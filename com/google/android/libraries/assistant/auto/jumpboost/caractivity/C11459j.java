package com.google.android.libraries.assistant.auto.jumpboost.caractivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.auto.sdk.C8971c;
import com.google.android.gms.car.p10760f.C143268bb;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11628d;
import com.google.android.libraries.assistant.auto.jumpboost.p664b.p665a.C11447a;
import com.google.android.libraries.assistant.auto.jumpboost.p664b.p665a.C11448b;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1110c.p1111a.C15502d;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.p2871b.C37251i;
import com.google.android.libraries.search.p2871b.C37266j;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.C47266f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.caractivity.j */
/* compiled from: PG */
public final class C11459j extends C8971c {

    /* renamed from: b */
    private static final C59071e f37250b = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.caractivity.j");

    /* renamed from: c */
    private C11447a f37251c;

    /* renamed from: com.google.android.libraries.assistant.auto.jumpboost.caractivity.j$a */
    /* compiled from: PG */
    public interface C11460a {
        /* renamed from: bR */
        C11628d mo19994bR();

        /* renamed from: bW */
        C15502d mo19995bW();

        /* renamed from: cx */
        C37266j mo19996cx();

        /* renamed from: dz */
        C47770dh mo19997dz();

        /* renamed from: eL */
        Executor mo19998eL();

        /* renamed from: rX */
        C32240a mo19999rX();
    }

    /* renamed from: com.google.android.libraries.assistant.auto.jumpboost.caractivity.j$b */
    /* compiled from: PG */
    public interface C11461b {
        /* renamed from: dS */
        C15488n mo20000dS();
    }

