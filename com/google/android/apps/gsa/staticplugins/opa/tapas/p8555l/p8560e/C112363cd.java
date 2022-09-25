package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113403en;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import com.google.research.p5181a.C66394w;
import com.google.research.p5181a.C66396y;
import com.google.research.p5181a.p5183b.p5184a.C66307h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.cd */
/* compiled from: PG */
public final /* synthetic */ class C112363cd implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ Map f311780a;

    /* renamed from: b */
    public final /* synthetic */ List f311781b;

    public /* synthetic */ C112363cd(Map map, List list) {
        this.f311780a = map;
        this.f311781b = list;
    }

    public final Object get() {
        Map map = this.f311780a;
        List list = this.f311781b;
        ArrayList arrayList = new ArrayList();
        if (list.contains(C48668ac.LOGISTIC_PREDICTOR)) {
            loop0:
            for (C113403en d : map.values()) {
                Iterator it = d.mo100086d().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C113415ez ezVar = (C113415ez) it.next();
                        if (Thread.interrupted()) {
                            break loop0;
                        }
                        C66307h hVar = new C66307h();
                        String Q = ezVar.mo100058Q();
                        C66394w wVar = hVar.f180316a;
                        wVar.copyOnWrite();
                        C66396y yVar = (C66396y) wVar.instance;
                        C66396y yVar2 = C66396y.f180539n;
                        Q.getClass();
                        yVar.f180541a |= 1;
                        yVar.f180542b = Q;
                        String str = (String) Collection.EL.stream(ezVar.mo100054M()).findFirst().orElse(BuildConfig.FLAVOR);
                        C66394w wVar2 = hVar.f180316a;
                        wVar2.copyOnWrite();
                        C66396y yVar3 = (C66396y) wVar2.instance;
                        str.getClass();
                        yVar3.f180541a |= 2;
                        yVar3.f180543c = str;
                        arrayList.add(hVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
