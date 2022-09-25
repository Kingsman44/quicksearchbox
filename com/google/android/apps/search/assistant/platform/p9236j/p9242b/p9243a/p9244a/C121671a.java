package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import java.util.List;
import java.util.Map;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.a */
/* compiled from: PG */
final class C121671a {

    /* renamed from: a */
    public final C34053bp f337556a;

    /* renamed from: b */
    public final C33729b f337557b;

    /* renamed from: c */
    public final C33514d f337558c;

    /* renamed from: d */
    public final Instant f337559d;

    /* renamed from: e */
    public final boolean f337560e;

    /* renamed from: f */
    public final List f337561f;

    /* renamed from: g */
    public final Map f337562g;

    /* renamed from: h */
    public final List f337563h;

    public C121671a(C34053bp bpVar, C33729b bVar, C33514d dVar, Instant instant, boolean z, List list, Map map, List list2) {
        C69664n.m101061g(bpVar, "token");
        C69664n.m101061g(bVar, "parameters");
        C69664n.m101061g(instant, "createdAt");
        C69664n.m101061g(list, "statusEvents");
        C69664n.m101061g(map, "activeResourceTrackers");
        C69664n.m101061g(list2, "closedResourceTrackers");
        this.f337556a = bpVar;
        this.f337557b = bVar;
        this.f337558c = dVar;
        this.f337559d = instant;
        this.f337560e = z;
        this.f337561f = list;
        this.f337562g = map;
        this.f337563h = list2;
    }

    /* renamed from: a */
    public static /* synthetic */ C121671a m201066a(C121671a aVar, boolean z, List list, Map map, List list2, int i) {
        C121671a aVar2 = aVar;
        int i2 = i;
        Instant instant = null;
        C34053bp bpVar = (i2 & 1) != 0 ? aVar2.f337556a : null;
        C33729b bVar = (i2 & 2) != 0 ? aVar2.f337557b : null;
        C33514d dVar = (i2 & 4) != 0 ? aVar2.f337558c : null;
        if ((i2 & 8) != 0) {
            instant = aVar2.f337559d;
        }
        Instant instant2 = instant;
        boolean z2 = (i2 & 16) != 0 ? aVar2.f337560e : z;
        List list3 = (i2 & 32) != 0 ? aVar2.f337561f : list;
        Map map2 = (i2 & 64) != 0 ? aVar2.f337562g : map;
        List list4 = (i2 & 128) != 0 ? aVar2.f337563h : list2;
        C69664n.m101061g(bpVar, "token");
        C69664n.m101061g(bVar, "parameters");
        C69664n.m101061g(instant2, "createdAt");
        C69664n.m101061g(list3, "statusEvents");
        C69664n.m101061g(map2, "activeResourceTrackers");
        C69664n.m101061g(list4, "closedResourceTrackers");
        return new C121671a(bpVar, bVar, dVar, instant2, z2, list3, map2, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121671a)) {
            return false;
        }
        C121671a aVar = (C121671a) obj;
        return C69664n.m101066l(this.f337556a, aVar.f337556a) && C69664n.m101066l(this.f337557b, aVar.f337557b) && C69664n.m101066l(this.f337558c, aVar.f337558c) && C69664n.m101066l(this.f337559d, aVar.f337559d) && this.f337560e == aVar.f337560e && C69664n.m101066l(this.f337561f, aVar.f337561f) && C69664n.m101066l(this.f337562g, aVar.f337562g) && C69664n.m101066l(this.f337563h, aVar.f337563h);
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f337556a.hashCode() * 31) + this.f337557b.hashCode()) * 31;
        C33514d dVar = this.f337558c;
        if (dVar == null) {
            i = 0;
        } else {
            long j = dVar.f89676a;
            i = (int) (j ^ (j >>> 32));
        }
        return ((((((((((hashCode + i) * 31) + this.f337559d.hashCode()) * 31) + (this.f337560e ? 1 : 0)) * 31) + this.f337561f.hashCode()) * 31) + this.f337562g.hashCode()) * 31) + this.f337563h.hashCode();
    }

    public final String toString() {
        C34053bp bpVar = this.f337556a;
        C33729b bVar = this.f337557b;
        C33514d dVar = this.f337558c;
        Instant instant = this.f337559d;
        boolean z = this.f337560e;
        List list = this.f337561f;
        Map map = this.f337562g;
        List list2 = this.f337563h;
        return "InvocationDebugData(token=" + bpVar + ", parameters=" + bVar + ", sessionId=" + dVar + ", createdAt=" + instant + ", isCompleted=" + z + ", statusEvents=" + list + ", activeResourceTrackers=" + map + ", closedResourceTrackers=" + list2 + ")";
    }
}
