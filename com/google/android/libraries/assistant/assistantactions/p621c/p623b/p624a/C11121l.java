package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11242c;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11244e;
import com.google.assistant.p3897e.p3921j.C52619yl;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.l */
/* compiled from: PG */
public final /* synthetic */ class C11121l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11129t f36447a;

    /* renamed from: b */
    public final /* synthetic */ C11242c f36448b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f36449c;

    /* renamed from: d */
    public final /* synthetic */ List f36450d;

    /* renamed from: e */
    public final /* synthetic */ String f36451e;

    /* renamed from: f */
    public final /* synthetic */ String f36452f;

    public /* synthetic */ C11121l(C11129t tVar, C11242c cVar, C58485gu guVar, List list, String str, String str2) {
        this.f36447a = tVar;
        this.f36448b = cVar;
        this.f36449c = guVar;
        this.f36450d = list;
        this.f36451e = str;
        this.f36452f = str2;
    }

    public final C60870cx apply(Object obj) {
        C11129t tVar = this.f36447a;
        C11242c cVar = this.f36448b;
        C58485gu guVar = this.f36449c;
        List list = this.f36450d;
        String str = this.f36451e;
        String str2 = this.f36452f;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            tVar.f36472c.mo19643m();
            return C60856cj.m92900i(C58836b.f156633a);
        }
        String str3 = (String) axVar.mo56107c();
        if (str3 != null) {
            ((C11244e) cVar).f36654c = str3;
            C58976aa aaVar = C58975e.f156826a;
            C52623yp ypVar = (C52623yp) ((List) Collection.EL.stream(guVar).filter(new C11126q(cVar)).collect(C58370cn.f155946a)).get(0);
            list.add(ypVar);
            ArrayList arrayList = new ArrayList();
            int i = tVar.f36474e;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    for (C52619yl ylVar : ypVar.f138168e) {
                        if ((ylVar.f138151a & 4) != 0) {
                            arrayList.add(ylVar.f138153c);
                        }
                    }
                } else if (i2 == 1) {
                    for (C52629yv yvVar : ypVar.f138169f) {
                        if ((yvVar.f138182a & 4) != 0) {
                            arrayList.add(yvVar.f138185d);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return C60856cj.m92900i(C58836b.f156633a);
                }
                return tVar.f36471b.mo19659c(str, tVar.f36473d, cVar.mo19664a(), str3, arrayList, str2);
            }
            throw null;
        }
        throw new NullPointerException("Null resolvedProvider");
    }
}
