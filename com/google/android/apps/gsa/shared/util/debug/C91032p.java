package com.google.android.apps.gsa.shared.util.debug;

import android.os.SystemClock;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.p */
/* compiled from: PG */
public final class C91032p implements C90991b {

    /* renamed from: c */
    private static final C59071e f254274c = C59071e.m91332i("com.google.android.apps.gsa.shared.util.debug.p");

    /* renamed from: a */
    public final Object f254275a = new Object();

    /* renamed from: b */
    public List f254276b;

    /* renamed from: d */
    private List f254277d;

    /* renamed from: e */
    private C91031o f254278e;

    /* renamed from: a */
    public final void mo85308a(String str) {
        synchronized (this.f254275a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C91031o oVar = this.f254278e;
            C91031o oVar2 = new C91031o(str, elapsedRealtime, oVar);
            if (oVar == null) {
                if (this.f254277d == null) {
                    this.f254277d = C58597ky.m90213d(1);
                }
                this.f254277d.add(oVar2);
            } else {
                if (oVar.f254271c == null) {
                    oVar.f254271c = new ArrayList(1);
                }
                oVar.f254271c.add(oVar2);
            }
            this.f254278e = oVar2;
        }
    }

    /* renamed from: b */
    public final void mo85309b(C91006f fVar, long j) {
        synchronized (this.f254275a) {
            fVar.mo85292s(C90752i.m148229c("[Trace]"));
            List<C91031o> list = this.f254277d;
            if (list != null) {
                for (C91031o a : list) {
                    a.mo85307a(fVar, j);
                }
            }
            List<C91032p> list2 = this.f254276b;
            if (list2 != null) {
                for (C91032p b : list2) {
                    b.mo85309b(fVar.mo85281e((Object) null), j);
                }
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        mo85309b(fVar, SystemClock.elapsedRealtime());
    }

    /* renamed from: c */
    public final void mo85310c() {
        synchronized (this.f254275a) {
            C91031o oVar = this.f254278e;
            if (oVar == null) {
                ((C59052c) ((C59052c) f254274c.mo56225c()).mo56372aa(11402)).mo56386p("All sections have already ended!");
            } else {
                oVar.f254270b = SystemClock.elapsedRealtime();
                this.f254278e = this.f254278e.f254269a;
            }
        }
    }
}
