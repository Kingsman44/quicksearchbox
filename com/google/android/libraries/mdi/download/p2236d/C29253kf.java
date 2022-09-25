package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58817ah;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.kf */
/* compiled from: PG */
public final /* synthetic */ class C29253kf implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29259kl f79263a;

    public /* synthetic */ C29253kf(C29259kl klVar) {
        this.f79263a = klVar;
    }

    public final Object apply(Object obj) {
        C29259kl klVar = this.f79263a;
        C29045l.m53934f("Failed to commit migration metadata to disk");
        klVar.f79271b.mo34497a(new Exception("Migration to DownloadTransform failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
        return false;
    }
}
