package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.app.C0401v;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class IntentLauncherActivity extends C0395p {

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.IntentLauncherActivity$a */
    /* compiled from: PG */
    public interface C112079a {
        /* renamed from: BU */
        void mo99354BU();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aF);
        super.onCreate(bundle);
        C58976aa aaVar = C58975e.f156826a;
        ((C112079a) C47266f.m84076a(this, C112079a.class)).mo99354BU();
        C0401v.m1321C();
        setContentView((int) R.layout.intent_launcher_layout);
        if (mo545jw().f634a.mo670b(R.id.intent_launcher_fragment) == null) {
            C112101i iVar = new C112101i();
            C0154a aVar = new C0154a(mo545jw());
            aVar.mo689v(R.id.intent_launcher_fragment, iVar, (String) null);
            aVar.mo505b(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        C0401v.m1321C();
    }
}
