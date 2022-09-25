package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.graphics.Rect;
import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a.C133192b;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a.C133193c;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a.C133202l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3711b.C47699g;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3711b.C47700h;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60901do;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.DeleteHistoryCallbacks */
/* compiled from: PG */
public final class DeleteHistoryCallbacks implements C46852f {

    /* renamed from: a */
    public static final C59071e f362987a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.DeleteHistoryCallbacks");

    /* renamed from: b */
    public final Fragment f362988b;

    /* renamed from: c */
    public final C133202l f362989c;

    /* renamed from: d */
    public final C46439e f362990d;

    /* renamed from: e */
    public final C60888db f362991e;

    /* renamed from: f */
    public final C46440f f362992f;

    /* renamed from: g */
    public final C46440f f362993g;

    /* renamed from: h */
    public Snackbar f362994h = null;

    /* renamed from: i */
    private final C21370a f362995i;

    /* renamed from: j */
    private final C47770dh f362996j;

    /* renamed from: k */
    private final C47700h f362997k;

    /* renamed from: l */
    private final C2376g f362998l;

    /* renamed from: com.google.android.apps.search.googleapp.accounts.ui.DeleteHistoryCallbacks$a */
    /* compiled from: PG */
    final class C133164a implements C46440f {
        public C133164a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) DeleteHistoryCallbacks.f362987a.mo56226d()).mo56382g(th)).mo56372aa(40015)).mo56384n();
            DeleteHistoryCallbacks.this.mo111005e(true);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            Snackbar d = DeleteHistoryCallbacks.this.mo111004d();
            C133202l lVar = DeleteHistoryCallbacks.this.f362989c;
            long c = DeleteHistoryCallbacks.m216123c(d);
            C46459k.m82829b(C47633f.m84733g(lVar.f363072g.mo46039a(new C133193c(Instant.ofEpochMilli(lVar.f363071f.mo26870b())), C60826bg.f164896a)), "Failed to reset Delete History retries.", new Object[0]);
            lVar.mo111022b(c);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.googleapp.accounts.ui.DeleteHistoryCallbacks$b */
    /* compiled from: PG */
    final class C133165b implements C46440f {
        public C133165b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Integer num = (Integer) obj;
            ((C59052c) ((C59052c) ((C59052c) DeleteHistoryCallbacks.f362987a.mo56226d()).mo56382g(th)).mo56372aa(40016)).mo56384n();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Void voidR = (Void) obj2;
            Snackbar snackbar = DeleteHistoryCallbacks.this.f362994h;
            if (snackbar != null && num.equals(Integer.valueOf(snackbar.hashCode()))) {
                DeleteHistoryCallbacks.this.f362994h.mo48340e(3);
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public DeleteHistoryCallbacks(Fragment fragment, C133202l lVar, C21370a aVar, C47770dh dhVar, C47700h hVar, C46439e eVar, C60888db dbVar) {
        C1331631 r0 = new C2376g() {
            /* renamed from: gV */
            public final void mo3520gV(C2391v vVar) {
                DeleteHistoryCallbacks deleteHistoryCallbacks = DeleteHistoryCallbacks.this;
                C46439e eVar = deleteHistoryCallbacks.f362990d;
                eVar.getClass();
                C46440f fVar = deleteHistoryCallbacks.f362992f;
                fVar.getClass();
                eVar.mo50429i(fVar);
                DeleteHistoryCallbacks deleteHistoryCallbacks2 = DeleteHistoryCallbacks.this;
                C46439e eVar2 = deleteHistoryCallbacks2.f362990d;
                eVar2.getClass();
                C46440f fVar2 = deleteHistoryCallbacks2.f362993g;
                fVar2.getClass();
                eVar2.mo50429i(fVar2);
            }

            /* renamed from: gW */
            public final /* synthetic */ void mo3521gW(C2391v vVar) {
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        };
        this.f362998l = r0;
        this.f362988b = fragment;
        this.f362989c = lVar;
        this.f362995i = aVar;
        this.f362996j = dhVar;
        this.f362997k = hVar;
        this.f362990d = eVar;
        this.f362991e = dbVar;
        this.f362992f = new C133164a();
        this.f362993g = new C133165b();
        fragment.getLifecycle().mo5790b(r0);
    }

    /* renamed from: c */
    public static long m216123c(Snackbar snackbar) {
        long a = (long) snackbar.mo48336a();
        if (a == -2) {
            a = C133359p.f363376b.toMillis();
        }
        long min = Math.min(a, C133359p.f363376b.toMillis());
        C58838bb.m90883r(min > 0);
        return min;
    }

    /* renamed from: g */
    private final void m216124g(Snackbar snackbar) {
        snackbar.f117089j.setClickable(true);
        snackbar.mo48348m(new C47699g(this.f362997k, new C133171aa(this)));
        snackbar.mo48343h();
        if (snackbar.mo48336a() != ((int) C133359p.f363375a.toMillis())) {
            this.f362990d.mo50445g(C46438d.m82810b(this.f362991e.mo29164d(C60901do.f165001a, m216123c(snackbar), TimeUnit.MILLISECONDS)), new C46436b(Integer.valueOf(snackbar.hashCode())), this.f362993g);
        }
    }

    /* renamed from: d */
    public final Snackbar mo111004d() {
        Snackbar p = Snackbar.m79660p(this.f362988b.requireView(), R.string.googleapp_accountmenu_quickdelete_progress_toast, (int) C133359p.f363375a.toMillis());
        p.mo48353t(R.string.googleapp_accountmenu_quickdelete_cancel, new C47591co(this.f362996j, "Quick Delete snackbar cancel action clicked", new C133367x(this)));
        m216124g(p);
        return p;
    }

    /* renamed from: e */
    public final void mo111005e(boolean z) {
        Snackbar p = Snackbar.m79660p(this.f362988b.requireView(), R.string.googleapp_accountmenu_quickdelete_error, (int) C133359p.f363375a.toMillis());
        if (z) {
            p.mo48353t(R.string.googleapp_accountmenu_quickdelete_retry, new C47591co(this.f362996j, "Quick Delete snackbar retry action clicked", new C133368y(this)));
        }
        m216124g(p);
    }

    /* renamed from: f */
    public final boolean mo111006f() {
        View view = this.f362988b.getView();
        return view != null && view.isShown() && view.getGlobalVisibleRect(new Rect());
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f362987a.mo56225c()).mo56382g(th)).mo56372aa(40017)).mo56386p("Error while subscribing to delete history service");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C133192b bVar = (C133192b) obj;
        if (bVar.f363056e) {
            boolean z = false;
            if (bVar.f363053b < 3) {
                C63042fg fgVar = bVar.f363055d;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                if (!C62950b.m95474e(fgVar).plus(C133359p.f363377c).isBefore(Instant.ofEpochMilli(this.f362995i.mo26870b()))) {
                    z = true;
                }
            }
            View view = this.f362988b.getView();
            if (mo111006f()) {
                mo111005e(z);
            } else if (view != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new C133369z(this, z));
            }
        }
    }
}
