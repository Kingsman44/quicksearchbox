package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.an */
/* compiled from: PG */
public final class C14203an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14203an f42982b;

    /* renamed from: c */
    private static volatile C63010eb f42983c;

    /* renamed from: a */
    public String f42984a = BuildConfig.FLAVOR;

    static {
        C14203an anVar = new C14203an();
        f42982b = anVar;
        C62942bv.registerDefaultInstance(C14203an.class, anVar);
    }

    private C14203an() {
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
                return newMessageInfo(f42982b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C14203an();
            case 4:
                return new C14202am();
            case 5:
                return f42982b;
            case 6:
                C63010eb ebVar = f42983c;
                if (ebVar == null) {
                    synchronized (C14203an.class) {
                        ebVar = f42983c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42982b);
                            f42983c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
