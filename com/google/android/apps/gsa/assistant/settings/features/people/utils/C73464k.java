package com.google.android.apps.gsa.assistant.settings.features.people.utils;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.utils.k */
/* compiled from: PG */
public final /* synthetic */ class C73464k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ m f194472a;

    public /* synthetic */ C73464k(m mVar) {
        this.f194472a = mVar;
    }

    public final void onClick(View view) {
        m mVar = this.f194472a;
        mVar.a.d();
        Fragment targetFragment = mVar.getTargetFragment();
        targetFragment.getClass();
        targetFragment.onActivityResult(mVar.c.e, 0, (Intent) null);
        mVar.dismiss();
    }
}
