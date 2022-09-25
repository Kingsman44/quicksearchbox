package com.google.android.apps.gsa.search.shared.overlay;

import android.app.Activity;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31499r;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.l */
/* compiled from: PG */
public final class C87663l extends C87656e {

    /* renamed from: c */
    public final C58833ax f236934c;

    /* renamed from: d */
    public final C38802e f236935d;

    /* renamed from: e */
    public boolean f236936e = false;

    /* renamed from: f */
    public boolean f236937f = false;

    /* renamed from: g */
    public boolean f236938g = false;

    /* renamed from: h */
    public boolean f236939h = false;

    /* renamed from: i */
    public boolean f236940i = false;

    /* renamed from: j */
    public boolean f236941j = false;

    /* renamed from: k */
    public boolean f236942k = false;

    /* renamed from: l */
    public boolean f236943l = false;

    /* renamed from: m */
    public boolean f236944m = false;

    /* renamed from: n */
    private final C21370a f236945n;

    public C87663l(long j, C58833ax axVar, C38802e eVar, C21370a aVar) {
        super(j);
        this.f236934c = axVar;
        this.f236935d = eVar;
        this.f236945n = aVar;
    }

    /* renamed from: a */
    public final void mo81866a() {
        if (this.f236934c.mo56113h()) {
            ((C89922b) this.f236934c.mo56107c()).mo83760d();
            C31499r.f84816a.mo37197a((Activity) null);
        }
        this.f236935d.mo41634h();
    }

    /* renamed from: b */
    public final void mo81867b() {
        if (!this.f236915a && !this.f236944m && !this.f236937f) {
            C58976aa aaVar = C58975e.f156826a;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 362;
            long j = this.f236916b;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164093a |= 16;
            ufVar2.f164261p = j;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            this.f236935d.mo41630d(C37248a.f98948N.mo40811d(this.f236945n.mo26872d()));
            if (this.f236934c.mo56113h()) {
                ((C89922b) this.f236934c.mo56107c()).mo83763g(C89849ae.SEARCH_OVERLAY_STARTUP_KEYBOARD_SHOWN);
            }
            if (this.f236938g) {
                mo81866a();
            }
            this.f236937f = true;
            this.f236943l = true;
        }
    }

    /* renamed from: c */
    public final void mo81868c(boolean z, boolean z2) {
        if (!this.f236915a && !this.f236944m && !this.f236938g) {
            if (!this.f236936e) {
                this.f236942k = z2;
                this.f236940i = true;
                this.f236941j = z;
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 363;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164254i |= 67108864;
            ufVar2.f164229cg = z;
            C60548tz tzVar2 = (C60548tz) ((C60555uf) tzVar.build()).toBuilder();
            long j = this.f236916b;
            tzVar2.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar2.instance;
            ufVar3.f164093a |= 16;
            ufVar3.f164261p = j;
            C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
            long d = this.f236945n.mo26872d();
            this.f236935d.mo41630d(C37248a.f98949O.mo40811d(d));
            if (z2) {
                this.f236935d.mo41630d(C37248a.f98950P.mo40811d(d));
            }
            if (this.f236934c.mo56113h()) {
                ((C89922b) this.f236934c.mo56107c()).mo83763g(C89849ae.SEARCH_OVERLAY_STARTUP_SUGGESTIONS_SHOWN);
                if (z2) {
                    ((C89922b) this.f236934c.mo56107c()).mo83763g(C89849ae.SEARCH_OVERLAY_STARTUP_ZERO_PREFIX_SUGGESTIONS_SHOWN);
                }
            }
            if (this.f236937f) {
                mo81866a();
            }
            this.f236938g = true;
            this.f236943l = true;
        }
    }
}
