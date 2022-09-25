package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.assistant.p3793ae.p3794a.C48770b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a */
/* compiled from: PG */
public final /* synthetic */ class C103819a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104123t f289066a;

    /* renamed from: b */
    public final /* synthetic */ C80627v f289067b;

    /* renamed from: c */
    public final /* synthetic */ C48770b f289068c;

    /* renamed from: d */
    public final /* synthetic */ String f289069d;

    /* renamed from: e */
    public final /* synthetic */ Optional f289070e;

    public /* synthetic */ C103819a(C104123t tVar, C80627v vVar, C48770b bVar, String str, Optional optional) {
        this.f289066a = tVar;
        this.f289067b = vVar;
        this.f289068c = bVar;
        this.f289069d = str;
        this.f289070e = optional;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C104123t tVar = this.f289066a;
        C80627v vVar = this.f289067b;
        C48770b bVar = this.f289068c;
        String str = this.f289069d;
        Optional optional = this.f289070e;
        C28708an anVar = (C28708an) obj;
        C58495hd a = C104123t.m172077a(vVar, bVar);
        C28707am amVar = (C28707am) anVar.toBuilder();
        amVar.copyOnWrite();
        C28708an anVar2 = (C28708an) amVar.instance;
        str.getClass();
        anVar2.f77996a |= 1;
        anVar2.f77997b = str;
        amVar.copyOnWrite();
        ((C28708an) amVar.instance).f78003h = C28708an.emptyProtobufList();
        amVar.copyOnWrite();
        C28708an anVar3 = (C28708an) amVar.instance;
        anVar3.f77996a &= -16385;
        anVar3.f78004i = 0;
        amVar.mo34327a((C58485gu) Collection.EL.stream(anVar.f78003h).map(new C104119p(a)).collect(C58370cn.f155946a));
        C28708an anVar4 = (C28708an) amVar.build();
        if (optional.isPresent()) {
            cxVar = tVar.mo93943c(optional, anVar4);
        } else {
            cxVar = C60866ct.f164955a;
        }
        return tVar.mo93944d(cxVar, tVar.mo93943c(Optional.empty(), anVar4));
    }
}
