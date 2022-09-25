package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.migration.impl;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9751d.C128672b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2479c.p2480a.C32169d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46012bw;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.migration.impl.c */
/* compiled from: PG */
public final class C128649c extends C128651e implements C45987ay {

    /* renamed from: a */
    public C45989b f353668a;

    /* renamed from: b */
    public C28310af f353669b;

    /* renamed from: c */
    public C28306ab f353670c;

    /* renamed from: d */
    public C47770dh f353671d;

    /* renamed from: e */
    private boolean f353672e;

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        View findViewById = this.f122878z.findViewById(16908290);
        if (this.f353672e) {
            C28306ab.m52929e(findViewById);
        }
        C28306ab abVar = this.f353670c;
        C28313c a = this.f353669b.mo33805a(C28427h.m53115a(151270));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(151287));
        a.mo33859g(C45954d.m82060a(accountId));
        abVar.mo33801b(findViewById, a);
        this.f353672e = true;
        Fragment b = mo51122q().f634a.mo670b(R.id.assistant_side_panel_fragment_root_id);
        C0154a aVar = new C0154a(mo51122q());
        if (b != null) {
            aVar.mo516m(b);
        }
        AccountId accountId2 = awVar.f120815a.f120816a;
        C69664n.m101060f(accountId2, "accountId");
        C69664n.m101061g(accountId2, "accountId");
        C128672b bVar = new C128672b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId2);
        aVar.mo511h(R.id.assistant_side_panel_fragment_root_id, bVar, (String) null, 1);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) SidePanelFragmentHostImpl.f353663a.mo56226d()).mo56382g(th)).mo56372aa(37926)).mo56386p("InternalHost.onAccountError. Removing attached fragment.");
        Fragment b = mo51122q().f634a.mo670b(R.id.assistant_side_panel_fragment_root_id);
        C0154a aVar = new C0154a(mo51122q());
        if (b != null) {
            aVar.mo516m(b);
        }
        aVar.mo509f();
    }

    /* renamed from: c */
    public final void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }

    /* renamed from: e */
    public final void mo51126e() {
        C47538ax c = this.f353671d.mo51613c("onPause");
        try {
            super.mo51126e();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128648b.m209946a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo51127f() {
        C47538ax c = this.f353671d.mo51613c("onResume");
        try {
            super.mo51127f();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128648b.m209946a(th, th);
        }
        throw th;
    }

    /* renamed from: g */
    public final void mo51128g() {
        C47538ax c = this.f353671d.mo51613c("onStart");
        try {
            super.mo51128g();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128648b.m209946a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final void mo22016h() {
        C47538ax c = this.f353671d.mo51613c("onStop");
        try {
            super.mo22016h();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128648b.m209946a(th, th);
        }
        throw th;
    }

    /* renamed from: jP */
    public final void mo19987jP(Bundle bundle) {
        C47538ax c = this.f353671d.mo51613c("onCreate");
        try {
            C45989b bVar = this.f353668a;
            C46012bw g = C46013bx.m82203g();
            g.mo50147b().mo55395g(C32169d.class);
            bVar.mo50083f(g.mo50146a());
            bVar.mo50082e(this);
            super.mo19987jP((Bundle) null);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128648b.m209946a(th, th);
        }
        throw th;
    }

    /* renamed from: jQ */
    public final void mo51129jQ() {
        C47538ax c = this.f353671d.mo51613c("onDestroy");
        try {
            super.mo51129jQ();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C128648b.m209946a(th, th);
        }
        throw th;
    }
}
