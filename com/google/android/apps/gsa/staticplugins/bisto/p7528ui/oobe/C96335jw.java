package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.ArrayDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.jw */
/* compiled from: PG */
public final class C96335jw extends C83870ad {

    /* renamed from: a */
    public final ArrayDeque f269548a = new ArrayDeque();

    /* renamed from: b */
    private boolean f269549b;

    /* renamed from: a */
    public final void mo90078a() {
        this.f269548a.add(C83875ai.m133541f(new C96348ki(), new Bundle(), new C96334jv(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        if (!this.f269549b) {
            this.f269549b = true;
            mo90078a();
        }
        return !this.f269548a.isEmpty() ? C58833ax.m90834k((C83956t) this.f269548a.remove()) : C58836b.f156633a;
    }
}
