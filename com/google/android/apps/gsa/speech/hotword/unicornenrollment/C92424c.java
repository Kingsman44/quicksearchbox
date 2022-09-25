package com.google.android.apps.gsa.speech.hotword.unicornenrollment;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.speech.hotword.unicornenrollment.c */
/* compiled from: PG */
public final /* synthetic */ class C92424c implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ ParentReauthScreenView f257779a;

    /* renamed from: b */
    public final /* synthetic */ C92428g f257780b;

    public /* synthetic */ C92424c(ParentReauthScreenView parentReauthScreenView, C92428g gVar) {
        this.f257779a = parentReauthScreenView;
        this.f257780b = gVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ParentReauthScreenView parentReauthScreenView = this.f257779a;
        C92428g gVar = this.f257780b;
        if (keyEvent.getAction() != 0 || i != 66) {
            return false;
        }
        parentReauthScreenView.mo87061e(gVar.mo87076c());
        return true;
    }
}
