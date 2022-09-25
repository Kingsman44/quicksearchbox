package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.common.base.C58839bc;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67474v;
import com.google.speech.recognizer.p5233a.C67476x;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.t */
/* compiled from: PG */
public final /* synthetic */ class C106368t implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ double f296715a;

    public /* synthetic */ C106368t(double d) {
        this.f296715a = d;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        double d = this.f296715a;
        C67438ag agVar = (C67438ag) obj;
        C118928k kVar = C106372x.f296719a;
        C67476x xVar = agVar.f183262e;
        if (xVar == null) {
            xVar = C67476x.f183390i;
        }
        for (C67474v vVar : xVar.f183393b) {
            if (vVar.f183388c < d) {
                return false;
            }
        }
        return !C106372x.m177166e(agVar).isEmpty();
    }
}
