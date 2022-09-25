package com.google.android.libraries.lens.view.p2059ah.p2063b.p2064a;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.view.p2069am.C25320ba;
import com.google.android.libraries.lens.view.p2069am.C25321bb;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.ah.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C25132a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C25136e f68437a;

    public /* synthetic */ C25132a(C25136e eVar) {
        this.f68437a = eVar;
    }

    public final Object apply(Object obj) {
        List<C24440ab> list = (List) obj;
        C58485gu u = this.f68437a.f68443b.mo31240b().keySet().mo55229u();
        HashMap hashMap = new HashMap();
        int size = u.size();
        for (int i = 0; i < size; i++) {
            String str = (String) u.get(i);
            C25320ba baVar = (C25320ba) C25321bb.f68892c.createBuilder();
            baVar.copyOnWrite();
            str.getClass();
            ((C25321bb) baVar.instance).f68894a = str;
            C25327c cVar = C25327c.DOWNLOADABLE;
            baVar.copyOnWrite();
            ((C25321bb) baVar.instance).f68895b = cVar.getNumber();
            hashMap.put(str, (C25321bb) baVar.build());
        }
        for (C24440ab abVar : list) {
            if (abVar != null) {
                C24446ah a = C24446ah.m45519a(abVar.f66922d);
                if (a == null) {
                    a = C24446ah.STATUS_UNKNOWN;
                }
                if (a.equals(C24446ah.STATUS_DOWNLOADED)) {
                    C24465t tVar = abVar.f66920b;
                    if (tVar == null) {
                        tVar = C24465t.f66964f;
                    }
                    String str2 = tVar.f66969d;
                    if (!str2.isEmpty()) {
                        C25320ba baVar2 = (C25320ba) C25321bb.f68892c.createBuilder();
                        baVar2.copyOnWrite();
                        str2.getClass();
                        ((C25321bb) baVar2.instance).f68894a = str2;
                        C25327c cVar2 = C25327c.DOWNLOADED;
                        baVar2.copyOnWrite();
                        ((C25321bb) baVar2.instance).f68895b = cVar2.getNumber();
                        hashMap.put(str2, (C25321bb) baVar2.build());
                    } else {
                        C59104x c = C25136e.f68442a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "MddWrapperTranslateModelsManager");
                        C59052c cVar3 = (C59052c) ((C59052c) c).mo56372aa(49824);
                        C24465t tVar2 = abVar.f66920b;
                        if (tVar2 == null) {
                            tVar2 = C24465t.f66964f;
                        }
                        cVar3.mo56389s("Cannot identify downloaded file group %s", tVar2.f66967b);
                    }
                }
            }
        }
        return hashMap.values();
    }
}
