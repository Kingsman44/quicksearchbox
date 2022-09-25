package org.chromium.weblayer;

import android.os.RemoteException;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72322ar;
import org.chromium.p5643b.p5644a.C72327aw;
import org.chromium.p5643b.p5644a.C72343bl;
import org.chromium.p5643b.p5644a.C72344c;

/* renamed from: org.chromium.weblayer.c */
/* compiled from: PG */
final class C72614c extends C72344c {

    /* renamed from: a */
    final /* synthetic */ C72615d f193177a;

    public C72614c(C72615d dVar) {
        this.f193177a = dVar;
    }

    /* renamed from: a */
    public final void mo63810a(int i) {
        C72343bl.m106991a();
        C72601bj e = C72601bj.m107381e(i);
        C72580ap apVar = new C72580ap(this.f193177a.f193179b);
        while (apVar.hasNext()) {
            ((C72603bl) apVar.next()).mo47091a(e);
        }
    }

    /* renamed from: b */
    public final void mo63811b(boolean z, int i) {
        C72580ap apVar = new C72580ap(this.f193177a.f193180c);
        while (apVar.hasNext()) {
            C72616e eVar = (C72616e) apVar.next();
            if (z) {
                eVar.mo47090b(i);
            } else {
                eVar.mo47089a(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo63812c() {
        C72580ap apVar = new C72580ap(this.f193177a.f193181d);
        if (apVar.hasNext()) {
            C72620i iVar = (C72620i) apVar.next();
            throw null;
        }
    }

    /* renamed from: d */
    public final void mo63813d(int i) {
        C72343bl.m106991a();
        C72601bj e = C72601bj.m107381e(i);
        e.f193148f = null;
        C72580ap apVar = new C72580ap(this.f193177a.f193179b);
        while (apVar.hasNext()) {
            ((C72603bl) apVar.next()).mo47093c(e);
        }
    }

    /* renamed from: e */
    public final C72322ar mo63814e() {
        C72343bl.m106991a();
        Fragment fragment = this.f193177a.f193178a;
        C72573ai aiVar = new C72573ai();
        C0154a aVar = new C0154a(fragment.getParentFragmentManager());
        aVar.mo511h(0, aiVar, "WebLayerMediaRouteDialogFragment", 1);
        aVar.mo509f();
        return aiVar.f193133e;
    }

    /* renamed from: f */
    public final void mo63815f(C72327aw awVar) {
        C72343bl.m106991a();
        try {
            C72601bj e = C72601bj.m107381e(awVar.mo63734e());
            if (e == null) {
                e = new C72601bj(awVar, this.f193177a);
            } else {
                e.f193148f = this.f193177a;
            }
            C72580ap apVar = new C72580ap(this.f193177a.f193179b);
            while (apVar.hasNext()) {
                ((C72603bl) apVar.next()).mo47092b(e);
            }
        } catch (RemoteException e2) {
            throw new C72304a(e2);
        }
    }
}
