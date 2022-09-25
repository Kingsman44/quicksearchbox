package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.C83582am;
import com.google.android.apps.gsa.shared.util.p7168f.C91036a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62946bz;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.bq */
/* compiled from: PG */
public final class C108017bq implements C83582am {

    /* renamed from: a */
    protected static final Object f300505a = new Object();

    /* renamed from: b */
    private final C108035q f300506b;

    /* renamed from: c */
    private final C108015bo f300507c;

    /* renamed from: d */
    private final Map f300508d = new ConcurrentHashMap();

    /* renamed from: e */
    private final Map f300509e = new ConcurrentHashMap();

    public C108017bq(C108035q qVar, C108015bo boVar) {
        this.f300506b = qVar;
        this.f300507c = boVar;
    }

    /* renamed from: a */
    public final C60870cx mo76944a(MessageLite messageLite, long j) {
        String str;
        C108015bo boVar = this.f300507c;
        if (boVar.f300504a.mo79659F() != null) {
            String F = boVar.f300504a.mo79659F();
            F.getClass();
            str = C91036a.m148712a(F, messageLite);
        } else {
            str = C91036a.m148712a(BuildConfig.FLAVOR, messageLite);
        }
        synchronized (f300505a) {
            C108035q qVar = this.f300506b;
            String a = qVar.f300541c.mo96370a(8, 10, C58833ax.m90834k(str.getBytes()));
            this.f300508d.put(a, C58833ax.m90834k(Long.valueOf(j)));
            this.f300509e.put(a, true);
        }
        return C60922j.m93045h(this.f300506b.mo96378g(8, 10, C58833ax.m90834k(str.getBytes()), C62946bz.m95449a(j).toByteArray(), TimeUnit.DAYS.toMinutes(7)), new C108016bp(), C60826bg.f164896a);
    }
}
