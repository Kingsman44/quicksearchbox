package com.google.assistant.p3852aq.p3853a.p3854a.p3855a.p3856a.p3857a;

import android.content.Context;
import android.os.Messenger;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3852aq.p3853a.p3854a.p3855a.p3856a.C49703a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.assistant.aq.a.a.a.a.a.g */
/* compiled from: PG */
public final class C49710g implements C49703a {

    /* renamed from: a */
    public static final C59071e f128287a = C59071e.m91332i("com.google.assistant.aq.a.a.a.a.a.g");

    /* renamed from: b */
    final Messenger f128288b;

    /* renamed from: c */
    public final C49709f f128289c;

    /* renamed from: d */
    public final C60887da f128290d;

    /* renamed from: e */
    public final C46459k f128291e;

    /* renamed from: f */
    public final C46428ao f128292f;

    /* renamed from: g */
    public final Context f128293g;

    /* renamed from: h */
    private C60870cx f128294h;

    public C49710g(C46459k kVar, Context context, C46428ao aoVar, C60887da daVar) {
        this.f128291e = kVar;
        this.f128292f = aoVar;
        C49709f fVar = new C49709f();
        this.f128289c = fVar;
        this.f128293g = context;
        this.f128288b = new Messenger(fVar);
        this.f128290d = daVar;
    }

    /* renamed from: b */
    private static boolean m85707b(C60870cx cxVar) {
        if (!((C2168g) cxVar).f6144b.isDone()) {
            return false;
        }
        try {
            C60856cj.m92909r(cxVar);
            return false;
        } catch (CancellationException e) {
            ((C59052c) ((C59052c) ((C59052c) f128287a.mo56225c()).mo56382g(e)).mo56372aa(54863)).mo56386p("Future failed with CancellationException");
            return true;
        } catch (ExecutionException e2) {
            ((C59052c) ((C59052c) ((C59052c) f128287a.mo56225c()).mo56382g(e2)).mo56372aa(54864)).mo56386p("Future failed with ExecutionException");
            return true;
        } catch (IllegalStateException e3) {
            ((C59052c) ((C59052c) ((C59052c) f128287a.mo56225c()).mo56382g(e3)).mo56372aa(54865)).mo56386p("Future failed with InterruptedException");
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized C60870cx mo53338a() {
        C60870cx cxVar = this.f128294h;
        if (cxVar == null || m85707b(cxVar)) {
            ((C59052c) ((C59052c) f128287a.mo56224b()).mo56372aa(54861)).mo56386p("Send out get cast device Id request.");
            this.f128294h = C2169h.m6027a(new C49706c(this));
        }
        return this.f128294h;
    }
}
