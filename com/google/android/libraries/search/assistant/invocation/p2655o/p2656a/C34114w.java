package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.w */
/* compiled from: PG */
public final class C34114w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34114w f90859c;

    /* renamed from: d */
    private static volatile C63010eb f90860d;

    /* renamed from: a */
    public int f90861a;

    /* renamed from: b */
    public String f90862b = BuildConfig.FLAVOR;

    static {
        C34114w wVar = new C34114w();
        f90859c = wVar;
        C62942bv.registerDefaultInstance(C34114w.class, wVar);
    }

    private C34114w() {
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
                return newMessageInfo(f90859c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C34114w();
            case 4:
                return new C34113v();
            case 5:
                return f90859c;
            case 6:
                C63010eb ebVar = f90860d;
                if (ebVar == null) {
                    synchronized (C34114w.class) {
                        ebVar = f90860d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90859c);
                            f90860d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
