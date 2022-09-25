package androidx.camera.core;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.dk */
/* compiled from: PG */
public final /* synthetic */ class C1534dk implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4231a;

    /* renamed from: b */
    public final /* synthetic */ String f4232b;

    public /* synthetic */ C1534dk(AtomicReference atomicReference, String str) {
        this.f4231a = atomicReference;
        this.f4232b = str;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        AtomicReference atomicReference = this.f4231a;
        String str = this.f4232b;
        atomicReference.set(cVar);
        return str.concat("-Surface");
    }
}
