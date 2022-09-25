package com.google.android.libraries.lens.view.imageviewer;

import android.animation.Animator;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25528k;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.h */
/* compiled from: PG */
public final class C26944h implements C27654a {

    /* renamed from: a */
    public static final C58974d f73441a = C58974d.m91135i("ImageViewer");

    /* renamed from: b */
    public final C26940d f73442b;

    /* renamed from: c */
    public final AccountId f73443c;

    /* renamed from: d */
    public final C43262m f73444d;

    /* renamed from: e */
    public final String f73445e;

    /* renamed from: f */
    public final C46801dp f73446f;

    /* renamed from: g */
    public final C43377v f73447g;

    /* renamed from: h */
    public final C28306ab f73448h;

    /* renamed from: i */
    public final C28443m f73449i;

    /* renamed from: j */
    public final C27655b f73450j;

    /* renamed from: k */
    public final C25528k f73451k;

    /* renamed from: l */
    public C43257h f73452l;

    /* renamed from: m */
    public C43376u f73453m;

    /* renamed from: n */
    public C28439i f73454n;

    /* renamed from: com.google.android.libraries.lens.view.imageviewer.h$a */
    /* compiled from: PG */
    final class C26945a implements C46792di {
        public C26945a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) C26944h.f73441a.mo56225c()).mo56382g(th)).mo56372aa(49486)).mo56386p("onError");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C26944h.this.f73453m = uVar;
            C43369n nVar = C43369n.UNSPECIFIED;
            C43369n a = C43369n.m76519a(uVar.f113330c);
            if (a == null) {
                a = C43369n.UNSPECIFIED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 2) {
                int i = uVar.f113333f;
            } else if (ordinal == 3) {
                C26944h.this.mo32338b();
            } else if (ordinal == 4) {
                String str = uVar.f113329b;
                C26944h.this.mo32338b();
            } else if (ordinal == 5) {
                C26944h.this.mo32338b();
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C26944h(C26940d dVar, AccountId accountId, C43262m mVar, String str, C46801dp dpVar, C43377v vVar, C28306ab abVar, C28443m mVar2, C27655b bVar, C25528k kVar) {
        this.f73442b = dVar;
        this.f73443c = accountId;
        this.f73444d = mVar;
        this.f73445e = str;
        this.f73446f = dpVar;
        this.f73447g = vVar;
        this.f73448h = abVar;
        this.f73449i = mVar2;
        this.f73450j = bVar;
        this.f73451k = kVar;
    }

    /* renamed from: a */
    public static C26940d m49915a(AccountId accountId, String str) {
        C26940d dVar = new C26940d();
        C68324h.m98669f(dVar);
        C47247a.m84047b(dVar, accountId);
        C47243l.m84040b(dVar, str);
        return dVar;
    }

    /* renamed from: b */
    public final void mo32338b() {
        View findViewById = this.f73442b.requireView().findViewById(R.id.image_viewer_web_fragment_container);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f73442b.requireView().findViewById(R.id.image_viewer_ghost_animation);
        if (findViewById.getVisibility() != 0) {
            int integer = this.f73442b.getResources().getInteger(17694721);
            findViewById.setAlpha(0.0f);
            findViewById.setVisibility(0);
            long j = (long) integer;
            findViewById.animate().alpha(1.0f).setDuration(j).setListener((Animator.AnimatorListener) null);
            lottieAnimationView.animate().alpha(0.0f).setDuration(j).setListener(new C26943g(lottieAnimationView));
        }
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("ImageViewer");
        eVar.mo33149f("Input Url: ", this.f73445e);
        C43257h hVar = this.f73452l;
        if (hVar != null) {
            eVar.mo33148e("Input Url w Params: ", hVar.mo46356f());
            C43257h hVar2 = this.f73452l;
            hVar2.getClass();
            String str = (String) hVar2.mo46353d().getOrDefault("X-Client-Data", BuildConfig.FLAVOR);
            str.getClass();
            eVar.mo33148e("X-Client-Header Length: ", String.valueOf(str.length()));
        }
        C43376u uVar = this.f73453m;
        if (uVar != null) {
            if (!uVar.f113329b.isEmpty()) {
                eVar.mo33148e("Current Url: ", uVar.f113329b);
            }
            if ((uVar.f113328a & 2) != 0) {
                C43369n a = C43369n.m76519a(uVar.f113330c);
                if (a == null) {
                    a = C43369n.UNSPECIFIED;
                }
                eVar.mo33148e("Current Load State: ", a.name());
            }
            if ((uVar.f113328a & 4) != 0) {
                C43363h hVar3 = uVar.f113331d;
                if (hVar3 == null) {
                    hVar3 = C43363h.f113275f;
                }
                C43362g a2 = C43362g.m76515a(hVar3.f113278b);
                if (a2 == null) {
                    a2 = C43362g.UNSPECIFIED;
                }
                eVar.mo33148e("Current Error Status Code: ", a2.name());
                C43363h hVar4 = uVar.f113331d;
                if (hVar4 == null) {
                    hVar4 = C43363h.f113275f;
                }
                eVar.mo33148e("Current Error Status Code: ", String.valueOf(hVar4.f113280d));
            }
        }
    }
}
