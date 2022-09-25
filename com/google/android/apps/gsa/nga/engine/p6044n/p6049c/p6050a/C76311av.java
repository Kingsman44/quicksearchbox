package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.am.d.g;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.am.v.d;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74849ah;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;
import com.google.android.apps.gsa.nga.engine.p6044n.C76342d;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6056o.C76534ab;
import com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d.C77089dg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80321bp;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80324bs;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80328bw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80330by;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80333ca;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80335cc;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80336cd;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import dagger.C68214a;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.av */
/* compiled from: PG */
public final class C76311av implements C76288a {

    /* renamed from: d */
    private static final C58974d f211365d = C58974d.m91136j();

    /* renamed from: a */
    public final C76303an f211366a;

    /* renamed from: b */
    public final C81515c f211367b;

    /* renamed from: c */
    public final C22871g f211368c;

    /* renamed from: e */
    private final C77089dg f211369e;

    /* renamed from: f */
    private final g f211370f;

    /* renamed from: g */
    private final C83334w f211371g;

    /* renamed from: h */
    private final d f211372h;

    /* renamed from: i */
    private final C74849ah f211373i;

    /* renamed from: j */
    private final C68214a f211374j;

    public C76311av(C77089dg dgVar, g gVar, C83334w wVar, d dVar, C74849ah ahVar, C76303an anVar, C81515c cVar, C22871g gVar2, C68214a aVar) {
        this.f211369e = dgVar;
        this.f211370f = gVar;
        this.f211371g = wVar;
        this.f211372h = dVar;
        this.f211373i = ahVar;
        this.f211366a = anVar;
        this.f211367b = cVar;
        this.f211368c = gVar2;
        this.f211374j = aVar;
    }

    /* renamed from: g */
    private final C60870cx m122917g(C60870cx cxVar, C80336cd cdVar, C65475b bVar) {
        return this.f211368c.mo28210j(cxVar, "[NGA] finalizeNonScreenshot", new C76308as(this, cdVar, bVar));
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80336cd cdVar;
        C80330by byVar;
        C80328bw bwVar;
        C80333ca caVar;
        C80324bs bsVar;
        if (aqVar.f220359a == 4) {
            cdVar = (C80336cd) aqVar.f220360b;
        } else {
            cdVar = C80336cd.f220442f;
        }
        int i = 0;
        Optional g = this.f211369e.mo72420g(Optional.m71637of(cdVar.f220446c), false);
        if (g.isEmpty()) {
            ((C58970a) ((C58970a) f211365d.mo56225c()).mo56372aa(3527)).mo56386p("Execution failed - no messaging app.");
            return mo72164d(bVar);
        }
        af afVar = (af) g.get();
        int i2 = cdVar.f220444a;
        if (i2 != 0) {
            switch (i2) {
                case 4:
                    i = 1;
                    break;
                case 5:
                    i = 2;
                    break;
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 4;
                    break;
                case 8:
                    i = 5;
                    break;
            }
        } else {
            i = 6;
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 == 0) {
            if (i2 == 4) {
                byVar = (C80330by) cdVar.f220445b;
            } else {
                byVar = C80330by.f220427d;
            }
            C80321bp bpVar = byVar.f220429a;
            if (bpVar == null) {
                bpVar = C80321bp.f220412c;
            }
            return m122917g(afVar.l(C74851z.m121022d(bpVar), byVar.f220430b, cdVar.f220447d, byVar.f220431c), cdVar, bVar);
        } else if (i3 == 1) {
            if (i2 == 5) {
                bwVar = (C80328bw) cdVar.f220445b;
            } else {
                bwVar = C80328bw.f220422d;
            }
            C80321bp bpVar2 = bwVar.f220424a;
            if (bpVar2 == null) {
                bpVar2 = C80321bp.f220412c;
            }
            return m122917g(afVar.k(C74851z.m121022d(bpVar2), Uri.parse(bwVar.f220425b), bwVar.f220426c), cdVar, bVar);
        } else if (i3 == 2) {
            if (i2 == 6) {
                caVar = (C80333ca) cdVar.f220445b;
            } else {
                caVar = C80333ca.f220432c;
            }
            return m122917g(afVar.m(caVar.f220434a, caVar.f220435b, cdVar.f220447d), cdVar, bVar);
        } else if (i3 == 3) {
            if (i2 == 7) {
                bsVar = (C80324bs) cdVar.f220445b;
            } else {
                bsVar = C80324bs.f220416b;
            }
            return m122917g(afVar.j(bsVar.f220418a), cdVar, bVar);
        } else if (i3 == 4) {
            C74849ah ahVar = this.f211373i;
            C83320io ioVar = bVar.f177980a;
            if (ioVar == null) {
                ioVar = C83320io.f227132d;
            }
            Optional d = ahVar.mo71238d(ioVar);
            if (d.isEmpty()) {
                ((C58970a) ((C58970a) f211365d.mo56225c()).mo56372aa(3528)).mo56386p("No screenshot present.");
                return mo72164d(bVar);
            } else if (((C76534ab) d.get()).mo72226b().isEmpty()) {
                return mo72163c(R.string.nga_screenshot_saving_failed, bVar);
            } else {
                return this.f211368c.mo28210j(this.f211372h.d((Bitmap) ((C76534ab) d.get()).mo72226b().get()), "[NGA] handleSendScreenshot.saveScreenshotToDisk", new C76309at(this, bVar, cdVar, afVar));
            }
        } else if (i3 != 5) {
            return mo72164d(bVar);
        } else {
            return mo72164d(bVar);
        }
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60003;
    }

    /* renamed from: c */
    public final C60870cx mo72163c(int i, C65475b bVar) {
        mo72166f(bVar);
        return ((C76342d) this.f211374j.mo27525b()).mo72169b(C58485gu.m89846n(t.r(this.f211367b.mo75121a(Locale.forLanguageTag(bVar.f177982c)).getString(i, new Object[0]))), bVar.f177981b);
    }

    /* renamed from: d */
    public final C60870cx mo72164d(C65475b bVar) {
        mo72166f(bVar);
        return ((C76342d) this.f211374j.mo27525b()).mo72169b(this.f211370f.c(true), bVar.f177981b);
    }

    /* renamed from: e */
    public final C60870cx mo72165e(C80336cd cdVar, C65475b bVar) {
        C80335cc ccVar = cdVar.f220448e;
        if (ccVar != null) {
            return ((C76342d) this.f211374j.mo27525b()).mo72169b(this.f211370f.d(ccVar.f220438a, ccVar.f220439b, ccVar.f220440c, cdVar.f220446c, ccVar.f220441d), bVar.f177981b);
        }
        return C118826c.f331423b;
    }

    /* renamed from: f */
    public final void mo72166f(C65475b bVar) {
        C83334w wVar = this.f211371g;
        C82887ec ecVar = C82887ec.EXECUTION_FAILED;
        C82885ea eaVar = C82885ea.f225977c;
        C83320io ioVar = bVar.f177980a;
        if (ioVar == null) {
            ioVar = C83320io.f227132d;
        }
        wVar.mo75545c(ecVar, eaVar, ioVar);
    }
}
