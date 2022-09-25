package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89666i;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89667j;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89668k;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89669l;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89670m;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89671n;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89673p;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95225al;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60060ji;
import com.google.common.p4552o.C60061jj;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.g */
/* compiled from: PG */
public final class C95258g {

    /* renamed from: a */
    public static final C59071e f266509a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.d.g");

    /* renamed from: h */
    private static final long f266510h = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b */
    public final C22871g f266511b;

    /* renamed from: c */
    public final C68214a f266512c;

    /* renamed from: d */
    public final C95850a f266513d;

    /* renamed from: e */
    public final C95261j f266514e;

    /* renamed from: f */
    public final String f266515f;

    /* renamed from: g */
    public C60870cx f266516g;

    /* renamed from: i */
    private final C22871g f266517i;

    /* renamed from: j */
    private final C68214a f266518j;

    /* renamed from: k */
    private final C95263l f266519k;

    /* renamed from: l */
    private final C89673p f266520l;

    /* renamed from: m */
    private final C89666i f266521m;

    /* renamed from: n */
    private final C95262k f266522n;

    /* renamed from: o */
    private final C89668k f266523o;

    /* renamed from: p */
    private final C95269r f266524p;

    /* renamed from: q */
    private final C89656k f266525q;

    /* renamed from: r */
    private final Context f266526r;

    public C95258g(C95355bf bfVar, Context context, C22871g gVar, C89668k kVar, C89673p pVar, C95264m mVar, C89666i iVar, C95262k kVar2, C95269r rVar, C22871g gVar2, C89656k kVar3, C68214a aVar, C68214a aVar2) {
        C95264m mVar2 = mVar;
        this.f266515f = bfVar.mo89270k();
        this.f266511b = gVar;
        C95850a aVar3 = new C95850a();
        this.f266513d = aVar3;
        C95225al alVar = new C95225al(gVar, gVar2, context, aVar3, aVar, bfVar);
        alVar.mo89142f();
        this.f266526r = context;
        this.f266517i = gVar2;
        this.f266523o = kVar;
        this.f266520l = pVar;
        Context context2 = (Context) mVar2.f266553a.mo17428b();
        context2.getClass();
        C96628d dVar = (C96628d) mVar2.f266554b.mo17428b();
        dVar.getClass();
        C95357bh bhVar = (C95357bh) mVar2.f266555c.mo17428b();
        bhVar.getClass();
        bfVar.getClass();
        C95355bf bfVar2 = bfVar;
        this.f266519k = new C95263l(context2, dVar, bhVar, bfVar);
        this.f266521m = iVar;
        this.f266522n = kVar2;
        this.f266524p = rVar;
        this.f266514e = new C95261j(alVar);
        this.f266525q = kVar3;
        this.f266512c = aVar;
        this.f266518j = aVar2;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo89184a(List list) {
        C89671n nVar;
        C89670m mVar;
        synchronized (this) {
            C60870cx cxVar = this.f266516g;
            if (cxVar != null) {
                return cxVar;
            }
            C95260i iVar = (C95260i) this.f266518j.mo27525b();
            C59104x b = C95260i.f266539a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AudioPathTestLogger");
            ((C59052c) ((C59052c) b).mo56372aa(14797)).mo56386p("startSession");
            iVar.f266541c = String.valueOf(C90719ac.f253778a.f253779b.nextLong());
            iVar.f266542d.clear();
            C60060ji jiVar = iVar.f266542d;
            jiVar.copyOnWrite();
            C60061jj jjVar = (C60061jj) jiVar.instance;
            C60061jj jjVar2 = C60061jj.f162338j;
            jjVar.f162340a |= 256;
            jjVar.f162347h = 4;
            if (this.f266525q.mo83553h("key_send_diagnostics")) {
                BluetoothAdapter.getDefaultAdapter().getProfileProxy(this.f266526r, new C95257f(this, iVar), 2);
            }
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            C60870cx i = C60856cj.m92900i(concurrentHashMap);
            Iterator it = list.iterator();
            C60870cx cxVar2 = i;
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (intValue != 1) {
                    nVar = this.f266520l;
                } else {
                    nVar = this.f266519k;
                }
                C89671n nVar2 = nVar;
                if (intValue != 1) {
                    mVar = this.f266521m;
                } else {
                    mVar = this.f266522n;
                }
                C89670m mVar2 = mVar;
                C89668k kVar = this.f266523o;
                C60870cx c = this.f266524p.mo89188c();
                nVar2.getClass();
                mVar2.getClass();
                C22871g gVar = (C22871g) kVar.f242786a.mo17428b();
                gVar.getClass();
                C89669l lVar = (C89669l) kVar.f242787b.mo17428b();
                lVar.getClass();
                cxVar2 = this.f266511b.mo28210j(cxVar2, String.format(Locale.US, "after testing profile=%d", new Object[]{Integer.valueOf(intValue)}), new C95252a(this, intValue, new C89667j(nVar2, mVar2, c, 9000, gVar, lVar), concurrentHashMap, iVar));
            }
            C60870cx e = C90877ak.m148471e(cxVar2, f266510h, TimeUnit.MILLISECONDS, this.f266517i);
            this.f266516g = e;
            new C90873ag(e, this.f266511b, "after audio test", new C95253b(this, concurrentHashMap)).mo85223a(new C95254c(this));
            return e;
        }
    }
}
