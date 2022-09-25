package com.google.apps.tiktok.monitoring.feedback;

import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.k */
/* compiled from: PG */
public abstract class C47474k {
    /* renamed from: a */
    public abstract C47475l mo51307a();

    /* renamed from: b */
    public abstract C58490gz mo51308b();

    /* renamed from: c */
    public abstract void mo51309c(String str);

    /* renamed from: d */
    public abstract void mo51310d(boolean z);

    /* renamed from: e */
    public final C47475l mo51332e() {
        C47475l a = mo51307a();
        boolean z = true;
        if (!a.mo51315e() && a.mo51311a().mo56113h()) {
            z = false;
        }
        C58838bb.m90884s(z, "If you want to include a custom screenshot in the FeedbackOptions, #includeScreenshot must be set to true!");
        return a;
    }

    /* renamed from: f */
    public final void mo51333f(String str, C46669g gVar) {
        mo51308b().mo55429h(str, C60856cj.m92900i(gVar));
    }

    /* renamed from: g */
    public final void mo51334g(String str) {
        C46663a aVar = new C46663a();
        aVar.mo50684b(false);
        aVar.mo50686d(C46667e.KEY_VALUE);
        aVar.f121916a = C63088z.m96143E(str);
        mo51333f("Entry point", aVar.mo50683a());
    }
}
