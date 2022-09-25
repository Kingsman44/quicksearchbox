package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97043f;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97027b;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97029d;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97032g;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97033h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Timer;
import org.p5633c.p5634a.C72296t;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.b.n */
/* compiled from: PG */
public class C97063n {

    /* renamed from: b */
    public static final C59071e f271202b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.b.n");

    /* renamed from: a */
    private Timer f271203a;

    /* renamed from: c */
    public final C22871g f271204c;

    /* renamed from: d */
    public final C97043f f271205d;

    /* renamed from: e */
    public final C97027b f271206e;

    /* renamed from: f */
    public final C97033h f271207f;

    /* renamed from: g */
    public final C97032g f271208g;

    /* renamed from: h */
    public final C97064o f271209h;

    /* renamed from: i */
    public Object f271210i;

    /* renamed from: j */
    public Uri f271211j = Uri.EMPTY;

    /* renamed from: k */
    public C97062m f271212k = C97062m.f271201c;

    /* renamed from: l */
    public C97029d f271213l;

    /* renamed from: m */
    public long f271214m = 0;

    /* renamed from: n */
    public C97061l f271215n = C97061l.f271200d;

    public C97063n(C22871g gVar, C97043f fVar, C97027b bVar, C97064o oVar, C97033h hVar, C97032g gVar2) {
        this.f271204c = gVar;
        this.f271205d = fVar;
        this.f271206e = bVar;
        this.f271207f = hVar;
        this.f271208g = gVar2;
        this.f271209h = oVar;
    }

    /* renamed from: a */
    private final void m160655a() {
        Timer timer = this.f271203a;
        if (timer != null) {
            timer.cancel();
            this.f271203a = null;
        }
    }

    /* renamed from: c */
    public final void mo90422c() {
        if (!mo90426g()) {
            ((C59052c) ((C59052c) f271202b.mo56226d()).mo56372aa(18343)).mo56386p("Not supposed to be listening to screen on/off when not polling.");
        } else {
            mo90424e();
        }
    }

    /* renamed from: d */
    public final void mo90423d() {
        if (!mo90426g()) {
            ((C59052c) ((C59052c) f271202b.mo56226d()).mo56372aa(18347)).mo56386p("resetFetchUri: Not expected to be called when not polling.");
            return;
        }
        Uri d = this.f271207f.mo90398d(this.f271210i);
        if (d.toString().isEmpty()) {
            ((C59052c) ((C59052c) f271202b.mo56226d()).mo56372aa(18346)).mo56386p("resetFetchUri called with empty uri");
        } else if (!d.equals(this.f271211j)) {
            this.f271211j = d;
        }
    }

    /* renamed from: e */
    public final void mo90424e() {
        long j;
        C58838bb.m90883r(mo90426g());
        m160655a();
        if (this.f271209h.f271218c) {
            j = ((C97051b) this.f271212k).f271188a;
        } else {
            j = ((C97051b) this.f271212k).f271189b;
        }
        long j2 = j;
        long max = Math.max(0, j2 - (new C72296t().f192450a - ((C97050a) this.f271215n).f271186b.f192450a));
        Timer timer = new Timer("FetchSportsDataPollingTimer");
        this.f271203a = timer;
        timer.schedule(new C97060k(this), max, j2);
    }

    /* renamed from: f */
    public final void mo90425f() {
        this.f271211j = Uri.EMPTY;
        m160655a();
        C97064o oVar = this.f271209h;
        C58976aa aaVar = C58975e.f156826a;
        try {
            oVar.f271216a.unregisterReceiver(oVar);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: g */
    public final boolean mo90426g() {
        return !this.f271211j.equals(Uri.EMPTY);
    }
}
