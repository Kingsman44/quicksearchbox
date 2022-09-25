package com.google.android.libraries.search.location;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.location.z */
/* compiled from: PG */
public abstract class C38726z {
    /* renamed from: d */
    public static C38725y m68011d(C39226b bVar) {
        C38570a aVar = new C38570a();
        if (bVar != null) {
            aVar.f101953a = bVar;
            aVar.f101954b = 1;
            aVar.mo41493b(Duration.ZERO);
            return aVar;
        }
        throw new NullPointerException("Null attributionId");
    }

    /* renamed from: a */
    public abstract C39226b mo41552a();

    /* renamed from: b */
    public abstract Duration mo41553b();

    /* renamed from: c */
    public abstract int mo41554c();
}
