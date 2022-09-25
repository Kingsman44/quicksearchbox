package com.google.apps.tiktok.tracing;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.apps.tiktok.tracing.m */
/* compiled from: PG */
public final class C47853m {

    /* renamed from: a */
    private final C47770dh f123918a;

    public C47853m(C47770dh dhVar) {
        this.f123918a = dhVar;
    }

    /* renamed from: a */
    public final C47573bx mo51699a(String str, String str2) {
        C58833ax axVar;
        if (C47831fm.m85027v()) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(this.f123918a.mo51615e("Invoking ".concat(str), C47562bm.f123426a));
        }
        return new C47852l(C47831fm.m85024s(str + "." + str2), axVar);
    }
}
