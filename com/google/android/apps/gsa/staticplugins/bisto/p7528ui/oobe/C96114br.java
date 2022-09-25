package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.p10712d.C142340bs;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.br */
/* compiled from: PG */
public final class C96114br extends C83869ac {

    /* renamed from: a */
    private final C96325jm f269096a;

    public C96114br(C96325jm jmVar) {
        this.f269096a = jmVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        return C83875ai.m133537b(new C96113bq());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        C142340bs bsVar = this.f269096a.f269538a.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        return (bsVar.f386178a & C89885b.NOW_VALUE) != 0;
    }
}
