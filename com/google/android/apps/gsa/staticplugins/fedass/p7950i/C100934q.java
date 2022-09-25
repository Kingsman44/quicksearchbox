package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19419w;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.q */
/* compiled from: PG */
public final class C100934q {

    /* renamed from: a */
    public final C69464a f281979a;

    public C100934q(C69464a aVar) {
        this.f281979a = aVar;
    }

    /* renamed from: a */
    public static C19419w m167167a(C132800h hVar) {
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        if (wVar.f362387w && ((fVar.f362317a & 4096) == 0 || !fVar.f362330n)) {
            return C19419w.CACHING_NOT_ELIGIBLE;
        }
        if ((fVar.f362317a & 16) == 0) {
            return C19419w.OPTED_IN_SETTINGS;
        }
        if (fVar.f362323g) {
            return C19419w.OPTED_IN_SETTINGS;
        }
        return C19419w.OPTED_OUT_SETTINGS;
    }

    /* renamed from: b */
    public final C19419w mo92101b(C132800h hVar) {
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        if (!wVar.f362373i) {
            ((C19435g) this.f281979a.mo17428b()).mo24621c("Sheldon.Classic.Caching.Optin.Reason", C19419w.RUNTIME_FLAG_OFF.f54321h);
            return C19419w.RUNTIME_FLAG_OFF;
        }
        C19419w a = m167167a(hVar);
        ((C19435g) this.f281979a.mo17428b()).mo24621c("Sheldon.Classic.Caching.Optin.Reason", a.f54321h);
        return a;
    }

    /* renamed from: c */
    public final C19419w mo92102c(C132800h hVar) {
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        if (!wVar.f362374j) {
            ((C19435g) this.f281979a.mo17428b()).mo24621c("Sheldon.Classic.Training.Optin.Reason", C19419w.RUNTIME_FLAG_OFF.f54321h);
            return C19419w.RUNTIME_FLAG_OFF;
        }
        C19419w a = m167167a(hVar);
        ((C19435g) this.f281979a.mo17428b()).mo24621c("Sheldon.Classic.Training.Optin.Reason", a.f54321h);
        return a;
    }
}
