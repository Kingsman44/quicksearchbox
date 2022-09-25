package androidx.camera.core;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.di */
/* compiled from: PG */
public final /* synthetic */ class C1532di implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4227a;

    /* renamed from: b */
    public final /* synthetic */ String f4228b;

    public /* synthetic */ C1532di(AtomicReference atomicReference, String str) {
        this.f4227a = atomicReference;
        this.f4228b = str;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        AtomicReference atomicReference = this.f4227a;
        String str = this.f4228b;
        atomicReference.set(cVar);
        return str.concat("-cancellation");
    }
}
