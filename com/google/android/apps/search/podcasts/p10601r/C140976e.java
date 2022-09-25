package com.google.android.apps.search.podcasts.p10601r;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.search.podcasts.episode.C140236o;
import com.google.android.apps.search.podcasts.episode.C140237p;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140642c;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import com.google.p4017at.p4082j.p4083a.C54458w;
import com.google.protobuf.C62942bv;
import com.google.protos.p4757ac.p4758a.C63104c;
import com.google.protos.p4757ac.p4758a.C63105d;
import com.google.protos.p4757ac.p4758a.C63110i;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.e */
/* compiled from: PG */
public final class C140976e {
    /* renamed from: a */
    public static final Bundle m228928a(C140641b bVar) {
        C69664n.m101061g(bVar, "<this>");
        C140236o oVar = (C140236o) C140237p.f380980c.createBuilder();
        oVar.copyOnWrite();
        C140237p pVar = (C140237p) oVar.instance;
        bVar.getClass();
        pVar.f380983b = bVar;
        pVar.f380982a = 2;
        return C46490k.m82868a(oVar.build()).mo50504d();
    }

    /* renamed from: b */
    public static final C63111j m228929b(C140641b bVar) {
        C69664n.m101061g(bVar, "<this>");
        C63110i iVar = (C63110i) C63111j.f170348p.createBuilder();
        C140646b bVar2 = bVar.f381974a;
        if (bVar2 == null) {
            bVar2 = C140646b.f381993r;
        }
        C69664n.m101060f(bVar2, "show");
        C63113l a = C140992n.m228954a(bVar2);
        iVar.copyOnWrite();
        C63111j jVar = (C63111j) iVar.instance;
        a.getClass();
        jVar.f170360k = a;
        jVar.f170350a |= 512;
        C140646b bVar3 = bVar.f381974a;
        if (bVar3 == null) {
            bVar3 = C140646b.f381993r;
        }
        String str = bVar3.f381995a;
        iVar.copyOnWrite();
        C63111j jVar2 = (C63111j) iVar.instance;
        str.getClass();
        jVar2.f170350a |= 8;
        jVar2.f170354e = str;
        C140646b bVar4 = bVar.f381974a;
        if (bVar4 == null) {
            bVar4 = C140646b.f381993r;
        }
        String str2 = bVar4.f382001g;
        iVar.copyOnWrite();
        C63111j jVar3 = (C63111j) iVar.instance;
        str2.getClass();
        jVar3.f170350a |= 64;
        jVar3.f170357h = str2;
        String str3 = bVar.f381975b;
        iVar.copyOnWrite();
        C63111j jVar4 = (C63111j) iVar.instance;
        str3.getClass();
        jVar4.f170350a |= 32;
        jVar4.f170356g = str3;
        String str4 = bVar.f381977d;
        iVar.copyOnWrite();
        C63111j jVar5 = (C63111j) iVar.instance;
        str4.getClass();
        int i = 2;
        jVar5.f170350a |= 2;
        jVar5.f170352c = str4;
        String str5 = bVar.f381979f;
        iVar.copyOnWrite();
        C63111j jVar6 = (C63111j) iVar.instance;
        str5.getClass();
        jVar6.f170350a |= C89885b.NOW_VALUE;
        jVar6.f170363n = str5;
        String str6 = bVar.f381978e;
        iVar.copyOnWrite();
        C63111j jVar7 = (C63111j) iVar.instance;
        str6.getClass();
        jVar7.f170350a |= 4;
        jVar7.f170353d = str6;
        long j = bVar.f381980g;
        iVar.copyOnWrite();
        C63111j jVar8 = (C63111j) iVar.instance;
        jVar8.f170350a |= 128;
        jVar8.f170358i = j;
        long j2 = bVar.f381981h;
        iVar.copyOnWrite();
        C63111j jVar9 = (C63111j) iVar.instance;
        jVar9.f170350a |= 16;
        jVar9.f170355f = j2;
        String str7 = bVar.f381976c;
        iVar.copyOnWrite();
        C63111j jVar10 = (C63111j) iVar.instance;
        str7.getClass();
        jVar10.f170350a |= 1;
        jVar10.f170351b = str7;
        if (true != bVar.f381983j) {
            i = 1;
        }
        iVar.copyOnWrite();
        C63111j jVar11 = (C63111j) iVar.instance;
        jVar11.f170361l = i - 1;
        jVar11.f170350a |= 1024;
        C63104c cVar = (C63104c) C63105d.f170333c.createBuilder();
        String str8 = bVar.f381982i;
        cVar.copyOnWrite();
        C63105d dVar = (C63105d) cVar.instance;
        str8.getClass();
        dVar.f170335a |= 1;
        dVar.f170336b = str8;
        iVar.copyOnWrite();
        C63111j jVar12 = (C63111j) iVar.instance;
        C63105d dVar2 = (C63105d) cVar.build();
        dVar2.getClass();
        jVar12.f170364o = dVar2;
        jVar12.f170350a |= 4194304;
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "newBuilder()\n    .setSho…sementText))\n    .build()");
        return (C63111j) build;
    }

    /* renamed from: c */
    public static final boolean m228930c(C140641b bVar, C140642c cVar) {
        C69664n.m101061g(bVar, "<this>");
        C69664n.m101061g(cVar, "other");
        C140641b bVar2 = (C140641b) cVar;
        if (bVar.f381985l != bVar2.f381985l) {
            return false;
        }
        C140644e eVar = bVar.f381984k;
        if (eVar == null) {
            eVar = C140644e.f381988d;
        }
        C140644e eVar2 = bVar2.f381984k;
        if (eVar2 == null) {
            eVar2 = C140644e.f381988d;
        }
        if (!C69664n.m101066l(eVar, eVar2)) {
            return false;
        }
        C97914d dVar = bVar.f381987n;
        if (dVar == null) {
            dVar = C97914d.f273393j;
        }
        C97913c a = C97913c.m162190a(dVar.f273396b);
        if (a == null) {
            a = C97913c.UNKNOWN;
        }
        C97914d dVar2 = bVar2.f381987n;
        C97913c a2 = C97913c.m162190a((dVar2 == null ? C97914d.f273393j : dVar2).f273396b);
        if (a2 == null) {
            a2 = C97913c.UNKNOWN;
        }
        if (a != a2) {
            return false;
        }
        C97914d dVar3 = bVar.f381987n;
        if (dVar3 == null) {
            dVar3 = C97914d.f273393j;
        }
        long j = dVar3.f273399e;
        if (dVar2 == null) {
            dVar2 = C97914d.f273393j;
        }
        if (j != dVar2.f273399e) {
            return false;
        }
        C54458w a3 = C54458w.m87383a(bVar.f381986m);
        if (a3 == null) {
            a3 = C54458w.UNRECOGNIZED;
        }
        C54458w a4 = C54458w.m87383a(bVar2.f381986m);
        if (a4 == null) {
            a4 = C54458w.UNRECOGNIZED;
        }
        if (a3 != a4) {
            return false;
        }
        C140646b bVar3 = bVar.f381974a;
        if (bVar3 == null) {
            bVar3 = C140646b.f381993r;
        }
        boolean z = bVar3.f382007m;
        C140646b bVar4 = bVar2.f381974a;
        if (bVar4 == null) {
            bVar4 = C140646b.f381993r;
        }
        if (z != bVar4.f382007m) {
            return false;
        }
        C140646b bVar5 = bVar.f381974a;
        if (bVar5 == null) {
            bVar5 = C140646b.f381993r;
        }
        C54397cw a5 = C54397cw.m87374a(bVar5.f382010p);
        if (a5 == null) {
            a5 = C54397cw.UNRECOGNIZED;
        }
        C140646b bVar6 = bVar2.f381974a;
        if (bVar6 == null) {
            bVar6 = C140646b.f381993r;
        }
        C54397cw a6 = C54397cw.m87374a(bVar6.f382010p);
        if (a6 == null) {
            a6 = C54397cw.UNRECOGNIZED;
        }
        return a5 == a6;
    }

    /* renamed from: d */
    public static final boolean m228931d(C140641b bVar, C140642c cVar) {
        C69664n.m101061g(bVar, "<this>");
        C69664n.m101061g(cVar, "other");
        if (!C69664n.m101066l(bVar.f381975b, cVar.mo115812b())) {
            return false;
        }
        C140646b bVar2 = bVar.f381974a;
        if (bVar2 == null) {
            bVar2 = C140646b.f381993r;
        }
        C69664n.m101060f(bVar2, "this.show");
        C140646b a = cVar.mo115811a();
        C69664n.m101060f(a, "other.show");
        C69664n.m101061g(bVar2, "<this>");
        C69664n.m101061g(a, "other");
        if (C69664n.m101066l(bVar2.f381995a, a.f381995a)) {
            return true;
        }
        String str = bVar2.f382001g;
        C69664n.m101060f(str, "this.clusterId");
        return str.length() > 0 && C69664n.m101066l(bVar2.f382001g, a.f382001g);
    }
}
