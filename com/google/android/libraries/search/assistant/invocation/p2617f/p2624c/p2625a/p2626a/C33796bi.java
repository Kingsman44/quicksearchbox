package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.bi */
/* compiled from: PG */
public final class C33796bi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33796bi f90247b;

    /* renamed from: c */
    private static volatile C63010eb f90248c;

    /* renamed from: a */
    public String f90249a = BuildConfig.FLAVOR;

    static {
        C33796bi biVar = new C33796bi();
        f90247b = biVar;
        C62942bv.registerDefaultInstance(C33796bi.class, biVar);
    }

    private C33796bi() {
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
                return newMessageInfo(f90247b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C33796bi();
            case 4:
                return new C33795bh();
            case 5:
                return f90247b;
            case 6:
                C63010eb ebVar = f90248c;
                if (ebVar == null) {
                    synchronized (C33796bi.class) {
                        ebVar = f90248c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90247b);
                            f90248c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
