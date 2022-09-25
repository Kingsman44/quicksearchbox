package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28740br;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.aq */
/* compiled from: PG */
public final /* synthetic */ class C122169aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122174av f338851a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f338852b;

    public /* synthetic */ C122169aq(C122174av avVar, C28740br brVar) {
        this.f338851a = avVar;
        this.f338852b = brVar;
    }

    public final C60870cx apply(Object obj) {
        return (C60870cx) Collection.EL.stream((C58485gu) obj).filter(C122166an.f338847a).findFirst().map(C122167ao.f338848a).map(new C122168ap(this.f338851a, this.f338852b)).orElse(C60866ct.f164955a);
    }
}
