package com.google.android.libraries.appdoctor.p573a;

import com.google.android.libraries.appdoctor.p575c.C10469a;
import com.google.android.libraries.appdoctor.p575c.C10471c;
import com.google.android.libraries.appdoctor.p575c.C10474f;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.appdoctor.a.l */
/* compiled from: PG */
public final /* synthetic */ class C10455l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C10471c f35209a;

    public /* synthetic */ C10455l(C10471c cVar) {
        this.f35209a = cVar;
    }

    public final Object apply(Object obj) {
        C10471c cVar = this.f35209a;
        C10469a aVar = (C10469a) ((C10474f) obj).toBuilder();
        for (int i = 0; i < ((C10474f) aVar.instance).f35239a.size(); i++) {
            if (((C10471c) ((C10474f) aVar.instance).f35239a.get(i)).f35229c.equals(cVar.f35229c)) {
                aVar.copyOnWrite();
                C10474f fVar = (C10474f) aVar.instance;
                cVar.getClass();
                fVar.mo18508a();
                fVar.f35239a.set(i, cVar);
                return (C10474f) aVar.build();
            }
        }
        aVar.copyOnWrite();
        C10474f fVar2 = (C10474f) aVar.instance;
        cVar.getClass();
        fVar2.mo18508a();
        fVar2.f35239a.add(cVar);
        return (C10474f) aVar.build();
    }
}
