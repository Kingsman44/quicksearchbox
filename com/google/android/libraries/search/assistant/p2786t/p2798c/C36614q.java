package com.google.android.libraries.search.assistant.p2786t.p2798c;

import android.content.Context;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e.C36499c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e.C36501e;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36531c;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.t.c.q */
/* compiled from: PG */
public final class C36614q implements C36610m {

    /* renamed from: a */
    public final C36531c f95456a;

    /* renamed from: b */
    private final Context f95457b;

    /* renamed from: c */
    private final C36501e f95458c;

    public C36614q(Context context, C36531c cVar, C36501e eVar) {
        this.f95457b = context;
        this.f95456a = cVar;
        this.f95458c = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo40232a(C36608k kVar) {
        if (!C36619a.m65149e(this.f95457b)) {
            return C60856cj.m92899h(new IllegalStateException("Notification access not granted."));
        }
        C47558bi a = C47831fm.m85006a("NotificationObserverRegistry.register");
        try {
            C36501e eVar = this.f95458c;
            C36499c cVar = C36499c.REGISTER_OBSERVER;
            C36613p pVar = new C36613p(this, kVar);
            C36609l a2 = C36609l.m65137a(kVar.f95443b);
            if (a2 == null) {
                a2 = C36609l.UNRECOGNIZED;
            }
            C60870cx b = eVar.mo40205b(cVar, pVar, a2.getNumber());
            a.mo51417a(b);
            a.close();
            return b;
        } catch (Throwable th) {
            C36611n.m65140a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final C60870cx mo40233b(C36608k kVar) {
        C47558bi a = C47831fm.m85006a("NotificationObserverRegistry.unregister");
        try {
            C36501e eVar = this.f95458c;
            C36499c cVar = C36499c.UNREGISTER_OBSERVER;
            C36612o oVar = new C36612o(this, kVar);
            C36609l a2 = C36609l.m65137a(kVar.f95443b);
            if (a2 == null) {
                a2 = C36609l.UNRECOGNIZED;
            }
            C60870cx b = eVar.mo40205b(cVar, oVar, a2.getNumber());
            a.mo51417a(b);
            a.close();
            return b;
        } catch (Throwable th) {
            C36611n.m65140a(th, th);
        }
        throw th;
    }
}
