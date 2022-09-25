package com.google.android.apps.gsa.staticplugins.opa.zerostate.hubs;

import android.net.Uri;
import android.os.Bundle;
import android.support.p033v7.app.C0356aq;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.app.C0401v;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.binaries.satin.app.C73970cd;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opa.smartspace.p6452a.C83725a;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91183ao;
import com.google.android.apps.gsa.shared.p7195y.C91188at;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110560t;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.hubs.C114767h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114547f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* compiled from: PG */
public class AgendaHubActivity extends C0395p {

    /* renamed from: j */
    public static final C59071e f318464j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.hubs.AgendaHubActivity");

    /* renamed from: k */
    public C91183ao f318465k;

    /* renamed from: l */
    public C114770j f318466l;

    /* renamed from: m */
    public C108013bm f318467m;

    /* renamed from: n */
    public C114547f f318468n;

    /* renamed from: o */
    public C22871g f318469o;

    /* renamed from: p */
    public C86124t f318470p;

    /* renamed from: q */
    C91097g f318471q;

    /* renamed from: r */
    public View f318472r;

    /* renamed from: s */
    public ViewGroup f318473s;

    /* renamed from: t */
    public C110560t f318474t;

    /* renamed from: u */
    private final C58881cr f318475u = C58886cw.m90973a(new C114764e(this));

    public final void onCreate(Bundle bundle) {
        C60870cx cxVar;
        C74504a.m120462a(f.aG);
        super.onCreate(bundle);
        this.f318471q = new C91090a(this, this, 0);
        C114767h hVar = new C114767h(this);
        if (hVar.f318484b == null) {
            ((C114767h.C114768a) C47266f.m84076a(hVar.f318483a, C114767h.C114768a.class)).mo101587qW(hVar);
        }
        C73970cd cdVar = new C73970cd(hVar.f318484b.f205827a);
        this.f318465k = (C91183ao) cdVar.f205828a.a.f202736ch.mo17428b();
        this.f318466l = new C114770j(cdVar.f205828a.g, cdVar.f205830c);
        this.f318467m = (C108013bm) cdVar.f205828a.a.f202825eQ.mo17428b();
        this.f318468n = (C114547f) cdVar.f205828a.b.f199974ao.mo17428b();
        this.f318469o = (C22871g) cdVar.f205828a.aT.mo17428b();
        this.f318474t = (C110560t) cdVar.f205828a.a.f202872fK.mo17428b();
        this.f318470p = (C86124t) cdVar.f205828a.a.f202006C.mo17428b();
        C91142g gVar = (C91142g) cdVar.f205828a.bq.mo17428b();
        C0401v.m1321C();
        C0356aq aqVar = (C0356aq) mo1322k();
        aqVar.mo1163P();
        aqVar.f1215o.mo1239j(true);
        setContentView((int) R.layout.agenda_hub_activity_layout);
        this.f318472r = findViewById(R.id.loading_spinner);
        this.f318473s = (ViewGroup) findViewById(R.id.agenda_hub_container);
        C91188at a = this.f318465k.mo85410a(this);
        ImageView imageView = (ImageView) findViewById(R.id.empty_agenda_image);
        new C90873ag(a.mo85427p(a.mo85414b(C91188at.m148979q(Uri.parse("https://www.gstatic.com/voice/zerostate/productivity.png")), imageView), imageView), this.f318469o, "getEmptyAgendaImage", C114765f.f318481a).mo85223a(C114766g.f318482a);
        C60870cx[] cxVarArr = new C60870cx[2];
        cxVarArr[0] = this.f318467m.mo76936k(C53306j.MAIN_APP);
        if (this.f318470p.mo79746e(C90014bt.f247647lB)) {
            cxVar = ((C83725a) this.f318475u.mo6453a()).mo77051c(14);
        } else {
            cxVar = this.f318467m.mo96367x();
        }
        cxVarArr[1] = cxVar;
        new C90873ag(C60856cj.m92897f(cxVarArr), this.f318469o, "getZeroStateResponse", new C114762c(this)).mo85223a(new C114763d(this));
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onResume() {
        C0401v.m1321C();
        super.onResume();
    }
}
