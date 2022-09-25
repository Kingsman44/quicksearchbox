package com.google.android.libraries.notifications.p2268e.p2271b.p2272a;

import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2266c.C29783b;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2268e.p2281g.C29895f;
import com.google.android.libraries.notifications.p2268e.p2281g.C29896g;
import com.google.android.libraries.notifications.p2268e.p2287j.C29953d;
import com.google.android.libraries.notifications.p2268e.p2287j.C29956g;
import com.google.android.libraries.notifications.p2293h.C30015h;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.p4160bf.p4161a.p4163b.C55441ae;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.p4160bf.p4161a.p4163b.C55491ca;
import com.google.p4160bf.p4161a.p4163b.C55492cb;
import com.google.p4160bf.p4161a.p4163b.C55502j;
import com.google.p4160bf.p4161a.p4163b.C55503k;
import com.google.p4160bf.p4164b.p4165a.C55661cq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55526af;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55575k;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55586v;
import com.google.p4160bf.p4167c.p4168a.p4169a.p4170a.p4171a.C55688b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.notifications.e.b.a.c */
/* compiled from: PG */
public final class C29837c implements C29834a {

    /* renamed from: a */
    static final List f80864a = Arrays.asList(new C55489bz[]{C55489bz.SHOWN, C55489bz.SHOWN_REPLACED, C55489bz.SHOWN_FORCED});

    /* renamed from: A */
    public final C29835a f80865A;

    /* renamed from: B */
    private final C29956g f80866B;

    /* renamed from: C */
    private final C29783b f80867C;

    /* renamed from: b */
    public final C55489bz f80868b;

    /* renamed from: c */
    public final C30075e f80869c;

    /* renamed from: d */
    public final C29896g f80870d;

    /* renamed from: e */
    public final C29895f f80871e;

    /* renamed from: f */
    public String f80872f = null;

    /* renamed from: g */
    public final List f80873g = new ArrayList();

    /* renamed from: h */
    public C30015h f80874h = null;

    /* renamed from: i */
    public String f80875i = null;

    /* renamed from: j */
    public C29820k f80876j = null;

    /* renamed from: k */
    public String f80877k = null;

    /* renamed from: l */
    public C55441ae f80878l = null;

    /* renamed from: m */
    public C29953d f80879m = null;

    /* renamed from: n */
    public final List f80880n = new ArrayList();

    /* renamed from: o */
    public Long f80881o;

    /* renamed from: p */
    public final Long f80882p;

    /* renamed from: q */
    public C29839c f80883q = null;

    /* renamed from: r */
    public Long f80884r;

    /* renamed from: s */
    public String f80885s = null;

    /* renamed from: t */
    public final int f80886t;

    /* renamed from: u */
    public final int f80887u;

    /* renamed from: v */
    public int f80888v = 0;

    /* renamed from: w */
    public int f80889w = 0;

    /* renamed from: x */
    public int f80890x = 0;

    /* renamed from: y */
    public int f80891y = 0;

    /* renamed from: z */
    public int f80892z = 0;

