package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90433n;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95627w;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95628x;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7504f.C95637a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7504f.C95638b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95680d;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95688l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95691o;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95694r;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.ae */
/* compiled from: PG */
public final class C95651ae implements C95627w, C95688l {

    /* renamed from: a */
    public static final long f267709a = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: o */
    private static final long f267710o = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: b */
    public final C22871g f267711b;

    /* renamed from: c */
    public final C21370a f267712c;

    /* renamed from: d */
    public final C95598as f267713d;

    /* renamed from: e */
    public final C95652af f267714e;

    /* renamed from: f */
    public final C95646a f267715f;

    /* renamed from: g */
    public final C95694r f267716g;

    /* renamed from: h */
    public final C95680d f267717h;

    /* renamed from: i */
    public final C95665n f267718i;

    /* renamed from: j */
    public final C95662k f267719j;

    /* renamed from: k */
    public final AtomicBoolean f267720k = new AtomicBoolean();

    /* renamed from: l */
    public final Set f267721l = new HashSet();

    /* renamed from: m */
    public final C95307m f267722m;

    /* renamed from: n */
    public C60870cx f267723n;

    /* renamed from: p */
    private final C95293ae f267724p;

    /* renamed from: q */
    private final C95638b f267725q;

    /* renamed from: r */
    private final long f267726r;

    public C95651ae(C22871g gVar, C21370a aVar, C95598as asVar, C95652af afVar, C95646a aVar2, C95694r rVar, C95680d dVar, C95293ae aeVar, C95665n nVar, C95662k kVar, C95638b bVar, C95307m mVar) {
        this.f267711b = gVar;
        this.f267712c = aVar;
        this.f267713d = asVar;
        this.f267714e = afVar;
        this.f267715f = aVar2;
        this.f267716g = rVar;
        this.f267717h = dVar;
        this.f267724p = aeVar;
        this.f267718i = nVar;
        this.f267719j = kVar;
        this.f267725q = bVar;
        this.f267726r = aVar.mo26870b();
        this.f267722m = mVar;
    }

    /* renamed from: a */
    public final void mo89581a(List list) {
        if (!this.f267720k.get()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            AtomicReference atomicReference = new AtomicReference();
            AtomicBoolean atomicBoolean3 = atomicBoolean;
            this.f267711b.mo28212l("render", new C95677z(this, list, atomicReference, atomicBoolean3, atomicBoolean2, new C95676y(this, atomicBoolean2, atomicReference, atomicBoolean3, list)));
        }
    }

    /* renamed from: b */
    public final void mo89582b(int i, Collection collection) {
        if (!this.f267720k.get()) {
            this.f267711b.mo28212l("rain-drop", new C95670s(this, i, collection));
        }
    }

    /* renamed from: c */
    public final boolean mo89619c(Context context, int i, String str, Uri uri, boolean z, Runnable runnable, String str2) {
        if (!mo89623g()) {
            return false;
        }
        C124548d a = ((C95637a) this.f267725q.f267680a.mo27525b()).mo89601a();
        if (a != null && a.mo106498al() == 3) {
            return false;
        }
        Context context2 = context;
        String str3 = str;
        if (this.f267715f.mo89618f(new C95657f(new C95658g(context2, this.f267724p, str3, new C95669r(this), new C95672u(uri, z), str2, i, this.f267722m, this.f267712c), this.f267724p, i, runnable))) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return false;
    }

    /* renamed from: d */
    public final void mo89620d(Context context, C95288a aVar) {
        Objects.requireNonNull(aVar);
        mo89624h(context, 12, new C95673v(aVar));
    }

    /* renamed from: e */
    public final void mo89621e(List list) {
        boolean p = this.f267715f.f267694b.mo89168p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f267721l.remove(((C90421b) it.next()).f252589j);
        }
        C58976aa aaVar = C58975e.f156826a;
        list.size();
        if (p || !mo89622f()) {
            mo89582b(3, list);
        }
    }

    /* renamed from: f */
    public final boolean mo89622f() {
        Integer num;
        C58976aa aaVar = C58975e.f156826a;
        long b = this.f267712c.mo26870b() - this.f267726r;
        C60870cx cxVar = this.f267723n;
        if (cxVar != null || b < f267710o) {
            if (cxVar == null) {
                this.f267723n = this.f267711b.mo28208h("maybe-intr", (f267710o - b) + 1, new C95648ab(this));
            }
            return false;
        } else if (this.f267715f.f267694b.mo89169q(3) || !this.f267715f.mo89615c() || this.f267715f.f267694b.mo89168p()) {
            return false;
        } else {
            C95691o b2 = this.f267714e.mo89626b();
            if (!b2.mo89638w() || !this.f267715f.mo89616d()) {
                return false;
            }
            List<C90421b> c = this.f267713d.mo89540c(new C95628x());
            if (!this.f267715f.mo89618f(b2)) {
                return false;
            }
            b2.mo89639A(C95649ac.f267708a);
            C95665n nVar = this.f267718i;
            C22872h.m42742b(C0826b.class);
            if (!c.isEmpty() && nVar.f267787e.mo89216i(nVar.f267784b, 8) != null) {
                Iterator it = c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C90433n nVar2 = ((C90421b) it.next()).f252594o;
                        if (nVar2 != null && (num = nVar2.f252643c) != null && num.intValue() != 1) {
                            break;
                        }
                    } else {
                        for (C90421b c2 : c) {
                            nVar.f267791i.add(c2.mo84145c());
                        }
                        nVar.mo89632a();
                        nVar.f267792j = nVar.f267788f.mo28208h("fetch-prompt", C95665n.f267783a, new C95663l(nVar, c));
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: g */
    public final boolean mo89623g() {
        if (this.f267715f.f267694b.mo89168p() || !this.f267715f.mo89615c() || this.f267720k.get()) {
            return false;
        }
        return this.f267715f.mo89616d();
    }

    /* renamed from: h */
    public final void mo89624h(Context context, int i, Runnable runnable) {
        C95653b bVar;
        if (mo89623g()) {
            C95293ae aeVar = this.f267724p;
            C95307m mVar = this.f267722m;
            C21370a aVar = this.f267712c;
            String i2 = aeVar.mo89216i(context, i);
            if (i2 == null) {
                bVar = null;
            } else {
                bVar = new C95653b(new C95654c(context, aeVar, i2, i, mVar, aVar), aeVar, i, runnable);
            }
            if (bVar == null || !this.f267715f.mo89618f(bVar)) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
    }
}
