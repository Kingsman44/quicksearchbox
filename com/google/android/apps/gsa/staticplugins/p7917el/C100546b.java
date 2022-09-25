package com.google.android.apps.gsa.staticplugins.p7917el;

import com.google.android.gms.languageprofile.LanguagePreference;
import com.google.common.base.C58817ah;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.el.b */
/* compiled from: PG */
public final /* synthetic */ class C100546b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f281131a;

    public /* synthetic */ C100546b(List list) {
        this.f281131a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f281131a;
        List list2 = (List) obj;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list2.size(); i++) {
            String language = ((LanguagePreference) list2.get(i)).f391048a.getLanguage();
            if (list.contains(language)) {
                hashMap.put(language, Integer.valueOf(i));
            }
        }
        return hashMap;
    }
}
