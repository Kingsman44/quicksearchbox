package com.google.android.apps.search.googleapp.discover.p10175ab.p10177b;

import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40023ad;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40025af;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.C57052a;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57163t;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57774f;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.discover.ab.b.c */
/* compiled from: PG */
public final class C134094c {

    /* renamed from: a */
    private final Executor f365275a;

    /* renamed from: b */
    private final C38750am f365276b;

    /* renamed from: c */
    private final C38487e f365277c;

    public C134094c(C38487e eVar, Executor executor, C38750am amVar) {
        this.f365277c = eVar;
        this.f365275a = executor;
        this.f365276b = amVar;
    }

    /* renamed from: b */
    public static C57057b m217543b(C57696b bVar, C57528m mVar) {
        Object obj;
        C57052a aVar;
        C57774f fVar = bVar.f154150k;
        if (fVar == null) {
            fVar = C57774f.f154362a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C57163t.f152606d);
        fVar.mo58887l(r0);
        Object l = fVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C57163t tVar = (C57163t) obj;
        if ((tVar.f152608a & 1) != 0) {
            C57057b bVar2 = tVar.f152609b;
            if (bVar2 == null) {
                bVar2 = C57057b.f152311e;
            }
            aVar = (C57052a) bVar2.toBuilder();
        } else {
            aVar = (C57052a) C57057b.f152311e.createBuilder();
        }
        aVar.copyOnWrite();
        C57057b bVar3 = (C57057b) aVar.instance;
        bVar3.f152316d = mVar.f153693B;
        bVar3.f152313a |= 4;
        return (C57057b) aVar.build();
    }

    /* renamed from: a */
    public final C40027ah mo111555a(C134766q qVar) {
        C59743a aVar;
        C47633f h = this.f365277c.mo41441a().mo51515h(C134092a.f365273a, this.f365275a);
        C38750am amVar = this.f365276b;
        C59743a aVar2 = C59743a.AADC_CONSENT_CHANGED;
        C60856cj.m92900i(C60555uf.f164065cO);
        int i = C40023ad.f105179a;
        C58838bb.m90869d(!qVar.mo111973a().equals(C134699b.CLEARCUT_EVENT_TYPE_UNSPECIFIED), "Must specify a clearcut log event type.");
        int ordinal = qVar.mo111973a().ordinal();
        if (ordinal == 1) {
            aVar = C59743a.NOW_VISUAL_ELEMENTS_INTERACTION_LOG_EVENT;
        } else if (ordinal == 2) {
            aVar = C59743a.DISCOVER_CHANNELS_VISUAL_ELEMENTS_INTERACTION_LOG_EVENT;
        } else {
            throw new AssertionError("Switch case above should be exhaustive. If not, go/bugpattern/MissingCasesInEnumSwitch will break you or compilation failed.");
        }
        return new C40025af(amVar, aVar, h, new C134093b(qVar), true);
    }
}
