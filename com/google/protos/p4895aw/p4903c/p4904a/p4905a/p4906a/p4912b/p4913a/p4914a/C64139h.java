package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.a.h */
/* compiled from: PG */
public final class C64139h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64139h f173414c;

    /* renamed from: e */
    private static volatile C63010eb f173415e;

    /* renamed from: a */
    public String f173416a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f173417b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f173418d;

    static {
        C64139h hVar = new C64139h();
        f173414c = hVar;
        C62942bv.registerDefaultInstance(C64139h.class, hVar);
    }

    private C64139h() {
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
                return newMessageInfo(f173414c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C64139h();
            case 4:
                return new C64138g();
            case 5:
                return f173414c;
            case 6:
                C63010eb ebVar = f173415e;
                if (ebVar == null) {
                    synchronized (C64139h.class) {
                        ebVar = f173415e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173414c);
                            f173415e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
