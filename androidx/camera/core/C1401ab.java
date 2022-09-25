package androidx.camera.core;

import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p073b.C1450m;
import java.util.UUID;

/* renamed from: androidx.camera.core.ab */
/* compiled from: PG */
public final class C1401ab {

    /* renamed from: a */
    public final C1339bz f3942a;

    public C1401ab() {
        this(C1339bz.m3625g());
    }

    public C1401ab(C1339bz bzVar) {
        Object obj;
        this.f3942a = bzVar;
        Object obj2 = null;
        try {
            obj = bzVar.mo3953E(C1450m.f4016t);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls == null || cls.equals(C1400aa.class)) {
            Class<C1400aa> cls2 = C1400aa.class;
            this.f3942a.mo4216c(C1450m.f4016t, C1339bz.f3819a, cls2);
            try {
                obj2 = this.f3942a.mo3953E(C1450m.f4015k);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.f3942a.mo4216c(C1450m.f4015k, C1339bz.f3819a, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
