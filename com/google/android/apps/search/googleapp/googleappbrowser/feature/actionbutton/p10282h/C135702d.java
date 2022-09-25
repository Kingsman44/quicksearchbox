package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10282h;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.web.contrib.p3358b.C43402c;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.shared.p3445e.C44096a;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.h.d */
/* compiled from: PG */
public final class C135702d {

    /* renamed from: a */
    public static final C59071e f369640a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.h.d");

    /* renamed from: b */
    public final boolean f369641b;

    /* renamed from: c */
    public final C43402c f369642c;

    /* renamed from: d */
    public final Fragment f369643d;

    /* renamed from: e */
    public final C44096a f369644e;

    /* renamed from: f */
    public final C46801dp f369645f;

    /* renamed from: g */
    public final C43377v f369646g;

    /* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.h.d$a */
    /* compiled from: PG */
    final class C135703a implements C46792di {
        public C135703a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C135702d.f369640a.mo56226d()).mo56382g(th)).mo56372aa(40593)).mo56386p("Failed to fetch WebState.");
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            View view = C135702d.this.f369643d.getView();
            if (view != null) {
                String str = uVar.f113329b;
                if (str.isEmpty()) {
                    C43367l lVar = uVar.f113335h;
                    if (lVar == null) {
                        lVar = C43367l.f113293h;
                    }
                    str = lVar.f113296b;
                }
                boolean z = false;
                if (!str.isEmpty()) {
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
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C135702d(boolean z, C43402c cVar, Fragment fragment, C46801dp dpVar, C44096a aVar, C43377v vVar) {
        this.f369641b = z;
        this.f369642c = cVar;
        this.f369643d = fragment;
        this.f369644e = aVar;
        this.f369645f = dpVar;
        this.f369646g = vVar;
    }
}
