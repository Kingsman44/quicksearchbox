package com.google.android.libraries.assistant.p1594s.p1600d.p1601a;

import com.google.android.libraries.assistant.p1594s.p1599c.C19213o;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.d.a.f */
/* compiled from: PG */
public final class C19222f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19222f f53818b;

    /* renamed from: e */
    private static volatile C63010eb f53819e;

    /* renamed from: a */
    public C19213o f53820a;

    /* renamed from: c */
    private int f53821c;

    /* renamed from: d */
    private byte f53822d = 2;

    static {
        C19222f fVar = new C19222f();
        f53818b = fVar;
        C62942bv.registerDefaultInstance(C19222f.class, fVar);
    }

    private C19222f() {
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53822d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53822d = b;
                return null;
            case 2:
                return newMessageInfo(f53818b, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဉ\u0006", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C19222f();
            case 4:
                return new C19221e();
            case 5:
                return f53818b;
            case 6:
                C63010eb ebVar = f53819e;
                if (ebVar == null) {
                    synchronized (C19222f.class) {
                        ebVar = f53819e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53818b);
                            f53819e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
