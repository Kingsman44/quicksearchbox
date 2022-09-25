package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p814c;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a.p1289e.C16538a;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a.p1289e.C16539b;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62947c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.c.f */
/* compiled from: PG */
public final class C12533f extends C68247h {

    /* renamed from: a */
    private final C68283d f39465a;

    /* renamed from: c */
    private final C68283d f39466c;

    public C12533f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C12533f.class), aVar);
        this.f39465a = C68236af.m98549d(dVar);
        this.f39466c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Map map = (Map) list.get(1);
        C16538a aVar = (C16538a) C16539b.f48527b.createBuilder();
        C12989g a = C12989g.m29225a(((C12991i) list.get(0)).f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (!map.containsKey(a)) {
            ((C59052c) ((C59052c) C12532e.f39464a.mo56226d()).mo56372aa(44290)).mo56389s("No SupportedClientOps for EntrySurface: %s. Returning empty DeviceCapabilitiesParams", a.name());
            return C60856cj.m92900i((C16539b) aVar.build());
        }
        try {
            aVar.copyOnWrite();
            C16539b bVar = (C16539b) aVar.instance;
            bVar.mo22929a();
            C62947c.addAll((Iterable) ((C69464a) map.get(a)).mo17428b(), (List) bVar.f48529a);
        } catch (NullPointerException e) {
            ((C59052c) ((C59052c) ((C59052c) C12532e.f39464a.mo56226d()).mo56382g(e)).mo56372aa(44289)).mo56389s("SupportedClientOps for EntrySurface: %s could not be provided. Returning empty DeviceCapabilitiesParams", a.name());
        }
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "mic.UPDATE";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 1;
        aVar.copyOnWrite();
        C16539b bVar2 = (C16539b) aVar.instance;
        C51785da daVar3 = (C51785da) czVar.build();
        daVar3.getClass();
        bVar2.mo22929a();
        bVar2.f48529a.add(daVar3);
        return C60856cj.m92900i((C16539b) aVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39465a.mo60297gq(), this.f39466c.mo60297gq());
    }
}
