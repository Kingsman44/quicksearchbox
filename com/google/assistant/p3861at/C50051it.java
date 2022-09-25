package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.it */
/* compiled from: PG */
public final class C50051it extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50051it f130125c;

    /* renamed from: d */
    private static volatile C63010eb f130126d;

    /* renamed from: a */
    public int f130127a;

    /* renamed from: b */
    public String f130128b = BuildConfig.FLAVOR;

    static {
        C50051it itVar = new C50051it();
        f130125c = itVar;
        C62942bv.registerDefaultInstance(C50051it.class, itVar);
    }

    private C50051it() {
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
                return newMessageInfo(f130125c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50051it();
            case 4:
                return new C50050is();
            case 5:
                return f130125c;
            case 6:
                C63010eb ebVar = f130126d;
                if (ebVar == null) {
                    synchronized (C50051it.class) {
                        ebVar = f130126d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130125c);
                            f130126d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
