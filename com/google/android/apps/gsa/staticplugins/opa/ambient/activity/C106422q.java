package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.q */
/* compiled from: PG */
public final /* synthetic */ class C106422q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AmbientAssistantFeedbackFragment f296857a;

    public /* synthetic */ C106422q(AmbientAssistantFeedbackFragment ambientAssistantFeedbackFragment) {
        this.f296857a = ambientAssistantFeedbackFragment;
    }

    public final void onClick(View view) {
        AmbientAssistantFeedbackFragment ambientAssistantFeedbackFragment = this.f296857a;
        ambientAssistantFeedbackFragment.getActivity().finish();
        ambientAssistantFeedbackFragment.getActivity().startActivity(new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.verticals.ambient.feedback.FeedbackDialogActivity").setFlags(268599296));
    }
}
