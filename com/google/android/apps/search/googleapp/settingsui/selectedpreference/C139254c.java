package com.google.android.apps.search.googleapp.settingsui.selectedpreference;

import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139874j;
import com.google.android.apps.search.googleapp.p10536x.C139879o;
import com.google.android.apps.search.googleapp.p10536x.C139880p;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.selectedpreference.c */
/* compiled from: PG */
public final class C139254c {

    /* renamed from: a */
    private final Map f378742a;

    /* renamed from: b */
    private final Map f378743b;

    public C139254c(Map map) {
        C69664n.m101061g(map, "settingUiElements");
        this.f378742a = map;
        C58528ij v = ((C58495hd) map).entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList<>();
        for (Object next : v) {
            if (((Map.Entry) next).getValue() instanceof C139880p) {
                arrayList.add(next);
            }
        }
        int b = C69505av.m100860b(C69540x.m100804k(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(b < 16 ? 16 : b);
        for (Map.Entry entry : arrayList) {
            C139879o oVar = (C139879o) entry.getValue();
            C69664n.m101059e(oVar, "null cannot be cast to non-null type com.google.android.apps.search.googleapp.settings.SettingsPageLinkSettingUiElement");
            C69685i iVar = new C69685i(((C139880p) oVar).mo112666c(), (C139873i) entry.getKey());
            linkedHashMap.put(iVar.f186052a, iVar.f186053b);
        }
        this.f378743b = linkedHashMap;
    }

    /* renamed from: a */
    public final List mo114857a(C139874j jVar) {
        if (jVar == C139874j.TOP) {
            return new ArrayList();
        }
        C139873i iVar = (C139873i) this.f378743b.get(jVar);
        if (iVar == null) {
            return null;
        }
        C139874j jVar2 = iVar.f380267aI;
        C69664n.m101060f(jVar2, "parentLink.page");
        List a = mo114857a(jVar2);
        if (a == null) {
            return null;
        }
        a.add(iVar);
        return a;
    }
}
