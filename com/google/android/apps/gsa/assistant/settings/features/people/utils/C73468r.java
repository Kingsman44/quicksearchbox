package com.google.android.apps.gsa.assistant.settings.features.people.utils;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.utils.r */
/* compiled from: PG */
public final /* synthetic */ class C73468r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73471u f194475a;

    public /* synthetic */ C73468r(C73471u uVar) {
        this.f194475a = uVar;
    }

    public final void onClick(View view) {
        C73471u uVar = this.f194475a;
        Intent intent = new Intent();
        Fragment targetFragment = uVar.getTargetFragment();
        targetFragment.getClass();
        targetFragment.onActivityResult(uVar.getTargetRequestCode(), 0, intent);
        uVar.dismiss();
    }
}
