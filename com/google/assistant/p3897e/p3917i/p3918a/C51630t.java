package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.t */
/* compiled from: PG */
public final class C51630t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51630t f134552d;

    /* renamed from: e */
    private static volatile C63010eb f134553e;

    /* renamed from: a */
    public int f134554a;

    /* renamed from: b */
    public C51058ev f134555b;

    /* renamed from: c */
    public String f134556c = BuildConfig.FLAVOR;

    static {
        C51630t tVar = new C51630t();
        f134552d = tVar;
        C62942bv.registerDefaultInstance(C51630t.class, tVar);
    }

    private C51630t() {
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
                return newMessageInfo(f134552d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51630t();
            case 4:
                return new C51629s();
            case 5:
                return f134552d;
            case 6:
                C63010eb ebVar = f134553e;
                if (ebVar == null) {
                    synchronized (C51630t.class) {
                        ebVar = f134553e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134552d);
                            f134553e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
