package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.nj */
/* compiled from: PG */
public final class C52320nj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52320nj f137323b;

    /* renamed from: c */
    private static volatile C63010eb f137324c;

    /* renamed from: a */
    public String f137325a = BuildConfig.FLAVOR;

    static {
        C52320nj njVar = new C52320nj();
        f137323b = njVar;
        C62942bv.registerDefaultInstance(C52320nj.class, njVar);
    }

    private C52320nj() {
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
                return newMessageInfo(f137323b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C52320nj();
            case 4:
                return new C52319ni();
            case 5:
                return f137323b;
            case 6:
                C63010eb ebVar = f137324c;
                if (ebVar == null) {
                    synchronized (C52320nj.class) {
                        ebVar = f137324c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137323b);
                            f137324c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
