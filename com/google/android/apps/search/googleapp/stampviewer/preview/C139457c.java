package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.graphics.drawable.Drawable;
import android.support.p031v4.app.C0154a;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.stampviewer.p10499j.C139434a;
import com.google.android.apps.search.googleapp.stampviewer.webview.C139505a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60901do;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import com.google.protobuf.C62910ar;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.c */
/* compiled from: PG */
public final class C139457c {

    /* renamed from: a */
    public final C28306ab f379210a;

    /* renamed from: b */
    public final AccountId f379211b;

    /* renamed from: c */
    public final C139456b f379212c;

    /* renamed from: d */
    public final C56610b f379213d;

    /* renamed from: e */
    public final C139434a f379214e;

    /* renamed from: f */
    public final C46439e f379215f;

    /* renamed from: g */
    public final C139505a f379216g;

    /* renamed from: h */
    public final C21232ab f379217h;

    /* renamed from: i */
    public final C60888db f379218i;

    /* renamed from: j */
    public final long f379219j;

    /* renamed from: k */
    public final C58872ci f379220k = new C58872ci(C58274c.f155808a);

    /* renamed from: l */
    public C139483z f379221l;

    /* renamed from: m */
    public C139482y f379222m;

    /* renamed from: n */
    public final C46440f f379223n = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C139457c.this.mo114985a();
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
        }
    };

    /* renamed from: o */
    public final C46440f f379224o = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C139457c.this.mo114986b();
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
        }
    };

    /* renamed from: p */
    public int f379225p = 1;

    /* renamed from: q */
    private final C62910ar f379226q;

    public C139457c(C28306ab abVar, AccountId accountId, C139456b bVar, C56610b bVar2, C139434a aVar, C46439e eVar, C139505a aVar2, C21232ab abVar2, C60888db dbVar, C62910ar arVar, long j) {
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(aVar, "ampUrlUtils");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(abVar2, "dataStore");
        C69664n.m101061g(dbVar, "executorService");
        this.f379210a = abVar;
        this.f379211b = accountId;
        this.f379212c = bVar;
        this.f379213d = bVar2;
        this.f379214e = aVar;
        this.f379215f = eVar;
        this.f379216g = aVar2;
        this.f379217h = abVar2;
        this.f379218i = dbVar;
        this.f379226q = arVar;
        this.f379219j = j;
    }

    /* renamed from: d */
    private final Optional m226651d() {
        Optional map = Optional.ofNullable(this.f379212c.getView()).map(C139460d.f379229a);
        C69664n.m101060f(map, "ofNullable(inlineCoordin…viewer_container)\n      }");
        return map;
    }

    /* renamed from: a */
    public final void mo114985a() {
        if (this.f379225p != 3) {
            mo114987c(7);
            this.f379225p = 3;
            View view = this.f379212c.getView();
            View findViewById = view != null ? view.findViewById(R.id.googleapp_preview_label) : null;
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (((C139477t) this.f379212c.getChildFragmentManager().f634a.mo671c("OVERLAY_FRAGMENT")) == null) {
                AccountId accountId = this.f379211b;
                C56622n nVar = this.f379213d.f151150i;
                if (nVar == null) {
                    nVar = C56622n.f151177e;
                }
                C139477t a = C139477t.m226687a(accountId, nVar);
                C0154a aVar = new C0154a(this.f379212c.getChildFragmentManager());
                aVar.mo691x(17432576, 17432577, 0, 0);
                aVar.mo511h(R.id.googleapp_inline_cta_container, a, "OVERLAY_FRAGMENT", 1);
                aVar.mo509f();
            }
            mo114987c(8);
            C139483z zVar = this.f379221l;
            if (zVar != null) {
                zVar.mo115002a();
            }
        }
    }

    /* renamed from: b */
    public final void mo114986b() {
        if (m226651d().isPresent()) {
            View view = (View) m226651d().get();
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.animate().alpha(1.0f);
            mo114987c(6);
        }
        this.f379225p = 2;
        View view2 = this.f379212c.getView();
        View findViewById = view2 != null ? view2.findViewById(R.id.googleapp_preview_label_with_spinner) : null;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View view3 = this.f379212c.getView();
        View findViewById2 = view3 != null ? view3.findViewById(R.id.googleapp_preview_label) : null;
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        Drawable background = findViewById2 != null ? findViewById2.getBackground() : null;
        if (background != null) {
            background.setAlpha(76);
        }
        View view4 = this.f379212c.getView();
        TextView textView = view4 != null ? (TextView) view4.findViewById(R.id.googleapp_preview_label_text) : null;
        if (textView != null) {
            textView.setAlpha(0.3f);
        }
        C60872cz d = this.f379218i.mo29164d(C60901do.f165001a, this.f379226q.f169860a, TimeUnit.SECONDS);
        C69664n.m101060f(d, "executorService.schedule… TimeUnit.SECONDS\n      )");
        this.f379215f.mo50428h(C46438d.m82810b(d).f121541a, (Object) null, this.f379223n);
    }

    /* renamed from: c */
    public final void mo114987c(int i) {
        C139482y yVar = this.f379222m;
        if (yVar != null) {
            yVar.mo114970d(i);
        }
    }
}
