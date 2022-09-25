package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58817ah;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.mdi.download.d.w */
/* compiled from: PG */
public final /* synthetic */ class C29311w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79433a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f79434b;

    /* renamed from: c */
    public final /* synthetic */ C29398ev f79435c;

    public /* synthetic */ C29311w(C29314z zVar, AtomicInteger atomicInteger, C29398ev evVar) {
        this.f79433a = zVar;
        this.f79434b = atomicInteger;
        this.f79435c = evVar;
    }

    public final Object apply(Object obj) {
        C29314z zVar = this.f79433a;
        AtomicInteger atomicInteger = this.f79434b;
        C29398ev evVar = this.f79435c;
        if (((Boolean) obj).booleanValue()) {
            atomicInteger.getAndIncrement();
            return null;
        }
        zVar.f79444e.mo34543h(1036);
        C29045l.m53936h("%s: Unsubscribe from file %s failed!", "ExpirationHandler", evVar);
        return null;
    }
}
