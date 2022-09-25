package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4764a.p4765a.p4766a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.a.a.a.a.a.g */
/* compiled from: PG */
public final class C63120g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63120g f170391c;

    /* renamed from: e */
    private static volatile C63010eb f170392e;

    /* renamed from: a */
    public String f170393a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f170394b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f170395d;

    static {
        C63120g gVar = new C63120g();
        f170391c = gVar;
        C62942bv.registerDefaultInstance(C63120g.class, gVar);
    }

    private C63120g() {
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
                return newMessageInfo(f170391c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C63120g();
            case 4:
                return new C63119f();
            case 5:
                return f170391c;
            case 6:
                C63010eb ebVar = f170392e;
                if (ebVar == null) {
                    synchronized (C63120g.class) {
                        ebVar = f170392e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170391c);
                            f170392e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
