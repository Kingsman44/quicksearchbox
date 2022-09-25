package com.google.android.apps.gsa.search.core.preferences.cards;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.cards.c */
/* compiled from: PG */
public final class C86305c extends DialogFragment {

    /* renamed from: a */
    public String f233352a;

    /* renamed from: b */
    public String f233353b;

    /* renamed from: c */
    public int f233354c;

    /* renamed from: d */
    public C86307e f233355d;

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (bundle != null) {
            this.f233352a = bundle.getString("Person");
            this.f233353b = bundle.getString("Relationship");
            this.f233354c = bundle.getInt("Position");
        }
        builder.setTitle(R.string.relationship_removal_dialog_title).setMessage(getResources().getString(R.string.relationship_removal_dialog_message, new Object[]{this.f233353b, this.f233352a})).setPositiveButton(R.string.relationship_removal_dialog_positive_button_text, new C86304b(this)).setNegativeButton(R.string.relationship_removal_dialog_negative_button_text, new C86303a());
        return builder.create();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("Person", this.f233352a);
        bundle.putString("Relationship", this.f233353b);
        bundle.putInt("Position", this.f233354c);
    }
}
