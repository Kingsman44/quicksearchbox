package com.google.android.apps.gsa.staticplugins.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.gsa.p6427o.C83559c;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6513aj.C84556p;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.p6786e.C85765a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6807j.C86139h;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6904m.C87354a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.p6919a.C87393a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7009b.C89336a;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.receiver.ShareAppChosenReceiver;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98573i;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98623f;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98624g;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98625h;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98629l;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98634q;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98642y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.p1703d.C20645ai;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.web.contrib.p3384g.C43561a;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.weblayer.contrib.p3456d.C44191d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.ai */
/* compiled from: PG */
public final class C98583ai extends C86734a implements C84624a {

    /* renamed from: a */
    public static final C59071e f275327a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.ai");

    /* renamed from: b */
    public final Context f275328b;

    /* renamed from: c */
    public final C98573i f275329c;

    /* renamed from: f */
    public final C98634q f275330f;

    /* renamed from: g */
    public final C86124t f275331g;

    /* renamed from: h */
    public final C84474e f275332h;

    /* renamed from: i */
    public final C85929cw f275333i;

    /* renamed from: j */
    public final Executor f275334j;

    /* renamed from: k */
    public final Executor f275335k;

    /* renamed from: l */
    public final C68214a f275336l;

    /* renamed from: m */
    public final C44191d f275337m;

    /* renamed from: n */
    public final C86034c f275338n;

    /* renamed from: o */
    private final C91097g f275339o;

    /* renamed from: p */
    private final C22871g f275340p;

    /* renamed from: q */
    private final C22871g f275341q;

    /* renamed from: r */
    private final C85765a f275342r;

    /* renamed from: s */
    private final C68214a f275343s;

    /* renamed from: t */
    private final C68214a f275344t;

    /* renamed from: u */
    private final C83559c f275345u;

    /* renamed from: v */
    private final C89336a f275346v;

    /* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.ai$a */
    /* compiled from: PG */
    public interface C98584a {
        /* renamed from: gq */
        C43561a mo91199gq();

        /* renamed from: gs */
        C44074i mo91200gs();

        /* renamed from: hn */
        C58833ax mo91201hn();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98583ai(Context context, C98573i iVar, C98634q qVar, C91097g gVar, C86124t tVar, C84474e eVar, C85929cw cwVar, C22871g gVar2, C22871g gVar3, C22871g gVar4, C85765a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C83559c cVar, C44191d dVar, C89336a aVar5, C86034c cVar2) {
        super(C118575h.WORKER_CUSTOM_TABS, "customtabs");
        this.f275328b = context;
        this.f275329c = iVar;
        this.f275330f = qVar;
        this.f275339o = gVar;
        this.f275331g = tVar;
        this.f275332h = eVar;
        this.f275333i = cwVar;
        this.f275340p = gVar2;
        this.f275341q = gVar3;
        this.f275342r = aVar;
        this.f275343s = aVar2;
        this.f275344t = aVar3;
        this.f275336l = aVar4;
        this.f275345u = cVar;
        this.f275337m = dVar;
        this.f275346v = aVar5;
        this.f275338n = cVar2;
        this.f275334j = new C98699s(gVar3);
        C22871g gVar5 = gVar4;
        this.f275335k = new C98706z(gVar4);
    }

    /* renamed from: w */
    private final C60870cx m163307w() {
        C60870cx cxVar;
        if (!this.f275345u.f227865c.mo76896a()) {
            return C60856cj.m92900i(false);
        }
        C22871g gVar = this.f275341q;
        C83559c cVar = this.f275345u;
        if (!cVar.mo76894e(this.f275346v.mo79659F())) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = cVar.mo76890a();
            cVar.mo76891b(cxVar);
        }
        return gVar.mo28205e(cxVar, "Error check when GAB enabled future failed", Exception.class, C98575aa.f275318a);
    }

    /* renamed from: a */
    public final C60870cx mo78383a(String str) {
        C58833ax a = this.f275342r.mo79421a(str);
        if (a.mo56113h()) {
            str = (String) a.mo56107c();
        }
        return this.f275340p.mo28201a("Copy link to the clipboard", new C98705y(this, str));
    }

