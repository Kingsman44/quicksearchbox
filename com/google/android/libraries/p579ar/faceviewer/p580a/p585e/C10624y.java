package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.p579ar.faceviewer.runtime.C10666d;
import com.google.android.libraries.p579ar.faceviewer.runtime.NativeCallback;
import com.google.android.libraries.p579ar.faceviewer.runtime.RuntimeJni;
import com.google.p363ad.p364a.C6677ai;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.y */
/* compiled from: PG */
public final /* synthetic */ class C10624y implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C10581ab f35496a;

    /* renamed from: b */
    public final /* synthetic */ C6677ai f35497b;

    public /* synthetic */ C10624y(C10581ab abVar, C6677ai aiVar) {
        this.f35496a = abVar;
        this.f35497b = aiVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C10581ab abVar = this.f35496a;
        C6677ai aiVar = this.f35497b;
        RuntimeJni runtimeJni = abVar.f35402a;
        runtimeJni.nativeMakeExperience(runtimeJni.f35580a, aiVar.toByteArray(), new NativeCallback(new C10616q(cVar, C10623x.f35495a), C10666d.f35585a));
        return "FaceViewerRuntime.makeExperience";
    }
}
