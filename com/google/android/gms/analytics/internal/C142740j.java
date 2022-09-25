package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.C142698e;
import com.google.android.gms.analytics.C142764q;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;

/* renamed from: com.google.android.gms.analytics.internal.j */
/* compiled from: PG */
public final class C142740j {

    /* renamed from: a */
    public static volatile C142740j f387333a;

    /* renamed from: b */
    public final Context f387334b;

    /* renamed from: c */
    public final Context f387335c;

    /* renamed from: d */
    public final C142708ae f387336d = new C142708ae(this);

    /* renamed from: e */
    public final C142722as f387337e;

    /* renamed from: f */
    public final C142726aw f387338f;

    /* renamed from: g */
    public final C142712ai f387339g;

    /* renamed from: h */
    public final C144006f f387340h = C144006f.f390244a;

    /* renamed from: i */
    private final C142764q f387341i;

    /* renamed from: j */
    private final C142735e f387342j;

    /* renamed from: k */
    private final C142713aj f387343k;

    /* renamed from: l */
    private final C142732bb f387344l;

    /* renamed from: m */
    private final C142698e f387345m;

    /* renamed from: n */
    private final C142705ab f387346n;

    /* renamed from: o */
    private final C142703a f387347o;

    /* renamed from: p */
    private final C142750t f387348p;

    public C142740j(C142741k kVar) {
        Context context = kVar.f387349a;
        C143919bh.m233971n(context, "Application context can't be null");
        Context context2 = kVar.f387350b;
        C143919bh.m233958a(context2);
        this.f387334b = context;
        this.f387335c = context2;
        C142722as asVar = new C142722as(this);
        asVar.mo117538l();
        this.f387337e = asVar;
        C142722as h = mo117548h();
        String str = C142738h.f387330a;
        h.mo117536i(4, "Google Analytics " + str + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4", (Object) null, (Object) null, (Object) null);
        C142726aw awVar = new C142726aw(this);
        awVar.mo117538l();
        this.f387338f = awVar;
        C142732bb bbVar = new C142732bb(this);
        bbVar.mo117538l();
        this.f387344l = bbVar;
        C142735e eVar = new C142735e(this);
        C142705ab abVar = new C142705ab(this);
        C142703a aVar = new C142703a(this);
        C142750t tVar = new C142750t(this);
        C142712ai aiVar = new C142712ai(this);
        C143919bh.m233958a(context);
        if (C142764q.f387398a == null) {
            synchronized (C142764q.class) {
                if (C142764q.f387398a == null) {
                    C142764q.f387398a = new C142764q(context);
                }
            }
        }
        C142764q qVar = C142764q.f387398a;
        qVar.f387403f = new C142739i(this);
        this.f387341i = qVar;
        C142698e eVar2 = new C142698e(this);
        abVar.mo117538l();
        this.f387346n = abVar;
        aVar.mo117538l();
        this.f387347o = aVar;
        tVar.mo117538l();
        this.f387348p = tVar;
        aiVar.mo117538l();
        this.f387339g = aiVar;
        C142713aj ajVar = new C142713aj(this);
        ajVar.mo117538l();
        this.f387343k = ajVar;
        eVar.mo117538l();
        this.f387342j = eVar;
        C142732bb j = eVar2.f387167a.mo117550j();
        j.mo117537k();
        j.mo117537k();
        if (j.f387322f) {
            j.mo117537k();
            eVar2.f387206d = j.f387323g;
        }
        j.mo117537k();
        eVar2.f387205c = true;
        this.f387345m = eVar2;
        C142755y yVar = eVar.f387327a;
        yVar.mo117537k();
        C143919bh.m233967j(!yVar.f387379a, "Analytics backend already started");
        yVar.f387379a = true;
        yVar.f387328e.mo117542b().mo117603c(new C142753w(yVar));
    }

    /* renamed from: k */
    private static final void m231625k(C142737g gVar) {
        C143919bh.m233971n(gVar, "Analytics service not created/initialized");
        C143919bh.m233960c(gVar.mo117539m(), "Analytics service not initialized");
    }

    /* renamed from: a */
    public final C142698e mo117541a() {
        C143919bh.m233958a(this.f387345m);
        C143919bh.m233960c(this.f387345m.f387205c, "Analytics instance not initialized");
        return this.f387345m;
    }

    /* renamed from: b */
    public final C142764q mo117542b() {
        C143919bh.m233958a(this.f387341i);
        return this.f387341i;
    }

    /* renamed from: c */
    public final C142703a mo117543c() {
        m231625k(this.f387347o);
        return this.f387347o;
    }

    /* renamed from: d */
    public final C142735e mo117544d() {
        m231625k(this.f387342j);
        return this.f387342j;
    }

    /* renamed from: e */
    public final C142750t mo117545e() {
        m231625k(this.f387348p);
        return this.f387348p;
    }

    /* renamed from: f */
    public final C142705ab mo117546f() {
        m231625k(this.f387346n);
        return this.f387346n;
    }

    /* renamed from: g */
    public final C142713aj mo117547g() {
        m231625k(this.f387343k);
        return this.f387343k;
    }

    /* renamed from: h */
    public final C142722as mo117548h() {
        m231625k(this.f387337e);
        return this.f387337e;
    }

    /* renamed from: i */
    public final C142726aw mo117549i() {
        m231625k(this.f387338f);
        return this.f387338f;
    }

    /* renamed from: j */
    public final C142732bb mo117550j() {
        m231625k(this.f387344l);
        return this.f387344l;
    }
}
