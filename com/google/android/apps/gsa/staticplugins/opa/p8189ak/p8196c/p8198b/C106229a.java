package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.a */
/* compiled from: PG */
final class C106229a extends C106258r {

    /* renamed from: a */
    private final C106286n f296417a;

    /* renamed from: b */
    private final Bundle f296418b;

    /* renamed from: c */
    private final Instant f296419c;

    public C106229a(C106286n nVar, Bundle bundle, Instant instant) {
        if (nVar != null) {
            this.f296417a = nVar;
            if (bundle != null) {
                this.f296418b = bundle;
                if (instant != null) {
                    this.f296419c = instant;
                    return;
                }
                throw new NullPointerException("Null enqueueStartTime");
            }
            throw new NullPointerException("Null data");
        }
        throw new NullPointerException("Null ngaEntryPointEventData");
    }

    /* renamed from: a */
    public final Bundle mo95460a() {
        return this.f296418b;
    }

    /* renamed from: b */
    public final C106286n mo95461b() {
        return this.f296417a;
    }

    /* renamed from: c */
    public final Instant mo95462c() {
        return this.f296419c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C106258r) {
            C106258r rVar = (C106258r) obj;
            return this.f296417a.equals(rVar.mo95461b()) && this.f296418b.equals(rVar.mo95460a()) && this.f296419c.equals(rVar.mo95462c());
        }
    }

    public final int hashCode() {
        return ((((this.f296417a.hashCode() ^ 1000003) * 1000003) ^ this.f296418b.hashCode()) * 1000003) ^ this.f296419c.hashCode();
    }

    public final String toString() {
        String obj = this.f296417a.toString();
        String obj2 = this.f296418b.toString();
        String obj3 = this.f296419c.toString();
        return "EventData{ngaEntryPointEventData=" + obj + ", data=" + obj2 + ", enqueueStartTime=" + obj3 + "}";
    }
}
