package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108925ea;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110421h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.t */
/* compiled from: PG */
public final class C110082t extends C83869ac {

    /* renamed from: a */
    public Bundle f306702a = new Bundle();

    /* renamed from: b */
    private final C108925ea f306703b;

    /* renamed from: c */
    private final C110421h f306704c;

    public C110082t(C108925ea eaVar, C110421h hVar) {
        this.f306703b = eaVar;
        this.f306704c = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        Bundle bundle = this.f306702a;
        C110421h hVar = this.f306704c;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("style", 2);
        if (!hVar.mo98655a()) {
            if (hVar.f307774b.mo79746e(C90014bt.f247233dL)) {
                bundle2.putInt("content", 2);
            } else {
                bundle2.putInt("content", 0);
            }
        } else if (!hVar.mo98657c()) {
            bundle2.putInt("content", 1);
        }
        bundle.putAll(bundle2);
        return C83875ai.m133540e(this.f306703b, this.f306702a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return !this.f306704c.mo98656b();
    }
}
