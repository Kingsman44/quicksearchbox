package androidx.media3.extractor;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.media3.extractor.u */
/* compiled from: PG */
final class C3631u {

    /* renamed from: a */
    private final C3630t f11573a;

    /* renamed from: b */
    private final AtomicBoolean f11574b = new AtomicBoolean(false);

    public C3631u(C3630t tVar) {
        this.f11573a = tVar;
    }

    /* renamed from: a */
    public final C3326aa mo7641a(Object... objArr) {
        Constructor constructor;
        synchronized (this.f11574b) {
            if (!this.f11574b.get()) {
                try {
                    constructor = this.f11573a.mo7640a();
                } catch (ClassNotFoundException unused) {
                    this.f11574b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (C3326aa) constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