    public C29837c(C29835a aVar, C21370a aVar2, C55489bz bzVar, int i, int i2, C30075e eVar, C29896g gVar, C29895f fVar, C29956g gVar2, C29783b bVar) {
        this.f80865A = aVar;
        this.f80868b = bzVar;
        this.f80886t = i;
        this.f80887u = i2;
        this.f80869c = eVar;
        this.f80870d = gVar;
        this.f80871e = fVar;
        this.f80866B = gVar2;
        this.f80867C = bVar;
        this.f80881o = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(aVar2.mo26870b()));
        this.f80882p = Long.valueOf(aVar2.mo26871c());
    }

    /* renamed from: a */
    public final void mo35136a() {
        this.f80867C.mo34980b(new C29836b(this));
    }

    /* renamed from: b */
    public final void mo35137b(String str) {
        this.f80872f = str;
    }

    /* renamed from: c */
    public final void mo35138c(String str) {
        C29953d dVar;
        Iterator it = this.f80866B.mo35236c().iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            dVar = (C29953d) it.next();
            if (dVar.mo35224b().equals(str)) {
                break;
            }
        }
        this.f80879m = dVar;
    }

    /* renamed from: d */
    public final void mo35139d(C29827r rVar) {
        if (rVar.mo35053b() != null) {
            boolean z = rVar.mo35053b().f146921a;
        }
        List list = this.f80880n;
        C55502j jVar = (C55502j) C55503k.f146459g.createBuilder();
        String j = rVar.mo35063j();
        jVar.copyOnWrite();
        C55503k kVar = (C55503k) jVar.instance;
        j.getClass();
        kVar.f146461a |= 1;
        kVar.f146462b = j;
        long longValue = rVar.mo35060h().longValue();
        jVar.copyOnWrite();
        C55503k kVar2 = (C55503k) jVar.instance;
        kVar2.f146461a |= 2;
        kVar2.f146463c = longValue;
        long longValue2 = rVar.mo35055d().longValue();
        jVar.copyOnWrite();
        C55503k kVar3 = (C55503k) jVar.instance;
        kVar3.f146461a |= 4;
        kVar3.f146464d = longValue2;
        String i = rVar.mo35062i();
        jVar.copyOnWrite();
        C55503k kVar4 = (C55503k) jVar.instance;
        i.getClass();
        kVar4.f146461a |= 8;
        kVar4.f146465e = i;
        C55575k kVar5 = rVar.mo35052a().f146673n;
        if (kVar5 == null) {
            kVar5 = C55575k.f146629b;
        }
        String str = kVar5.f146631a;
        jVar.copyOnWrite();
        C55503k kVar6 = (C55503k) jVar.instance;
        str.getClass();
        kVar6.f146461a |= 16;
        kVar6.f146466f = str;
        list.add((C55503k) jVar.build());
    }

    /* renamed from: e */
    public final void mo35140e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo35139d((C29827r) it.next());
        }
    }

    /* renamed from: f */
    public final void mo35141f(long j) {
        boolean z = true;
        if (!C55489bz.CLICK_DURATION_CLICK_OPENED_APP.equals(this.f80868b) && !C55489bz.CLICK_DURATION_CLICK_WHILE_OPEN.equals(this.f80868b)) {
            z = false;
        }
        C58838bb.m90883r(z);
        this.f80884r = Long.valueOf(j);
    }

    /* renamed from: g */
    public final void mo35142g(C30015h hVar) {
        this.f80874h = hVar;
    }

    /* renamed from: h */
    public final void mo35143h(String str) {
        this.f80885s = str;
    }

    /* renamed from: i */
    public final void mo35144i(C55441ae aeVar) {
        this.f80878l = aeVar;
    }

    /* renamed from: j */
    public final void mo35145j(C29820k kVar) {
        if (kVar != null) {
            this.f80876j = kVar;
            this.f80875i = kVar.mo35009h();
            this.f80877k = kVar.mo35012j();
        }
    }

    /* renamed from: k */
    public final void mo35146k(C55526af afVar) {
        C55586v vVar;
        C55586v vVar2;
        if (afVar != null && !afVar.f146521c.isEmpty()) {
            List list = this.f80880n;
            C55502j jVar = (C55502j) C55503k.f146459g.createBuilder();
            String str = afVar.f146521c;
            jVar.copyOnWrite();
            C55503k kVar = (C55503k) jVar.instance;
            str.getClass();
            kVar.f146461a |= 1;
            kVar.f146462b = str;
            long j = afVar.f146525g;
            jVar.copyOnWrite();
            C55503k kVar2 = (C55503k) jVar.instance;
            kVar2.f146461a |= 2;
            kVar2.f146463c = j;
            long j2 = afVar.f146522d;
            jVar.copyOnWrite();
            C55503k kVar3 = (C55503k) jVar.instance;
            kVar3.f146461a |= 4;
            kVar3.f146464d = j2;
            if (afVar.f146519a == 12) {
                vVar = (C55586v) afVar.f146520b;
            } else {
                vVar = C55586v.f146658u;
            }
            String str2 = vVar.f146672m;
            jVar.copyOnWrite();
            C55503k kVar4 = (C55503k) jVar.instance;
            str2.getClass();
            kVar4.f146461a |= 8;
            kVar4.f146465e = str2;
            if (afVar.f146519a == 12) {
                vVar2 = (C55586v) afVar.f146520b;
            } else {
                vVar2 = C55586v.f146658u;
            }
            C55575k kVar5 = vVar2.f146673n;
            if (kVar5 == null) {
                kVar5 = C55575k.f146629b;
            }
            String str3 = kVar5.f146631a;
            jVar.copyOnWrite();
            C55503k kVar6 = (C55503k) jVar.instance;
            str3.getClass();
            kVar6.f146461a |= 16;
            kVar6.f146466f = str3;
            list.add((C55503k) jVar.build());
            C55688b bVar = afVar.f146532n;
            if (bVar == null) {
                bVar = C55688b.f146919b;
            }
            boolean z = bVar.f146921a;
        }
    }

    /* renamed from: l */
    public final void mo35147l(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo35146k((C55526af) it.next());
        }
    }

    /* renamed from: m */
    public final void mo35148m(String str) {
        this.f80877k = str;
    }

    /* renamed from: n */
    public final void mo35149n(String str) {
        List list = this.f80873g;
        C55491ca caVar = (C55491ca) C55492cb.f146427c.createBuilder();
        caVar.copyOnWrite();
        C55492cb cbVar = (C55492cb) caVar.instance;
        str.getClass();
        cbVar.f146429a = 1;
        cbVar.f146430b = str;
        list.add((C55492cb) caVar.build());
    }

    /* renamed from: o */
    public final void mo35150o(long j) {
        this.f80881o = Long.valueOf(j);
    }

    /* renamed from: p */
    public final void mo35151p(C29839c cVar) {
        this.f80883q = cVar;
    }

    /* renamed from: q */
    public final void mo35152q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55661cq cqVar = (C55661cq) it.next();
            List list2 = this.f80880n;
            C55502j jVar = (C55502j) C55503k.f146459g.createBuilder();
            String str = cqVar.f146871b;
            jVar.copyOnWrite();
            C55503k kVar = (C55503k) jVar.instance;
            str.getClass();
            kVar.f146461a |= 1;
            kVar.f146462b = str;
            long j = cqVar.f146872c;
            jVar.copyOnWrite();
            C55503k kVar2 = (C55503k) jVar.instance;
            kVar2.f146461a |= 2;
            kVar2.f146463c = j;
            long j2 = cqVar.f146873d;
            jVar.copyOnWrite();
            C55503k kVar3 = (C55503k) jVar.instance;
            kVar3.f146461a |= 4;
            kVar3.f146464d = j2;
            list2.add((C55503k) jVar.build());
        }
    }

    /* renamed from: r */
    public final void mo35153r(int i) {
        this.f80892z = i;
    }

    /* renamed from: s */
    public final void mo35154s(int i) {
        this.f80890x = i;
    }

    /* renamed from: t */
    public final void mo35155t(int i) {
        this.f80891y = i;
    }

    /* renamed from: u */
    public final void mo35156u() {
        this.f80888v = 2;
    }

    /* renamed from: v */
    public final void mo35157v() {
        this.f80889w = 2;
    }

    /* renamed from: w */
    public final void mo35158w() {
        List list = this.f80873g;
        C55491ca caVar = (C55491ca) C55492cb.f146427c.createBuilder();
        caVar.copyOnWrite();
        C55492cb cbVar = (C55492cb) caVar.instance;
        cbVar.f146430b = 1;
        cbVar.f146429a = 2;
        list.add((C55492cb) caVar.build());
    }
}
