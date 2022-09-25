package com.google.android.apps.p471d.p472a.p479c.p480a.p481a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.d.a.c.a.a.d */
/* compiled from: PG */
public final class C9037d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9037d f31238c;

    /* renamed from: e */
    private static volatile C63010eb f31239e;

    /* renamed from: a */
    public String f31240a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C9039f f31241b;

    /* renamed from: d */
    private int f31242d;

    static {
        C9037d dVar = new C9037d();
        f31238c = dVar;
        C62942bv.registerDefaultInstance(C9037d.class, dVar);
    }

    private C9037d() {
        emptyProtobufList();
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
                return newMessageInfo(f31238c, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0005ဉ\u0003", new Object[]{"d", "a", "b"});
            case 3:
                return new C9037d();
            case 4:
                return new C9036c();
            case 5:
                return f31238c;
            case 6:
                C63010eb ebVar = f31239e;
                if (ebVar == null) {
                    synchronized (C9037d.class) {
                        ebVar = f31239e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31238c);
                            f31239e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
