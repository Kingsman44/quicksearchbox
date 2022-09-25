package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.hf */
/* compiled from: PG */
public final class C51123hf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51123hf f133072c;

    /* renamed from: e */
    private static volatile C63010eb f133073e;

    /* renamed from: a */
    public String f133074a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f133075b;

    /* renamed from: d */
    private int f133076d;

    static {
        C51123hf hfVar = new C51123hf();
        f133072c = hfVar;
        C62942bv.registerDefaultInstance(C51123hf.class, hfVar);
    }

    private C51123hf() {
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
                return newMessageInfo(f133072c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C51123hf();
            case 4:
                return new C51122he();
            case 5:
                return f133072c;
            case 6:
                C63010eb ebVar = f133073e;
                if (ebVar == null) {
                    synchronized (C51123hf.class) {
                        ebVar = f133073e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133072c);
                            f133073e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
