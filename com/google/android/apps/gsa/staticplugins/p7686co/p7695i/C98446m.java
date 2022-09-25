package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import android.content.Context;
import android.databinding.C0118a;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.apps.gsa.k.b;
import com.google.android.apps.gsa.k.d;
import com.google.android.apps.gsa.k.e;
import com.google.android.apps.gsa.k.f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.proactive.C84170f;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7637ej;
import com.google.p375ai.p378b.C7639el;
import com.google.p375ai.p378b.C7641en;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.m */
/* compiled from: PG */
public final class C98446m implements C98396bq, C90991b {

    /* renamed from: a */
    public static final C58817ah f274842a = C98441h.f274828a;

    /* renamed from: j */
    private static final C59071e f274843j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.i.m");

    /* renamed from: b */
    public final C98435db f274844b;

    /* renamed from: c */
    public final C98395bp f274845c;

    /* renamed from: d */
    public final Object f274846d = new Object();

    /* renamed from: e */
    public final C98426ct f274847e;

    /* renamed from: f */
    public final C84170f f274848f;

    /* renamed from: g */
    public final C90998g f274849g;

    /* renamed from: h */
    public final SparseArray f274850h = new SparseArray();

    /* renamed from: i */
    public final SparseIntArray f274851i = new SparseIntArray();

    /* renamed from: k */
    private final AtomicBoolean f274852k = new AtomicBoolean(false);

    /* renamed from: l */
    private final C21370a f274853l;

    /* renamed from: m */
    private final d f274854m;

    /* renamed from: n */
    private final C22871g f274855n;

    /* renamed from: o */
    private int f274856o;

    public C98446m(C21370a aVar, Context context, C89037bh bhVar, C98435db dbVar, C98395bp bpVar, e eVar, f fVar, C84170f fVar2, C118561t tVar, C90998g gVar, C22871g gVar2) {
        Context context2 = context;
        C89037bh bhVar2 = bhVar;
        C98426ct ctVar = new C98426ct(tVar, aVar, bhVar, context);
        this.f274855n = gVar2;
        this.f274853l = aVar;
        this.f274844b = dbVar;
        this.f274845c = bpVar;
        this.f274854m = new d(C98402bw.f274696f, "now_request_queue", eVar, fVar, true);
        this.f274847e = ctVar;
        this.f274848f = fVar2;
        this.f274849g = gVar;
    }

    /* renamed from: r */
    private final void m163030r() {
        for (int i = 0; i < this.f274850h.size(); i++) {
            C98400bu buVar = (C98400bu) this.f274850h.valueAt(i);
            boolean z = true;
            C58838bb.m90883r((buVar.f274690a & 4) != 0);
            if ((buVar.f274690a & 2) == 0) {
                z = false;
            }
            C58838bb.m90883r(z);
        }
    }

