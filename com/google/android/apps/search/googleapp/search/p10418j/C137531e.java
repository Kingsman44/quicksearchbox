package com.google.android.apps.search.googleapp.search.p10418j;

import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.libraries.search.assistant.p2704m.C34807b;
import com.google.android.libraries.search.assistant.p2704m.C34809d;
import com.google.android.libraries.search.assistant.p2704m.C34812g;
import com.google.android.libraries.search.assistant.p2704m.C34816k;
import com.google.android.libraries.search.udcdataservice.C41385a;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41388d;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.android.libraries.search.udcdataservice.C41408g;
import com.google.android.libraries.search.udcdataservice.C41409h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.p4671b.C61819l;
import com.google.knowledge.p4671b.C61820m;
import com.google.knowledge.p4671b.C61829v;
import com.google.knowledge.p4671b.C61832y;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.search.j.e */
/* compiled from: PG */
public final class C137531e {

    /* renamed from: a */
    public static final C59071e f374060a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.j.e");

    /* renamed from: d */
    private static final C41387c[] f374061d = {C41387c.DEVICE_APPS, C41387c.DEVICE_CONTACTS, C41387c.WEB_AND_APP_HISTORY, C41387c.WEB_HISTORY, C41387c.AUDIO_HISTORY};

    /* renamed from: b */
    public final Object f374062b = new Object();

    /* renamed from: c */
    public boolean f374063c = false;

    /* renamed from: e */
    private final C137396a f374064e;

    /* renamed from: f */
    private final C41409h f374065f;

    /* renamed from: g */
    private final Executor f374066g;

    /* renamed from: h */
    private final C34809d f374067h;

    /* renamed from: i */
    private C60870cx f374068i;

    public C137531e(C137396a aVar, C41409h hVar, C34809d dVar, Executor executor) {
        this.f374064e = aVar;
        this.f374065f = hVar;
        this.f374066g = executor;
        this.f374067h = dVar;
    }

    /* renamed from: b */
    public static C61819l m223407b() {
        C61819l lVar = (C61819l) C61820m.f167020J.createBuilder();
        C41387c[] cVarArr = f374061d;
        int length = cVarArr.length;
        for (int i = 0; i < 5; i++) {
            C41387c cVar = cVarArr[i];
            C41388d dVar = (C41388d) C41389e.f108143e.createBuilder();
            dVar.copyOnWrite();
            C41389e eVar = (C41389e) dVar.instance;
            eVar.f108146b = cVar.f108142h;
            eVar.f108145a |= 1;
            dVar.copyOnWrite();
            C41389e eVar2 = (C41389e) dVar.instance;
            eVar2.f108147c = 0;
            eVar2.f108145a |= 2;
            dVar.copyOnWrite();
            C41389e eVar3 = (C41389e) dVar.instance;
            eVar3.f108148d = 0;
            eVar3.f108145a |= 4;
            m223408d(lVar, (C41389e) dVar.build());
        }
        return lVar;
    }

    /* renamed from: d */
    public static void m223408d(C61819l lVar, C41389e eVar) {
        C34807b bVar = C34807b.NOT_ELIGIBLE;
        C41387c cVar = C41387c.DEFAULT;
        C41387c a = C41387c.m72380a(eVar.f108146b);
        if (a == null) {
            a = C41387c.DEFAULT;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            C61832y e = m223409e(eVar);
            lVar.copyOnWrite();
            C61820m mVar = (C61820m) lVar.instance;
            C61820m mVar2 = C61820m.f167020J;
            e.getClass();
            mVar.f167039i = e;
            mVar.f167031a |= 64;
        } else if (ordinal == 2) {
            C61832y e2 = m223409e(eVar);
            lVar.copyOnWrite();
            C61820m mVar3 = (C61820m) lVar.instance;
            C61820m mVar4 = C61820m.f167020J;
            e2.getClass();
            mVar3.f167041k = e2;
            mVar3.f167031a |= 512;
        } else if (ordinal == 3) {
            C61832y e3 = m223409e(eVar);
            lVar.copyOnWrite();
            C61820m mVar5 = (C61820m) lVar.instance;
            C61820m mVar6 = C61820m.f167020J;
            e3.getClass();
            mVar5.f167042l = e3;
            mVar5.f167031a |= 1024;
        } else if (ordinal == 5) {
            C61832y e4 = m223409e(eVar);
            lVar.copyOnWrite();
            C61820m mVar7 = (C61820m) lVar.instance;
            C61820m mVar8 = C61820m.f167020J;
            e4.getClass();
            mVar7.f167037g = e4;
            mVar7.f167031a |= 16;
        } else if (ordinal == 6) {
            C61832y e5 = m223409e(eVar);
            lVar.copyOnWrite();
            C61820m mVar9 = (C61820m) lVar.instance;
            C61820m mVar10 = C61820m.f167020J;
            e5.getClass();
            mVar9.f167038h = e5;
            mVar9.f167031a |= 32;
        }
    }

    /* renamed from: e */
    private static C61832y m223409e(C41389e eVar) {
        C61829v vVar = (C61829v) C61832y.f167087d.createBuilder();
        int a = C41408g.m72395a(eVar.f108148d);
        int i = 6;
        if (a != 0 && a == 2) {
            i = 2;
        }
        vVar.copyOnWrite();
        C61832y yVar = (C61832y) vVar.instance;
        yVar.f167090b = i - 1;
        boolean z = true;
        yVar.f167089a |= 1;
        int a2 = C41408g.m72395a(eVar.f108147c);
        if (a2 == 0 || a2 != 2) {
            z = false;
        }
        vVar.copyOnWrite();
        C61832y yVar2 = (C61832y) vVar.instance;
        yVar2.f167089a |= 2;
        yVar2.f167091c = z;
        return (C61832y) vVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo113798a() {
        C60870cx cxVar;
        synchronized (this.f374062b) {
            if (!this.f374063c) {
                cxVar = this.f374065f.mo43949b(f374061d, C41385a.SEARCH);
            } else {
                cxVar = this.f374065f.mo43948a(f374061d, C41385a.SEARCH);
            }
        }
        C60870cx f = this.f374064e.mo103986f();
        C137529c cVar = C137529c.f374058a;
        C60870cx g = C60922j.m93044g(f, C47810es.m84963c(cVar), this.f374066g);
        C34809d dVar = this.f374067h;
        C60870cx a = C70876o.m103760a(dVar.f189039a.mo39510a(C34812g.m63574a(), dVar.f189040b), C34816k.f92352a);
        return C47636i.m84744c(cxVar, g, a).mo51518a(new C137528b(this, cxVar, a, g), this.f374066g);
    }

    /* renamed from: c */
    public final void mo113799c() {
        synchronized (this.f374062b) {
            if (this.f374068i == null && !this.f374063c) {
                C60870cx c = this.f374065f.mo43950c(C41385a.SEARCH);
                this.f374068i = c;
                C137530d dVar = new C137530d(this);
                C60856cj.m92911t(c, C47810es.m84974n(dVar), C60826bg.f164896a);
            }
        }
    }
}
