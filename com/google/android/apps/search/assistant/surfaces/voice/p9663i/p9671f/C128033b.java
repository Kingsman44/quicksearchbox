package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.f.b */
/* compiled from: PG */
final class C128033b extends C128042k {

    /* renamed from: a */
    private final C58495hd f352315a;

    /* renamed from: b */
    private final Duration f352316b;

    public C128033b(C58495hd hdVar, Duration duration) {
        this.f352315a = hdVar;
        this.f352316b = duration;
    }

    /* renamed from: a */
    public final int mo108310a() {
        return 0;
    }

    /* renamed from: b */
    public final C58495hd mo108311b() {
        return this.f352315a;
    }

    /* renamed from: c */
    public final Duration mo108312c() {
        return this.f352316b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C128042k) {
            C128042k kVar = (C128042k) obj;
            return kVar.mo108310a() == 0 && this.f352315a.equals(kVar.mo108311b()) && this.f352316b.equals(kVar.mo108312c());
        }
    }

    public final int hashCode() {
        return ((C58758qx.m90643a(this.f352315a.entrySet()) ^ -721379959) * 1000003) ^ this.f352316b.hashCode();
    }

    public final String toString() {
        String obj = this.f352315a.toString();
        String obj2 = this.f352316b.toString();
        return "SensorsCollectorRequest{sensorDelayType=0, sensorsWithEventsCount=" + obj + ", sensorCollectionTimeout=" + obj2 + "}";
    }
}
