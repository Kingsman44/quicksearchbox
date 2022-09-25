package com.google.android.apps.search.googleapp.search.srp.p10436f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.p201w.C4372p;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10335j.C136374e;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.C137890u;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y;
import com.google.android.apps.search.lens.p10547a.C139916a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.silk.web.searchbox.C40898g;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43513c;
import com.google.android.libraries.web.contrib.p3389i.C43630d;
import com.google.android.libraries.web.coordinator.C43737c;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62912at;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.f.g */
/* compiled from: PG */
public final class C137843g {

    /* renamed from: a */
    public static final C58974d f375025a = C58974d.m91135i("SrpSearchBoxFragment");

    /* renamed from: b */
    public static final AtomicReference f375026b = new AtomicReference(true);

    /* renamed from: A */
    public String f375027A;

    /* renamed from: c */
    public final C137839c f375028c;

    /* renamed from: d */
    public final C139916a f375029d;

    /* renamed from: e */
    public final C28443m f375030e;

    /* renamed from: f */
    public final boolean f375031f;

    /* renamed from: g */
    public final C46801dp f375032g;

    /* renamed from: h */
    public final C138772i f375033h;

    /* renamed from: i */
    public final C43377v f375034i;

    /* renamed from: j */
    public final C43630d f375035j;

    /* renamed from: k */
    public final Context f375036k;

    /* renamed from: l */
    public final C40898g f375037l;

    /* renamed from: m */
    public final C46401p f375038m;

    /* renamed from: n */
    public final C28306ab f375039n;

    /* renamed from: o */
    public final boolean f375040o;

    /* renamed from: p */
    public final C139708c f375041p;

    /* renamed from: q */
    public final C89859i f375042q;

    /* renamed from: r */
    public final C46855i f375043r;

    /* renamed from: s */
    public final C43513c f375044s;

    /* renamed from: t */
    public final C136374e f375045t;

    /* renamed from: u */
    public final C137890u f375046u;

    /* renamed from: v */
    public final boolean f375047v;

    /* renamed from: w */
    public final C43737c f375048w;

    /* renamed from: x */
    public final boolean f375049x;

    /* renamed from: y */
    public final C46792di f375050y = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            int i;
            C43376u uVar = (C43376u) obj;
            String str = uVar.f113329b;
            if ((uVar.f113328a & 64) != 0) {
                C43367l lVar = uVar.f113335h;
                if (lVar == null) {
                    lVar = C43367l.f113293h;
                }
                str = lVar.f113297c;
            }
            Uri parse = Uri.parse(str);
            if (parse.isOpaque()) {
                PackageInfo f = C4372p.m12527f();
                C58970a aVar = (C58970a) C137843g.f375025a.mo56226d();
                aVar.mo56378ag(C38505d.f101864b, 161433167);
                C58970a aVar2 = (C58970a) aVar.mo56372aa(41060);
                if (f == null) {
                    i = -1;
                } else {
                    i = f.versionName;
                }
                aVar2.mo56389s("#getSearchQueryFromUrl uri is opaque. webview version is %s [default value = -1]", i);
                return;
            }
            String queryParameter = parse.getQueryParameter("q");
            C137843g gVar = C137843g.this;
            if (gVar.f375051z) {
                gVar.mo114001f(gVar.f375027A);
                C137843g.this.f375051z = false;
            } else if (!TextUtils.isEmpty(queryParameter)) {
                if (C137843g.this.f375045t.mo112951a() && "vs".equals(parse.getQueryParameter("inm"))) {
                    C43366k a = C43366k.m76517a(uVar.f113332e);
                    if (a == null) {
                        a = C43366k.UNSPECIFIED;
                    }
                    if (a.equals(C43366k.BROWSER_INITIATED_NEW_PAGE)) {
                        return;
                    }
                }
                C137843g.this.mo114001f(queryParameter);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: z */
    public boolean f375051z;

    /* renamed from: com.google.android.apps.search.googleapp.search.srp.f.g$a */
    /* compiled from: PG */
    final class C137845a implements C46792di {
        public C137845a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            throw g$a$$ExternalSyntheticBackport0.m224106m("State is read from memory (not disk or network) and should therefore never fail", th);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C138788y yVar = (C138788y) obj;
            String str = yVar.f377535c;
            int b = C138787x.m225440b(yVar.f377534b);
            if (b == 0) {
                b = 1;
            }
            if ((b == 5 || b == 6 || b == 12) && !str.isEmpty()) {
                C137843g.this.mo114001f(str);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C137843g(C137839c cVar, C139916a aVar, boolean z, C46801dp dpVar, C138772i iVar, C43377v vVar, C43630d dVar, Context context, C40898g gVar, C44077a aVar2, C28306ab abVar, C28443m mVar, boolean z2, C139708c cVar2, C89859i iVar2, C46855i iVar3, C43513c cVar3, C136374e eVar, C137890u uVar, C43737c cVar4, boolean z3, boolean z4) {
        this.f375028c = cVar;
        this.f375029d = aVar;
        this.f375031f = z;
        this.f375032g = dpVar;
        this.f375033h = iVar;
        this.f375034i = vVar;
        this.f375035j = dVar;
        this.f375036k = context;
        this.f375037l = gVar;
        this.f375038m = aVar2.f114747a.mo50325a("search_query_name", C137542d.f374085g);
        this.f375039n = abVar;
        this.f375030e = mVar;
        this.f375040o = z2;
        this.f375041p = cVar2;
        this.f375042q = iVar2;
        this.f375043r = iVar3;
        this.f375044s = cVar3;
        this.f375045t = eVar;
        this.f375046u = uVar;
        this.f375048w = cVar4;
        this.f375047v = z3;
        this.f375049x = z4;
    }

    /* renamed from: d */
    public static C137839c m224094d(AccountId accountId, C137890u uVar) {
        C137839c cVar = new C137839c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        C47243l.m84039a(cVar, uVar);
        return cVar;
    }

    /* renamed from: a */
    public final TextView mo113997a() {
        View view = this.f375028c.getView();
        view.getClass();
        return (TextView) view.findViewById(R.id.googleapp_srp_search_box_text);
    }

    /* renamed from: b */
    public final LottieAnimationView mo113998b() {
        return (LottieAnimationView) this.f375028c.getView().findViewById(R.id.googleapp_search_or_super_g_lottie_icon);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C137542d mo113999c() {
        if (this.f375047v) {
            return ((C137543b) this.f375048w.mo5768a()).mo113804a();
        }
        C46370ah a = this.f375038m.mo50378a(C62912at.f169862a);
        return a == null ? C137542d.f374085g : (C137542d) a.f121384a;
    }

    /* renamed from: e */
    public final String mo114000e() {
        TextView a = mo113997a();
        a.getClass();
        return a.getText().toString();
    }

    /* renamed from: f */
    public final void mo114001f(String str) {
        TextView a = mo113997a();
        a.getClass();
        if (!TextUtils.equals(a.getText(), str)) {
            a.setText(str);
        }
    }
}
