package com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a;

import com.google.android.libraries.search.assistant.p2828y.p2854o.C37043e;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a.C37026b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4117aw.p4118a.p4119a.C54624b;
import com.google.p4117aw.p4118a.p4119a.C54631i;
import com.google.p4117aw.p4118a.p4119a.C54632j;
import com.google.p4117aw.p4118a.p4119a.C54633k;
import com.google.p4117aw.p4118a.p4119a.C54634l;
import com.google.p4117aw.p4118a.p4119a.C54635m;
import com.google.p4117aw.p4118a.p4119a.C54636n;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.y.o.a.i */
/* compiled from: PG */
public final class C37038i implements C37035f {

    /* renamed from: a */
    private static final C59071e f96478a = C59071e.m91332i("com.google.android.libraries.search.assistant.y.o.a.i");

    /* renamed from: b */
    private final Executor f96479b;

    /* renamed from: c */
    private final C37043e f96480c;

    public C37038i(Executor executor, C37043e eVar) {
        this.f96479b = executor;
        this.f96480c = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo40545a(C37026b bVar) {
        return mo40546b(bVar, 200);
    }

    /* renamed from: b */
    public final C60870cx mo40546b(C37026b bVar, int i) {
        C54624b bVar2;
        C37026b bVar3 = C37026b.PKG_UNSPECIFIED;
        int ordinal = bVar.ordinal();
        if (ordinal == 1) {
            bVar2 = C54624b.PKG_MEDIA_ARTISTS;
        } else if (ordinal == 2) {
            bVar2 = C54624b.PKG_MEDIA_NON_ARTISTS;
        } else if (ordinal == 3) {
            bVar2 = C54624b.PKG_PEOPLE_TIER_1;
        } else if (ordinal != 4) {
            ((C59052c) ((C59052c) f96478a.mo56226d()).mo56372aa(52499)).mo56386p("Unexpected PkgContextDataType.PKG_UNSPECIFIED when creating PkgTopNamedEntitiesRequest.");
            bVar2 = C54624b.UNSPECIFIED;
        } else {
            bVar2 = C54624b.PKG_PEOPLE_TIER_2_EMAIL_CONTACTS;
        }
        C54631i iVar = (C54631i) C54636n.f143450b.createBuilder();
        C54634l lVar = (C54634l) C54635m.f143445d.createBuilder();
        lVar.copyOnWrite();
        C54635m mVar = (C54635m) lVar.instance;
        mVar.f143448b = bVar2.f143427v;
        mVar.f143447a |= 1;
        C54632j jVar = (C54632j) C54633k.f143441c.createBuilder();
        jVar.copyOnWrite();
        C54633k kVar = (C54633k) jVar.instance;
        kVar.f143443a = 1 | kVar.f143443a;
        kVar.f143444b = i;
        lVar.copyOnWrite();
        C54635m mVar2 = (C54635m) lVar.instance;
        C54633k kVar2 = (C54633k) jVar.build();
        kVar2.getClass();
        mVar2.f143449c = kVar2;
        mVar2.f143447a |= 2;
        iVar.mo54150a(lVar);
        C60870cx b = this.f96480c.mo40585b((C54636n) iVar.build());
        ((C59052c) ((C59052c) f96478a.mo56224b()).mo56372aa(52498)).mo56386p("Start fetching data from PkgAccessor");
        return C60922j.m93044g(b, C47810es.m84963c(C37037h.f96477a), this.f96479b);
    }
}
