package com.google.android.apps.gsa.nga.shared.p6275aa.p6287i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.i.m */
/* compiled from: PG */
public final class C80465m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80465m f220842e;

    /* renamed from: f */
    private static volatile C63010eb f220843f;

    /* renamed from: a */
    public C62971cq f220844a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f220845b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f220846c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f220847d = emptyProtobufList();

    static {
        C80465m mVar = new C80465m();
        f220842e = mVar;
        C62942bv.registerDefaultInstance(C80465m.class, mVar);
    }

    private C80465m() {
    }

    /* renamed from: a */
    public final void mo74331a() {
        C62971cq cqVar = this.f220844a;
        if (!cqVar.mo58948c()) {
            this.f220844a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo74332b() {
        C62971cq cqVar = this.f220845b;
        if (!cqVar.mo58948c()) {
            this.f220845b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: c */
    public final void mo74333c() {
        C62971cq cqVar = this.f220846c;
        if (!cqVar.mo58948c()) {
            this.f220846c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: d */
    public final void mo74334d() {
        C62971cq cqVar = this.f220847d;
        if (!cqVar.mo58948c()) {
            this.f220847d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f220842e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", C80464l.class, "b", C80462j.class, C45240c.f118157a, C80459g.class, "d", C80462j.class});
            case 3:
                return new C80465m();
            case 4:
                return new C80460h();
            case 5:
                return f220842e;
            case 6:
                C63010eb ebVar = f220843f;
                if (ebVar == null) {
                    synchronized (C80465m.class) {
                        ebVar = f220843f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220842e);
                            f220843f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
