package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.p3356a.p3357a.C43381b;
import com.google.android.libraries.web.contrib.p3356a.p3357a.C43386g;
import com.google.android.libraries.web.profile.C44075j;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60901do;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.s */
/* compiled from: PG */
public final class C135999s {

    /* renamed from: a */
    static final Duration f370386a = Duration.ofSeconds(1);

    /* renamed from: b */
    public static final Duration f370387b = Duration.ofMillis(500);

    /* renamed from: c */
    public static final C59071e f370388c = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.g.s");

    /* renamed from: d */
    public final C28443m f370389d;

    /* renamed from: e */
    public final C47770dh f370390e;

    /* renamed from: f */
    public final C43386g f370391f;

    /* renamed from: g */
    public final C46439e f370392g;

    /* renamed from: h */
    public final C135996p f370393h;

    /* renamed from: i */
    public final C135955ab f370394i;

    /* renamed from: j */
    public final C60888db f370395j;

    /* renamed from: k */
    public final C46440f f370396k = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C135999s.f370388c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ClearFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(40675)).mo56386p("Failed to clear cookies and data");
            C135999s.this.mo112676c();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C135999s sVar = C135999s.this;
            C46439e eVar = sVar.f370392g;
            C46438d b = C46438d.m82810b(sVar.f370395j.mo29164d(C60901do.f165001a, C135999s.f370386a.toMillis(), TimeUnit.MILLISECONDS));
            eVar.mo50428h(b.f121541a, (Object) null, sVar.f370397l);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: l */
    public final C46440f f370397l = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C135999s.f370388c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ClearFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(40676)).mo56386p("Failed to schedule clearDoneView");
            C135999s.this.mo112676c();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C135999s sVar = C135999s.this;
            C46439e eVar = sVar.f370392g;
            C46438d b = C46438d.m82810b(sVar.f370395j.mo29164d(C60901do.f165001a, C135999s.f370387b.toMillis(), TimeUnit.MILLISECONDS));
            eVar.mo50428h(b.f121541a, (Object) null, sVar.f370398m);
            if (sVar.f370393h.getDialog() != null) {
                View inflate = sVar.f370393h.getLayoutInflater().inflate(R.layout.googleapp_browser_settings_cleardata_dialog_clearing_done, (ViewGroup) null);
                sVar.mo112675b(inflate, 150043);
                sVar.f370393h.requireDialog().setContentView(inflate);
                inflate.announceForAccessibility(sVar.f370393h.requireContext().getString(R.string.googleapp_browser_clear_done));
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: m */
    public final C46440f f370398m = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C135999s.f370388c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ClearFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(40677)).mo56386p("Failed to schedule closeActivity");
            C135999s.this.mo112676c();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C135999s.this.f370393h.dismiss();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: n */
    public final C133148g f370399n;

    /* renamed from: o */
    private final C28306ab f370400o;

    public C135999s(C135996p pVar, C46439e eVar, C135955ab abVar, C43381b bVar, C60888db dbVar, C44075j jVar, C28306ab abVar2, C28443m mVar, C47770dh dhVar, C133148g gVar) {
        boolean z = true;
        if (!abVar.f370296b && !abVar.f370297c) {
            z = false;
        }
        C58838bb.m90884s(z, "At least one clear argument should be set.");
        this.f370393h = pVar;
        this.f370392g = eVar;
        this.f370391f = bVar.mo46482a(jVar.mo47043a(C43271v.WEB_LAYER));
        this.f370394i = abVar;
        this.f370395j = dbVar;
        this.f370400o = abVar2;
        this.f370389d = mVar;
        this.f370390e = dhVar;
        this.f370399n = gVar;
    }

    /* renamed from: a */
    public static C135996p m220794a(AccountId accountId, C135955ab abVar) {
        C135996p pVar = new C135996p();
        C68324h.m98669f(pVar);
        C47247a.m84047b(pVar, accountId);
        C47243l.m84039a(pVar, abVar);
        return pVar;
    }

    /* renamed from: b */
    public final C28439i mo112675b(View view, int i) {
        C28306ab abVar = this.f370400o;
        return abVar.mo33801b(view, abVar.f76990a.mo33805a(C28427h.m53115a(i)));
    }

    /* renamed from: c */
    public final void mo112676c() {
        Snackbar.m79660p(this.f370393h.getParentFragment().requireView(), R.string.googleapp_browser_clear_error, -1).mo48343h();
        this.f370393h.dismiss();
    }
}