    /* renamed from: c */
    public final C60870cx mo78384c(Intent intent) {
        C86139h hVar;
        ProtoLiteParcelable protoLiteParcelable = (ProtoLiteParcelable) intent.getParcelableExtra("EXTRA_RESTORATION_DATA");
        if (protoLiteParcelable == null) {
            hVar = null;
        } else {
            hVar = (C86139h) protoLiteParcelable.mo84191d(C86139h.f232811d.getParserForType());
        }
        if (hVar == null) {
            ((C59052c) ((C59052c) f275327a.mo56225c()).mo56372aa(19085)).mo56386p("Attempting to dismiss the bottom bar without a session.");
            return C60856cj.m92900i(C118826c.f331422a);
        }
        C22871g gVar = this.f275341q;
        C98634q qVar = this.f275330f;
        return C60846c.m92878g(gVar.mo28209i(qVar.f275474e.mo28209i(C60846c.m92879h(C60922j.m93045h(C60838bs.m92859i(qVar.mo91232c()), new C98623f(qVar), C60826bg.f164896a), CancellationException.class, C98624g.f275458a, C60826bg.f164896a), "getOrRestoreSession", new C98625h(qVar, hVar)), "Dismiss GoC bottom bar", C98579ae.f275324a), C98629l.class, new C98580af(this), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo78385e(String str) {
        this.f275339o.mo65089a(C87354a.m141350c(Uri.parse("https://www.google.com/remove-results-about-you").buildUpon().appendQueryParameter("url", str).build().toString()));
        return C118826c.f331423b;
    }

    /* renamed from: f */
    public final C60870cx mo78386f() {
        return C118826c.f331423b;
    }

    /* renamed from: g */
    public final C60870cx mo78387g(Uri uri) {
        String str;
        String str2;
        if (!this.f275342r.mo79422b(uri)) {
            if (!C87393a.f235981a.matcher(uri.toString()).matches()) {
                str = "https://support.google.com/websearch?p=chrome_custom_tabs";
                str2 = "chrome_custom_tabs";
                Intent a = C84556p.m135246a(R.string.feedback_entrypoint_customtabs, Uri.parse(str), false, str2, "velvet");
                a.addFlags(268435456);
                this.f275339o.mo65089a(a);
                C89949q.m146523g(772);
                return C118826c.f331423b;
            }
        }
        str = this.f275331g.mo79758x(C90110fh.f250709o);
        str2 = this.f275331g.mo79758x(C90110fh.f250708n);
        Intent a2 = C84556p.m135246a(R.string.feedback_entrypoint_customtabs, Uri.parse(str), false, str2, "velvet");
        a2.addFlags(268435456);
        this.f275339o.mo65089a(a2);
        C89949q.m146523g(772);
        return C118826c.f331423b;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("CustomTabsWorker");
        fVar.mo85287n(this.f275330f);
    }

    /* renamed from: h */
    public final C60870cx mo78388h(String[] strArr) {
        if (this.f275332h.mo78103aq()) {
            return C118826c.f331423b;
        }
        return this.f275341q.mo28210j(m163307w(), "GAB enabled check callback - #prefetchLowConfidenceUrls", new C98577ac(this, strArr));
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f275330f.mo91234f();
    }

    /* renamed from: i */
    public final C60870cx mo78389i() {
        return this.f275341q.mo28210j(m163307w(), "GAB enabled check callback - #prepareForSession", new C98703w(this));
    }

    /* renamed from: j */
    public final C60870cx mo78390j(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.putExtra("com.google.android.apps.gsa.customtabs.WITHOUT_CUSTOM_TABS", true);
        this.f275339o.mo65089a(intent);
        return C118826c.f331423b;
    }

    /* renamed from: k */
    public final C60870cx mo78391k(Intent intent) {
        String dataString = intent.getDataString();
        C58833ax a = this.f275342r.mo79421a(dataString);
        if (a.mo56113h()) {
            dataString = (String) a.mo56107c();
        }
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", dataString);
        if (intent.hasExtra("android.intent.extra.SUBJECT")) {
            intent2.putExtra("android.intent.extra.SUBJECT", intent.getStringExtra("android.intent.extra.SUBJECT"));
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(this.f275328b, ShareAppChosenReceiver.class));
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f275328b, 0, C147798a.m240896b(intent3, 201326592, 0), 201326592);
        C58893dc.m90996a(broadcast);
        this.f275339o.mo65089a(Intent.createChooser(intent2, this.f275328b.getString(R.string.custom_tabs_share_via), broadcast.getIntentSender()));
        ((C37215b) this.f275344t.mo27525b()).mo19974a(C37182a.f97743B);
        C89949q.m146523g(607);
        ((C89859i) this.f275343s.mo27525b()).mo83702b(C89849ae.CCT_SHARE_URL_PICKER_STARTED);
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final C60870cx mo78392l() {
        C60870cx w = m163307w();
        C98576ab abVar = new C98576ab(this);
        return C60922j.m93045h(w, C47810es.m84966f(abVar), this.f275334j);
    }

    /* renamed from: m */
    public final void mo78393m(Intent intent) {
        this.f275339o.mo65089a(intent);
    }

    /* renamed from: n */
    public final void mo78394n(C20645ai aiVar) {
        if (!this.f275331g.mo79746e(C90110fh.f250576A) && !this.f275332h.mo78104ar()) {
            C60870cx w = m163307w();
            C98578ad adVar = new C98578ad(this, aiVar);
            C60870cx h = C60922j.m93045h(w, C47810es.m84966f(adVar), this.f275334j);
            C98582ah ahVar = new C98582ah();
            C60856cj.m92911t(h, C47810es.m84974n(ahVar), this.f275335k);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: p */
    public final void mo78395p(int i, Bitmap bitmap, String str) {
        C98642y yVar = this.f275330f.f275478i;
        if (yVar == null) {
            C89949q.m146523g(1040);
        } else {
            yVar.mo91246e(bitmap, str);
        }
    }

    /* renamed from: u */
    public final C60870cx mo91197u() {
        C22871g gVar = this.f275341q;
        C98634q qVar = this.f275330f;
        Objects.requireNonNull(qVar);
        return gVar.mo28202b("prepareForSession", new C98581ag(qVar));
    }

    /* renamed from: v */
    public final C60870cx mo91198v(Runnable runnable) {
        return this.f275341q.mo28209i(mo91197u(), "onCctSessionPrepared", new C98697q(runnable));
    }
}
