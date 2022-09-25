package com.google.speech.p5230n.p5231a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.a.m */
/* compiled from: PG */
public final class C67376m extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C67376m f183139e;

    /* renamed from: g */
    private static volatile C63010eb f183140g;

    /* renamed from: a */
    public int f183141a;

    /* renamed from: b */
    public C62971cq f183142b = emptyProtobufList();

    /* renamed from: c */
    public C67365b f183143c;

    /* renamed from: d */
    public boolean f183144d;

    /* renamed from: f */
    private byte f183145f = 2;

    static {
        C67376m mVar = new C67376m();
        f183139e = mVar;
        C62942bv.registerDefaultInstance(C67376m.class, mVar);
    }

    private C67376m() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183145f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183145f = b;
                return null;
            case 2:
                return newMessageInfo(f183139e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0004ဇ\u0001", new Object[]{"a", "b", C67374k.class, C45240c.f118157a, "d"});
            case 3:
                return new C67376m();
            case 4:
                return new C67375l();
            case 5:
                return f183139e;
            case 6:
                C63010eb ebVar = f183140g;
                if (ebVar == null) {
                    synchronized (C67376m.class) {
                        ebVar = f183140g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183139e);
                            f183140g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
