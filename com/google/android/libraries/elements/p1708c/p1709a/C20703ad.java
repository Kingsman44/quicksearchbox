package com.google.android.libraries.elements.p1708c.p1709a;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.protos.youtube.elements.p5165a.C66030r;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.libraries.elements.c.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C20703ad implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C20704ae f58007a;

    /* renamed from: b */
    public final /* synthetic */ C66030r f58008b;

    /* renamed from: c */
    public final /* synthetic */ C21311r f58009c;

    public /* synthetic */ C20703ad(C20704ae aeVar, C66030r rVar, C21311r rVar2) {
        this.f58007a = aeVar;
        this.f58008b = rVar;
        this.f58009c = rVar2;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C20704ae aeVar = this.f58007a;
        C66030r rVar = this.f58008b;
        C21311r rVar2 = this.f58009c;
        C20702ac acVar = aeVar.f58010a;
        if (rVar != null) {
            int i = rVar.f179576a;
            if (!((i & 1) == 0 || (i & 4) == 0)) {
                if (((double) rVar.f179578c) >= 0.1d) {
                    View b = rVar2.mo26732b();
                    if (b != null) {
                        synchronized (acVar.f58004d) {
                            acVar.mo25801d(rVar.f179577b);
                            acVar.f58001a.put(rVar.f179577b, new C20701ab(rVar));
                        }
                        b.addOnAttachStateChangeListener(new C20700aa(acVar, rVar));
                        return;
                    }
                    throw new C21260bc("No view is available, loop has not been registered");
                }
                throw new C21260bc("LoopCommand delay is too small");
            }
        }
        throw new C21260bc("Invalid LoopCommand");
    }
}
