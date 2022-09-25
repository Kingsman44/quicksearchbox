package com.google.android.libraries.places.api.p2437b;

import com.google.android.gms.tasks.C146004a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.p2426a.p2436d.C31844b;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.b.k */
/* compiled from: PG */
public abstract class C31855k implements C31844b {
    /* renamed from: e */
    public static C31854j m59240e(String str, List list) {
        C31845a aVar = new C31845a();
        if (str != null) {
            aVar.f85473a = str;
            aVar.mo37406b(list);
            return aVar;
        }
        throw new NullPointerException("Null placeId");
    }

    /* renamed from: a */
    public abstract C146004a mo37404a();

    /* renamed from: b */
    public abstract AutocompleteSessionToken mo37407b();

    /* renamed from: c */
    public abstract String mo37408c();

    /* renamed from: d */
    public abstract List mo37409d();
}
