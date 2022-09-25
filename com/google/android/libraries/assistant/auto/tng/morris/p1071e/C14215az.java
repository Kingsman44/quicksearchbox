package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.az */
/* compiled from: PG */
public final class C14215az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14215az f43002c;

    /* renamed from: e */
    private static volatile C63010eb f43003e;

    /* renamed from: a */
    public C62971cq f43004a = emptyProtobufList();

    /* renamed from: b */
    public boolean f43005b;

    /* renamed from: d */
    private byte f43006d = 2;

    static {
        C14215az azVar = new C14215az();
        f43002c = azVar;
        C62942bv.registerDefaultInstance(C14215az.class, azVar);
    }

    private C14215az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43006d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43006d = b;
                return null;
            case 2:
                return newMessageInfo(f43002c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002\u0007", new Object[]{"a", C53435nu.class, "b"});
            case 3:
                return new C14215az();
            case 4:
                return new C14214ay();
            case 5:
                return f43002c;
            case 6:
                C63010eb ebVar = f43003e;
                if (ebVar == null) {
                    synchronized (C14215az.class) {
                        ebVar = f43003e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43002c);
                            f43003e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
