package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58833ax;

/* renamed from: com.google.apps.tiktok.dataservice.ab */
/* compiled from: PG */
final class C46684ab extends C46794dj {

    /* renamed from: b */
    private final long f121967b;

    /* renamed from: c */
    private final C46792di f121968c;

    /* renamed from: d */
    private final boolean f121969d;

    /* renamed from: e */
    private final C58833ax f121970e;

    /* renamed from: f */
    private final C58833ax f121971f;

    public C46684ab(long j, C46792di diVar, boolean z, C58833ax axVar, C58833ax axVar2) {
        this.f121967b = j;
        if (diVar != null) {
            this.f121968c = diVar;
            this.f121969d = z;
            if (axVar != null) {
                this.f121970e = axVar;
                if (axVar2 != null) {
                    this.f121971f = axVar2;
                    return;
                }
                throw new NullPointerException("Null maybeInstanceData");
            }
            throw new NullPointerException("Null maybeTopicData");
        }
        throw new NullPointerException("Null callbacks");
    }

    /* renamed from: a */
    public final long mo50725a() {
        return this.f121967b;
    }

    /* renamed from: b */
    public final C46792di mo50726b() {
        return this.f121968c;
    }

    /* renamed from: c */
    public final C58833ax mo50727c() {
        return this.f121971f;
    }

    /* renamed from: d */
    public final C58833ax mo50728d() {
        return this.f121970e;
    }

    /* renamed from: e */
    public final boolean mo50729e() {
        return this.f121969d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46794dj) {
            C46794dj djVar = (C46794dj) obj;
            return this.f121967b == djVar.mo50725a() && this.f121968c.equals(djVar.mo50726b()) && this.f121969d == djVar.mo50729e() && this.f121970e.equals(djVar.mo50728d()) && this.f121971f.equals(djVar.mo50727c());
        }
    }

    public final int hashCode() {
        long j = this.f121967b;
        return this.f121971f.hashCode() ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f121968c.hashCode()) * 1000003) ^ (true != this.f121969d ? 1237 : 1231)) * 1000003) ^ this.f121970e.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f121967b;
        String obj = this.f121968c.toString();
        boolean z = this.f121969d;
        String obj2 = this.f121970e.toString();
        String obj3 = this.f121971f.toString();
        return "SubscriptionCallbacksState{index=" + j + ", callbacks=" + obj + ", openBackgroundFetch=" + z + ", maybeTopicData=" + obj2 + ", maybeInstanceData=" + obj3 + "}";
    }
}
