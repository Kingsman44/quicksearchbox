package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import android.app.KeyguardManager;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32952e;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.a */
/* compiled from: PG */
public final class C33187a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ KeyguardManager.KeyguardDismissCallback f88762a;

    /* renamed from: b */
    final /* synthetic */ C33190d f88763b;

    public C33187a(KeyguardManager.KeyguardDismissCallback keyguardDismissCallback, C33190d dVar) {
        this.f88762a = keyguardDismissCallback;
        this.f88763b = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        if (th instanceof UnsupportedOperationException) {
            C33190d dVar = this.f88763b;
            KeyguardManager.KeyguardDismissCallback keyguardDismissCallback = this.f88762a;
            if (dVar.f88771d == null) {
                C59052c cVar = (C59052c) C33191e.f88775a.mo56225c();
                cVar.mo56380ai(C58979ad.SMALL);
                cVar.mo56379ah(new C59094n(50943));
                cVar.mo56386p("#dismissKeyguard: Failed, fragment is not attached to an Activity");
                keyguardDismissCallback.onDismissError();
            } else if (!dVar.f88770c.isDeviceLocked()) {
                keyguardDismissCallback.onDismissSucceeded();
            } else {
                dVar.f88770c.requestDismissKeyguard(dVar.f88771d, keyguardDismissCallback);
            }
        } else {
            C59052c cVar2 = (C59052c) ((C59052c) C33191e.f88775a.mo56225c()).mo56382g(th);
            cVar2.mo56379ah(new C59094n(50939));
            cVar2.mo56386p("#dismissKeyguard: Failed with fatal error");
            this.f88762a.onDismissError();
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C32952e eVar = (C32952e) obj;
        C69664n.m101061g(eVar, "keyguardDismissState");
        C32952e eVar2 = C32952e.SUCCEEDED;
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            this.f88762a.onDismissSucceeded();
        } else if (ordinal == 2) {
            this.f88762a.onDismissError();
        }
    }
}
