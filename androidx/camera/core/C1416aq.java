package androidx.camera.core;

import androidx.camera.core.p069a.C1323bj;
import androidx.camera.core.p069a.C1338by;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;
import androidx.camera.core.p069a.C1372de;
import androidx.camera.core.p069a.C1373df;
import androidx.camera.core.p073b.C1450m;
import java.util.UUID;

/* renamed from: androidx.camera.core.aq */
/* compiled from: PG */
public final class C1416aq implements C1372de {

    /* renamed from: a */
    public final C1339bz f3973a;

    public C1416aq() {
        this(C1339bz.m3625g());
    }

    /* renamed from: a */
    public final C1323bj mo4273c() {
        return new C1323bj(C1343cc.m3633m(this.f3973a));
    }

    /* renamed from: b */
    public final C1338by mo3737b() {
        return this.f3973a;
    }

    public C1416aq(C1339bz bzVar) {
        Object obj;
        this.f3973a = bzVar;
        Object obj2 = null;
        try {
            obj = bzVar.mo3953E(C1450m.f4016t);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls == null || cls.equals(C1419at.class)) {
            Class<C1419at> cls2 = C1419at.class;
            this.f3973a.mo4216c(C1373df.f4016t, C1339bz.f3819a, cls2);
            try {
                obj2 = this.f3973a.mo3953E(C1373df.f4015k);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.f3973a.mo4216c(C1373df.f4015k, C1339bz.f3819a, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
