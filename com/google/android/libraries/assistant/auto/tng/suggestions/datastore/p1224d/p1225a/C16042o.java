package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15768a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16360bg;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16379o;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16383s;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.o */
/* compiled from: PG */
public final /* synthetic */ class C16042o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f47492a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f47493b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f47494c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f47495d;

    public /* synthetic */ C16042o(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4) {
        this.f47492a = cxVar;
        this.f47493b = cxVar2;
        this.f47494c = cxVar3;
        this.f47495d = cxVar4;
    }

    public final Object call() {
        C60870cx cxVar = this.f47492a;
        C60870cx cxVar2 = this.f47493b;
        C60870cx cxVar3 = this.f47494c;
        C60870cx cxVar4 = this.f47495d;
        C58490gz gzVar = new C58490gz(4);
        Collection.EL.stream((List) C60856cj.m92909r(cxVar)).forEach(new C16015al(gzVar));
        C15768a aVar = new C15768a();
        aVar.mo22538g(C16360bg.f48159g);
        aVar.mo22534c(C16379o.f48211b);
        aVar.mo22536e(C16383s.f48219e);
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        if (axVar != null) {
            aVar.f46973a = axVar;
            aVar.f46975c = gzVar.mo55427f(false);
            C16091aq aqVar = (C16091aq) C60856cj.m92909r(cxVar3);
            if (aqVar != null) {
                aVar.f46974b = aqVar;
                C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar4);
                if (guVar != null) {
                    aVar.f46976d = guVar;
                    return aVar.mo22532a();
                }
                throw new NullPointerException("Null currentlyDisplayedCandidateSuggestionList");
            }
            throw new NullPointerException("Null displayInfo");
        }
        throw new NullPointerException("Null partnerAppSignal");
    }
}
