package com.google.android.libraries.places.widget.internal.common;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.places.widget.internal.common.h */
/* compiled from: PG */
public abstract class C31920h {
    /* renamed from: g */
    public static C31920h m59471g() {
        return m59473i(3).mo37677a();
    }

    /* renamed from: i */
    public static C31919g m59473i(int i) {
        C31915c cVar = new C31915c();
        cVar.f85840f = i;
        return cVar;
    }

    /* renamed from: a */
    public abstract Status mo37678a();

    /* renamed from: b */
    public abstract AutocompletePrediction mo37679b();

    /* renamed from: c */
    public abstract Place mo37680c();

    /* renamed from: d */
    public abstract C58485gu mo37681d();

    /* renamed from: e */
    public abstract String mo37682e();

    /* renamed from: f */
    public abstract int mo37684f();

    /* renamed from: h */
    public static C31920h m59472h(Status status) {
        status.getClass();
        C31919g i = m59473i(10);
        ((C31915c) i).f85839e = status;
        return i.mo37677a();
    }
}
