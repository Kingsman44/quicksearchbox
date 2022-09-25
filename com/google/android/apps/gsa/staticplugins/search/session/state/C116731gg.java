package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.common.base.C58839bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gg */
/* compiled from: PG */
final class C116731gg implements C58839bc {

    /* renamed from: a */
    private boolean f323724a = false;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        ActionData g = C116735gk.m193762g((Bundle) obj);
        if (g == null || g.mo81098i() || this.f323724a) {
            return true;
        }
        this.f323724a = !g.mo81099j();
        return false;
    }
}
