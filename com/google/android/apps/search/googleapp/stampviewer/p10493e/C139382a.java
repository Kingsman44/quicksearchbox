package com.google.android.apps.search.googleapp.stampviewer.p10493e;

import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4569o.C60315a;
import com.google.common.p4552o.p4569o.C60316b;
import com.google.protobuf.C62909aq;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.p4750c.C62948a;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.e.a */
/* compiled from: PG */
public final class C139382a {

    /* renamed from: a */
    public final C38553h f379010a;

    /* renamed from: b */
    private final C69464a f379011b;

    /* renamed from: c */
    private final boolean f379012c;

    /* renamed from: d */
    private final boolean f379013d;

    public C139382a(C69464a aVar, boolean z, boolean z2, C38553h hVar) {
        this.f379011b = aVar;
        this.f379012c = z;
        this.f379013d = z2;
        this.f379010a = hVar;
    }

    /* renamed from: a */
    public final void mo114939a(String str, Duration duration) {
        if (!this.f379010a.f101930a && this.f379013d) {
            C60315a aVar = (C60315a) C60316b.f163205e.createBuilder();
            aVar.copyOnWrite();
            C60316b bVar = (C60316b) aVar.instance;
            bVar.f163210c = 2;
            bVar.f163208a = 2 | bVar.f163208a;
            aVar.copyOnWrite();
            C60316b bVar2 = (C60316b) aVar.instance;
            str.getClass();
            bVar2.f163208a |= 1;
            bVar2.f163209b = str;
            C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
            long seconds = duration.getSeconds();
            aqVar.copyOnWrite();
            ((C62910ar) aqVar.instance).f169860a = seconds;
            int nano = duration.getNano();
            aqVar.copyOnWrite();
            ((C62910ar) aqVar.instance).f169861b = nano;
            C62910ar arVar = (C62910ar) aqVar.build();
            C62948a.m95465p(arVar);
            aVar.copyOnWrite();
            C60316b bVar3 = (C60316b) aVar.instance;
            arVar.getClass();
            bVar3.f163211d = arVar;
            bVar3.f163208a |= 4;
            mo114940b((C60316b) aVar.build());
        }
    }

    /* renamed from: b */
    public final void mo114940b(C60316b bVar) {
        C59743a aVar = C59743a.STAMP_VIEWER_ACTION_LOG_EVENT;
        C62940bt btVar = C60316b.f163206f;
        if (this.f379012c) {
            ((C38768q) this.f379011b.mo17428b()).mo41591c(aVar, btVar, bVar);
        } else {
            ((C38768q) this.f379011b.mo17428b()).mo41590b(aVar, btVar, bVar);
        }
    }
}
