package com.google.speech.p5230n.p5232b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.f */
/* compiled from: PG */
public final class C67409f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67409f f183209c;

    /* renamed from: f */
    private static volatile C63010eb f183210f;

    /* renamed from: a */
    public String f183211a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f183212b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f183213d;

    /* renamed from: e */
    private byte f183214e = 2;

    static {
        C67409f fVar = new C67409f();
        f183209c = fVar;
        C62942bv.registerDefaultInstance(C67409f.class, fVar);
    }

    private C67409f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183214e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183214e = b;
                return null;
            case 2:
                return newMessageInfo(f183209c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C67409f();
            case 4:
                return new C67408e();
            case 5:
                return f183209c;
            case 6:
                C63010eb ebVar = f183210f;
                if (ebVar == null) {
                    synchronized (C67409f.class) {
                        ebVar = f183210f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183209c);
                            f183210f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
