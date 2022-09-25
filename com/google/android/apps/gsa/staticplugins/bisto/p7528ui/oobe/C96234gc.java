package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.ArrayDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gc */
/* compiled from: PG */
public class C96234gc extends C83870ad {

    /* renamed from: a */
    private final C96292ig f269362a;

    /* renamed from: b */
    private final C96296ik f269363b;

    /* renamed from: c */
    private final C96289id f269364c;

    /* renamed from: d */
    private boolean f269365d;

    /* renamed from: e */
    private final ArrayDeque f269366e = new ArrayDeque();

    public C96234gc(C96292ig igVar, C96296ik ikVar, C96289id idVar) {
        this.f269362a = igVar;
        this.f269363b = ikVar;
        this.f269364c = idVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        if (!this.f269365d) {
            this.f269365d = true;
            mo90013a(1);
        }
        return !this.f269366e.isEmpty() ? C58833ax.m90834k((C83956t) this.f269366e.remove()) : C58836b.f156633a;
    }

    /* renamed from: a */
    public final void mo90013a(int i) {
        if (i == 1) {
            this.f269366e.add(C83875ai.m133541f(this.f269362a, new Bundle(), new C96230fz(this)));
        } else if (i == 2) {
            this.f269366e.add(C83875ai.m133541f(this.f269363b, new Bundle(), new C96232ga(this)));
        } else if (i == 3) {
            this.f269366e.add(C83875ai.m133541f(this.f269364c, new Bundle(), new C96233gb(this)));
        }
    }
}
