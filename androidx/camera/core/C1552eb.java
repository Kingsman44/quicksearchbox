package androidx.camera.core;

import androidx.camera.core.p069a.C1338by;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;
import androidx.camera.core.p069a.C1372de;
import androidx.camera.core.p069a.C1377dj;
import androidx.camera.core.p073b.C1450m;
import java.util.UUID;

/* renamed from: androidx.camera.core.eb */
/* compiled from: PG */
public final class C1552eb implements C1372de {

    /* renamed from: a */
    public final C1339bz f4274a;

    public C1552eb() {
        this(C1339bz.m3625g());
    }

    /* renamed from: a */
    public final C1377dj mo4273c() {
        return new C1377dj(C1343cc.m3633m(this.f4274a));
    }

    /* renamed from: b */
    public final C1338by mo3737b() {
        return this.f4274a;
    }

    public C1552eb(C1339bz bzVar) {
        Object obj;
        this.f4274a = bzVar;
        Object obj2 = null;
        try {
            obj = bzVar.mo3953E(C1450m.f4016t);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls == null || cls.equals(C1554ed.class)) {
            Class<C1554ed> cls2 = C1554ed.class;
            this.f4274a.mo4216c(C1450m.f4016t, C1339bz.f3819a, cls2);
            try {
                obj2 = this.f4274a.mo3953E(C1450m.f4015k);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.f4274a.mo4216c(C1450m.f4015k, C1339bz.f3819a, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
