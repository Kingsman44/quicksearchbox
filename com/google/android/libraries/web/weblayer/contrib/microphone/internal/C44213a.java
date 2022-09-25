package com.google.android.libraries.web.weblayer.contrib.microphone.internal;

import android.os.RemoteException;
import androidx.p104d.p105a.C2164c;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.weblayer.C72571ag;
import org.chromium.weblayer.C72604bm;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.microphone.internal.a */
/* compiled from: PG */
public final /* synthetic */ class C44213a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C44216d f114994a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f114995b;

    public /* synthetic */ C44213a(C44216d dVar, C2164c cVar) {
        this.f114994a = dVar;
        this.f114995b = cVar;
    }

    public final void run() {
        C44216d dVar = this.f114994a;
        dVar.f114999b = this.f114995b;
        C72571ag agVar = dVar.f114998a;
        C72604bm.m107399a();
        try {
            agVar.f193101a.mo63745p();
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
