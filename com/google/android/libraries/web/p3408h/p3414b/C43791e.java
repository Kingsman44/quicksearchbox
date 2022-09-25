package com.google.android.libraries.web.p3408h.p3414b;

import android.net.Uri;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43366k;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.h.b.e */
/* compiled from: PG */
public final class C43791e {

    /* renamed from: a */
    public final List f114183a;

    /* renamed from: b */
    public final boolean f114184b;

    /* renamed from: c */
    public final C43363h f114185c;

    /* renamed from: d */
    private final C43366k f114186d;

    public C43791e(List list, C43366k kVar, boolean z, C43363h hVar) {
        C69664n.m101061g(list, "redirectChain");
        C69664n.m101061g(kVar, "triggerType");
        this.f114183a = list;
        this.f114186d = kVar;
        this.f114184b = z;
        this.f114185c = hVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C43791e m77312b(C43791e eVar, List list, boolean z, C43363h hVar, int i) {
        if ((i & 1) != 0) {
            list = eVar.f114183a;
        }
        C43366k kVar = (i & 2) != 0 ? eVar.f114186d : null;
        if ((i & 4) != 0) {
            z = eVar.f114184b;
        }
        if ((i & 8) != 0) {
            hVar = eVar.f114185c;
        }
        C69664n.m101061g(list, "redirectChain");
        C69664n.m101061g(kVar, "triggerType");
        return new C43791e(list, kVar, z, hVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Uri mo46810a() {
        return (Uri) C69540x.m100824F(this.f114183a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43791e)) {
            return false;
        }
        C43791e eVar = (C43791e) obj;
        return C69664n.m101066l(this.f114183a, eVar.f114183a) && this.f114186d == eVar.f114186d && this.f114184b == eVar.f114184b && C69664n.m101066l(this.f114185c, eVar.f114185c);
    }

    public final int hashCode() {
        int hashCode = ((((this.f114183a.hashCode() * 31) + this.f114186d.hashCode()) * 31) + (this.f114184b ? 1 : 0)) * 31;
        C43363h hVar = this.f114185c;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public final String toString() {
        List list = this.f114183a;
        C43366k kVar = this.f114186d;
        boolean z = this.f114184b;
        C43363h hVar = this.f114185c;
        return "WebNavigationSnapshotImpl(redirectChain=" + list + ", triggerType=" + kVar + ", completedWithDocument=" + z + ", error=" + hVar + ")";
    }
}
