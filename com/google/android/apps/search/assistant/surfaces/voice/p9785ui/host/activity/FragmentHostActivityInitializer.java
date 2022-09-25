package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129688v;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129691y;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129665c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129669g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129578c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129625d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.material.p3505b.C44534d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46012bw;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.apps.tiktok.account.api.controller.C46058z;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.account.p3616e.p3620d.C46348h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.FragmentHostActivityInitializer */
/* compiled from: PG */
public final class FragmentHostActivityInitializer implements C45987ay {

    /* renamed from: b */
    private static final C59071e f355596b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.FragmentHostActivityInitializer");

    /* renamed from: a */
    public final C0167am f355597a;

    /* renamed from: c */
    private final C45989b f355598c;

    /* renamed from: d */
    private final C129688v f355599d;

    /* renamed from: e */
    private final C28310af f355600e;

    /* renamed from: f */
    private final C28306ab f355601f;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.activity.FragmentHostActivityInitializer$LifeCycleListener */
    /* compiled from: PG */
    final class LifeCycleListener implements C2376g {
        public LifeCycleListener() {
        }

        /* renamed from: gV */
        public final void mo3520gV(C2391v vVar) {
            FragmentHostActivityInitializer.this.f355597a.setContentView((int) R.layout.assistant_fragment_host_activity);
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
    }

    public FragmentHostActivityInitializer(C0167am amVar, C45989b bVar, C129688v vVar, C28310af afVar, C28306ab abVar, boolean z) {
        this.f355599d = vVar;
        this.f355597a = amVar;
        this.f355598c = bVar;
        this.f355600e = afVar;
        this.f355601f = abVar;
        amVar.setTheme(true != z ? 2132150624 : 2132150630);
        amVar.getLifecycle().mo5790b(new LifeCycleListener());
        C44534d.m78714a(amVar);
        C46012bw f = C46013bx.m82202f(amVar);
        f.mo50147b().mo55395g(C46348h.class);
        bVar.mo50083f(f.mo50146a());
        bVar.mo50082e(this);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C59071e eVar = C129636o.f355779b;
        C129578c a = C129625d.m211648a(accountId);
        Bundle extras = this.f355597a.getIntent().getExtras();
        if (extras != null) {
            C129669g a2 = C129665c.m211717a(extras);
            ((C59052c) ((C59052c) f355596b.mo56224b()).mo56372aa(38304)).mo56389s("setupMainFragment. destination_content=%s", a2.f355878b);
            C129691y yVar = (C129691y) C129541aa.f355591c.createBuilder();
            C129688v vVar = this.f355599d;
            yVar.copyOnWrite();
            C129541aa aaVar = (C129541aa) yVar.instance;
            vVar.getClass();
            aaVar.f355594b = vVar;
            aaVar.f355593a = 1;
            C129669g.m211719c((C129541aa) yVar.build(), a2.f355878b, a2.f355879c, a2.f355880d).mo109180a(a.requireArguments());
        } else {
            ((C59052c) ((C59052c) f355596b.mo56224b()).mo56372aa(38303)).mo56386p("setupMainFragment.");
        }
        C0154a aVar = new C0154a(this.f355597a.mo545jw());
        aVar.mo689v(16908290, a, (String) null);
        aVar.mo691x(R.anim.assistant_host_slide_in, R.anim.assistant_host_slide_out, 0, 0);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        if (th instanceof C46058z) {
            ((C59052c) ((C59052c) f355596b.mo56224b()).mo56372aa(38300)).mo56386p("No account selected, exiting");
            this.f355597a.finish();
            return;
        }
        throw FragmentHostActivityInitializer$$ExternalSyntheticBackport0.m211507m("account selection error", th);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: e */
    public final void mo109086e(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            ((C59052c) ((C59052c) f355596b.mo56224b()).mo56372aa(38302)).mo56389s("onNewIntent. Activity host is re-used instead of recreated. destination_content=%s", C129665c.m211717a(extras).f355878b);
        } else {
            ((C59052c) ((C59052c) f355596b.mo56224b()).mo56372aa(38301)).mo56386p("onNewIntent. Activity host is re-used instead of recreated.");
        }
        this.f355597a.setIntent(intent);
        Fragment b = this.f355597a.mo545jw().f634a.mo670b(16908290);
        C129636o a = b instanceof C129578c ? ((C129578c) b).mo17754z() : null;
        if (a != null) {
            a.mo109143k();
        }
        this.f355598c.mo50079b();
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28306ab abVar = this.f355601f;
        C0167am amVar = this.f355597a;
        amVar.getClass();
        C28313c a = this.f355600e.mo33805a(C28427h.m53115a(149097));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(148012));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(amVar.findViewById(16908290), a);
    }
}
