package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.n */
/* compiled from: PG */
public final /* synthetic */ class C126270n implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C126276t f347925a;

    public /* synthetic */ C126270n(C126276t tVar) {
        this.f347925a = tVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        boolean z;
        C126276t tVar = this.f347925a;
        AtomicReference atomicReference = tVar.f347937i;
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, cVar)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        C58838bb.m90887v(z, "%s already started", tVar);
        return tVar.toString().concat(" ASR started");
    }
}
