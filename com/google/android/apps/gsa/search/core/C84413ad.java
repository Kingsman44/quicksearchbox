package com.google.android.apps.gsa.search.core;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.gms.common.C143700ab;
import com.google.android.libraries.gcoreclient.p1763h.p1769c.C21556a;
import com.google.android.libraries.gcoreclient.p1763h.p1769c.C21557b;
import com.google.android.libraries.gcoreclient.p1763h.p1769c.C21560e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60538tp;
import com.google.common.p4552o.C60539tq;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.ad */
/* compiled from: PG */
public final class C84413ad {

    /* renamed from: a */
    public static final C59071e f229680a = C59071e.m91332i("com.google.android.apps.gsa.search.core.ad");

    /* renamed from: b */
    public final C90929bz f229681b;

    /* renamed from: c */
    public final C90476a f229682c;

    /* renamed from: d */
    private final Context f229683d;

    /* renamed from: e */
    private final C22871g f229684e;

    /* renamed from: f */
    private final C69464a f229685f;

    /* renamed from: g */
    private final C69464a f229686g;

    /* renamed from: h */
    private final C69464a f229687h;

    /* renamed from: i */
    private final List f229688i = new ArrayList();

    /* renamed from: j */
    private C58833ax f229689j;

    /* renamed from: k */
    private C58833ax f229690k;

    /* renamed from: l */
    private C58833ax f229691l;

    /* renamed from: m */
    private BroadcastReceiver f229692m;

    public C84413ad(Context context, C90929bz bzVar, C22871g gVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C90476a aVar4) {
        this.f229683d = context;
        this.f229681b = bzVar;
        this.f229684e = gVar;
        this.f229685f = aVar;
        this.f229686g = aVar2;
        this.f229687h = aVar3;
        this.f229682c = aVar4;
        C58836b bVar = C58836b.f156633a;
        this.f229689j = bVar;
        this.f229690k = bVar;
        this.f229691l = bVar;
    }

    /* renamed from: j */
    private final int m134718j() {
        C21557b bVar = (C21557b) this.f229685f.mo17428b();
        return C143700ab.m233439a(this.f229683d);
    }

    @Deprecated
    /* renamed from: a */
    public final synchronized int mo77964a() {
        int intValue;
        if (this.f229692m == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addDataScheme("package");
            C21557b bVar = (C21557b) this.f229685f.mo17428b();
            intentFilter.addDataSchemeSpecificPart("com.google.android.gms", 0);
            intentFilter.addDataSchemeSpecificPart("com.android.vending", 0);
            C84394ab abVar = new C84394ab(this);
            this.f229692m = abVar;
            this.f229683d.registerReceiver(abVar, intentFilter);
        }
        if (!this.f229690k.mo56113h()) {
            this.f229690k = C58833ax.m90834k(Integer.valueOf(((C21556a) this.f229687h.mo17428b()).mo27012a(this.f229683d)));
            this.f229691l = C58833ax.m90834k(Integer.valueOf(m134718j()));
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 109;
            C60538tp tpVar = (C60538tp) C60539tq.f164014d.createBuilder();
            int intValue2 = ((Integer) this.f229690k.mo56107c()).intValue();
            tpVar.copyOnWrite();
            C60539tq tqVar = (C60539tq) tpVar.instance;
            tqVar.f164016a |= 1;
            tqVar.f164017b = intValue2;
            int intValue3 = ((Integer) this.f229691l.mo56107c()).intValue();
            tpVar.copyOnWrite();
            C60539tq tqVar2 = (C60539tq) tpVar.instance;
            tqVar2.f164016a |= 2;
            tqVar2.f164018c = intValue3;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C60539tq tqVar3 = (C60539tq) tpVar.build();
            tqVar3.getClass();
            ufVar2.f164067A = tqVar3;
            ufVar2.f164093a |= 1073741824;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        intValue = ((Integer) this.f229690k.mo56107c()).intValue();
        if (!this.f229689j.mo56113h() || intValue != ((Integer) this.f229689j.mo56107c()).intValue()) {
            C58976aa aaVar = C58975e.f156826a;
            synchronized (this.f229688i) {
                for (C84396ac a : this.f229688i) {
                    a.mo77954a(intValue);
                }
            }
            this.f229689j = C58833ax.m90834k(Integer.valueOf(intValue));
        }
        return intValue;
    }

    /* renamed from: b */
    public final int mo77965b() {
        int a = ((C21556a) this.f229687h.mo17428b()).mo27012a(this.f229683d);
        this.f229684e.mo28212l("getGooglePlayServicesAvailability", new C87251w(this));
        return a;
    }

    /* renamed from: c */
    public final synchronized int mo77966c() {
        if (!this.f229691l.mo56113h()) {
            this.f229691l = C58833ax.m90834k(Integer.valueOf(m134718j()));
        }
        return ((Integer) this.f229691l.mo56107c()).intValue();
    }

    /* renamed from: d */
    public final void mo77967d(C84396ac acVar) {
        synchronized (this.f229688i) {
            C58838bb.m90869d(!this.f229688i.contains(acVar), "listener already added");
            this.f229688i.add(acVar);
        }
    }

    /* renamed from: e */
    public final void mo77968e(C22871g gVar, C91043j jVar) {
        new C90873ag(this.f229684e.mo28201a("getGooglePlayServicesAvailability", new C87279x(this)), gVar, "Consume Play services availability", new C87282y(jVar)).mo85223a(new C87391z(jVar));
    }

    /* renamed from: f */
    public final synchronized void mo77969f() {
        C58836b bVar = C58836b.f156633a;
        this.f229690k = bVar;
        this.f229691l = bVar;
    }

    /* renamed from: g */
    public final boolean mo77970g(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return false;
        }
        return mo77972i(callingActivity.getPackageName());
    }

    /* renamed from: h */
    public final boolean mo77971h() {
        return mo77964a() == 0;
    }

    /* renamed from: i */
    public final boolean mo77972i(String str) {
        this.f229683d.getPackageManager();
        return ((C21560e) this.f229686g.mo17428b()).f59951a.mo119084c(str);
    }
}
