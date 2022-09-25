package com.google.android.apps.gsa.speech.helper.crossprofile;

import android.content.Context;
import com.google.android.enterprise.connectedapps.C142555ao;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.C142563c;
import com.google.android.enterprise.connectedapps.C142570e;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.speech.helper.crossprofile.q */
/* compiled from: PG */
public final class C92332q {

    /* renamed from: a */
    private final C142557aq f257435a;

    public C92332q(C142557aq aqVar) {
        this.f257435a = aqVar;
    }

    /* renamed from: a */
    public final C92327l mo86987a() {
        Object obj;
        this.f257435a.mo117178i();
        C142555ao[] aoVarArr = {C142570e.f386860a, C142570e.f386861b};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 2; i++) {
            C142555ao aoVar = aoVarArr[i];
            if (aoVar.mo117171a()) {
                obj = mo86988b();
            } else {
                obj = new C92328m(this.f257435a);
            }
            hashMap.put(aoVar, obj);
        }
        return new C92327l(hashMap);
    }

    /* renamed from: b */
    public final C92318c mo86988b() {
        Context context = ((C142563c) this.f257435a).f386843a;
        C92326k kVar = C92326k.f257426a;
        return new C92318c(C92326k.m151615a(((C142563c) this.f257435a).f386843a));
    }
}
