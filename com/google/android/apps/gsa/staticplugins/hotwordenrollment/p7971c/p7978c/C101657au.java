package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.av.au;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.au */
/* compiled from: PG */
final class C101657au extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C101661ay f283668a;

    public C101657au(C101661ay ayVar) {
        this.f283668a = ayVar;
    }

    public final void onClick(View view) {
        Context context = this.f283668a.f283669a.getContext();
        int i = this.f283668a.f283674f - 1;
        if (i == 0) {
            au.c(context, R.string.dialog_learn_more_pr_title, R.string.dialog_learn_more_pr_content_speaker_vm_off);
        } else if (i == 1) {
            au.c(context, R.string.dialog_learn_more_pr_title, R.string.dialog_learn_more_pr_content_speaker_vm_on);
        } else if (i == 2) {
            au.c(context, R.string.dialog_learn_more_pr_title, R.string.dialog_learn_more_pr_content_display_vm_off);
        } else if (i != 3) {
            au.c(context, R.string.dialog_learn_more_pr_title, R.string.dialog_learn_more_pr_content_display_fm_on);
        } else {
            au.c(context, R.string.dialog_learn_more_pr_title, R.string.dialog_learn_more_pr_content_display_vm_on_fm_off);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
