package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94638b;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94639c;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94642f;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import com.google.common.p4552o.C60303np;
import com.google.common.p4552o.C60305nr;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.k */
/* compiled from: PG */
public final class C95118k extends C94650n {

    /* renamed from: e */
    public final String f266119e;

    /* renamed from: f */
    public final C95117j f266120f;

    /* renamed from: g */
    public final Context f266121g;

    /* renamed from: h */
    public final C95293ae f266122h;

    /* renamed from: i */
    public final boolean f266123i;

    /* renamed from: j */
    public boolean f266124j = false;

    /* renamed from: k */
    public final Runnable f266125k = new C95116i(this);

    public C95118k(Context context, C95293ae aeVar, CharSequence charSequence, String str, boolean z, C95117j jVar, C95307m mVar, C21370a aVar) {
        super(context, mVar, aVar, charSequence, (Uri) null);
        this.f266121g = context;
        this.f266122h = aeVar;
        this.f266119e = str;
        this.f266123i = z;
        this.f266120f = jVar;
    }

    /* renamed from: a */
    public final C94638b mo88567a() {
        String str;
        if (!mo88576j() || (str = this.f266119e) == null) {
            return new C94638b(false, false, false);
        }
        this.f266120f.mo89035d(str);
        return new C94638b(false, true, true);
    }

    /* renamed from: b */
    public final C94639c mo88568b(C95455a aVar, C95065ab abVar, Runnable runnable) {
        C58976aa aaVar = C58975e.f156826a;
        this.f266124j = true;
        C95117j jVar = this.f266120f;
        C59104x b = C95109bs.f266079a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18085)).mo56386p("retryTranscription()");
        ((C95109bs) jVar).mo89038g(aVar);
        return new C94639c(true, true);
    }

    /* renamed from: c */
    public final C60237lk mo88569c() {
        C60237lk lkVar = this.f264731d;
        C60303np npVar = (C60303np) C60305nr.f163179e.createBuilder();
        npVar.copyOnWrite();
        C60305nr nrVar = (C60305nr) npVar.instance;
        nrVar.f163182b = 5;
        nrVar.f163181a |= 1;
        lkVar.mo57078b((C60305nr) npVar.build());
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 2;
        loVar.f162984c = true;
        lkVar.copyOnWrite();
        C60241lo loVar3 = (C60241lo) lkVar.instance;
        loVar3.f162982a |= 128;
        loVar3.f162988g = "bisto_voice_transcript_confirmation";
        return lkVar;
    }

    /* renamed from: e */
    public final String mo88571e() {
        return C58837ba.m90858g(this.f266122h.mo89217j(this.f266121g, 1, 1));
    }

    /* renamed from: j */
    public final boolean mo88576j() {
        return this.f266119e != null && !this.f266124j;
    }

    /* renamed from: k */
    public final boolean mo88577k() {
        return true;
    }

    /* renamed from: l */
    public final boolean mo88578l(C94647k kVar, C94637a aVar) {
        return false;
    }

    /* renamed from: n */
    public final void mo88581n(C95285o oVar, C95284n nVar) {
        C58976aa aaVar = C58975e.f156826a;
        super.mo88581n(oVar, new C94642f(oVar, new C95115h(this, oVar, nVar, new C95114g(this, oVar, new C95113f(this, oVar, nVar)))));
    }
}
