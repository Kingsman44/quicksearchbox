package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48299d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.v */
/* compiled from: PG */
public final class C64712v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64712v f175417e;

    /* renamed from: g */
    private static volatile C63010eb f175418g;

    /* renamed from: a */
    public int f175419a;

    /* renamed from: b */
    public C62971cq f175420b = emptyProtobufList();

    /* renamed from: c */
    public boolean f175421c;

    /* renamed from: d */
    public C48299d f175422d;

    /* renamed from: f */
    private byte f175423f = 2;

    static {
        C64712v vVar = new C64712v();
        f175417e = vVar;
        C62942bv.registerDefaultInstance(C64712v.class, vVar);
    }

    private C64712v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175423f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175423f = b;
                return null;
            case 2:
                return newMessageInfo(f175417e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0001\u0001Л\u0003ဇ\u0001\u0006ဉ\u0003", new Object[]{"a", "b", C64714x.class, C45240c.f118157a, "d"});
            case 3:
                return new C64712v();
            case 4:
                return new C64711u();
            case 5:
                return f175417e;
            case 6:
                C63010eb ebVar = f175418g;
                if (ebVar == null) {
                    synchronized (C64712v.class) {
                        ebVar = f175418g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175417e);
                            f175418g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