    /* renamed from: N */
    private final void m27150N(C37251i iVar) {
        Intent intent = ((C143268bb) this.f388166f).f388466o;
        if (intent == null) {
            ((C59052c) ((C59052c) f37250b.mo56226d()).mo56372aa(43352)).mo56386p("No intent set when bringing up the CarActivity.");
            intent = new Intent();
        }
        intent.putExtra("assistant_auto_additional_events_extra", iVar.mo40776d());
        mo118016F(intent);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0050 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m27151q(p3186j$.util.function.Consumer r7, java.lang.String r8) {
        /*
            r6 = this;
            com.google.android.libraries.assistant.auto.jumpboost.b.a.a r0 = r6.f37251c
            if (r0 != 0) goto L_0x0013
            com.google.common.f.e r7 = f37250b
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Trying to run lifecycle method before attaching"
            r0 = 43350(0xa956, float:6.0746E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r0)).mo56386p(r8)
            return
        L_0x0013:
            java.lang.Class<com.google.android.libraries.assistant.auto.jumpboost.caractivity.j$a> r0 = com.google.android.libraries.assistant.auto.jumpboost.caractivity.C11459j.C11460a.class
            java.lang.Object r0 = com.google.apps.tiktok.inject.C47266f.m84076a(r6, r0)
            com.google.android.libraries.assistant.auto.jumpboost.caractivity.j$a r0 = (com.google.android.libraries.assistant.auto.jumpboost.caractivity.C11459j.C11460a) r0
            r1 = 0
            com.google.apps.tiktok.tracing.dh r2 = r0.mo19997dz()     // Catch:{ Exception -> 0x0051 }
            com.google.apps.tiktok.tracing.ax r8 = r2.mo51613c(r8)     // Catch:{ Exception -> 0x0051 }
            com.google.android.libraries.assistant.auto.jumpboost.b.a.a r2 = r6.f37251c     // Catch:{ all -> 0x0032 }
            r2.getClass()
            r7.accept(r2)     // Catch:{ all -> 0x0032 }
            if (r8 == 0) goto L_0x0031
            r8.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0031:
            return
        L_0x0032:
            r7 = move-exception
            if (r8 == 0) goto L_0x0050
            r8.close()     // Catch:{ all -> 0x0039 }
            goto L_0x0050
        L_0x0039:
            r8 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0050 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r1] = r4     // Catch:{ Exception -> 0x0050 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x0050 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0050 }
            r2[r1] = r8     // Catch:{ Exception -> 0x0050 }
            r3.invoke(r7, r2)     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            throw r7     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            r7 = move-exception
            com.google.common.f.e r8 = f37250b
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r2 = "Error running fragment host lifecycle"
            r3 = 43349(0xa955, float:6.0745E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r7)).mo56372aa(r3)).mo56386p(r2)
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.d r7 = r0.mo19994bR()
            com.google.common.util.concurrent.cx r7 = r7.mo20066d()
            com.google.android.libraries.assistant.auto.jumpboost.caractivity.b r8 = new com.google.android.libraries.assistant.auto.jumpboost.caractivity.b
            r8.<init>(r6)
            java.util.concurrent.Executor r0 = r0.mo19998eL()
            com.google.common.base.ah r8 = com.google.apps.tiktok.tracing.C47810es.m84963c(r8)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r8, r0)
            java.lang.String r8 = "Failed to stop voice session and finish"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r7, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.jumpboost.caractivity.C11459j.m27151q(j$.util.function.Consumer, java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo17282c(Bundle bundle) {
        super.mo17282c(bundle);
        C11460a aVar = (C11460a) C47266f.m84076a(this, C11460a.class);
        C37251i a = aVar.mo19996cx().mo40826a();
        a.mo40774b(C37179a.f97578cr.mo40779c());
        mo17290l();
        mo118029z();
        if (!((C143268bb) this.f388166f).f388466o.hasExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM") || !((C143268bb) this.f388166f).f388466o.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM", false)) {
            this.f31072a.mo17292a().setBackgroundColor(0);
            this.f31072a.f31077b.mo17277a();
            View inflate = mo118024t().inflate(R.layout.assist_layer_container, (ViewGroup) null);
            mo17288j(inflate);
            a.mo40774b(C37179a.f97581cu.mo40779c());
            this.f37251c = C11448b.m27147j(mo118026v(), inflate);
            a.mo40774b(C37179a.f97582cv.mo40779c());
            m27150N(a);
            m27151q(C11457h.f37247a, "VoicePlateCarActivity#onCreate");
            C11447a aVar2 = this.f37251c;
            aVar2.getClass();
            aVar2.f37238e = this;
            return;
        }
        a.mo40774b(C37179a.f97663ee.mo40805c(C62722b.OK));
        m27150N(a);
        C46459k.m82829b(C60922j.m93045h(aVar.mo19999rX().f86461a.mo104411a(C11461b.class), C47810es.m84966f(new C11458i(this, aVar)), aVar.mo19998eL()), "Failed to log prewarm appflow", new Object[0]);
        mo118012A();
    }

    /* renamed from: g */
    public final void mo17285g() {
        super.mo17285g();
        m27151q(C11450a.f37240a, "VoicePlateCarActivity#onStart");
    }

    /* renamed from: h */
    public final void mo17286h() {
        super.mo17286h();
        m27151q(C11452c.f37242a, "VoicePlateCarActivity#onStop");
    }

    /* renamed from: m */
    public final void mo19990m() {
        super.mo19990m();
        m27151q(C11456g.f37246a, "VoicePlateCarActivity#onDestroy");
    }

    /* renamed from: n */
    public final void mo19991n(Intent intent) {
        if (!intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_STOP_VOICE_SESSION", false)) {
            ((C59052c) ((C59052c) f37250b.mo56226d()).mo56372aa(43344)).mo56389s("Unsupported new intent: %s", intent);
            return;
        }
        m27151q(new C11453d(intent), "VoicePlateCarActivity#onNewIntent");
        this.f388174j.mo583n();
    }

    /* renamed from: o */
    public final void mo19992o() {
        super.mo19992o();
        m27151q(C11455f.f37245a, "VoicePlateCarActivity#onPause");
    }

    /* renamed from: p */
    public final void mo19993p() {
        super.mo19993p();
        m27151q(C11454e.f37244a, "VoicePlateCarActivity#onResume");
    }
}
