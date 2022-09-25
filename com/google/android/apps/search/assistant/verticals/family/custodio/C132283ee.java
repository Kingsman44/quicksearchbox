package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ee */
/* compiled from: PG */
public final /* synthetic */ class C132283ee implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C132287ei f361065a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f361066b;

    public /* synthetic */ C132283ee(C132287ei eiVar, C0392m mVar) {
        this.f361065a = eiVar;
        this.f361066b = mVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C132287ei eiVar = this.f361065a;
        C0392m mVar = this.f361066b;
        TextView textView = (TextView) mVar.mo1197b().mo1177e(R.id.assistant_custodio_generic_dialog_title);
        TextView textView2 = (TextView) mVar.mo1197b().mo1177e(R.id.assistant_custodio_generic_dialog_body);
        if (textView == null || textView2 == null) {
            throw new IllegalStateException("One or more views are null in onShow!");
        }
        textView.setText(eiVar.mo110589b("dialog_title_text_key"));
        textView2.setText(Html.fromHtml(eiVar.mo110589b("dialog_body_text_key")));
        textView2.setMovementMethod(new LinkMovementMethod());
        ((ViewGroup) Objects.requireNonNull((ViewGroup) mVar.mo1197b().mo1177e(R.id.buttonPanel))).setVisibility(0);
        Button button = mVar.f1349a.f1110j;
        button.setText(eiVar.mo110589b("dialog_primary_button_text_key"));
        button.setOnClickListener(new C132285eg(eiVar));
        button.setVisibility(0);
        String string = eiVar.f361071b.getString("dialog_secondary_button_text_key");
        if (string != null) {
            Button button2 = mVar.f1349a.f1113m;
            button2.setText(string);
            button2.setOnClickListener(new C132286eh(eiVar));
            button2.setVisibility(0);
        }
    }
}
