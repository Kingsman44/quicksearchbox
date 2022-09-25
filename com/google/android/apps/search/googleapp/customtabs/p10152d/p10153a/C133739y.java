package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import android.content.Context;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.p10154a.C133707a;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.p10154a.C133708b;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.android.libraries.p1703d.C20665u;
import com.google.android.libraries.p1703d.C20670z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.y */
/* compiled from: PG */
public final class C133739y {

    /* renamed from: e */
    private static final C59071e f364257e = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.d.a.y");

    /* renamed from: a */
    public final C60888db f364258a;

    /* renamed from: b */
    public final Object f364259b = new Object();

    /* renamed from: c */
    public final ConcurrentMap f364260c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Set f364261d = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: f */
    private final C133732r f364262f;

    /* renamed from: g */
    private final C20665u f364263g;

    /* renamed from: h */
    private final Object f364264h = new Object();

    /* renamed from: i */
    private int f364265i;

    /* renamed from: j */
    private C46423aj f364266j;

    public C133739y(C133732r rVar, C60888db dbVar, C21370a aVar, C20665u uVar) {
        this.f364262f = rVar;
        this.f364263g = uVar;
        this.f364258a = dbVar;
        this.f364265i = (int) (aVar.mo26871c() % 2147483648L);
        m216973e();
    }

    /* renamed from: e */
    private final void m216973e() {
        synchronized (this.f364264h) {
            int i = this.f364265i;
            this.f364265i = i + 1;
            this.f364266j = new C46423aj(new C133735u(this, i), this.f364258a);
        }
    }

    /* renamed from: a */
    public final C133731q mo111372a(C133712ad adVar) {
        C133731q qVar;
        synchronized (this.f364264h) {
            qVar = null;
            if (this.f364266j.f121487d.isDone()) {
                try {
                    qVar = (C133731q) C60856cj.m92909r(this.f364266j.mo50395b());
                } catch (ExecutionException e) {
                    ((C59052c) ((C59052c) ((C59052c) f364257e.mo56226d()).mo56382g(e)).mo56372aa(40114)).mo56386p("Session cannot be used because its creation failed");
                }
                m216973e();
            }
        }
        if (qVar != null) {
            synchronized (qVar) {
                if (!qVar.f364241j) {
                    C133713ae aeVar = (C133713ae) C133714af.f364207d.createBuilder();
                    int i = qVar.f364235d;
                    aeVar.copyOnWrite();
                    C133714af afVar = (C133714af) aeVar.instance;
                    afVar.f364209a |= 1;
                    afVar.f364210b = i;
                    aeVar.copyOnWrite();
                    C133714af afVar2 = (C133714af) aeVar.instance;
                    adVar.getClass();
                    afVar2.f364211c = adVar;
                    afVar2.f364209a |= 2;
                    qVar.f364240i = (C133714af) aeVar.build();
                    C133707a aVar = qVar.f364236e;
                    C133771b bVar = adVar.f364206c;
                    if (bVar == null) {
                        bVar = C133771b.f364368e;
                    }
                    aVar.mo111348h(bVar, false, qVar.f364234c);
                    qVar.f364241j = true;
                } else {
                    throw new IllegalStateException("Session was already prepared");
                }
            }
        }
        return qVar;
    }

    /* renamed from: b */
    public final C133731q mo111373b(int i, boolean z) {
        C20670z d;
        if (this.f364263g.mo25587k(30)) {
            d = this.f364263g.mo25659e(i);
        } else if (!z) {
            ((C59052c) ((C59052c) f364257e.mo56226d()).mo56372aa(40115)).mo56386p("CCT session id support is not available. Falling back to id-less sessions");
            d = this.f364263g.mo25658d();
        } else {
            throw new C133710ab("CCT session restoration is not supported");
        }
        C20670z zVar = d;
        if (zVar != null) {
            Integer iG = this.f364263g.mo25584iG();
            C133732r rVar = this.f364262f;
            C133737w wVar = new C133737w(this);
            C133738x xVar = new C133738x(this);
            C60888db dbVar = (C60888db) rVar.f364246a.mo17428b();
            dbVar.getClass();
            C133708b bVar = (C133708b) rVar.f364247b.mo17428b();
            bVar.getClass();
            C47770dh dhVar = (C47770dh) rVar.f364248c.mo17428b();
            dhVar.getClass();
            Set set = (Set) rVar.f364249d.mo17428b();
            set.getClass();
            Context context = (Context) rVar.f364250e.mo17428b();
            context.getClass();
            C133731q qVar = new C133731q(dbVar, bVar, dhVar, set, context, zVar, i, iG, wVar, xVar);
            this.f364260c.put(Integer.valueOf(i), new WeakReference(qVar));
            return qVar;
        }
        throw new C133710ab("The CCT session could not be created due to an internal error");
    }

    /* renamed from: c */
    public final C60870cx mo111374c() {
        C60870cx b;
        synchronized (this.f364264h) {
            b = this.f364266j.mo50395b();
        }
        return b;
    }

    /* renamed from: d */
    public final void mo111375d(C133731q qVar, boolean z) {
        int i = qVar.f364235d;
        if (z) {
            this.f364261d.add(Integer.valueOf(i));
        } else {
            this.f364261d.remove(Integer.valueOf(i));
        }
    }
}
