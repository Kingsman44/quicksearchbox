package com.google.apps.tiktok.inject.baseclasses;

import android.support.p031v4.app.C0167am;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2393x;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47563bn;
import com.google.apps.tiktok.tracing.C47851k;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.inject.baseclasses.h */
/* compiled from: PG */
public final class C47212h extends C2393x {

    /* renamed from: d */
    private C47851k f122870d;

    public C47212h(C0167am amVar) {
        super(amVar);
    }

    /* renamed from: e */
    public final void mo5793e(C2382m mVar) {
        C47563bn bnVar;
        String str;
        C2393x.m6407h("getObserverCount");
        if (this.f6611b.f2977e > 0) {
            C47851k kVar = this.f122870d;
            C2382m mVar2 = C2382m.ON_CREATE;
            int ordinal = mVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = "Lifecycle.Started";
                    bnVar = C47562bm.f123426a;
                } else if (ordinal == 2) {
                    str = "Lifecycle.Resumed";
                    bnVar = C47562bm.f123426a;
                } else if (ordinal == 3) {
                    str = "Lifecycle.Paused";
                    bnVar = C47562bm.f123426a;
                } else if (ordinal == 4) {
                    str = "Lifecycle.Stopped";
                    bnVar = C47562bm.f123426a;
                } else if (ordinal == 5) {
                    str = "Lifecycle.Destroyed";
                    bnVar = C47562bm.f123426a;
                } else {
                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(String.valueOf(String.valueOf(mVar))));
                }
                kVar.mo51689p(str, bnVar);
            } else if (kVar.f123905c == null) {
                kVar.mo51689p("Lifecycle.Created", C47562bm.f123426a);
                kVar.f123904b = true;
            }
            try {
                super.mo5793e(mVar);
            } finally {
                this.f122870d.mo51687n(mVar);
            }
        } else {
            super.mo5793e(mVar);
        }
    }

    /* renamed from: i */
    public final void mo51120i(C47851k kVar) {
        C58838bb.m90884s(this.f122870d == null, "Activity was already created");
        this.f122870d = kVar;
    }
}
