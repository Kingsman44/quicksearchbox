package com.google.assistant.p3803ag.p3804a.p3805a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.a.f */
/* compiled from: PG */
public final class C48786f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48786f f126232b;

    /* renamed from: e */
    private static volatile C63010eb f126233e;

    /* renamed from: a */
    public C48871n f126234a;

    /* renamed from: c */
    private int f126235c;

    /* renamed from: d */
    private byte f126236d = 2;

    static {
        C48786f fVar = new C48786f();
        f126232b = fVar;
        C62942bv.registerDefaultInstance(C48786f.class, fVar);
    }

    private C48786f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126236d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126236d = b;
                return null;
            case 2:
                return newMessageInfo(f126232b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C48786f();
            case 4:
                return new C48785e();
            case 5:
                return f126232b;
            case 6:
                C63010eb ebVar = f126233e;
                if (ebVar == null) {
                    synchronized (C48786f.class) {
                        ebVar = f126233e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126232b);
                            f126233e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
