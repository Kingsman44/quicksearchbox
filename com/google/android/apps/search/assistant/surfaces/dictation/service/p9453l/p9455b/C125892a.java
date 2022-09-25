package com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import java.util.Map;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.a */
/* compiled from: PG */
public final class C125892a {

    /* renamed from: a */
    public final C125160i f346960a;

    /* renamed from: b */
    public final boolean f346961b;

    /* renamed from: c */
    public final Instant f346962c;

    /* renamed from: d */
    public final Map f346963d;

    public C125892a() {
        this((byte[]) null);
    }

    public C125892a(C125160i iVar, boolean z, Instant instant, Map map) {
        C69664n.m101061g(instant, "lastKeyboardOpenTime");
        C69664n.m101061g(map, "pendingLanguageDownloadRequests");
        this.f346960a = iVar;
        this.f346961b = z;
        this.f346962c = instant;
        this.f346963d = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C125892a(byte[] r4) {
        /*
            r3 = this;
            j$.time.Instant r4 = p3186j$.time.Instant.EPOCH
            java.lang.String r0 = "EPOCH"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r0)
            r0 = 0
            h.a.an r1 = p5462h.p5463a.C69497an.f185919a
            r2 = 0
            r3.<init>(r2, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.C125892a.<init>(byte[]):void");
    }

    /* renamed from: a */
    public static /* synthetic */ C125892a m205886a(C125892a aVar, C125160i iVar, boolean z, Instant instant, Map map, int i) {
        if ((i & 1) != 0) {
            iVar = aVar.f346960a;
        }
        if ((i & 2) != 0) {
            z = aVar.f346961b;
        }
        if ((i & 4) != 0) {
            instant = aVar.f346962c;
        }
        if ((i & 8) != 0) {
            map = aVar.f346963d;
        }
        C69664n.m101061g(instant, "lastKeyboardOpenTime");
        C69664n.m101061g(map, "pendingLanguageDownloadRequests");
        return new C125892a(iVar, z, instant, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125892a)) {
            return false;
        }
        C125892a aVar = (C125892a) obj;
        return this.f346960a == aVar.f346960a && this.f346961b == aVar.f346961b && C69664n.m101066l(this.f346962c, aVar.f346962c) && C69664n.m101066l(this.f346963d, aVar.f346963d);
    }

    public final int hashCode() {
        C125160i iVar = this.f346960a;
        return ((((((iVar == null ? 0 : iVar.hashCode()) * 31) + (this.f346961b ? 1 : 0)) * 31) + this.f346962c.hashCode()) * 31) + this.f346963d.hashCode();
    }

    public final String toString() {
        C125160i iVar = this.f346960a;
        boolean z = this.f346961b;
        Instant instant = this.f346962c;
        Map map = this.f346963d;
        return "Snapshot(configEligibility=" + iVar + ", userMetricsDisabled=" + z + ", lastKeyboardOpenTime=" + instant + ", pendingLanguageDownloadRequests=" + map + ")";
    }
}
