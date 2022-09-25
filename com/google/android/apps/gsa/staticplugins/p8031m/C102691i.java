package com.google.android.apps.gsa.staticplugins.p8031m;

import android.media.AudioManager;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85505a;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85515b;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86787b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.android.libraries.search.p2904c.C37520e;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.m.i */
/* compiled from: PG */
public final class C102691i extends C86734a implements C85515b {

    /* renamed from: a */
    public static final C59071e f286621a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.m.i");

    /* renamed from: b */
    public final C86787b f286622b;

    /* renamed from: c */
    public final C118843f f286623c;

    /* renamed from: f */
    public final C22871g f286624f;

    /* renamed from: g */
    public final AudioManager f286625g;

    /* renamed from: h */
    public int f286626h;

    /* renamed from: i */
    public int f286627i;

    /* renamed from: j */
    public boolean f286628j;

    /* renamed from: k */
    private final C92194i f286629k;

    /* renamed from: l */
    private final C102690h f286630l;

    /* renamed from: m */
    private final C90758bb f286631m;

    /* renamed from: n */
    private final C86610af f286632n;

    /* renamed from: o */
    private final C22871g f286633o;

    /* renamed from: p */
    private C90757ba f286634p;

    /* renamed from: q */
    private final C91123v f286635q;

    /* JADX INFO: finally extract failed */
    public C102691i(C86787b bVar, C22871g gVar, AudioManager audioManager, C90758bb bbVar, C86610af afVar, C118843f fVar, C92194i iVar, C91123v vVar, C22871g gVar2) {
        super(C118575h.WORKER_AUDIO, "audio");
        this.f286622b = bVar;
        this.f286623c = fVar;
        this.f286629k = iVar;
        this.f286624f = gVar;
        C102690h hVar = new C102690h(this);
        this.f286630l = hVar;
        iVar.f257033d.writeLock().lock();
        try {
            iVar.f257034e.add(hVar);
            iVar.f257033d.writeLock().unlock();
            this.f286625g = audioManager;
            this.f286631m = bbVar;
            this.f286632n = afVar;
            this.f286635q = vVar;
            this.f286633o = gVar2;
        } catch (Throwable th) {
            iVar.f257033d.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo79027a() {
        this.f286633o.mo28212l("Bump volume on background runner", new C102685c(this));
    }

    /* renamed from: c */
    public final void mo79028c(long j) {
        this.f286624f.mo28212l("release audio", new C102683a(this, j));
    }

    /* renamed from: e */
    public final void mo79029e(long j) {
        this.f286624f.mo28212l("request audio", new C102684b(this, j));
    }

    /* renamed from: f */
    public final void mo79030f() {
        if (this.f286628j) {
            if (this.f286625g.getStreamVolume(this.f286626h) == this.f286625g.getStreamMaxVolume(this.f286626h) / 2) {
                this.f286625g.setStreamVolume(this.f286626h, this.f286627i, 0);
                this.f286628j = false;
            }
        }
    }

    /* renamed from: g */
    public final void mo79031g(boolean z) {
        this.f286623c.mo71753n(z);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AudioWorker");
        fVar.mo85279c("volume compensated").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f286628j)));
    }

    /* renamed from: h */
    public final void mo79032h(Query query) {
        int i = 4;
        if (!this.f286635q.mo85390b()) {
            if (query.mo84366bz()) {
                if (!query.mo84412cs()) {
                    if (query.mo84326bK()) {
                        i = 5;
                    } else if (!query.mo84324bI()) {
                        i = 0;
                    }
                }
            } else if (!query.mo84450de()) {
                if (query.mo84463dq()) {
                    i = 2;
                } else if (!query.mo84338bW()) {
                    i = -1;
                } else {
                    return;
                }
            }
            i = 3;
        }
        this.f286623c.mo71755p(i);
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        mo79033i(C37520e.ROUTE_NO_AUDIO, C37478d.CONNECTION_TYPE_NONE, (C85505a) null, true);
        C92194i iVar = this.f286629k;
        C102690h hVar = this.f286630l;
        iVar.f257033d.writeLock().lock();
        try {
            iVar.f257034e.remove(hVar);
        } finally {
            iVar.f257033d.writeLock().unlock();
        }
    }

    /* renamed from: i */
    public final void mo79033i(C37520e eVar, C37478d dVar, C85505a aVar, boolean z) {
        this.f286623c.mo71756q(z);
        this.f286623c.mo71761v(eVar, dVar, aVar != null ? new C102687e(this, aVar) : null);
    }

    /* renamed from: j */
    public final void mo79034j() {
        C90757ba baVar = this.f286634p;
        if (baVar != null) {
            this.f286631m.mo85094a(baVar);
            this.f286634p = null;
        }
        if (this.f286632n.mo80227h()) {
            C86771n nVar = this.f286632n.f233977l.f234383e;
            this.f286634p = nVar;
            if (nVar != null) {
                this.f286631m.mo85095b(nVar);
            }
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
