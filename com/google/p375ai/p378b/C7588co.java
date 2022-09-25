package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.co */
/* compiled from: PG */
public final class C7588co extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7588co f26218c;

    /* renamed from: d */
    private static volatile C63010eb f26219d;

    /* renamed from: a */
    public int f26220a;

    /* renamed from: b */
    public String f26221b = BuildConfig.FLAVOR;

    static {
        C7588co coVar = new C7588co();
        f26218c = coVar;
        C62942bv.registerDefaultInstance(C7588co.class, coVar);
    }

    private C7588co() {
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
                return newMessageInfo(f26218c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7588co();
            case 4:
                return new C7587cn();
            case 5:
                return f26218c;
            case 6:
                C63010eb ebVar = f26219d;
                if (ebVar == null) {
                    synchronized (C7588co.class) {
                        ebVar = f26219d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26218c);
                            f26219d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
