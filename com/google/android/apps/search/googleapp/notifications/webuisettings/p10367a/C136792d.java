package com.google.android.apps.search.googleapp.notifications.webuisettings.p10367a;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.notifications.webuisettings.a.d */
/* compiled from: PG */
public final class C136792d {

    /* renamed from: a */
    public static final C59071e f372358a = C59071e.m91332i("com.google.android.apps.search.googleapp.notifications.webuisettings.a.d");

    /* renamed from: b */
    public final AccountId f372359b;

    /* renamed from: c */
    public final String f372360c;

    /* renamed from: d */
    public final C43377v f372361d;

    /* renamed from: e */
    public final C136791c f372362e;

    /* renamed from: f */
    public final Fragment f372363f;

    /* renamed from: g */
    public final C28310af f372364g;

    /* renamed from: h */
    public final C46801dp f372365h;

    /* renamed from: i */
    public final C46792di f372366i = new C136793a();

    /* renamed from: com.google.android.apps.search.googleapp.notifications.webuisettings.a.d$a */
    /* compiled from: PG */
    final class C136793a implements C46792di {
        public C136793a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C136792d.f372358a.mo56226d()).mo56382g(th)).mo56372aa(40828)).mo56386p("Failed to get WebState.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C43369n a = C43369n.m76519a(uVar.f113330c);
            if (a == null) {
                a = C43369n.UNSPECIFIED;
            }
            if (a == C43369n.FAILED) {
                C43363h hVar = uVar.f113331d;
                if (hVar == null) {
                    hVar = C43363h.f113275f;
                }
                C59052c cVar = (C59052c) ((C59052c) C136792d.f372358a.mo56226d()).mo56372aa(40829);
                C43362g a2 = C43362g.m76515a(hVar.f113278b);
                if (a2 == null) {
                    a2 = C43362g.UNSPECIFIED;
                }
                cVar.mo56354G("Error loading page with type: %s and msg: %s", a2.name(), hVar.f113279c);
                C0154a aVar = new C0154a(C136792d.this.f372362e.getChildFragmentManager());
                aVar.mo689v(R.id.googleapp_sno_webuisettings_web_fragment_container, C136792d.this.f372363f, "ERROR_PANE_FRAGMENT");
                aVar.mo505b(false);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C136792d(AccountId accountId, String str, C43377v vVar, C136791c cVar, Fragment fragment, C28310af afVar, C46801dp dpVar) {
        this.f372359b = accountId;
        this.f372360c = str;
        this.f372361d = vVar;
        this.f372362e = cVar;
        this.f372363f = fragment;
        this.f372364g = afVar;
        this.f372365h = dpVar;
    }
}
