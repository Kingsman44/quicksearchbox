package com.google.android.libraries.p10923ac.p10925b.p10937f;

import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147248e;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147254k;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ac.b.f.e */
/* compiled from: PG */
public final class C147041e {

    /* renamed from: a */
    public final Map f397016a = new HashMap();

    /* renamed from: b */
    public final Map f397017b = new HashMap();

    /* renamed from: c */
    public final Executor f397018c;

    /* renamed from: d */
    public final Object f397019d = new Object();

    /* renamed from: e */
    public C60870cx f397020e;

    /* renamed from: f */
    public final C147248e f397021f;

    /* renamed from: g */
    public final C147266a f397022g;

    /* renamed from: h */
    private final C147254k f397023h;

    public C147041e(C147254k kVar, C147248e eVar, Executor executor, C147266a aVar) {
        this.f397023h = kVar;
        this.f397021f = eVar;
        this.f397018c = executor;
        this.f397022g = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo123841a() {
        C60870cx cxVar = this.f397020e;
        if (cxVar != null) {
            return cxVar;
        }
        C60870cx h = C60922j.m93045h(this.f397023h.mo124056a(), new C147038b(this), this.f397018c);
        this.f397020e = h;
        return h;
    }
}
