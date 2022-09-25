package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.android.apps.gsa.nga.engine.au.k;
import com.google.android.apps.gsa.nga.engine.p6040k.p6041a.C76231s;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76565ai;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6274a.C80055ai;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50579a;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50580b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62971cq;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.q */
/* compiled from: PG */
public final /* synthetic */ class C77340q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77349z f213294a;

    /* renamed from: b */
    public final /* synthetic */ C76590bg f213295b;

    /* renamed from: c */
    public final /* synthetic */ C79326x f213296c;

    public /* synthetic */ C77340q(C77349z zVar, C76590bg bgVar, C79326x xVar) {
        this.f213294a = zVar;
        this.f213295b = bgVar;
        this.f213296c = xVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77349z zVar = this.f213294a;
        C76590bg bgVar = this.f213295b;
        C79326x xVar = this.f213296c;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return optional;
        }
        if (!zVar.f213314c.mo85405j(C90126fx.f251476jY)) {
            return Optional.empty();
        }
        if (!zVar.f213314c.mo85405j(C90126fx.f251485jh)) {
            Optional g = bgVar.mo72265g(C76565ai.f211802a, "app");
            if (g.isEmpty()) {
                return Optional.empty();
            }
            Optional g2 = bgVar.mo72265g(C76564ah.f211801a, "webref_deeplink");
            if (g2.isEmpty() || C77349z.m124120d(bgVar).size() != 1) {
                return Optional.empty();
            }
            xVar.mo73900a(String.format("Using provided deeplink: %s", new Object[]{g2.get()}));
            C50579a aVar = (C50579a) C50580b.f131622c.createBuilder();
            String str = ((C63775d) g.get()).f172523d;
            aVar.copyOnWrite();
            str.getClass();
            ((C50580b) aVar.instance).f131624a = str;
            String str2 = (String) g2.get();
            aVar.copyOnWrite();
            str2.getClass();
            ((C50580b) aVar.instance).f131625b = str2;
            return zVar.f213313b.mo72144b(C76231s.m122803a(C58485gu.m89846n((C50580b) aVar.build())));
        }
        C58485gu c = bgVar.mo72261c("webref_deeplink", k.c);
        if (c.size() != 1 || C77349z.m124119c(bgVar).size() != 1) {
            return Optional.empty();
        }
        C62971cq<C80055ai> cqVar = ((k) c.get(0)).a;
        if (cqVar.isEmpty()) {
            return Optional.empty();
        }
        xVar.mo73900a(String.format("Using provided deeplinks: %s", new Object[]{cqVar}));
        C58480gp e = C58485gu.m89837e();
        for (C80055ai aiVar : cqVar) {
            C50579a aVar2 = (C50579a) C50580b.f131622c.createBuilder();
            String str3 = aiVar.f219684a;
            aVar2.copyOnWrite();
            str3.getClass();
            ((C50580b) aVar2.instance).f131624a = str3;
            String str4 = aiVar.f219685b;
            aVar2.copyOnWrite();
            str4.getClass();
            ((C50580b) aVar2.instance).f131625b = str4;
            e.mo55395g((C50580b) aVar2.build());
        }
        return zVar.f213313b.mo72144b(C76231s.m122803a(e.mo55394f()));
    }
}
