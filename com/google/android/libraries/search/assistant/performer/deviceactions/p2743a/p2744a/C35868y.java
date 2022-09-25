package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52102fh;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.y */
/* compiled from: PG */
public final /* synthetic */ class C35868y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35817af f93978a;

    /* renamed from: b */
    public final /* synthetic */ C52098fd f93979b;

    /* renamed from: c */
    public final /* synthetic */ String f93980c;

    /* renamed from: d */
    public final /* synthetic */ C52099fe f93981d;

    public /* synthetic */ C35868y(C35817af afVar, C52098fd fdVar, String str, C52099fe feVar) {
        this.f93978a = afVar;
        this.f93979b = fdVar;
        this.f93980c = str;
        this.f93981d = feVar;
    }

    public final Object apply(Object obj) {
        C35817af afVar = this.f93978a;
        C52098fd fdVar = this.f93979b;
        String str = this.f93980c;
        C52099fe feVar = this.f93981d;
        Void voidR = (Void) obj;
        fdVar.mo53798b(str, (C52103fi) feVar.build());
        C52103fi fiVar = (C52103fi) feVar.instance;
        int a = C52102fh.m86506a(fiVar.f136734d);
        if ((a != 0 && a == 4) || (fiVar.f136731a & 16) != 0) {
            C58976aa aaVar = C58975e.f156826a;
            afVar.f93843e.mo39894b(str, C62722b.OK);
            return true;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        afVar.f93843e.mo39894b(str, C62722b.UNAVAILABLE);
        return false;
    }
}
