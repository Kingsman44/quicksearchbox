package com.google.android.apps.gsa.staticplugins.nowstream.shared;

import android.text.TextUtils;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91788al;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91800g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91801h;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.c */
/* compiled from: PG */
public final class C105426c {

    /* renamed from: a */
    public static final C8142xb f294058a = C8142xb.SEARCH_NOW_MONET;

    /* renamed from: a */
    public static C91801h m175128a(List list, C7669fo foVar, String str, String str2, boolean z, C91788al alVar, String str3) {
        C91800g gVar = (C91800g) C91801h.f256011n.createBuilder();
        gVar.copyOnWrite();
        C91801h hVar = (C91801h) gVar.instance;
        str.getClass();
        hVar.f256013a |= 64;
        hVar.f256020h = str;
        gVar.copyOnWrite();
        C91801h hVar2 = (C91801h) gVar.instance;
        C62971cq cqVar = hVar2.f256019g;
        if (!cqVar.mo58948c()) {
            hVar2.f256019g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) hVar2.f256019g);
        gVar.copyOnWrite();
        C91801h hVar3 = (C91801h) gVar.instance;
        hVar3.f256013a |= 8;
        hVar3.f256016d = z;
        if (foVar != null) {
            gVar.copyOnWrite();
            C91801h hVar4 = (C91801h) gVar.instance;
            hVar4.f256018f = foVar;
            hVar4.f256013a |= 32;
        }
        if (!TextUtils.isEmpty(str2)) {
            gVar.copyOnWrite();
            C91801h hVar5 = (C91801h) gVar.instance;
            str2.getClass();
            hVar5.f256013a |= 128;
            hVar5.f256021i = str2;
        }
        if (alVar != null) {
            gVar.copyOnWrite();
            C91801h hVar6 = (C91801h) gVar.instance;
            hVar6.f256022j = alVar;
            hVar6.f256013a |= 256;
        }
        if (str3 != null) {
            gVar.copyOnWrite();
            C91801h hVar7 = (C91801h) gVar.instance;
            hVar7.f256013a |= 1024;
            hVar7.f256024l = str3;
        }
        return (C91801h) gVar.build();
    }
}
