package com.google.android.apps.search.googleapp.search.suggest.p10452d;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.d.a */
/* compiled from: PG */
public final /* synthetic */ class C138074a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138076c f375669a;

    public /* synthetic */ C138074a(C138076c cVar) {
        this.f375669a = cVar;
    }

    public final Object apply(Object obj) {
        String str;
        C138076c cVar = this.f375669a;
        String str2 = (String) obj;
        synchronized (cVar.f375671a) {
            if (cVar.f375677g == null) {
                long b = cVar.f375672b.mo26870b();
                cVar.f375677g = str2 + '.' + b + '.' + cVar.f375676f;
            }
            str = cVar.f375677g;
        }
        return str;
    }
}
