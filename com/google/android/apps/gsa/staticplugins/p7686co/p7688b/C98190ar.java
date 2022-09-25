package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.ar */
/* compiled from: PG */
public final /* synthetic */ class C98190ar implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98211bl f274173a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f274174b;

    public /* synthetic */ C98190ar(C98211bl blVar, C58485gu guVar) {
        this.f274173a = blVar;
        this.f274174b = guVar;
    }

    public final C60870cx apply(Object obj) {
        C98211bl blVar = this.f274173a;
        C58485gu guVar = this.f274174b;
        C58485gu guVar2 = (C58485gu) obj;
        C58480gp f = C58485gu.m89838f(guVar.size());
        for (int i = 0; i < guVar.size(); i++) {
            C7751ip x = C98211bl.m162656x((C7752iq) guVar.get(i));
            if (i < guVar2.size()) {
                int a = C98225p.m162690a(((Long) guVar2.get(i)).longValue());
                x.copyOnWrite();
                C7752iq iqVar = (C7752iq) x.instance;
                C7752iq iqVar2 = C7752iq.f27124E;
                iqVar.f27131a |= LinearLayoutManager.INVALID_OFFSET;
                iqVar.f27128C = a;
            }
            f.mo55395g((C7752iq) x.build());
        }
        return blVar.mo91028u(false, f.mo55394f());
    }
}
