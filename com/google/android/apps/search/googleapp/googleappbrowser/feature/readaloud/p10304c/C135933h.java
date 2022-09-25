package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10304c;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.gsa.h.l.c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135914g;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135915h;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135916i;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10303b.C135923f;
import com.google.android.libraries.web.contrib.p3358b.C43402c;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.dataservice.C46685ac;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c.h */
/* compiled from: PG */
public final class C135933h {

    /* renamed from: a */
    public final C43402c f370218a;

    /* renamed from: b */
    public final C46801dp f370219b;

    /* renamed from: c */
    public final C135923f f370220c;

    /* renamed from: d */
    public final C135934a f370221d = new C135934a();

    /* renamed from: e */
    public final C43377v f370222e;

    /* renamed from: f */
    public final c f370223f;

    /* renamed from: g */
    public final boolean f370224g;

    /* renamed from: h */
    public final boolean f370225h;

    /* renamed from: i */
    public boolean f370226i;

    /* renamed from: j */
    private final Fragment f370227j;

    /* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c.h$a */
    /* compiled from: PG */
    final class C135934a implements C46792di, C46685ac {
        public C135934a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C135933h hVar = C135933h.this;
            C135915h hVar2 = (C135915h) C135916i.f370168c.createBuilder();
            C135914g gVar = C135914g.READABILITY_STATE_NON_READABLE;
            hVar2.copyOnWrite();
            C135916i iVar = (C135916i) hVar2.instance;
            iVar.f370171b = gVar.f370167f;
            iVar.f370170a |= 1;
            hVar.mo112631a((C135916i) hVar2.build());
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C135933h.this.mo112631a((C135916i) obj);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }

        /* renamed from: d */
        public final void mo50733d() {
        }

        /* renamed from: e */
        public final void mo50734e(Throwable th) {
            C135933h hVar = C135933h.this;
            C135915h hVar2 = (C135915h) C135916i.f370168c.createBuilder();
            C135914g gVar = C135914g.READABILITY_STATE_NON_READABLE;
            hVar2.copyOnWrite();
            C135916i iVar = (C135916i) hVar2.instance;
            iVar.f370171b = gVar.f370167f;
            iVar.f370170a |= 1;
            hVar.mo112631a((C135916i) hVar2.build());
        }

        /* renamed from: f */
        public final void mo50735f() {
        }
    }

    public C135933h(C43402c cVar, C46801dp dpVar, C135923f fVar, Fragment fragment, C43377v vVar, c cVar2, boolean z, boolean z2) {
        this.f370218a = cVar;
        this.f370219b = dpVar;
        this.f370220c = fVar;
        this.f370227j = fragment;
        this.f370222e = vVar;
        this.f370223f = cVar2;
        this.f370224g = z;
        this.f370225h = z2;
    }

    /* renamed from: b */
    private final void m220571b(boolean z) {
        View requireView = this.f370227j.requireView();
        if (requireView instanceof ImageButton) {
            ImageButton imageButton = (ImageButton) requireView;
            imageButton.setEnabled(z);
            if (z) {
                imageButton.setAlpha(1.0f);
            } else {
                imageButton.setAlpha(0.3f);
            }
        }
    }

    /* renamed from: a */
    public final void mo112631a(C135916i iVar) {
        C135914g gVar = C135914g.READABILITY_STATE_UNKNOWN;
        C135914g a = C135914g.m220526a(iVar.f370171b);
        if (a == null) {
            a = C135914g.READABILITY_STATE_UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            this.f370226i = true;
            m220571b(true);
        } else if (ordinal != 4) {
            this.f370226i = true;
            m220571b(false);
        } else {
            this.f370226i = false;
            m220571b(true);
        }
    }
}
