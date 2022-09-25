package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.common.base.C58839bc;

/* renamed from: com.google.android.apps.gsa.search.core.state.fk */
/* compiled from: PG */
final class C87049fk implements C58839bc {

    /* renamed from: a */
    private boolean f235134a = false;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        ActionData a = C87052fn.m140609a((Bundle) obj);
        if (a == null || a.mo81098i() || this.f235134a) {
            return true;
        }
        this.f235134a = !a.mo81099j();
        return false;
    }
}
