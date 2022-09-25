package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.av.au;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bu */
/* compiled from: PG */
final class C101684bu extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C101687bx f283718a;

    public C101684bu(C101687bx bxVar) {
        this.f283718a = bxVar;
    }

    public final void onClick(View view) {
        if (this.f283718a.f283727g.mo92669c()) {
            Context context = this.f283718a.f283721a.getContext();
            String c = this.f283718a.f283728h.mo92672c();
            String d = this.f283718a.f283728h.mo92673d();
            View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_recognition, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.content_text)).setText(d);
            new AlertDialog.Builder(context).setTitle(c).setView(inflate).setPositiveButton(R.string.dialog_got_it, (DialogInterface.OnClickListener) null).create().show();
            return;
        }
        au.c(this.f283718a.f283721a.getContext(), R.string.dialog_learn_more_vm_title, R.string.dialog_learn_more_vm_content);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
