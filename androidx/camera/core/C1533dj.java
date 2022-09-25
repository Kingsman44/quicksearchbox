package androidx.camera.core;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.dj */
/* compiled from: PG */
public final /* synthetic */ class C1533dj implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4229a;

    /* renamed from: b */
    public final /* synthetic */ String f4230b;

    public /* synthetic */ C1533dj(AtomicReference atomicReference, String str) {
        this.f4229a = atomicReference;
        this.f4230b = str;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        AtomicReference atomicReference = this.f4229a;
        String str = this.f4230b;
        atomicReference.set(cVar);
        return str.concat("-status");
    }
}
