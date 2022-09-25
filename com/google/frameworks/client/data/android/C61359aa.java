package com.google.frameworks.client.data.android;

import android.net.Uri;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58890d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.frameworks.client.data.android.aa */
/* compiled from: PG */
final class C61359aa implements C61531o {

    /* renamed from: a */
    public static final AtomicInteger f165925a = new AtomicInteger();

    /* renamed from: c */
    private static final C58974d f165926c = C58974d.m91134h("xRPC");

    /* renamed from: b */
    public final Executor f165927b;

    /* renamed from: d */
    private final C60930r f165928d;

    public C61359aa(C61532p pVar) {
        this.f165927b = pVar.f166327a;
        this.f165928d = new C61534r(new C46423aj(new C61533q(pVar), pVar.f166328b));
    }

    /* renamed from: a */
    public final C60870cx mo42484a(C61365ag agVar) {
        String scheme = Uri.parse(agVar.f165938a).getScheme();
        if (!agVar.f165939b && !C58890d.m90990e(scheme, "https")) {
            ((C58970a) ((C58970a) f165926c.mo56225c()).mo56372aa(54877)).mo56386p("Making plaintext http request");
        }
        C47558bi a = C47831fm.m85006a("Http Request");
        try {
            C60870cx h = C60922j.m93045h(C60856cj.m92905n(this.f165928d, C60826bg.f164896a), C47810es.m84966f(new C61535s(this, agVar)), C60826bg.f164896a);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
