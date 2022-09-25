package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.gsa.h.e.a;
import com.google.android.apps.gsa.h.e.c;
import com.google.android.apps.gsa.h.e.d;
import com.google.android.apps.gsa.h.e.e;
import com.google.android.apps.gsa.h.e.f;
import com.google.android.apps.search.googleapp.collections.C133514l;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.activity.bg */
/* compiled from: PG */
public final /* synthetic */ class C133420bg implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139767h f363550a;

    /* renamed from: b */
    public final /* synthetic */ boolean f363551b;

    public /* synthetic */ C133420bg(C139767h hVar, boolean z) {
        this.f363550a = hVar;
        this.f363551b = z;
    }

    public final Object apply(Object obj) {
        C133514l lVar;
        d dVar;
        C139767h hVar = this.f363550a;
        boolean z = this.f363551b;
        if (((Boolean) obj).booleanValue()) {
            return C133421bh.m216558b(hVar);
        }
        C139770k kVar = hVar.f379877g;
        if (kVar == null) {
            kVar = C139770k.f379882c;
        }
        if (kVar.f379884a == 3) {
            lVar = (C133514l) kVar.f379885b;
        } else {
            lVar = C133514l.f363786c;
        }
        String str = lVar.f363789b;
        C133425d dVar2 = (C133425d) C133426e.f363567e.createBuilder();
        C139779t tVar = C139779t.COLLECTIONS;
        dVar2.copyOnWrite();
        C133426e eVar = (C133426e) dVar2.instance;
        eVar.f363572d = tVar.f379907i;
        eVar.f363569a |= 1;
        if (str.isEmpty()) {
            e createBuilder = f.c.createBuilder();
            createBuilder.copyOnWrite();
            f fVar = createBuilder.instance;
            fVar.a |= 2;
            fVar.b = z;
            c createBuilder2 = d.c.createBuilder();
            f build = createBuilder.build();
            createBuilder2.copyOnWrite();
            d dVar3 = createBuilder2.instance;
            build.getClass();
            dVar3.b = build;
            dVar3.a = 1;
            dVar = (d) createBuilder2.build();
        } else {
            dVar = a.b(str);
        }
        dVar2.copyOnWrite();
        C133426e eVar2 = (C133426e) dVar2.instance;
        dVar.getClass();
        eVar2.f363571c = dVar;
        eVar2.f363570b = 5;
        return C133421bh.m216557a((C133426e) dVar2.build());
    }
}
