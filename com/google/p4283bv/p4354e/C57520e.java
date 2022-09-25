package com.google.p4283bv.p4354e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.e */
/* compiled from: PG */
public final class C57520e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57520e f153640d;

    /* renamed from: f */
    private static volatile C63010eb f153641f;

    /* renamed from: a */
    public int f153642a;

    /* renamed from: b */
    public int f153643b;

    /* renamed from: c */
    public C62971cq f153644c = emptyProtobufList();

    /* renamed from: e */
    private byte f153645e = 2;

    static {
        C57520e eVar = new C57520e();
        f153640d = eVar;
        C62942bv.registerDefaultInstance(C57520e.class, eVar);
    }

    private C57520e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153645e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153645e = b;
                return null;
            case 2:
                return newMessageInfo(f153640d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л", new Object[]{"a", "b", C57519d.f153639a, C45240c.f118157a, C57051b.class});
            case 3:
                return new C57520e();
            case 4:
                return new C57347c();
            case 5:
                return f153640d;
            case 6:
                C63010eb ebVar = f153641f;
                if (ebVar == null) {
                    synchronized (C57520e.class) {
                        ebVar = f153641f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153640d);
                            f153641f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
