package com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a;

import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23138a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23139b;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23140c;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23141d;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C23147g implements C23142b {

    /* renamed from: a */
    public final /* synthetic */ int f63496a;

    /* renamed from: b */
    public final /* synthetic */ C23142b f63497b;

    public /* synthetic */ C23147g(int i, C23142b bVar) {
        this.f63496a = i;
        this.f63497b = bVar;
    }

    /* renamed from: a */
    public final Object mo28587a(Object obj) {
        int i = this.f63496a;
        C23140c cVar = (C23140c) obj;
        cVar.copyOnWrite();
        C23141d dVar = (C23141d) cVar.instance;
        C23139b bVar = (C23139b) ((C23138a) this.f63497b.mo28587a((C23138a) ((C23139b) ((C23141d) cVar.instance).f63491a.get(i)).toBuilder())).build();
        bVar.getClass();
        dVar.mo28588a();
        dVar.f63491a.set(i, bVar);
        return cVar;
    }
}
