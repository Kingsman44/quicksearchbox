package com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a;

import com.google.assistant.p4008y.p4009a.C53556ap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.a.d */
/* compiled from: PG */
public final class C109369d {

    /* renamed from: a */
    public final Map f304653a;

    /* renamed from: b */
    public final List f304654b = new ArrayList();

    public C109369d() {
        HashMap hashMap = new HashMap();
        this.f304653a = hashMap;
        hashMap.put(C53556ap.TIME_CONTEXT, new C109376k());
        hashMap.put(C53556ap.NGA_CONTEXT, new C109373h());
        hashMap.put(C53556ap.OVERAPP_CONTEXT, new C109372g());
    }

    /* renamed from: a */
    public final void mo97808a() {
        this.f304653a.put(C53556ap.PERSONAL_CONTEXT, new C109375j());
    }

    /* renamed from: b */
    public final void mo97809b(String str) {
        this.f304654b.add(C53556ap.OVERAPP_CONTEXT);
        this.f304653a.put(C53556ap.OVERAPP_CONTEXT, new C109374i(str));
    }

    /* renamed from: c */
    public final void mo97810c() {
        this.f304654b.add(C53556ap.PERSONAL_CONTEXT);
        this.f304653a.put(C53556ap.PERSONAL_CONTEXT, new C109375j());
    }
}
