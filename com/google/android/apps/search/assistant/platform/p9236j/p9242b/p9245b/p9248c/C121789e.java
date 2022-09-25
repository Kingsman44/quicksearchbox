package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.e */
/* compiled from: PG */
final class C121789e {

    /* renamed from: a */
    public Instant f337969a;

    /* renamed from: b */
    public Instant f337970b;

    /* renamed from: c */
    public Instant f337971c;

    /* renamed from: d */
    public Instant f337972d;

    /* renamed from: e */
    public Instant f337973e;

    /* renamed from: f */
    public final List f337974f;

    /* renamed from: g */
    public final Map f337975g;

    /* renamed from: h */
    public final List f337976h;

    public C121789e() {
        this((byte[]) null);
    }

    public /* synthetic */ C121789e(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        this.f337969a = null;
        this.f337970b = null;
        this.f337971c = null;
        this.f337972d = null;
        this.f337973e = null;
        this.f337974f = arrayList;
        this.f337975g = linkedHashMap;
        this.f337976h = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121789e)) {
            return false;
        }
        C121789e eVar = (C121789e) obj;
        return C69664n.m101066l(this.f337969a, eVar.f337969a) && C69664n.m101066l(this.f337970b, eVar.f337970b) && C69664n.m101066l(this.f337971c, eVar.f337971c) && C69664n.m101066l(this.f337972d, eVar.f337972d) && C69664n.m101066l(this.f337973e, eVar.f337973e) && C69664n.m101066l(this.f337974f, eVar.f337974f) && C69664n.m101066l(this.f337975g, eVar.f337975g) && C69664n.m101066l(this.f337976h, eVar.f337976h);
    }

    public final int hashCode() {
        Instant instant = this.f337969a;
        int i = 0;
        int hashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Instant instant2 = this.f337970b;
        int hashCode2 = (hashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.f337971c;
        int hashCode3 = (hashCode2 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        Instant instant4 = this.f337972d;
        int hashCode4 = (hashCode3 + (instant4 == null ? 0 : instant4.hashCode())) * 31;
        Instant instant5 = this.f337973e;
        if (instant5 != null) {
            i = instant5.hashCode();
        }
        return ((((((hashCode4 + i) * 31) + this.f337974f.hashCode()) * 31) + this.f337975g.hashCode()) * 31) + this.f337976h.hashCode();
    }

    public final String toString() {
        Instant instant = this.f337969a;
        Instant instant2 = this.f337970b;
        Instant instant3 = this.f337971c;
        Instant instant4 = this.f337972d;
        Instant instant5 = this.f337973e;
        List list = this.f337974f;
        Map map = this.f337975g;
        List list2 = this.f337976h;
        return "DebugData(createdAt=" + instant + ", releasedStartedAt=" + instant2 + ", releasedCompletedAt=" + instant3 + ", acquisitionLostStartedAt=" + instant4 + ", acquisitionLostCompletedAt=" + instant5 + ", audioRouteUpdatedList=" + list + ", sessions=" + map + ", startListeningFailedList=" + list2 + ")";
    }
}
