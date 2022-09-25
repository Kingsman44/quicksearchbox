package com.google.android.gms.measurement.p10848a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.ap */
/* compiled from: PG */
public final class C145138ap extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C145138ap f392285e;

    /* renamed from: f */
    private static volatile C63010eb f392286f;

    /* renamed from: a */
    public C62964ck f392287a = emptyLongList();

    /* renamed from: b */
    public C62964ck f392288b = emptyLongList();

    /* renamed from: c */
    public C62971cq f392289c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f392290d = emptyProtobufList();

    static {
        C145138ap apVar = new C145138ap();
        f392285e = apVar;
        C62942bv.registerDefaultInstance(C145138ap.class, apVar);
    }

    private C145138ap() {
    }

    /* renamed from: a */
    public final void mo120684a() {
        C62971cq cqVar = this.f392289c;
        if (!cqVar.mo58948c()) {
            this.f392289c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo120685b() {
        C62971cq cqVar = this.f392290d;
        if (!cqVar.mo58948c()) {
            this.f392290d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f392285e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, C145124ab.class, "d", C145140ar.class});
            case 3:
                return new C145138ap();
            case 4:
                return new C145137ao();
            case 5:
                return f392285e;
            case 6:
                C63010eb ebVar = f392286f;
                if (ebVar == null) {
                    synchronized (C145138ap.class) {
                        ebVar = f392286f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392285e);
                            f392286f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
