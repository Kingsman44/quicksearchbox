package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5127o.C65682h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.p */
/* compiled from: PG */
public final /* synthetic */ class C18270p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18280z f51849a;

    public /* synthetic */ C18270p(C18280z zVar) {
        this.f51849a = zVar;
    }

    /* JADX INFO: finally extract failed */
    public final C60870cx apply(Object obj) {
        C18280z zVar = this.f51849a;
        C65682h hVar = (C65682h) obj;
        zVar.f51873b.writeLock().lock();
        try {
            zVar.f51877f = Optional.m71637of(hVar);
            zVar.f51873b.writeLock().unlock();
            return C60866ct.f164955a;
        } catch (Throwable th) {
            zVar.f51873b.writeLock().unlock();
            throw th;
        }
    }
}
