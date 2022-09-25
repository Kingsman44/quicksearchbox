package com.google.protos.p4953bc.p4955b.p4956a.p4957a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bc.b.a.a.h */
/* compiled from: PG */
public final class C64417h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64417h f174725c;

    /* renamed from: e */
    private static volatile C63010eb f174726e;

    /* renamed from: a */
    public String f174727a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f174728b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f174729d;

    static {
        C64417h hVar = new C64417h();
        f174725c = hVar;
        C62942bv.registerDefaultInstance(C64417h.class, hVar);
    }

    private C64417h() {
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
                return newMessageInfo(f174725c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C64417h();
            case 4:
                return new C64416g();
            case 5:
                return f174725c;
            case 6:
                C63010eb ebVar = f174726e;
                if (ebVar == null) {
                    synchronized (C64417h.class) {
                        ebVar = f174726e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174725c);
                            f174726e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
