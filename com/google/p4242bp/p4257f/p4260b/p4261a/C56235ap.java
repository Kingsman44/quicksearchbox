package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62474cx;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.ap */
/* compiled from: PG */
public final class C56235ap extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56235ap f149780e;

    /* renamed from: f */
    private static volatile C63010eb f149781f;

    /* renamed from: a */
    public int f149782a;

    /* renamed from: b */
    public C62971cq f149783b = emptyProtobufList();

    /* renamed from: c */
    public C56224ae f149784c;

    /* renamed from: d */
    public int f149785d;

    static {
        C56235ap apVar = new C56235ap();
        f149780e = apVar;
        C62942bv.registerDefaultInstance(C56235ap.class, apVar);
    }

    private C56235ap() {
    }

    /* renamed from: a */
    public final void mo54343a() {
        C62971cq cqVar = this.f149783b;
        if (!cqVar.mo58948c()) {
            this.f149783b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f149780e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", C56233an.class, C45240c.f118157a, "d", C62474cx.f168681a});
            case 3:
                return new C56235ap();
            case 4:
                return new C56234ao();
            case 5:
                return f149780e;
            case 6:
                C63010eb ebVar = f149781f;
                if (ebVar == null) {
                    synchronized (C56235ap.class) {
                        ebVar = f149781f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149780e);
                            f149781f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
