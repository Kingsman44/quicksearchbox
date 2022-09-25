package com.google.android.apps.gsa.shared.p7148ui.p7149a;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;

/* renamed from: com.google.android.apps.gsa.shared.ui.a.d */
/* compiled from: PG */
public final class C90624d extends DialogFragment {
    public final /* bridge */ /* synthetic */ Dialog onCreateDialog(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments.getString("title");
        String string2 = arguments.getString("text");
        String string3 = arguments.getString("positive_button_text");
        String string4 = arguments.getString("negative_button_text");
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.simple_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.simple_dialog_title)).setText(string);
        ((TextView) inflate.findViewById(R.id.simple_dialog_text)).setText(string2);
        return new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), C10678R.style.Theme_GoogleMaterial_DayNight)).setView(inflate).setPositiveButton(string3, new C90623c(this, (Intent) arguments.getParcelable("positive_button_intent"))).setNegativeButton(string4, new C90622b()).create();
    }
}
