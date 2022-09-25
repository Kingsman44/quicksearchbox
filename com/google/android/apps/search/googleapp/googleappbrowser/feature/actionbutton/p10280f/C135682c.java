package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10280f;

import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.AppCompatImageButton;
import android.support.p033v7.widget.C0678gm;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.saves.p10388b.C137229x;
import com.google.android.apps.search.googleapp.saves.p10388b.C137230y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.p3358b.C43402c;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.f.c */
/* compiled from: PG */
public final class C135682c {

    /* renamed from: a */
    public static final C59071e f369580a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.f.c");

    /* renamed from: b */
    public final AccountId f369581b;

    /* renamed from: c */
    public final C43402c f369582c;

    /* renamed from: d */
    public final Fragment f369583d;

    /* renamed from: e */
    public final C46801dp f369584e;

    /* renamed from: f */
    public final C43377v f369585f;

    /* renamed from: g */
    public final C137230y f369586g;

    /* renamed from: h */
    public final C46792di f369587h = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C135682c.f369580a.mo56226d()).mo56382g(th)).mo56372aa(40591)).mo56386p("Failed to retrieve page save state.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C135682c cVar = C135682c.this;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            cVar.f369583d.requireView().setEnabled(true);
            View view = cVar.f369583d.getView();
            if (view instanceof AppCompatImageButton) {
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view;
                Drawable c = C0678gm.m2375e().mo3100c(cVar.f369583d.getContext(), true != booleanValue ? R.drawable.quantum_gm_ic_bookmark_border_vd_theme_24 : R.drawable.quantum_gm_ic_bookmark_vd_theme_24);
                c.getClass();
                appCompatImageButton.setImageDrawable(c);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.f.c$a */
    /* compiled from: PG */
    final class C135684a implements C46792di {

        /* renamed from: b */
        private String f369590b = BuildConfig.FLAVOR;

        public C135684a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C135682c.f369580a.mo56226d()).mo56382g(th)).mo56372aa(40592)).mo56386p("Failed to fetch WebState.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            View view = C135682c.this.f369583d.getView();
            if (view != null) {
                boolean z = false;
                if (!uVar.f113329b.isEmpty()) {
                    C43363h hVar = uVar.f113331d;
                    if (hVar == null) {
                        hVar = C43363h.f113275f;
                    }
                    C43362g a = C43362g.m76515a(hVar.f113278b);
                    if (a == null) {
                        a = C43362g.UNSPECIFIED;
                    }
                    if (!a.equals(C43362g.SSL)) {
                        z = true;
                    }
                }
                view.setEnabled(z);
            }
            if (!uVar.f113329b.isEmpty() && !uVar.f113329b.equals(this.f369590b) && (uVar.f113328a & 4) == 0) {
                C135682c cVar = C135682c.this;
                cVar.f369584e.mo50707a(new C137229x(cVar.f369586g, uVar.f113329b), cVar.f369587h);
                this.f369590b = uVar.f113329b;
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C135682c(AccountId accountId, C43402c cVar, Fragment fragment, C46801dp dpVar, C43377v vVar, C137230y yVar) {
        this.f369581b = accountId;
        this.f369582c = cVar;
        this.f369583d = fragment;
        this.f369584e = dpVar;
        this.f369585f = vVar;
        this.f369586g = yVar;
    }
}
