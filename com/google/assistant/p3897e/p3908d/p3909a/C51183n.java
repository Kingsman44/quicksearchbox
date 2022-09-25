package com.google.assistant.p3897e.p3908d.p3909a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.d.a.n */
/* compiled from: PG */
public final class C51183n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51183n f133226e;

    /* renamed from: f */
    private static volatile C63010eb f133227f;

    /* renamed from: a */
    public int f133228a;

    /* renamed from: b */
    public C62971cq f133229b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f133230c = emptyProtobufList();

    /* renamed from: d */
    public C52428rj f133231d;

    static {
        C51183n nVar = new C51183n();
        f133226e = nVar;
        C62942bv.registerDefaultInstance(C51183n.class, nVar);
    }

    private C51183n() {
    }

    /* renamed from: a */
    public final void mo53552a() {
        C62971cq cqVar = this.f133229b;
        if (!cqVar.mo58948c()) {
            this.f133229b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo53553b() {
        C62971cq cqVar = this.f133230c;
        if (!cqVar.mo58948c()) {
            this.f133230c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f133226e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", C51175f.class, C45240c.f118157a, C51181l.class, "d"});
            case 3:
                return new C51183n();
            case 4:
                return new C51182m();
            case 5:
                return f133226e;
            case 6:
                C63010eb ebVar = f133227f;
                if (ebVar == null) {
                    synchronized (C51183n.class) {
                        ebVar = f133227f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133226e);
                            f133227f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
