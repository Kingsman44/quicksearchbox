package com.google.android.apps.search.assistant.verticals.ambient.feedback.full;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.search.assistant.verticals.ambient.feedback.FeedbackDialogActivity;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.t */
/* compiled from: PG */
final class C130640t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130639s f357781a;

    public C130640t(C130639s sVar) {
        this.f357781a = sVar;
    }

    public final void onClick(View view) {
        C130639s sVar = this.f357781a;
        sVar.f357775c.finish();
        Activity activity = sVar.f357775c;
        activity.startActivity(new Intent(activity, FeedbackDialogActivity.class));
    }
}
