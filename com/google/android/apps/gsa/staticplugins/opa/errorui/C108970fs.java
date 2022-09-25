package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fs */
/* compiled from: PG */
public final /* synthetic */ class C108970fs implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108980gb f303019a;

    public /* synthetic */ C108970fs(C108980gb gbVar) {
        this.f303019a = gbVar;
    }

    public final void onClick(View view) {
        C108980gb gbVar = this.f303019a;
        if (gbVar.mo97342k()) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(gbVar.f303054s).inflate(R.layout.wakeup_routine_confirm_dialog, (ViewGroup) null);
            ((TextView) linearLayout.findViewById(R.id.wakeup_routine_confirm_dialog_title)).setText(R.string.opa_wakeup_routine_screen_confirm_dialog_title);
            TextView textView = (TextView) linearLayout.findViewById(R.id.wakeup_routine_confirm_dialog_message);
            String string = ((C73841bf) gbVar.f303043h.mo27525b()).mo65322a().getString(R.string.opa_wakeup_routine_confirm_dialog_pr_assistant);
            String string2 = ((C73841bf) gbVar.f303043h.mo27525b()).mo65322a().getString(R.string.opa_wakeup_routine_screen_confirm_dialog_message, new Object[]{string});
            Uri parse = Uri.parse(gbVar.f303040e.mo79758x(C90053de.f248956W));
            SpannableString spannableString = new SpannableString(string2);
            int indexOf = spannableString.toString().indexOf(string);
            spannableString.setSpan(new C108979ga(gbVar, gbVar.f303054s, parse), indexOf, string.length() + indexOf, 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            new AlertDialog.Builder(gbVar.f303054s).setPositiveButton(R.string.opa_wakeup_routine_confirm_dialog_positive_button, new C108969fr(gbVar)).setNegativeButton(R.string.opa_wakeup_routine_confirm_dialog_negative_button, (DialogInterface.OnClickListener) null).setView(linearLayout).create().show();
            return;
        }
        gbVar.mo97338g();
    }
}
