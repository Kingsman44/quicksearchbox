package com.google.android.libraries.search.assistant.invocation.p2646l.p2649c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.l.c.g */
/* compiled from: PG */
public final class C33947g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33947g f90518b;

    /* renamed from: d */
    private static volatile C63010eb f90519d;

    /* renamed from: a */
    public C34053bp f90520a;

    /* renamed from: c */
    private byte f90521c = 2;

    static {
        C33947g gVar = new C33947g();
        f90518b = gVar;
        C62942bv.registerDefaultInstance(C33947g.class, gVar);
    }

    private C33947g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90521c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f90521c = b;
                return null;
            case 2:
                return newMessageInfo(f90518b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C33947g();
            case 4:
                return new C33946f();
            case 5:
                return f90518b;
            case 6:
                C63010eb ebVar = f90519d;
                if (ebVar == null) {
                    synchronized (C33947g.class) {
                        ebVar = f90519d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90518b);
                            f90519d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
