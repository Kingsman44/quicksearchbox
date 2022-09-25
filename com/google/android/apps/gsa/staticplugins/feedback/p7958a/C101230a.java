package com.google.android.apps.gsa.staticplugins.feedback.p7958a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.libraries.p1646ay.C19600b;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.a.a */
/* compiled from: PG */
public final class C101230a extends C19600b {

    /* renamed from: a */
    private final C90465g f282513a;

    /* renamed from: b */
    private boolean f282514b;

    public C101230a(C90465g gVar) {
        this.f282513a = gVar;
    }

    /* renamed from: b */
    public final void mo24895b(Bundle bundle) {
        C74504a.m120462a(f.bh);
        this.f54539k.mo24861h(bundle);
        if (this.f54539k.mo24853b() == null) {
            this.f54539k.mo24855e();
        }
        if (bundle != null) {
            this.f282514b = bundle.getBoolean("is_intent_handled");
        }
    }

    /* renamed from: d */
    public final void mo24897d() {
        this.f54539k.mo24866m();
        Intent b = this.f54539k.mo24853b();
        if (b != null && !this.f282514b) {
            this.f282514b = true;
            int intExtra = b.getIntExtra("EXTRA_HELP_ENTRYPOINT", 0);
            boolean booleanExtra = b.getBooleanExtra("EXTRA_ENABLE_OFFLINE_HELP", false);
            String stringExtra = b.getStringExtra("EXTRA_HELP_CONTEXT");
            C90464f a = this.f282513a.mo84210a(this.f54539k);
            C90461c cVar = new C90461c();
            cVar.f252690b = stringExtra;
            cVar.f252707s = intExtra;
            cVar.f252697i = null;
            cVar.f252692d = (Uri) b.getParcelableExtra("EXTRA_HELP_FALLBACK_URI");
            cVar.f252706r = booleanExtra;
            a.mo84209b(cVar, 0);
        }
        this.f54539k.mo24855e();
    }

    /* renamed from: ih */
    public final void mo24903ih(Bundle bundle) {
        this.f54539k.mo24865l(bundle);
        if (this.f54539k.mo24853b() != null) {
            bundle.putBoolean("is_intent_handled", this.f282514b);
        }
    }
}
