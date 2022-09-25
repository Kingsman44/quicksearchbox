package com.google.android.libraries.search.assistant.invocation.p2651n.p2654c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.c.m */
/* compiled from: PG */
public final class C33996m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33996m f90622c;

    /* renamed from: d */
    private static volatile C63010eb f90623d;

    /* renamed from: a */
    public String f90624a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f90625b;

    static {
        C33996m mVar = new C33996m();
        f90622c = mVar;
        C62942bv.registerDefaultInstance(C33996m.class, mVar);
    }

    private C33996m() {
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
                return newMessageInfo(f90622c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C33996m();
            case 4:
                return new C33994k();
            case 5:
                return f90622c;
            case 6:
                C63010eb ebVar = f90623d;
                if (ebVar == null) {
                    synchronized (C33996m.class) {
                        ebVar = f90623d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90622c);
                            f90623d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
