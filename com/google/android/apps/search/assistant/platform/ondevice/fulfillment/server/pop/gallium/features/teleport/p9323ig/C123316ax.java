package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p001a.p014d.p015a.p016a.C0081z;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ax */
/* compiled from: PG */
final class C123316ax extends C123388do {

    /* renamed from: a */
    private final C0081z f341064a;

    /* renamed from: b */
    private final C58485gu f341065b;

    /* renamed from: c */
    private final C58485gu f341066c;

    public C123316ax(C0081z zVar, C58485gu guVar, C58485gu guVar2) {
        this.f341064a = zVar;
        this.f341065b = guVar;
        this.f341066c = guVar2;
    }

    /* renamed from: a */
    public final C0081z mo105977a() {
        return this.f341064a;
    }

    /* renamed from: b */
    public final C58485gu mo105978b() {
        return this.f341066c;
    }

    /* renamed from: c */
    public final C58485gu mo105979c() {
        return this.f341065b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123388do) {
            C123388do doVar = (C123388do) obj;
            return this.f341064a.equals(doVar.mo105977a()) && C58597ky.m90218i(this.f341065b, doVar.mo105979c()) && C58597ky.m90218i(this.f341066c, doVar.mo105978b());
        }
    }

    public final int hashCode() {
        return ((((this.f341064a.hashCode() ^ 1000003) * 1000003) ^ this.f341065b.hashCode()) * 1000003) ^ this.f341066c.hashCode();
    }

    public final String toString() {
        String obj = this.f341064a.toString();
        String obj2 = this.f341065b.toString();
        String obj3 = this.f341066c.toString();
        return "TeleportPrecompiledPatternSet{source=" + obj + ", patterns=" + obj2 + ", exceptions=" + obj3 + "}";
    }
}
