package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.h */
/* compiled from: PG */
public final /* synthetic */ class C92799h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C92804m f258956a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f258957b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f258958c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f258959d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f258960e;

    public /* synthetic */ C92799h(C92804m mVar, C60870cx cxVar, C58833ax axVar, C60870cx cxVar2, C58833ax axVar2) {
        this.f258956a = mVar;
        this.f258957b = cxVar;
        this.f258958c = axVar;
        this.f258959d = cxVar2;
        this.f258960e = axVar2;
    }

    public final Object call() {
        C92804m mVar = this.f258956a;
        C60870cx cxVar = this.f258957b;
        C58833ax axVar = this.f258958c;
        C60870cx cxVar2 = this.f258959d;
        C58833ax axVar2 = this.f258960e;
        C58833ax axVar3 = (C58833ax) C60856cj.m92909r(cxVar);
        C58833ax axVar4 = (C58833ax) C60856cj.m92909r(cxVar2);
        if (axVar3.mo56113h()) {
            Query G = Query.f252741b.mo84259V().mo84244G(true);
            Bundle bundle = new Bundle();
            bundle.putByteArray("android.opa.extra.ASSISTANT_RESPONSE", ((C51195j) axVar3.mo56107c()).toByteArray());
            if (axVar.mo56113h()) {
                G = G.mo84288aY();
                bundle.putByteArray("android.search.extra.TTS_BYTES", ((C63088z) axVar.mo56107c()).mo59174N());
            }
            if (axVar4.mo56113h()) {
                bundle.putParcelable("android.speech.extra.ACTION_DATA", (Parcelable) axVar4.mo56107c());
            }
            if (axVar2.mo56113h()) {
                C84349ah ahVar = (C84349ah) axVar2.mo56107c();
                if (ahVar instanceof C84349ah) {
                    Query query = ahVar.f229566a;
                    if (query.mo84464dr()) {
                        G = G.mo84287aX();
                    }
                    if (query.mo84466dt()) {
                        G = G.mo84291ab();
                    }
                    if (query.mo84363bw("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN")) {
                        bundle.putBoolean("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN", true);
                    }
                }
            }
            Query as = G.mo84307as(bundle);
            int i = mVar.f258972b;
            if (i == 2) {
                as = as.mo84260X(true);
            } else if (i == 4) {
                as = as.mo84301am();
            } else if (i == 5 || i == 6) {
                as = as.mo84309au();
            } else if (i == 7) {
                as = as.mo84243F();
            }
            mVar.f258973c.mo77881b(as);
        }
        return C118826c.f331422a;
    }
}
