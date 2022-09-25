package com.google.android.libraries.lens.view.filters.translation;

import android.app.Activity;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25200af;
import com.google.android.libraries.lens.view.p2067ak.C25223bb;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25496ab;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.lens.p4711m.C62632i;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.dc */
/* compiled from: PG */
public final class C26120dc implements C25496ab {

    /* renamed from: a */
    public final C25758g f70975a = new C25758g(false);

    /* renamed from: b */
    public final C25758g f70976b = new C25758g(false);

    /* renamed from: c */
    public final C25758g f70977c = new C25758g(false);

    /* renamed from: d */
    public final List f70978d = new ArrayList();

    /* renamed from: e */
    private final C24974a f70979e;

    /* renamed from: f */
    private final C26244b f70980f;

    /* renamed from: g */
    private final C27232l f70981g;

    /* renamed from: h */
    private final C25989d f70982h;

    /* renamed from: i */
    private final C25225bd f70983i;

    /* renamed from: j */
    private final Activity f70984j;

    /* renamed from: k */
    private boolean f70985k = false;

    public C26120dc(C26244b bVar, C27232l lVar, C25989d dVar, C25225bd bdVar, C24974a aVar, Activity activity) {
        this.f70980f = bVar;
        this.f70981g = lVar;
        this.f70982h = dVar;
        this.f70983i = bdVar;
        this.f70979e = aVar;
        this.f70984j = activity;
    }

    /* renamed from: l */
    private final boolean m48201l() {
        return !C24974a.m46225a(this.f70979e.f68122a) && this.f70984j.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: e */
    public final void mo31312e(C26119db dbVar) {
        this.f70978d.add(dbVar);
    }

    /* renamed from: f */
    public final void mo31313f() {
        if (((Boolean) this.f70977c.mo3842a()).booleanValue()) {
            this.f70977c.mo5708l(false);
        }
    }

    /* renamed from: g */
    public final void mo31314g(boolean z) {
        if (z != ((Boolean) this.f70976b.mo3842a()).booleanValue()) {
            this.f70976b.mo5708l(Boolean.valueOf(z));
        }
    }

    /* renamed from: h */
    public final void mo31315h() {
        boolean z = false;
        if (this.f70980f.mo31462g(C26239a.PARTIAL_TRANSLATE_TOOLTIP_ENABLED) && this.f70985k && !m48201l() && ((((Boolean) this.f70977c.mo3842a()).booleanValue() || !this.f70983i.mo30349e().f68757e) && ((Boolean) this.f70976b.mo3842a()).booleanValue())) {
            z = true;
        }
        if (z) {
            this.f70983i.f68662a.mo30363c(new C25223bb());
        }
        if (z != ((Boolean) this.f70977c.mo3842a()).booleanValue()) {
            this.f70977c.mo5708l(Boolean.valueOf(z));
        }
    }

    /* renamed from: i */
    public final boolean mo31316i() {
        return ((Boolean) this.f70976b.mo3842a()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo31317j() {
        return this.f70980f.mo31462g(C26239a.PARTIAL_TRANSLATE_ALWAYS_ENABLED) || C62632i.m94823h(this.f70981g.mo32701h());
    }

    /* renamed from: k */
    public final boolean mo31318k() {
        return ((Boolean) this.f70975a.mo3842a()).booleanValue();
    }

    /* renamed from: kW */
    public final /* synthetic */ void mo30520kW(C25533p pVar) {
    }

    /* renamed from: kX */
    public final /* synthetic */ void mo30521kX(boolean z) {
    }

    /* renamed from: kY */
    public final void mo30522kY(C25497ac acVar, C25497ac acVar2, C25533p pVar) {
        this.f70985k = acVar2.mo30525b();
        if (C28130s.m52412c(this.f70982h.f70643b, C56306df.TRANSLATE) && mo31317j()) {
            if (this.f70985k && !m48201l()) {
                long b = this.f70980f.mo31456b(C26239a.PARTIAL_TRANSLATE_MENU_POSTCAPTURE_AUTO_OPENS);
                if (b == -1 || ((long) this.f70983i.mo30349e().f68756d) < b) {
                    mo31314g(true);
                    this.f70983i.f68662a.mo30363c(C25200af.f68642a);
                    return;
                }
            }
            if (mo31318k() && !mo31316i()) {
                mo31314g(true);
            } else if (!mo31318k() && mo31316i()) {
                mo31314g(false);
            }
        }
    }

    /* renamed from: kZ */
    public final /* synthetic */ void mo30523kZ() {
    }
}
