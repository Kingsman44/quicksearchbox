package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124716n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124717o;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.ad */
/* compiled from: PG */
final class C89438ad extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ String f242451a;

    /* renamed from: b */
    final /* synthetic */ String f242452b;

    /* renamed from: c */
    final /* synthetic */ Collection f242453c;

    /* renamed from: d */
    final /* synthetic */ String f242454d;

    /* renamed from: e */
    final /* synthetic */ String f242455e;

    /* renamed from: f */
    final /* synthetic */ boolean f242456f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89438ad(C89474bm bmVar, String str, String str2, String str3, Collection collection, String str4, String str5, boolean z) {
        super(bmVar, str, 26);
        this.f242451a = str2;
        this.f242452b = str3;
        this.f242453c = collection;
        this.f242454d = str4;
        this.f242455e = str5;
        this.f242456f = z;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124621an f = C89474bm.m145536f(c);
        C124716n d = C89474bm.m145534d(f);
        String str = this.f242451a;
        d.copyOnWrite();
        C124717o oVar = (C124717o) d.instance;
        C124717o oVar2 = C124717o.f344082m;
        str.getClass();
        oVar.f344084a |= 32;
        oVar.f344090g = str;
        String str2 = this.f242452b;
        d.copyOnWrite();
        C124717o oVar3 = (C124717o) d.instance;
        str2.getClass();
        oVar3.f344084a |= 64;
        oVar3.f344091h = str2;
        d.copyOnWrite();
        ((C124717o) d.instance).f344092i = C62942bv.emptyProtobufList();
        Collection collection = this.f242453c;
        d.copyOnWrite();
        C124717o oVar4 = (C124717o) d.instance;
        C62971cq cqVar = oVar4.f344092i;
        if (!cqVar.mo58948c()) {
            oVar4.f344092i = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) collection, (List) oVar4.f344092i);
        String str3 = this.f242454d;
        d.copyOnWrite();
        C124717o oVar5 = (C124717o) d.instance;
        str3.getClass();
        oVar5.f344084a |= 128;
        oVar5.f344093j = str3;
        String str4 = this.f242455e;
        d.copyOnWrite();
        C124717o oVar6 = (C124717o) d.instance;
        str4.getClass();
        oVar6.f344084a |= 256;
        oVar6.f344094k = str4;
        int i = true != this.f242456f ? 3 : 2;
        d.copyOnWrite();
        C124717o oVar7 = (C124717o) d.instance;
        oVar7.f344095l = i - 1;
        oVar7.f344084a |= 512;
        f.copyOnWrite();
        C124623ap apVar = (C124623ap) f.instance;
        C124717o oVar8 = (C124717o) d.build();
        C124623ap apVar2 = C124623ap.f343769w;
        oVar8.getClass();
        apVar.f343778h = oVar8;
        apVar.f343771a |= 64;
        c.copyOnWrite();
        C124709g gVar2 = (C124709g) c.instance;
        C124623ap apVar3 = (C124623ap) f.build();
        C124709g gVar3 = C124709g.f344049g;
        apVar3.getClass();
        gVar2.f344052b = apVar3;
        gVar2.f344051a |= 1;
        return (C124709g) c.build();
    }
}
