package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.android.apps.search.googleapp.search.suggest.C138542t;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.d */
/* compiled from: PG */
public final /* synthetic */ class C137974d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138001s f375377a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f375378b;

    /* renamed from: c */
    public final /* synthetic */ C138134p f375379c;

    public /* synthetic */ C137974d(C138001s sVar, C138133o oVar, C138134p pVar) {
        this.f375377a = sVar;
        this.f375378b = oVar;
        this.f375379c = pVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C138001s sVar = this.f375377a;
        C138133o oVar = this.f375378b;
        C138134p pVar = this.f375379c;
        List list = (List) obj;
        C137937aw awVar = sVar.f375433e;
        C54231at atVar = ((C138542t) pVar.instance).f376814b;
        if (atVar == null) {
            atVar = C54231at.f142359r;
        }
        if (!oVar.f375825b.isEmpty()) {
            cxVar = C60856cj.m92900i(list);
        } else {
            cxVar = C47633f.m84733g(awVar.f375278b.mo103987g()).mo51515h(new C137931aq(list), awVar.f375277a);
        }
        return C47633f.m84733g(cxVar).mo51515h(new C137935au(oVar), awVar.f375277a).mo51515h(new C137936av(atVar), awVar.f375277a);
    }
}
