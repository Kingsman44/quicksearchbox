package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4390b.p4391a.C57687c;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4390b.p4391a.C57690f;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4390b.p4391a.C57693i;
import com.google.protobuf.C62995dn;
import com.google.protos.youtube.elements.C66190dd;
import com.google.protos.youtube.elements.C66192df;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.aj */
/* compiled from: PG */
public final class C40029aj extends C40035ap {

    /* renamed from: a */
    public final C57693i f105188a;

    /* renamed from: b */
    public final C66192df f105189b;

    public C40029aj(C57693i iVar, C66192df dfVar) {
        C69664n.m101061g(iVar, "veLoggingProperties");
        C69664n.m101061g(dfVar, "loggingNode");
        this.f105188a = iVar;
        this.f105189b = dfVar;
    }

    /* renamed from: a */
    public final Integer mo42136a(C66190dd ddVar) {
        C69664n.m101061g(ddVar, "gestureType");
        int i = ddVar.f179995e;
        C62995dn dnVar = this.f105188a.f154092j;
        Integer valueOf = Integer.valueOf(i);
        if (!dnVar.containsKey(valueOf)) {
            return null;
        }
        C62995dn dnVar2 = this.f105188a.f154092j;
        if (dnVar2.containsKey(valueOf)) {
            return Integer.valueOf(((Integer) dnVar2.get(valueOf)).intValue());
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final boolean mo42137b(C66190dd ddVar) {
        C69664n.m101061g(ddVar, "gestureType");
        int a = C57690f.m88518a(this.f105188a.f154088f);
        if (a != 0 && a != 1) {
            return false;
        }
        if (ddVar == C66190dd.GESTURE_TYPE_CLICK) {
            C57693i iVar = this.f105188a;
            int a2 = C57687c.m88517a(iVar.f154087e);
            if (a2 == 0 || a2 == 1) {
                C59052c cVar = (C59052c) C40035ap.f105195c.mo56225c();
                C61301b bVar = new C61301b(C61284a.NON_TEXTUAL_INTERACTION_USER_DATA, Integer.valueOf(iVar.f154084b));
                cVar.mo56379ah(new C59094n(53311));
                cVar.mo56389s("xUIKit VE id %s sets ClickTracking.NONE, but also InteractionLoggingMode.LOG_ALL", bVar);
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40029aj)) {
            return false;
        }
        C40029aj ajVar = (C40029aj) obj;
        return C69664n.m101066l(this.f105188a, ajVar.f105188a) && C69664n.m101066l(this.f105189b, ajVar.f105189b);
    }

    public final int hashCode() {
        return (this.f105188a.hashCode() * 31) + this.f105189b.hashCode();
    }

    public final String toString() {
        C57693i iVar = this.f105188a;
        C66192df dfVar = this.f105189b;
        return "ClientImpressedVe(veLoggingProperties=" + iVar + ", loggingNode=" + dfVar + ")";
    }
}
