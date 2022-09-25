package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.el */
/* compiled from: PG */
public final class C53183el extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53183el f139373c;

    /* renamed from: d */
    private static volatile C63010eb f139374d;

    /* renamed from: a */
    public int f139375a;

    /* renamed from: b */
    public String f139376b = BuildConfig.FLAVOR;

    static {
        C53183el elVar = new C53183el();
        f139373c = elVar;
        C62942bv.registerDefaultInstance(C53183el.class, elVar);
    }

    private C53183el() {
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
                return newMessageInfo(f139373c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53183el();
            case 4:
                return new C53182ek();
            case 5:
                return f139373c;
            case 6:
                C63010eb ebVar = f139374d;
                if (ebVar == null) {
                    synchronized (C53183el.class) {
                        ebVar = f139374d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139373c);
                            f139374d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
