package androidx.camera.core;

import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1338by;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;
import androidx.camera.core.p069a.C1345ce;
import androidx.camera.core.p069a.C1372de;
import androidx.camera.core.p073b.C1450m;
import java.util.UUID;

/* renamed from: androidx.camera.core.cg */
/* compiled from: PG */
public final class C1503cg implements C1372de {

    /* renamed from: a */
    public final C1339bz f4141a;

    public C1503cg() {
        this(C1339bz.m3625g());
    }

    /* renamed from: a */
    static C1503cg m4021a(C1308av avVar) {
        return new C1503cg(C1339bz.m3626l(avVar));
    }

    /* renamed from: b */
    public final C1338by mo3737b() {
        return this.f4141a;
    }

    /* renamed from: d */
    public final C1506cj mo4378d() {
        Object obj;
        Object obj2 = null;
        try {
            obj = this.f4141a.mo3953E(C1345ce.f3811x);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        if (obj != null) {
            try {
                obj2 = this.f4141a.mo3953E(C1345ce.f3807A);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
        }
        return new C1506cj(mo4273c());
    }

    /* renamed from: e */
    public final C1345ce mo4273c() {
        return new C1345ce(C1343cc.m3633m(this.f4141a));
    }

    /* renamed from: f */
    public final void mo4380f(String str) {
        this.f4141a.mo4216c(C1345ce.f4015k, C1339bz.f3819a, str);
    }

    public C1503cg(C1339bz bzVar) {
        Object obj;
        this.f4141a = bzVar;
        Object obj2 = null;
        try {
            obj = bzVar.mo3953E(C1450m.f4016t);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls == null || cls.equals(C1506cj.class)) {
            Class<C1506cj> cls2 = C1506cj.class;
            this.f4141a.mo4216c(C1345ce.f4016t, C1339bz.f3819a, cls2);
            try {
                obj2 = this.f4141a.mo3953E(C1345ce.f4015k);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                mo4380f(cls2.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