    /* renamed from: a */
    public final int mo91068a(C98414ch chVar, C98437dd ddVar) {
        int i;
        C90748e.m148224b();
        synchronized (this.f274846d) {
            mo91117c();
            i = this.f274856o;
            this.f274856o = i + 1;
            int b = mo91116b();
            C98399bt btVar = (C98399bt) C98400bu.f274688f.createBuilder();
            btVar.copyOnWrite();
            C98400bu buVar = (C98400bu) btVar.instance;
            buVar.f274690a |= 1;
            buVar.f274691b = i;
            btVar.copyOnWrite();
            C98400bu buVar2 = (C98400bu) btVar.instance;
            chVar.getClass();
            buVar2.f274692c = chVar;
            buVar2.f274690a |= 2;
            C98417ck ckVar = (C98417ck) C98418cl.f274760h.createBuilder();
            if (ddVar.mo91106a() > 0) {
                ckVar.copyOnWrite();
                C98418cl clVar = (C98418cl) ckVar.instance;
                clVar.f274762a |= 2;
                clVar.f274764c = ddVar.mo91106a() + b;
            }
            int b2 = ddVar.mo91107b();
            ckVar.copyOnWrite();
            C98418cl clVar2 = (C98418cl) ckVar.instance;
            clVar2.f274762a |= 4;
            clVar2.f274765d = b2;
            if (ddVar.mo91110e()) {
                ckVar.copyOnWrite();
                C98418cl clVar3 = (C98418cl) ckVar.instance;
                clVar3.f274762a |= 8;
                clVar3.f274766e = true;
            }
            boolean d = ddVar.mo91109d();
            ckVar.copyOnWrite();
            C98418cl clVar4 = (C98418cl) ckVar.instance;
            clVar4.f274762a |= 16;
            clVar4.f274768g = d;
            C7641en c = ddVar.mo91108c();
            if (c != null) {
                if ((1 & c.f26397a) != 0) {
                    int i2 = c.f26399c;
                    ckVar.copyOnWrite();
                    C98418cl clVar5 = (C98418cl) ckVar.instance;
                    clVar5.f274762a |= 4;
                    clVar5.f274765d = i2;
                }
                C62971cq cqVar = c.f26398b;
                ckVar.copyOnWrite();
                C98418cl clVar6 = (C98418cl) ckVar.instance;
                C62971cq cqVar2 = clVar6.f274767f;
                if (!cqVar2.mo58948c()) {
                    clVar6.f274767f = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) cqVar, (List) clVar6.f274767f);
            }
            C98418cl clVar7 = (C98418cl) ckVar.build();
            btVar.copyOnWrite();
            C98400bu buVar3 = (C98400bu) btVar.instance;
            clVar7.getClass();
            buVar3.f274693d = clVar7;
            buVar3.f274690a |= 4;
            if ((chVar.f274735a & 2) != 0) {
                String str = chVar.f274737c;
                btVar.copyOnWrite();
                C98400bu buVar4 = (C98400bu) btVar.instance;
                str.getClass();
                buVar4.f274690a |= 8;
                buVar4.f274694e = str;
            }
            C98444k f = ddVar.mo91111f();
            if (f == null) {
                mo91121j(b);
                mo91119h((C98400bu) btVar.build());
                mo91072l();
            } else {
                f.mo91112a((C98400bu) btVar.build());
            }
        }
        return i;
    }

    /* renamed from: b */
    public final int mo91116b() {
        return (int) TimeUnit.MILLISECONDS.toSeconds(this.f274853l.mo26870b());
    }

    /* renamed from: c */
    public final C118826c mo91117c() {
        C98416cj cjVar;
        C98434da daVar;
        if (this.f274852k.getAndSet(true)) {
            return C118826c.f331422a;
        }
        C98402bw bwVar = (C98402bw) this.f274854m.a();
        if ((bwVar.f274698a & 2) != 0) {
            this.f274856o = bwVar.f274701d;
        }
        for (C98400bu buVar : bwVar.f274699b) {
            int i = buVar.f274690a;
            if ((i & 2) == 0 || (i & 4) == 0) {
                C59104x d = f274843j.mo56226d();
                d.mo56378ag(C58975e.f156826a, "RequestQueue");
                ((C59052c) ((C59052c) d).mo56372aa(30623)).mo56386p("Dropping request with missing fields");
            } else {
                this.f274850h.append(buVar.f274691b, buVar);
            }
        }
        C98426ct ctVar = this.f274847e;
        boolean z = bwVar.f274702e;
        if (!ctVar.f274786d) {
            ctVar.f274788f = z;
            ctVar.f274786d = true;
        }
        C98435db dbVar = this.f274844b;
        if ((1 & bwVar.f274698a) != 0) {
            cjVar = bwVar.f274700c;
            if (cjVar == null) {
                cjVar = C98416cj.f274753f;
            }
        } else {
            cjVar = null;
        }
        if (cjVar != null) {
            dbVar.f274816d = cjVar.f274756b;
            dbVar.f274817e = cjVar.f274757c;
            if (cjVar.f274758d.size() != 0) {
                dbVar.f274814b.mo91096d(cjVar.f274758d);
            }
            for (C98398bs bsVar : cjVar.f274759e) {
                int i2 = bsVar.f274683a;
                if ((i2 & 1) == 0 || (i2 & 2) == 0 || (i2 & 4) == 0) {
                    C59104x d2 = C98435db.f274813a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "Throttler");
                    C0118a.m109q(d2, "Failed to restore invalid bucket", 30685, "Bucket", C58975e.f156826a);
                    daVar = null;
                } else {
                    daVar = new C98434da(bsVar.f274684b, bsVar.f274685c, bsVar.f274686d);
                    daVar.mo91096d(bsVar.f274687e);
                }
                if (daVar != null) {
                    dbVar.f274815c.put(daVar.f274809a, daVar);
                }
            }
        }
        m163030r();
        return C118826c.f331422a;
    }

    /* renamed from: e */
    public final C60870cx mo91069e(boolean z) {
        return C60922j.m93045h(this.f274855n.mo28201a("setIsApplicationForeground$maybeInit", new C98442i(this)), new C98443j(this, z), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo91070f() {
        return this.f274855n.mo28209i(C60922j.m93045h(this.f274855n.mo28201a("tryGetNextSendableRequest$maybeInit", new C98379b(this)), new C98406c(this), C60826bg.f164896a), "tryGetNextSendableRequest", new C98433d(this));
    }

    /* renamed from: g */
    public final List mo91118g(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f274850h.size(); i2++) {
            C98400bu buVar = (C98400bu) this.f274850h.valueAt(i2);
            C98435db dbVar = this.f274844b;
            C98418cl clVar = buVar.f274693d;
            if (clVar == null) {
                clVar = C98418cl.f274760h;
            }
            if (dbVar.mo91099b(clVar, i) <= i) {
                C58976aa aaVar = C58975e.f156826a;
                int i3 = buVar.f274691b;
                arrayList.add(buVar);
            }
        }
        return arrayList;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("RequestQueue");
        if (this.f274852k.get()) {
            C98435db dbVar = this.f274844b;
            C91006f e = fVar.mo85281e((Object) null);
            int b = mo91116b();
            e.mo85291r("Throttler");
            e.mo85279c("recentFailures").mo85276a(C90752i.m148230d(Integer.valueOf(dbVar.f274816d)));
            if (dbVar.f274817e != 0) {
                e.mo85279c("nextRetry").mo85276a(C90752i.m148232f(new Date(TimeUnit.SECONDS.toMillis((long) dbVar.f274817e))));
            }
            dbVar.f274814b.mo91094b(e.mo85281e((Object) null), b);
            for (C98434da b2 : dbVar.f274815c.values()) {
                b2.mo91094b(e.mo85281e((Object) null), b);
            }
            this.f274847e.mo17602gS(fVar);
        } else {
            fVar.mo85279c("initialized").mo85276a(C90752i.m148228b(false));
        }
        this.f274849g.mo85271g(fVar, "requests", new C98352a(), true);
    }

    /* renamed from: h */
    public final void mo91119h(C98400bu buVar) {
        C98400bu buVar2;
        C98414ch chVar = buVar.f274692c;
        if (chVar == null) {
            chVar = C98414ch.f274733s;
        }
        int i = 0;
        while (true) {
            if (i >= this.f274850h.size()) {
                buVar2 = null;
                break;
            }
            buVar2 = (C98400bu) this.f274850h.valueAt(i);
            C98414ch chVar2 = buVar2.f274692c;
            if (chVar2 == null) {
                chVar2 = C98414ch.f274733s;
            }
            if (chVar2.equals(chVar)) {
                break;
            }
            i++;
        }
        if (buVar2 == null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f274850h.put(buVar.f274691b, buVar);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: i */
    public final void mo91120i() {
        synchronized (this.f274846d) {
            m163030r();
            C98401bv bvVar = (C98401bv) C98402bw.f274696f.createBuilder();
            int i = this.f274856o;
            bvVar.copyOnWrite();
            C98402bw bwVar = (C98402bw) bvVar.instance;
            bwVar.f274698a |= 2;
            bwVar.f274701d = i;
            boolean z = this.f274847e.f274788f;
            bvVar.copyOnWrite();
            C98402bw bwVar2 = (C98402bw) bvVar.instance;
            bwVar2.f274698a |= 4;
            bwVar2.f274702e = z;
            C98435db dbVar = this.f274844b;
            C98415ci ciVar = (C98415ci) C98416cj.f274753f.createBuilder();
            int i2 = dbVar.f274816d;
            ciVar.copyOnWrite();
            C98416cj cjVar = (C98416cj) ciVar.instance;
            cjVar.f274755a |= 1;
            cjVar.f274756b = i2;
            int i3 = dbVar.f274817e;
            ciVar.copyOnWrite();
            C98416cj cjVar2 = (C98416cj) ciVar.instance;
            cjVar2.f274755a |= 2;
            cjVar2.f274757c = i3;
            List list = dbVar.f274814b.f274812d;
            ciVar.copyOnWrite();
            C98416cj cjVar3 = (C98416cj) ciVar.instance;
            C62961ch chVar = cjVar3.f274758d;
            if (!chVar.mo58948c()) {
                cjVar3.f274758d = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) list, (List) cjVar3.f274758d);
            for (C98434da daVar : dbVar.f274815c.values()) {
                C98397br brVar = (C98397br) C98398bs.f274681f.createBuilder();
                String str = daVar.f274809a;
                brVar.copyOnWrite();
                C98398bs bsVar = (C98398bs) brVar.instance;
                str.getClass();
                bsVar.f274683a |= 1;
                bsVar.f274684b = str;
                int i4 = daVar.f274810b;
                brVar.copyOnWrite();
                C98398bs bsVar2 = (C98398bs) brVar.instance;
                bsVar2.f274683a |= 2;
                bsVar2.f274685c = i4;
                int i5 = daVar.f274811c;
                brVar.copyOnWrite();
                C98398bs bsVar3 = (C98398bs) brVar.instance;
                bsVar3.f274683a |= 4;
                bsVar3.f274686d = i5;
                List list2 = daVar.f274812d;
                brVar.copyOnWrite();
                C98398bs bsVar4 = (C98398bs) brVar.instance;
                C62961ch chVar2 = bsVar4.f274687e;
                if (!chVar2.mo58948c()) {
                    bsVar4.f274687e = C62942bv.mutableCopy(chVar2);
                }
                C62947c.addAll((Iterable) list2, (List) bsVar4.f274687e);
                C98398bs bsVar5 = (C98398bs) brVar.build();
                ciVar.copyOnWrite();
                C98416cj cjVar4 = (C98416cj) ciVar.instance;
                bsVar5.getClass();
                C62971cq cqVar = cjVar4.f274759e;
                if (!cqVar.mo58948c()) {
                    cjVar4.f274759e = C62942bv.mutableCopy(cqVar);
                }
                cjVar4.f274759e.add(bsVar5);
            }
            C98416cj cjVar5 = (C98416cj) ciVar.build();
            bvVar.copyOnWrite();
            C98402bw bwVar3 = (C98402bw) bvVar.instance;
            cjVar5.getClass();
            bwVar3.f274700c = cjVar5;
            bwVar3.f274698a |= 1;
            for (int i6 = 0; i6 < this.f274850h.size(); i6++) {
                C98400bu buVar = (C98400bu) this.f274850h.valueAt(i6);
                bvVar.copyOnWrite();
                C98402bw bwVar4 = (C98402bw) bvVar.instance;
                buVar.getClass();
                C62971cq cqVar2 = bwVar4.f274699b;
                if (!cqVar2.mo58948c()) {
                    bwVar4.f274699b = C62942bv.mutableCopy(cqVar2);
                }
                bwVar4.f274699b.add(buVar);
            }
            this.f274854m.d(new b((C98402bw) bvVar.build()));
            int size = this.f274851i.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (this.f274850h.get(this.f274851i.keyAt(size)) == null) {
                        this.f274851i.removeAt(size);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo91121j(int i) {
        int size = this.f274850h.size();
        while (true) {
            size--;
            if (size >= 0) {
                C98435db dbVar = this.f274844b;
                C98418cl clVar = ((C98400bu) this.f274850h.valueAt(size)).f274693d;
                if (clVar == null) {
                    clVar = C98418cl.f274760h;
                }
                if (dbVar.mo91101d(clVar, i)) {
                    this.f274850h.removeAt(size);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void mo91071k(String str, boolean z) {
        synchronized (this.f274846d) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            for (int i2 = 0; i2 < this.f274850h.size(); i2++) {
                C98400bu buVar = (C98400bu) this.f274850h.valueAt(i2);
                if (C58890d.m90990e(C58837ba.m90858g(str), buVar.f274694e)) {
                    arrayList.add(buVar);
                    i = Math.max(i, buVar.f274691b);
                } else {
                    for (C98450q a : this.f274848f.mo77631a()) {
                        a.mo91126a(buVar.f274691b, 7);
                    }
                }
            }
            this.f274850h.clear();
            this.f274856o = i + 1;
            if (z) {
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C98400bu buVar2 = (C98400bu) it.next();
                    this.f274850h.put(buVar2.f274691b, buVar2);
                    int i3 = this.f274851i.get(buVar2.f274691b, -1);
                    if (i3 != -1) {
                        arrayList2.add(Integer.valueOf(i3));
                    }
                }
                C98435db dbVar = this.f274844b;
                dbVar.f274816d = 0;
                dbVar.f274817e = 0;
                dbVar.f274814b.mo91096d(arrayList2);
            }
            this.f274847e.f274788f = false;
            this.f274852k.set(true);
            mo91120i();
        }
    }

    /* renamed from: l */
    public final void mo91072l() {
        synchronized (this.f274846d) {
            mo91117c();
        }
        this.f274855n.mo28209i(this.f274847e.mo91089a(), "scheduleNextRequest", new C98440g(this, mo91116b()));
    }

    /* renamed from: m */
    public final void mo91122m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C98400bu buVar = (C98400bu) it.next();
            if (this.f274850h.get(buVar.f274691b) != null) {
                this.f274850h.put(buVar.f274691b, buVar);
            }
        }
    }

    /* renamed from: n */
    public final void mo91073n(C7639el elVar) {
        synchronized (this.f274846d) {
            mo91117c();
            C98435db dbVar = this.f274844b;
            int b = mo91116b();
            if (elVar == null) {
                dbVar.f274815c.clear();
            } else {
                HashSet<String> hashSet = new HashSet<>();
                hashSet.addAll(dbVar.f274815c.keySet());
                for (C7637ej ejVar : elVar.f26394a) {
                    String str = ejVar.f26389b;
                    if (!TextUtils.isEmpty(str)) {
                        int i = ejVar.f26388a;
                        if (!((i & 2) == 0 || (i & 4) == 0)) {
                            C98434da daVar = (C98434da) dbVar.f274815c.get(str);
                            int i2 = ejVar.f26390c;
                            if (daVar == null) {
                                dbVar.f274815c.put(str, new C98434da(str, i2, ejVar.f26391d));
                            } else {
                                hashSet.remove(str);
                                int i3 = ejVar.f26391d;
                                daVar.f274810b = i2;
                                daVar.f274811c = i3;
                                daVar.mo91097e(b);
                            }
                        }
                    }
                    C59104x d = C98435db.f274813a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Throttler");
                    ((C59052c) ((C59052c) d).mo56372aa(30687)).mo56386p("Invalid bucket");
                }
                for (String remove : hashSet) {
                    dbVar.f274815c.remove(remove);
                }
            }
            mo91120i();
        }
    }

    /* renamed from: o */
    public final boolean mo91074o(int i) {
        C90748e.m148224b();
        synchronized (this.f274846d) {
            mo91117c();
            C98400bu buVar = (C98400bu) this.f274850h.get(i);
            if (buVar == null) {
                return false;
            }
            C98399bt btVar = (C98399bt) buVar.toBuilder();
            C98418cl clVar = buVar.f274693d;
            if (clVar == null) {
                clVar = C98418cl.f274760h;
            }
            int b = mo91116b();
            C98417ck ckVar = (C98417ck) clVar.toBuilder();
            ckVar.copyOnWrite();
            C98418cl clVar2 = (C98418cl) ckVar.instance;
            clVar2.f274762a |= 2;
            clVar2.f274764c = b;
            C98418cl clVar3 = (C98418cl) ckVar.build();
            btVar.copyOnWrite();
            C98400bu buVar2 = (C98400bu) btVar.instance;
            clVar3.getClass();
            buVar2.f274693d = clVar3;
            buVar2.f274690a |= 4;
            mo91122m(C58485gu.m89846n((C98400bu) btVar.build()));
            mo91072l();
            return true;
        }
    }

    /* renamed from: p */
    public final C98444k mo91075p(String str) {
        return new C98444k(this, str);
    }

    /* renamed from: q */
    public final boolean mo91076q(C98444k kVar) {
        C90748e.m148224b();
        synchronized (this.f274846d) {
            mo91117c();
            C98400bu buVar = (C98400bu) this.f274850h.get(0);
            if (buVar == null) {
                return false;
            }
            this.f274850h.remove(0);
            kVar.mo91112a(buVar);
            mo91120i();
            return true;
        }
    }
}
