package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.support.p031v4.app.C0154a;
import android.view.View;
import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.apps.search.googleapp.stampviewer.p10499j.C139434a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.util.concurrent.C60888db;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.n */
/* compiled from: PG */
public final class C139470n {

    /* renamed from: a */
    public final AccountId f379238a;

    /* renamed from: b */
    public final C56610b f379239b;

    /* renamed from: c */
    public final C139467k f379240c;

    /* renamed from: d */
    public final C139434a f379241d;

    /* renamed from: e */
    public C139482y f379242e = null;

    /* renamed from: f */
    public final C46439e f379243f;

    /* renamed from: g */
    public final C60888db f379244g;

    /* renamed from: h */
    public final Duration f379245h;

    /* renamed from: i */
    public final C28306ab f379246i;

    /* renamed from: j */
    public C139483z f379247j = null;

    /* renamed from: k */
    public final C46440f f379248k = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C139470n.this.mo114993c(7);
            C139470n.this.mo114991a();
            C139470n nVar = C139470n.this;
            if (!nVar.mo114992b()) {
                if (((C139477t) nVar.f379240c.getChildFragmentManager().f634a.mo671c("OVERLAY_FRAGMENT")) == null) {
                    AccountId accountId = nVar.f379238a;
                    C56622n nVar2 = nVar.f379239b.f151150i;
                    if (nVar2 == null) {
                        nVar2 = C56622n.f151177e;
                    }
                    C139477t a = C139477t.m226687a(accountId, nVar2);
                    C0154a aVar = new C0154a(nVar.f379240c.getChildFragmentManager());
                    aVar.mo511h(R.id.googleapp_inline_cta_container, a, "OVERLAY_FRAGMENT", 1);
                    aVar.mo509f();
                }
                nVar.mo114993c(8);
            }
            C139483z zVar = C139470n.this.f379247j;
            if (zVar != null) {
                zVar.mo115002a();
            }
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
        }
    };

    public C139470n(C28306ab abVar, AccountId accountId, C139467k kVar, C56610b bVar, C139434a aVar, C46439e eVar, C47215a aVar2, C60888db dbVar, long j) {
        this.f379246i = abVar;
        this.f379238a = accountId;
        this.f379240c = kVar;
        this.f379239b = bVar;
        this.f379241d = aVar;
        this.f379243f = eVar;
        this.f379244g = dbVar;
        this.f379245h = Duration.ofMillis(j);
        this.f379247j = (C139483z) new C2368bp(aVar2).mo5770a(C139483z.class);
    }

    /* renamed from: a */
    public final void mo114991a() {
        View findViewById;
        View view = this.f379240c.getView();
        if (view != null && (findViewById = view.findViewById(R.id.googleapp_preview_label)) != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final boolean mo114992b() {
        C139483z zVar = this.f379247j;
        return zVar != null && zVar.f379264c.equals(C139343y.VIEWER_MODE_FULLSCREEN);
    }

    /* renamed from: c */
    public final void mo114993c(int i) {
        C139482y yVar = this.f379242e;
        if (yVar != null) {
            yVar.mo114970d(i);
        }
    }
}
