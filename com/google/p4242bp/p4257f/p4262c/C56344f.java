package com.google.p4242bp.p4257f.p4262c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.c.f */
/* compiled from: PG */
public final class C56344f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56344f f150275a;

    /* renamed from: e */
    private static volatile C63010eb f150276e;

    /* renamed from: b */
    private int f150277b;

    /* renamed from: c */
    private C54946ad f150278c;

    /* renamed from: d */
    private byte f150279d = 2;

    static {
        C56344f fVar = new C56344f();
        f150275a = fVar;
        C62942bv.registerDefaultInstance(C56344f.class, fVar);
    }

    private C56344f() {
        C62942bv.emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150279d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150279d = b;
                return null;
            case 2:
                return newMessageInfo(f150275a, "\u0001\u0001\u0000\u0001\u0018\u0018\u0001\u0000\u0000\u0001\u0018ᐉ\u000e", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56344f();
            case 4:
                return new C56343e();
            case 5:
                return f150275a;
            case 6:
                C63010eb ebVar = f150276e;
                if (ebVar == null) {
                    synchronized (C56344f.class) {
                        ebVar = f150276e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150275a);
                            f150276e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
