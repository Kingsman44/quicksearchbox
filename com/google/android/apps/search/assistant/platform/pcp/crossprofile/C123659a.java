package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.content.Context;
import com.google.android.enterprise.connectedapps.C142555ao;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.C142563c;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.a */
/* compiled from: PG */
public final class C123659a {

    /* renamed from: a */
    public final C142557aq f341620a;

    public C123659a(C142557aq aqVar) {
        this.f341620a = aqVar;
    }

    /* renamed from: b */
    public final C123686v mo106086b() {
        return mo106085a(this.f341620a.mo117178i().mo117186b());
    }

    /* renamed from: a */
    public final C123686v mo106085a(C142555ao aoVar) {
        if (!aoVar.mo117171a()) {
            return new C123685u(this.f341620a);
        }
        Context context = ((C142563c) this.f341620a).f386843a;
        C123684t tVar = C123684t.f341650a;
        return new C123679o(C123684t.m203055a(((C142563c) this.f341620a).f386843a));
    }
}
