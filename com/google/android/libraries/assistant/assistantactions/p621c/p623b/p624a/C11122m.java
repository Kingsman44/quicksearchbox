package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11241b;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11242c;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11244e;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52619yl;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4152bb.p4153a.C55421x;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.m */
/* compiled from: PG */
public final /* synthetic */ class C11122m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11129t f36453a;

    /* renamed from: b */
    public final /* synthetic */ C11242c f36454b;

    /* renamed from: c */
    public final /* synthetic */ List f36455c;

    /* renamed from: d */
    public final /* synthetic */ String f36456d;

    /* renamed from: e */
    public final /* synthetic */ String f36457e;

    public /* synthetic */ C11122m(C11129t tVar, C11242c cVar, List list, String str, String str2) {
        this.f36453a = tVar;
        this.f36454b = cVar;
        this.f36455c = list;
        this.f36456d = str;
        this.f36457e = str2;
    }

    public final C60870cx apply(Object obj) {
        C11129t tVar = this.f36453a;
        C11242c cVar = this.f36454b;
        List list = this.f36455c;
        String str = this.f36456d;
        String str2 = this.f36457e;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            tVar.f36472c.mo19642l();
            return C60856cj.m92900i(C58836b.f156633a);
        }
        String str3 = (String) axVar.mo56107c();
        if (str3 != null) {
            C11244e eVar = (C11244e) cVar;
            eVar.f36655d = str3;
            C58976aa aaVar = C58975e.f156826a;
            if (list.isEmpty()) {
                C59104x c = C11129t.f36469a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ContactLookupFeatureImpl");
                ((C59052c) ((C59052c) c).mo56372aa(42889)).mo56386p("targetPersonData is not present, this should not happen");
                return C60856cj.m92900i(C58836b.f156633a);
            }
            C52623yp ypVar = (C52623yp) list.get(0);
            ArrayList arrayList = new ArrayList();
            int i = tVar.f36474e;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    for (C52619yl ylVar : (List) Collection.EL.stream(ypVar.f138168e).filter(new C11125p(str3)).collect(C58370cn.f155946a)) {
                        arrayList.add(ylVar.f138152b);
                    }
                } else if (i2 == 1) {
                    for (C52629yv yvVar : (List) Collection.EL.stream(ypVar.f138169f).filter(new C11124o(str3)).collect(C58370cn.f155946a)) {
                        arrayList.add(yvVar.f138184c);
                    }
                } else if (i2 == 5) {
                    C52627yt ytVar = ypVar.f138165b;
                    if (ytVar == null) {
                        ytVar = C52627yt.f138176c;
                    }
                    for (C52617yj yjVar : ytVar.f138179b) {
                        for (C52633yz yzVar : yjVar.f138148a) {
                            if (str3.equals(yzVar.f138195b)) {
                                C52613yf yfVar = yzVar.f138197d;
                                if (yfVar == null) {
                                    yfVar = C52613yf.f138138f;
                                }
                                arrayList.add(yfVar.f138141b);
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return C60856cj.m92900i(C58836b.f156633a);
                }
                C11241b bVar = tVar.f36471b;
                C55421x xVar = tVar.f36473d;
                String a = cVar.mo19664a();
                String str4 = eVar.f36654c;
                if (str4 != null) {
                    return bVar.mo19658b(str, xVar, a, str4, str3, arrayList, str2);
                }
                throw new IllegalStateException("Property \"resolvedProvider\" has not been set");
            }
            throw null;
        }
        throw new NullPointerException("Null resolvedInstanceLabel");
    }
}
