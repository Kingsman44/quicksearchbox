package androidx.camera.core;

import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1324bk;
import androidx.camera.core.p069a.C1338by;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;
import androidx.camera.core.p069a.C1372de;
import androidx.camera.core.p073b.C1450m;
import java.util.UUID;

/* renamed from: androidx.camera.core.bj */
/* compiled from: PG */
public final class C1464bj implements C1372de {

    /* renamed from: a */
    public final C1339bz f4039a;

    public C1464bj() {
        this(C1339bz.m3625g());
    }

    /* renamed from: a */
    public static C1464bj m3933a(C1308av avVar) {
        return new C1464bj(C1339bz.m3626l(avVar));
    }

    /* renamed from: b */
    public final C1338by mo3737b() {
        return this.f4039a;
    }

    /* renamed from: d */
    public final C1324bk mo4273c() {
        return new C1324bk(C1343cc.m3633m(this.f4039a));
    }

    /* renamed from: e */
    public final void mo4347e(String str) {
        this.f4039a.mo4216c(C1324bk.f4015k, C1339bz.f3819a, str);
    }

    public C1464bj(C1339bz bzVar) {
        Object obj;
        this.f4039a = bzVar;
        Object obj2 = null;
        try {
            obj = bzVar.mo3953E(C1450m.f4016t);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls == null || cls.equals(C1470bp.class)) {
            Class<C1470bp> cls2 = C1470bp.class;
            this.f4039a.mo4216c(C1324bk.f4016t, C1339bz.f3819a, cls2);
            try {
                obj2 = this.f4039a.mo3953E(C1324bk.f4015k);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                mo4347e(cls2.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
