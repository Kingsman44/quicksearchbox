package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.v */
/* compiled from: PG */
public final class C33628v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33628v f89863a;

    /* renamed from: b */
    private static volatile C63010eb f89864b;

    static {
        C33628v vVar = new C33628v();
        f89863a = vVar;
        C62942bv.registerDefaultInstance(C33628v.class, vVar);
    }

    private C33628v() {
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
                return newMessageInfo(f89863a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33628v();
            case 4:
                return new C33627u();
            case 5:
                return f89863a;
            case 6:
                C63010eb ebVar = f89864b;
                if (ebVar == null) {
                    synchronized (C33628v.class) {
                        ebVar = f89864b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89863a);
                            f89864b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
