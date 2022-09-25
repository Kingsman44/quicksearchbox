package com.google.p4691l.p4692a.p4693a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.l.a.a.f */
/* compiled from: PG */
public final class C62018f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62018f f167582c;

    /* renamed from: e */
    private static volatile C63010eb f167583e;

    /* renamed from: a */
    public String f167584a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f167585b;

    /* renamed from: d */
    private int f167586d;

    static {
        C62018f fVar = new C62018f();
        f167582c = fVar;
        C62942bv.registerDefaultInstance(C62018f.class, fVar);
    }

    private C62018f() {
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
                return newMessageInfo(f167582c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဇ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C62018f();
            case 4:
                return new C62017e();
            case 5:
                return f167582c;
            case 6:
                C63010eb ebVar = f167583e;
                if (ebVar == null) {
                    synchronized (C62018f.class) {
                        ebVar = f167583e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167582c);
                            f167583e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
