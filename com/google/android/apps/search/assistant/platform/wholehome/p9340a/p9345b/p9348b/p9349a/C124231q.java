package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124235b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.q */
/* compiled from: PG */
public final /* synthetic */ class C124231q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124234t f343018a;

    /* renamed from: b */
    public final /* synthetic */ C124204t f343019b;

    public /* synthetic */ C124231q(C124234t tVar, C124204t tVar2) {
        this.f343018a = tVar;
        this.f343019b = tVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124234t tVar = this.f343018a;
        C124204t tVar2 = this.f343019b;
        if (tVar.f343032k != null) {
            C58485gu guVar = (C58485gu) Collection.EL.stream(tVar.f343028g).filter(new C124230p(tVar)).collect(C58370cn.f155946a);
            if (guVar.size() == 1) {
                C124235b bVar = (C124235b) C58557jl.m90133n(guVar);
                if (bVar != null) {
                    return bVar.mo106332g(tVar2);
                }
                throw new NullPointerException("Connection is null, this should never happen.");
            }
            ((C59052c) ((C59052c) C124234t.f343022a.mo56226d()).mo56372aa(36121)).mo56386p("Primary connection size is wrong, this should never happen.");
            throw new IllegalStateException("Connections does not have exactly one primary connection on target device, this should never happen.");
        }
        ((C59052c) ((C59052c) C124234t.f343022a.mo56226d()).mo56372aa(36122)).mo56386p("Primary connection is null, this should never happen.");
        throw new IllegalStateException("Primary connection is null, this should never happen.");
    }
}
