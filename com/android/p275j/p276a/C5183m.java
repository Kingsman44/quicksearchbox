package com.android.p275j.p276a;

import com.android.p275j.C5206r;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31787a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31824b;
import org.json.JSONObject;

/* renamed from: com.android.j.a.m */
/* compiled from: PG */
public abstract class C5183m extends C5206r {

    /* renamed from: n */
    public final Object f16459n = new Object();

    /* renamed from: o */
    public C31787a f16460o;

    static {
        String.format("application/json; charset=%s", new Object[]{"utf-8"});
    }

    public C5183m(String str, C31787a aVar, C31824b bVar) {
        super(str, bVar);
        this.f16460o = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10268d(Object obj) {
        C31787a aVar;
        synchronized (this.f16459n) {
            aVar = this.f16460o;
        }
        if (aVar != null) {
            aVar.f85412a.mo37393b(aVar.f85413b, aVar.f85414c, (JSONObject) obj);
        }
    }
}
