package com.google.android.libraries.search.assistant.p2828y.p2848i;

import com.google.assistant.p3897e.p3921j.C52265li;
import com.google.assistant.p3897e.p3921j.amf;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.i.b */
/* compiled from: PG */
public final class C36974b {

    /* renamed from: a */
    public final amf f96254a;

    /* renamed from: b */
    public final C52265li f96255b;

    /* renamed from: c */
    public final List f96256c;

    /* renamed from: d */
    public final List f96257d;

    /* renamed from: e */
    public final boolean f96258e;

    /* renamed from: f */
    public final boolean f96259f;

    /* renamed from: g */
    public final List f96260g;

    public /* synthetic */ C36974b(amf amf, C52265li liVar, List list, List list2, boolean z, boolean z2, int i) {
        list = (i & 4) != 0 ? C69496am.f185918a : list;
        list2 = (i & 8) != 0 ? C69496am.f185918a : list2;
        boolean z3 = false;
        boolean z4 = z & ((i & 16) == 0);
        z3 = (i & 32) == 0 ? true : z3;
        C69496am amVar = C69496am.f185918a;
        C69664n.m101061g(amf, "surfaceIdentity");
        C69664n.m101061g(liVar, "supportedFeatures");
        C69664n.m101061g(list, "installedAppsAllowedList");
        C69664n.m101061g(list2, "mediaFulfillmentDeniedAppList");
        this.f96254a = amf;
        this.f96255b = liVar;
        this.f96256c = list;
        this.f96257d = list2;
        this.f96258e = z4;
        this.f96259f = z3 & z2;
        this.f96260g = amVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36974b)) {
            return false;
        }
        C36974b bVar = (C36974b) obj;
        return C69664n.m101066l(this.f96254a, bVar.f96254a) && C69664n.m101066l(this.f96255b, bVar.f96255b) && C69664n.m101066l(this.f96256c, bVar.f96256c) && C69664n.m101066l(this.f96257d, bVar.f96257d) && this.f96258e == bVar.f96258e && this.f96259f == bVar.f96259f && C69664n.m101066l(this.f96260g, bVar.f96260g);
    }

    public final int hashCode() {
        return (((((((((((this.f96254a.hashCode() * 31) + this.f96255b.hashCode()) * 31) + this.f96256c.hashCode()) * 31) + 1) * 31) + (this.f96258e ? 1 : 0)) * 31) + (this.f96259f ? 1 : 0)) * 31) + 1;
    }

    public final String toString() {
        amf amf = this.f96254a;
        C52265li liVar = this.f96255b;
        List list = this.f96256c;
        List list2 = this.f96257d;
        boolean z = this.f96258e;
        boolean z2 = this.f96259f;
        List list3 = this.f96260g;
        return "DeviceCapabilitiesConfiguration(surfaceIdentity=" + amf + ", supportedFeatures=" + liVar + ", installedAppsAllowedList=" + list + ", mediaFulfillmentDeniedAppList=" + list2 + ", sendDeviceInstalledApps=" + z + ", sendDeviceInstalledAppNames=" + z2 + ", supportedLocales=" + list3 + ")";
    }
}
