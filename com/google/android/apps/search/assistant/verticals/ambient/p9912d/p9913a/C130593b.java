package com.google.android.apps.search.assistant.verticals.ambient.p9912d.p9913a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106593e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106588b;
import com.google.assistant.p4016z.C53714bl;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C130593b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130597f f357692a;

    /* renamed from: b */
    public final /* synthetic */ C53715bm f357693b;

    /* renamed from: c */
    public final /* synthetic */ long f357694c;

    public /* synthetic */ C130593b(C130597f fVar, C53715bm bmVar, long j) {
        this.f357692a = fVar;
        this.f357693b = bmVar;
        this.f357694c = j;
    }

    public final Object apply(Object obj) {
        C106532f fVar;
        C106588b bVar;
        C130597f fVar2 = this.f357692a;
        C53715bm bmVar = this.f357693b;
        long j = this.f357694c;
        ((C58970a) ((C58970a) C130597f.f357698a.mo56224b()).mo56372aa(38938)).mo56389s("Updating user context. Event: %s", C53714bl.m86892a(bmVar.f141023a).name());
        C106593e eVar = (C106593e) ((C106596h) obj).toBuilder();
        C63042fg i = C62953e.m95484i(fVar2.f357702e.mo26870b());
        eVar.copyOnWrite();
        C106596h hVar = (C106596h) eVar.instance;
        i.getClass();
        hVar.f297217l = i;
        hVar.f297206a |= 16384;
        eVar.copyOnWrite();
        C106596h hVar2 = (C106596h) eVar.instance;
        hVar2.f297206a |= 512;
        hVar2.f297215j = j;
        int ordinal = C53714bl.m86892a(bmVar.f141023a).ordinal();
        if (ordinal == 3) {
            if (bmVar.f141023a == 4) {
                fVar = (C106532f) bmVar.f141024b;
            } else {
                fVar = C106532f.f297078g;
            }
            C106529c cVar = C106529c.CONNECTED;
            C106529c a = C106529c.m177304a(fVar.f297081b);
            if (a == null) {
                a = C106529c.UNSPECIFIED;
            }
            boolean equals = cVar.equals(a);
            String str = fVar.f297083d;
            eVar.copyOnWrite();
            C106596h hVar3 = (C106596h) eVar.instance;
            str.getClass();
            hVar3.f297206a |= 64;
            hVar3.f297212g = str;
            C106531e a2 = C106531e.m177306a(fVar.f297082c);
            if (a2 == null) {
                a2 = C106531e.UNKNOWN;
            }
            eVar.copyOnWrite();
            C106596h hVar4 = (C106596h) eVar.instance;
            hVar4.f297207b = a2.f297077e;
            hVar4.f297206a |= 1;
            eVar.copyOnWrite();
            C106596h hVar5 = (C106596h) eVar.instance;
            hVar5.f297206a = 4 | hVar5.f297206a;
            hVar5.f297208c = equals;
            long j2 = fVar.f297084e;
            eVar.copyOnWrite();
            C106596h hVar6 = (C106596h) eVar.instance;
            hVar6.f297206a |= 32;
            hVar6.f297211f = j2;
            long j3 = 0;
            long b = equals ? fVar2.f357702e.mo26870b() : 0;
            eVar.copyOnWrite();
            C106596h hVar7 = (C106596h) eVar.instance;
            hVar7.f297206a |= 8;
            hVar7.f297209d = b;
            if (!equals) {
                j3 = fVar2.f357702e.mo26870b();
            }
            eVar.copyOnWrite();
            C106596h hVar8 = (C106596h) eVar.instance;
            hVar8.f297206a |= 16;
            hVar8.f297210e = j3;
        } else if (ordinal == 7) {
            if (bmVar.f141023a == 12) {
                bVar = (C106588b) bmVar.f141024b;
            } else {
                bVar = C106588b.f297185b;
            }
            eVar.copyOnWrite();
            ((C106596h) eVar.instance).f297214i = C106596h.emptyProtobufList();
            C62971cq cqVar = bVar.f297187a;
            eVar.copyOnWrite();
            C106596h hVar9 = (C106596h) eVar.instance;
            hVar9.mo95586a();
            C62947c.addAll((Iterable) cqVar, (List) hVar9.f297214i);
        }
        return (C106596h) eVar.build();
    }
}
