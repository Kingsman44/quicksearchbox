package com.google.android.libraries.p1703d;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.d.y */
/* compiled from: PG */
public final /* synthetic */ class C20669y {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f57935a;

    /* renamed from: b */
    public final /* synthetic */ String f57936b;

    /* renamed from: c */
    public final /* synthetic */ String f57937c;

    public /* synthetic */ C20669y(AtomicBoolean atomicBoolean, String str, String str2) {
        this.f57935a = atomicBoolean;
        this.f57936b = str;
        this.f57937c = str2;
    }

    /* renamed from: a */
    public final void mo25661a(C20670z zVar, boolean z) {
        AtomicBoolean atomicBoolean = this.f57935a;
        String str = this.f57936b;
        String str2 = this.f57937c;
        if (atomicBoolean.getAndSet(z) != z && zVar.f57938a.mo25587k(5)) {
            Bundle a = zVar.mo25662a();
            a.putBoolean(str, z);
            zVar.f57938a.f57933b.mo3580a(str2, a);
        }
    }
}
