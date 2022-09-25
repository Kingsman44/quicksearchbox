package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8152d;

import android.graphics.Rect;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91869k;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91870l;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91871m;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91872n;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91873o;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91874p;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.VisualElementBoundsParcelable;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7973qv;
import com.google.p375ai.p378b.C8176yi;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.d.b */
/* compiled from: PG */
public final class C105459b implements C91871m, C91872n, C91874p {

    /* renamed from: e */
    private static final C59071e f294087e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.shared.d.b");

    /* renamed from: a */
    final ArrayList f294088a = new ArrayList();

    /* renamed from: b */
    public C91869k f294089b;

    /* renamed from: c */
    public C105458a f294090c;

    /* renamed from: d */
    boolean f294091d = true;

    /* renamed from: f */
    private final C21370a f294092f;

    /* renamed from: g */
    private final Set f294093g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    private final Map f294094h = new WeakHashMap();

    /* renamed from: i */
    private long f294095i;

    /* renamed from: j */
    private boolean f294096j;

    public C105459b(C21370a aVar) {
        this.f294092f = aVar;
    }

    /* renamed from: k */
    private final void m175226k(C91870l lVar) {
        C58838bb.m90890y(this.f294094h.remove(lVar.f256196a) == lVar, "Unlock called with invalid lock: %s. Current locks %s", lVar.toString(), this.f294094h);
    }

    /* renamed from: l */
    private static final Rect m175227l(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public final C91870l mo86397a(C22945j jVar) {
        C91870l lVar = new C91870l(jVar);
        this.f294094h.put(lVar.f256196a, lVar);
        if (!this.f294096j) {
            return lVar;
        }
        C58485gu j = C58485gu.m89842j(this.f294088a);
        this.f294088a.clear();
        this.f294096j = false;
        C91869k kVar = this.f294089b;
        if (kVar != null) {
            kVar.mo86393jk(this.f294095i, j);
        } else {
            C59104x d = f294087e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(22379)).mo56386p("Attempting to record views without an attached Renderer.");
        }
        C105458a aVar = this.f294090c;
        if (aVar != null) {
            aVar.f294081a.clear();
            aVar.f294082b.clear();
            aVar.invalidate();
        }
        return lVar;
    }

    /* renamed from: b */
    public final void mo86398b(C91870l lVar) {
        if (lVar != null) {
            m175226k(lVar);
        }
    }

    /* renamed from: c */
    public final void mo86399c(C91870l lVar) {
        if (this.f294091d) {
            C59104x d = f294087e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(22389)).mo56386p("Attempting to start view recording with a hidden viewport.");
            return;
        }
        if (lVar != null) {
            m175226k(lVar);
        }
        if (!this.f294096j) {
            if (mo94790j()) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            this.f294095i = this.f294092f.mo26870b();
            this.f294096j = true;
            for (C91873o l : this.f294093g) {
                l.mo86402l();
            }
        }
    }

    /* renamed from: d */
    public final void mo86400d(C91873o oVar) {
        this.f294093g.add(oVar);
        if (this.f294096j) {
            oVar.mo86402l();
        }
    }

    /* renamed from: e */
    public final void mo86401e(C91873o oVar) {
        this.f294093g.remove(oVar);
    }

    /* renamed from: f */
    public final void mo86403f(C8178yk ykVar, int i, long j) {
        if (this.f294091d) {
            C59104x d = f294087e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(22383)).mo56386p("Attempting to report viewport hidden that is already hidden.");
            return;
        }
        C91869k kVar = this.f294089b;
        if (kVar != null) {
            kVar.mo86394y(ykVar, i, j);
            return;
        }
        C59104x d2 = f294087e.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
        ((C59052c) ((C59052c) d2).mo56372aa(22382)).mo56386p("Attempting to report viewport hidden without an attached Renderer.");
    }

    /* renamed from: g */
    public final void mo86404g(C8178yk ykVar, View view, C57057b bVar, C7669fo foVar, C7973qv qvVar) {
        C8176yi yiVar;
        if (this.f294091d) {
            C59104x d = f294087e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(22381)).mo56386p("Attempting to report views to a hidden viewport.");
        } else if (!C2043bi.m5569aw(view)) {
            C59104x b = f294087e.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
            ((C59052c) ((C59052c) b).mo56372aa(22380)).mo56386p("Not recording unattached view.");
        } else {
            Rect l = m175227l(view);
            this.f294088a.add(VisualElementBoundsParcelable.m150498f(ykVar, l, bVar, foVar, qvVar));
            C105458a aVar = this.f294090c;
            if (aVar != null) {
                if (ykVar.f28739b == 1) {
                    yiVar = (C8176yi) ykVar.f28740c;
                } else {
                    yiVar = C8176yi.f28728f;
                }
                int i = yiVar.f28732c;
                aVar.f294081a.add(l);
                aVar.f294082b.add(Integer.valueOf(i));
                aVar.invalidate();
            }
        }
    }

    /* renamed from: h */
    public final void mo94788h(View view) {
        C91869k kVar = this.f294089b;
        if (kVar != null) {
            this.f294091d = false;
            kVar.mo86395z(m175227l(view), this.f294092f.mo26870b());
            return;
        }
        C59104x d = f294087e.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
        ((C59052c) ((C59052c) d).mo56372aa(22384)).mo56386p("Attempting to report viewport without an attached Renderer.");
    }

    /* renamed from: i */
    public final void mo94789i(C91870l lVar) {
        if (lVar != null) {
            m175226k(lVar);
        }
        if (this.f294091d) {
            C59104x d = f294087e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(22387)).mo56386p("Attempting to report viewport hidden that is already hidden.");
            return;
        }
        if (mo94790j()) {
            C59104x d2 = f294087e.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
            ((C59052c) ((C59052c) d2).mo56372aa(22386)).mo56389s("Locks still held when reporting viewport hidden: %s.", this.f294094h);
        }
        C91869k kVar = this.f294089b;
        if (kVar != null) {
            this.f294091d = true;
            kVar.mo86392A(this.f294092f.mo26870b());
            return;
        }
        C59104x d3 = f294087e.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "NowVeViewportMonitor");
        ((C59052c) ((C59052c) d3).mo56372aa(22385)).mo56386p("Attempting to report viewport hidden without an attached Renderer.");
    }

    /* renamed from: j */
    public final boolean mo94790j() {
        return !this.f294094h.isEmpty();
    }
}
