package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.d */
/* compiled from: PG */
final class C15432d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C15433e f46290a;

    public C15432d(C15433e eVar) {
        this.f46290a = eVar;
    }

    public final void onClick(View view) {
        this.f46290a.f46294d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        this.f46290a.f46291a.requestPermissions(new String[]{"android.permission.ACTIVITY_RECOGNITION"}, 1);
    }
}
