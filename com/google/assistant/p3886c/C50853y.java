package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.y */
/* compiled from: PG */
public final class C50853y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50853y f132421c;

    /* renamed from: d */
    private static volatile C63010eb f132422d;

    /* renamed from: a */
    public int f132423a;

    /* renamed from: b */
    public String f132424b = BuildConfig.FLAVOR;

    static {
        C50853y yVar = new C50853y();
        f132421c = yVar;
        C62942bv.registerDefaultInstance(C50853y.class, yVar);
    }

    private C50853y() {
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
                return newMessageInfo(f132421c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50853y();
            case 4:
                return new C50852x();
            case 5:
                return f132421c;
            case 6:
                C63010eb ebVar = f132422d;
                if (ebVar == null) {
                    synchronized (C50853y.class) {
                        ebVar = f132422d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132421c);
                            f132422d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
