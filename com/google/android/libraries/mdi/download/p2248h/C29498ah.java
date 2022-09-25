package com.google.android.libraries.mdi.download.p2248h;

import android.net.Uri;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.h.ah */
/* compiled from: PG */
public final /* synthetic */ class C29498ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29514ax f79932a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f79933b;

    /* renamed from: c */
    public final /* synthetic */ Uri f79934c;

    public /* synthetic */ C29498ah(C29514ax axVar, AtomicReference atomicReference, Uri uri) {
        this.f79932a = axVar;
        this.f79933b = atomicReference;
        this.f79934c = uri;
    }

    public final C60870cx apply(Object obj) {
        C29514ax axVar = this.f79932a;
        AtomicReference atomicReference = this.f79933b;
        Uri uri = this.f79934c;
        Throwable th = (Throwable) obj;
        C29515ay ayVar = (C29515ay) ((C29581bb) atomicReference.get()).toBuilder();
        ayVar.copyOnWrite();
        C29581bb bbVar = (C29581bb) ayVar.instance;
        bbVar.f80151d = 1;
        bbVar.f80148a |= 4;
        atomicReference.set((C29581bb) ayVar.build());
        axVar.mo34754d(uri);
        return C60866ct.f164955a;
    }
}
