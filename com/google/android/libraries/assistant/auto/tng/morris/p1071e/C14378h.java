package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.h */
/* compiled from: PG */
public final class C14378h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14378h f43505c;

    /* renamed from: d */
    private static volatile C63010eb f43506d;

    /* renamed from: a */
    public int f43507a;

    /* renamed from: b */
    public int f43508b;

    static {
        C14378h hVar = new C14378h();
        f43505c = hVar;
        C62942bv.registerDefaultInstance(C14378h.class, hVar);
    }

    private C14378h() {
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
                return newMessageInfo(f43505c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C14378h();
            case 4:
                return new C14351g();
            case 5:
                return f43505c;
            case 6:
                C63010eb ebVar = f43506d;
                if (ebVar == null) {
                    synchronized (C14378h.class) {
                        ebVar = f43506d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43505c);
                            f43506d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
