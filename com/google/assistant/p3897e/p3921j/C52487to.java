package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.to */
/* compiled from: PG */
public final class C52487to extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52487to f137774c;

    /* renamed from: d */
    private static volatile C63010eb f137775d;

    /* renamed from: a */
    public int f137776a;

    /* renamed from: b */
    public String f137777b = BuildConfig.FLAVOR;

    static {
        C52487to toVar = new C52487to();
        f137774c = toVar;
        C62942bv.registerDefaultInstance(C52487to.class, toVar);
    }

    private C52487to() {
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
                return newMessageInfo(f137774c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52487to();
            case 4:
                return new C52486tn();
            case 5:
                return f137774c;
            case 6:
                C63010eb ebVar = f137775d;
                if (ebVar == null) {
                    synchronized (C52487to.class) {
                        ebVar = f137775d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137774c);
                            f137775d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
