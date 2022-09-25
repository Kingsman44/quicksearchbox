package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.m */
/* compiled from: PG */
final class C124916m implements C0815b {

    /* renamed from: a */
    final /* synthetic */ C124919p f344652a;

    public C124916m(C124919p pVar) {
        this.f344652a = pVar;
    }

    public final /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
        if (((ActivityResult) obj).f2755a == -1) {
            this.f344652a.mo106714a();
        } else {
            C47393f.m84237h(new C124920q("FixAccountToken-Failed"), this.f344652a.f344657c.requireView());
        }
    }
}
