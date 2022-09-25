package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58817ah;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.ju */
/* compiled from: PG */
public final /* synthetic */ class C29241ju implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29259kl f79244a;

    public /* synthetic */ C29241ju(C29259kl klVar) {
        this.f79244a = klVar;
    }

    public final Object apply(Object obj) {
        C29259kl klVar = this.f79244a;
        C29045l.m53934f("Failed to commit migration metadata to disk");
        klVar.f79271b.mo34497a(new Exception("Migration to ChecksumOnly failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
        return false;
    }
}
