package com.google.android.apps.search.googleapp.search.srp;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.graphics.C1924a;
import com.google.android.apps.gsa.h.a.b;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.apps.search.googleapp.search.p10409e.C137415d;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.p10436f.C137839c;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.search.silk.web.signin.C40930h;
import com.google.android.libraries.search.silk.web.uimodes.C40946j;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43513c;
import com.google.android.libraries.web.contrib.p3389i.C43630d;
import com.google.android.libraries.web.coordinator.C43737c;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43370o;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.android.libraries.web.shared.p3441a.C44078b;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.android.libraries.web.shared.p3443c.C44082a;
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
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.r */
/* compiled from: PG */
public final class C137886r {

    /* renamed from: a */
    public static final C58974d f375149a = C58974d.m91135i("HeaderFragment");

    /* renamed from: z */
    private static final Duration f375150z = Duration.ofMillis(250);

    /* renamed from: A */
    private int f375151A;

    /* renamed from: b */
    public final AccountId f375152b;

    /* renamed from: c */
    public final b f375153c;

    /* renamed from: d */
    public final C139695b f375154d;

    /* renamed from: e */
    public final Context f375155e;

    /* renamed from: f */
    public final C139684f f375156f;

    /* renamed from: g */
    public final C43513c f375157g;

    /* renamed from: h */
    public final C137733c f375158h;

    /* renamed from: i */
    public final C46401p f375159i;

    /* renamed from: j */
    public final C46855i f375160j;

    /* renamed from: k */
    public final C137852a f375161k;

    /* renamed from: l */
    public final C137890u f375162l;

    /* renamed from: m */
    public final C40930h f375163m;

    /* renamed from: n */
    public final C40946j f375164n;

    /* renamed from: o */
    public final C46801dp f375165o;

    /* renamed from: p */
    public final C28306ab f375166p;

    /* renamed from: q */
    public final C43737c f375167q;

    /* renamed from: r */
    public final C44080d f375168r;

    /* renamed from: s */
    public final C43377v f375169s;

    /* renamed from: t */
    public final boolean f375170t;

    /* renamed from: u */
    public final boolean f375171u;

    /* renamed from: v */
    public final C43630d f375172v;

    /* renamed from: w */
    public int f375173w;

    /* renamed from: x */
    public int f375174x;

    /* renamed from: y */
    public final C38553h f375175y;

    /* renamed from: com.google.android.apps.search.googleapp.search.srp.r$a */
    /* compiled from: PG */
    final class C137887a implements C46792di {

        /* renamed from: b */
        private final ViewGroup f375177b;

        /* renamed from: c */
        private final C46401p f375178c;

