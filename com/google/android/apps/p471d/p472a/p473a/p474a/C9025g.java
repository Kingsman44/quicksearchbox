package com.google.android.apps.p471d.p472a.p473a.p474a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.d.a.a.a.g */
/* compiled from: PG */
public final class C9025g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9025g f31162b;

    /* renamed from: c */
    private static volatile C63010eb f31163c;

    /* renamed from: a */
    public C62971cq f31164a = emptyProtobufList();

    static {
        C9025g gVar = new C9025g();
        f31162b = gVar;
        C62942bv.registerDefaultInstance(C9025g.class, gVar);
    }

    private C9025g() {
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
                return newMessageInfo(f31162b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C9023e.class});
            case 3:
                return new C9025g();
            case 4:
                return new C9024f();
            case 5:
                return f31162b;
            case 6:
                C63010eb ebVar = f31163c;
                if (ebVar == null) {
                    synchronized (C9025g.class) {
                        ebVar = f31163c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31162b);
                            f31163c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
