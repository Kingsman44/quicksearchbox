package com.google.android.libraries.elements.p1714d;

import android.os.Handler;
import android.os.Looper;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.widget.C6558w;
import com.google.android.libraries.elements.interfaces.C21233ac;
import com.google.android.libraries.elements.interfaces.C21239ai;
import com.google.android.libraries.elements.interfaces.C21249as;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.p1727f.C21166o;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.p370af.C7490c;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.p5166b.C66083aq;
import com.google.protos.youtube.elements.p5166b.C66084ar;
import com.google.protos.youtube.elements.p5166b.C66086at;
import com.google.protos.youtube.elements.p5166b.C66096bc;
import com.google.protos.youtube.elements.p5166b.C66097bd;
import com.youtube.p5283a.p5284a.C68039ab;
import com.youtube.p5283a.p5284a.C68044ag;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69826b;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69942aw;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.al */
/* compiled from: PG */
public final class C20799al {

    /* renamed from: a */
    public static final C20920dp f58231a;

    /* renamed from: b */
    public static final Handler f58232b = new Handler(Looper.getMainLooper());

    static {
        C7490c cVar = new C7490c(1024);
        C7490c cVar2 = new C7490c(1024);
        cVar2.mo16906n(1);
        cVar2.mo16911t(cVar2.mo16895c());
        cVar2.mo16902j();
        cVar.mo16911t(C68039ab.m98252h(cVar, C68044ag.m98267g(cVar, 158796327, cVar.mo16893a(cVar2.f24688a.array()), 1), 0, 0, 0));
        cVar.mo16902j();
        f58231a = new C20814b(C68039ab.m98253j(cVar.f24688a), (C21166o) null);
    }

    /* renamed from: a */
    static void m39038a(C6411u uVar, C6281fx fxVar, C21249as asVar, C69802a aVar, C21239ai aiVar, @C6118b C20798ak akVar, @C6118b C70120l lVar, @C6118b C21319z zVar, @C6118b C21259bb bbVar, @C6118b boolean z, @C6118b boolean z2) {
        C20869ct ctVar = new C20869ct(bbVar, asVar, zVar, aiVar, aVar);
        fxVar.f18496a = ctVar;
        m39042e(ctVar, uVar, zVar, akVar, lVar, bbVar, z, z2);
        C69802a aVar2 = aVar;
        aVar.mo61462b(ctVar);
    }

    /* renamed from: b */
    static void m39039b(C6281fx fxVar) {
        int i;
        Integer num = (Integer) fxVar.f18496a;
        if (num == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        fxVar.f18496a = Integer.valueOf(i + 1);
    }

    /* renamed from: c */
    static C6407q m39040c(C6411u uVar, C20869ct ctVar, @C6118b C20798ak akVar, @C6118b C70120l lVar, @C6118b C21319z zVar, @C6118b C21259bb bbVar, @C6118b C21292ch chVar, @C6118b boolean z, @C6118b boolean z2) {
        C6407q a;
        C20869ct ctVar2 = ctVar;
        C20798ak akVar2 = akVar;
        C21292ch chVar2 = chVar;
        C69826b l = zVar.mo26811l();
        if (l instanceof C69802a) {
            ctVar.mo25991c((C69802a) l);
        }
        if (ctVar2.f58533g != lVar) {
            if (!(akVar2 == null || (a = ctVar.mo25989a()) == null)) {
                C20868cs csVar = ctVar2.f58532f;
                C20798ak akVar3 = csVar != null ? csVar.f58523a : null;
                if (akVar3 != null && !ctVar.mo25859e() && akVar.equals(akVar3)) {
                    return a.mo13318j();
                }
            }
            ctVar.dispose();
        }
        if (ctVar.mo25859e()) {
            m39042e(ctVar, uVar, zVar, akVar, lVar, bbVar, z, z2);
            if (l != null) {
                l.mo61462b(ctVar);
            }
            C6411u uVar2 = uVar;
        } else {
            C6411u uVar3 = uVar;
            ctVar.mo25992d(uVar);
        }
        C6407q a2 = ctVar.mo25989a();
        if (a2 == null) {
            chVar2.mo26277e(true);
            return C6558w.m17858b(uVar).f19531a;
        }
        chVar2.mo26277e(false);
        return a2.mo13318j();
    }

    /* renamed from: d */
    static void m39041d(@C6118b C21319z zVar, @C6118b C20798ak akVar, @C6118b C69464a aVar, @C6118b C21233ac acVar) {
        if (acVar.mo26165b()) {
            C66083aq aqVar = (C66083aq) C66084ar.f179702d.createBuilder();
            C66086at f = C21168q.m39752f(zVar);
            aqVar.copyOnWrite();
            C66084ar arVar = (C66084ar) aqVar.instance;
            f.getClass();
            arVar.f179705b = f;
            arVar.f179704a |= 1;
            String c = C20794ag.m39030c(akVar.f58229a.mo16918f(14));
            aqVar.copyOnWrite();
            C66084ar arVar2 = (C66084ar) aqVar.instance;
            c.getClass();
            arVar2.f179704a |= 2;
            arVar2.f179706c = c;
            C66084ar arVar3 = (C66084ar) aqVar.build();
            C66096bc bcVar = (C66096bc) C66097bd.f179735e.createBuilder();
            C63042fg d = C21168q.m39750d();
            bcVar.copyOnWrite();
            C66097bd bdVar = (C66097bd) bcVar.instance;
            d.getClass();
            bdVar.f179740d = d;
            bdVar.f179737a |= 1;
            bcVar.copyOnWrite();
            C66097bd bdVar2 = (C66097bd) bcVar.instance;
            arVar3.getClass();
            bdVar2.f179739c = arVar3;
            bdVar2.f179738b = 9;
            ((DebuggerClient) aVar.mo17428b()).sendTimelineEvent(((C66097bd) bcVar.build()).toByteArray());
        }
    }

    /* renamed from: e */
    private static void m39042e(C20869ct ctVar, C6411u uVar, C21319z zVar, C20798ak akVar, C70120l lVar, C21259bb bbVar, boolean z, boolean z2) {
        C6411u uVar2 = uVar;
        C69942aw awVar = new C69942aw(lVar, new C20797aj(bbVar, zVar, z2, uVar2, z));
        C69822d dVar = C70101a.f186843k;
        ctVar.mo25993f(lVar, awVar, zVar, uVar2, akVar);
        ctVar.mo25990b();
    }
}