        public C137887a(ViewGroup viewGroup, C46401p pVar) {
            this.f375177b = viewGroup;
            this.f375178c = pVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            int i;
            C137542d dVar;
            C43376u uVar = (C43376u) obj;
            Uri parse = Uri.parse(uVar.f113329b);
            if (C137886r.this.f375170t && (uVar.f113328a & 64) != 0) {
                C43367l lVar = uVar.f113335h;
                if (lVar == null) {
                    lVar = C43367l.f113293h;
                }
                C43366k a = C43366k.m76517a(lVar.f113299e);
                if (a == null) {
                    a = C43366k.UNSPECIFIED;
                }
                if (a == C43366k.BROWSER_INITIATED_NEW_PAGE) {
                    C137886r rVar = C137886r.this;
                    if (rVar.f375171u) {
                        dVar = ((C137543b) rVar.f375167q.mo5768a()).mo113804a();
                    } else {
                        C46370ah a2 = this.f375178c.mo50378a(C62912at.f169862a);
                        dVar = a2 == null ? C137542d.f374085g : (C137542d) a2.f121384a;
                    }
                    C137418g gVar = dVar.f374092f;
                    if (gVar == null) {
                        gVar = C137418g.f373767r;
                    }
                    int a3 = C137415d.m223276a(gVar.f373774f);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    rVar.mo114024i(a3);
                }
            }
            if ((uVar.f113328a & 64) == 0) {
                C43366k a4 = C43366k.m76517a(uVar.f113332e);
                if (a4 == null) {
                    a4 = C43366k.UNSPECIFIED;
                }
                if (a4 != C43366k.BROWSER_INITIATED_NEW_PAGE) {
                    C43366k a5 = C43366k.m76517a(uVar.f113332e);
                    if (a5 == null) {
                        a5 = C43366k.UNSPECIFIED;
                    }
                    if (a5 != C43366k.USER_INITIATED_NEW_PAGE) {
                        C43369n a6 = C43369n.m76519a(uVar.f113330c);
                        if (a6 == null) {
                            a6 = C43369n.UNSPECIFIED;
                        }
                        if (a6 == C43369n.WAITING_FOR_RESPONSE) {
                            if (C137886r.this.f375161k.mo114007a(parse)) {
                                i = 3;
                            } else {
                                i = C137886r.this.f375161k.mo114008b(parse) ? 2 : 1;
                            }
                            C137886r.this.mo114024i(i);
                        }
                    }
                }
            }
            C43369n a7 = C43369n.m76519a(uVar.f113330c);
            if (a7 == null) {
                a7 = C43369n.UNSPECIFIED;
            }
            if (a7 == C43369n.WAITING_FOR_RESPONSE) {
                if (C137886r.this.f375161k.mo114009c(Uri.parse(uVar.f113329b))) {
                    this.f375177b.setVisibility(8);
                } else if (C137886r.this.mo114023h() != 3) {
                    this.f375177b.setVisibility(0);
                }
            }
            if (parse.isHierarchical()) {
                int i2 = uVar.f113328a;
                if ((i2 & 64) == 0 && (i2 & 4) == 0) {
                    C43369n a8 = C43369n.m76519a(uVar.f113330c);
                    if (a8 == null) {
                        a8 = C43369n.UNSPECIFIED;
                    }
                    if (!C43370o.m76522b(a8)) {
                        return;
                    }
                    if (C137886r.this.f375161k.mo114008b(parse)) {
                        C137886r.this.mo114025j(2);
                        C137886r.this.mo114026k(2);
                    } else if (parse.getQueryParameter("ibp") != null || C137886r.this.f375161k.mo114007a(parse)) {
                        C137886r.this.mo114025j(3);
                        C137886r.this.mo114026k(1);
                    } else {
                        C43366k a9 = C43366k.m76517a(uVar.f113332e);
                        if (a9 == null) {
                            a9 = C43366k.UNSPECIFIED;
                        }
                        if (a9 == C43366k.USER_INITIATED_NEW_PAGE) {
                            C137886r.this.mo114025j(1);
                        }
                        C137886r.this.mo114026k(1);
                    }
                }
            } else {
                ((C58970a) ((C58970a) C137886r.f375149a.mo56225c()).mo56372aa(41019)).mo56386p("Loaded an opaque URL in the web content. This alludes to a bug in request blocking.");
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C137886r(Context context, C137890u uVar, boolean z, boolean z2, AccountId accountId, b bVar, C139695b bVar2, C139684f fVar, C43513c cVar, C38553h hVar, C137733c cVar2, C46855i iVar, C137852a aVar, C40930h hVar2, C40946j jVar, C46801dp dpVar, C28306ab abVar, C44077a aVar2, C43737c cVar3, C44078b bVar3, C43377v vVar, C43630d dVar) {
        this.f375152b = accountId;
        this.f375153c = bVar;
        this.f375155e = context;
        this.f375156f = fVar;
        this.f375157g = cVar;
        this.f375175y = hVar;
        this.f375158h = cVar2;
        this.f375160j = iVar;
        this.f375172v = dVar;
        this.f375161k = aVar;
        this.f375162l = uVar;
        this.f375159i = aVar2.f114747a.mo50325a("search_query_name", C137542d.f374085g);
        this.f375167q = cVar3;
        this.f375163m = hVar2;
        this.f375164n = jVar;
        this.f375154d = bVar2;
        this.f375165o = dpVar;
        this.f375170t = z2;
        this.f375171u = z;
        this.f375166p = abVar;
        C44078b bVar4 = bVar3;
        this.f375168r = bVar4.mo47044a(C44082a.f114755a, "com.google.android.apps.search.googleapp.search.srp.HeaderFragmentPeer", C137722au.f374618e);
        this.f375169s = vVar;
    }

    /* renamed from: a */
    public static C137733c m224179a(AccountId accountId, C137890u uVar) {
        C137733c cVar = new C137733c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        C47243l.m84039a(cVar, uVar);
        return cVar;
    }

    /* renamed from: b */
    public final C137839c mo114017b() {
        return (C137839c) this.f375158h.getChildFragmentManager().f634a.mo671c("SRP_SEARCH_BOX_FRAGMENT");
    }

    /* renamed from: c */
    public final void mo114018c(int i) {
        int i2 = ((C137722au) this.f375168r.mo47045a()).f374623d;
        mo114022g(i);
    }

    /* renamed from: d */
    public final void mo114019d(int i) {
        C137839c b = mo114017b();
        b.getClass();
        TextView a = b.mo17754z().mo113997a();
        a.getClass();
        a.bringPointIntoView(i);
    }

    /* renamed from: e */
    public final void mo114020e(String str) {
        C137839c b = mo114017b();
        b.getClass();
        b.mo17754z().mo114001f(str);
    }

    /* renamed from: f */
    public final void mo114021f(int i) {
        C137839c b = mo114017b();
        b.getClass();
        TextView a = b.mo17754z().mo113997a();
        a.getClass();
        a.setTextColor(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo114022g(int i) {
        int i2;
        float f;
        C44080d dVar = this.f375168r;
        C137721at atVar = (C137721at) ((C137722au) dVar.mo47045a()).toBuilder();
        atVar.copyOnWrite();
        C137722au auVar = (C137722au) atVar.instance;
        auVar.f374620a |= 4;
        auVar.f374623d = i;
        dVar.mo47046b((C137722au) atVar.build());
        if (mo114023h() == 1) {
            View requireView = this.f375158h.requireView();
            Resources resources = this.f375158h.getResources();
            requireView.animate().cancel();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.googleapp_search_header_height) - resources.getDimensionPixelOffset(R.dimen.googleapp_srp_header_search_box_padding_top);
            float min = 1.0f - Math.min(((float) i) / ((float) dimensionPixelOffset), 1.0f);
            int i3 = this.f375173w;
            if (i3 != 0) {
                i2 = C1924a.m5186e(this.f375174x, i3, min);
            } else {
                i2 = this.f375174x;
            }
            requireView.findViewById(R.id.googleapp_account_disc_fragment).setAlpha(min);
            requireView.findViewById(R.id.googleapp_doodle_fragment).setAlpha(min);
            requireView.setBackgroundColor(i2);
            requireView.setTranslationY((float) (-Math.min(i, dimensionPixelOffset)));
            if (i <= dimensionPixelOffset) {
                f = 0.0f;
            } else {
                f = (float) resources.getDimensionPixelOffset(R.dimen.googleapp_search_header_elevation);
            }
            requireView.setElevation(f);
        }
    }

    /* renamed from: h */
    public final int mo114023h() {
        int a = C137415d.m223276a(((C137722au) this.f375168r.mo47045a()).f374621b);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo114024i(int i) {
        this.f375158h.requireView().findViewById(R.id.googleapp_doodle_fragment).setAlpha(1.0f);
        this.f375158h.requireView().setElevation(0.0f);
        this.f375151A = 0;
        int i2 = 2;
        if (i != 2) {
            i2 = 1;
        }
        C44080d dVar = this.f375168r;
        C137721at atVar = (C137721at) ((C137722au) dVar.mo47045a()).toBuilder();
        atVar.copyOnWrite();
        C137722au auVar = (C137722au) atVar.instance;
        auVar.f374620a |= 4;
        auVar.f374623d = 0;
        dVar.mo47046b((C137722au) atVar.build());
        mo114026k(i2);
        mo114025j(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo114025j(int i) {
        if (this.f375158h.getView() == null) {
            ((C58970a) ((C58970a) f375149a.mo56226d()).mo56372aa(41022)).mo56386p("Tried to set header visibility before view created.");
        } else if (mo114023h() != i) {
            C44080d dVar = this.f375168r;
            C137721at atVar = (C137721at) ((C137722au) dVar.mo47045a()).toBuilder();
            atVar.copyOnWrite();
            C137722au auVar = (C137722au) atVar.instance;
            int i2 = i - 1;
            auVar.f374621b = i2;
            auVar.f374620a |= 1;
            dVar.mo47046b((C137722au) atVar.build());
            View requireView = this.f375158h.requireView();
            int dimensionPixelSize = this.f375155e.getResources().getDimensionPixelSize(R.dimen.googleapp_search_header_height) - this.f375155e.getResources().getDimensionPixelSize(R.dimen.googleapp_srp_header_search_box_padding_top);
            int i3 = ((C137722au) this.f375168r.mo47045a()).f374623d;
            if (i2 == 0) {
                requireView.animate().translationY((float) (-Math.min(dimensionPixelSize, this.f375151A))).setDuration(f375150z.toMillis()).withStartAction(new C137881m(this, requireView)).withEndAction(new C137882n(this, requireView, dimensionPixelSize)).start();
            } else if (i2 != 2) {
                this.f375151A = i3;
                requireView.animate().translationY((float) (-dimensionPixelSize)).setDuration(f375150z.toMillis()).withStartAction(new C137883o(requireView)).withEndAction(new C137748e(this, requireView)).start();
            } else {
                this.f375151A = i3;
                requireView.animate().translationY((float) (-requireView.getBottom())).setDuration(f375150z.toMillis()).withEndAction(new C137836f(requireView)).start();
            }
        }
    }

    /* renamed from: k */
    public final void mo114026k(int i) {
        C44080d dVar = this.f375168r;
        C137721at atVar = (C137721at) ((C137722au) dVar.mo47045a()).toBuilder();
        atVar.copyOnWrite();
        C137722au auVar = (C137722au) atVar.instance;
        auVar.f374622c = i - 1;
        auVar.f374620a |= 2;
        dVar.mo47046b((C137722au) atVar.build());
    }
}
