package com.google.frameworks.client.data.android.p4640g;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.frameworks.client.data.android.C61377as;
import com.google.frameworks.client.data.android.C61378at;

/* renamed from: com.google.frameworks.client.data.android.g.q */
/* compiled from: PG */
public final /* synthetic */ class C61456q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C61378at f166148a;

    /* renamed from: b */
    public final /* synthetic */ C61377as f166149b;

    public /* synthetic */ C61456q(C61378at atVar, C61377as asVar) {
        this.f166148a = atVar;
        this.f166149b = asVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C61378at atVar = this.f166148a;
        C61377as asVar = this.f166149b;
        C47558bi a = C47831fm.m85006a("FrameworkChannel#getTransportChannel");
        try {
            C60870cx i = C60856cj.m92900i(atVar.mo44918a(asVar));
            a.close();
            return i;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
