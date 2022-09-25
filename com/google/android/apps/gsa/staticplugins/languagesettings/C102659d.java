package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.os.LocaleList;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.d */
/* compiled from: PG */
public final /* synthetic */ class C102659d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102667l f286559a;

    public /* synthetic */ C102659d(C102667l lVar) {
        this.f286559a = lVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C8506p pVar;
        List list;
        C102667l lVar = this.f286559a;
        lVar.mo93375f(2);
        lVar.mo93374e((String) obj);
        RecyclerView recyclerView = (RecyclerView) lVar.f286576d.findViewById(R.id.discover_feed_language_preferences_layout);
        Map map = lVar.f286577e;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).toLanguageTag());
        }
        linkedHashSet.addAll(arrayList);
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add(Locale.getDefault().getCountry());
        linkedHashSet2.add(lVar.f286578f.getSimCountryIso());
        linkedHashSet2.add(lVar.f286578f.getNetworkCountryIso());
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        for (String str : linkedHashSet2) {
            if (!TextUtils.isEmpty(str) && (list = (List) C102667l.f286574b.get(str.toUpperCase(Locale.getDefault()))) != null) {
                linkedHashSet3.addAll(list);
            }
        }
        linkedHashSet.addAll(linkedHashSet3);
        Iterator it = linkedHashSet.iterator();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (it.hasNext() && linkedHashMap.size() < 11) {
            String str2 = (String) it.next();
            if (map.containsKey(str2) && (pVar = (C8506p) map.get(str2)) != null) {
                linkedHashMap.put(str2, pVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (!linkedHashMap.isEmpty()) {
            arrayList2.add(new C102666k(2, (String) null, (C8506p) null));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add(new C102666k(1, (String) entry.getKey(), (C8506p) entry.getValue()));
            }
        }
        arrayList2.add(new C102666k(3, (String) null, (C8506p) null));
        for (Map.Entry entry2 : lVar.f286577e.entrySet()) {
            arrayList2.add(new C102666k(1, (String) entry2.getKey(), (C8506p) entry2.getValue()));
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(lVar.f286575c));
        recyclerView.setAdapter(new C102665j(arrayList2, lVar));
    }
}
