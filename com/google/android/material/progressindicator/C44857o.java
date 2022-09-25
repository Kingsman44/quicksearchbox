package com.google.android.material.progressindicator;

import androidx.p109f.p110a.C2249w;

/* renamed from: com.google.android.material.progressindicator.o */
/* compiled from: PG */
final class C44857o extends C2249w {
    /* renamed from: a */
    public final /* synthetic */ float mo5579a(Object obj) {
        int i = C44858p.f117043c;
        return ((C44858p) obj).f117046b * 10000.0f;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo5580b(Object obj, float f) {
        C44858p pVar = (C44858p) obj;
        int i = C44858p.f117043c;
        pVar.f117046b = f / 10000.0f;
        pVar.invalidateSelf();
    }
}
