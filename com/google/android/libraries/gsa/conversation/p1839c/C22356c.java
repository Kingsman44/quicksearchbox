package com.google.android.libraries.gsa.conversation.p1839c;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.c.c */
/* compiled from: PG */
public final class C22356c implements C68220f {

    /* renamed from: a */
    private final C69464a f61703a;

    public C22356c(C69464a aVar) {
        this.f61703a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        CameraManager cameraManager = (CameraManager) ((Context) ((C68221g) this.f61703a).f184583a).getSystemService("camera");
        C68225k.m98532d(cameraManager);
        return cameraManager;
    }
}
