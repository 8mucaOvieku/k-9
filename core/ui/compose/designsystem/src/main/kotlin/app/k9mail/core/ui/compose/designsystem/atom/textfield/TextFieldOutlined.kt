package app.k9mail.core.ui.compose.designsystem.atom.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.k9mail.core.ui.compose.theme.PreviewWithThemes
import androidx.compose.material.OutlinedTextField as MaterialOutlinedTextField

@Composable
fun TextFieldOutlined(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: String? = null,
    isRequired: Boolean = false,
    isError: Boolean = false,
) {
    MaterialOutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        label = selectLabel(label, isRequired),
        isError = isError,
    )
}

@Preview(showBackground = true)
@Composable
internal fun TextFieldOutlinedPreview() {
    PreviewWithThemes {
        TextFieldOutlined(
            value = "Input text",
            onValueChange = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun TextFieldOutlinedWithLabelPreview() {
    PreviewWithThemes {
        TextFieldOutlined(
            value = "Input text",
            label = "Label",
            onValueChange = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun TextFieldOutlinedDisabledPreview() {
    PreviewWithThemes {
        TextFieldOutlined(
            value = "Input text",
            onValueChange = {},
            enabled = false,
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun TextFieldOutlinedErrorPreview() {
    PreviewWithThemes {
        TextFieldOutlined(
            value = "Input text",
            onValueChange = {},
            isError = true,
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun TextFieldOutlinedRequiredPreview() {
    PreviewWithThemes {
        TextFieldOutlined(
            value = "",
            onValueChange = {},
            label = "Label",
            isRequired = true,
        )
    }
}
