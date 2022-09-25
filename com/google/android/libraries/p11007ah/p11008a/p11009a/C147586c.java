package com.google.android.libraries.p11007ah.p11008a.p11009a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ah.a.a.c */
/* compiled from: PG */
public final class C147586c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C147586c f398384c;

    /* renamed from: d */
    private static volatile C63010eb f398385d;

    /* renamed from: a */
    public int f398386a;

    /* renamed from: b */
    public String f398387b = BuildConfig.FLAVOR;

    static {
        C147586c cVar = new C147586c();
        f398384c = cVar;
        C62942bv.registerDefaultInstance(C147586c.class, cVar);
    }

    private C147586c() {
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
                return newMessageInfo(f398384c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C147586c();
            case 4:
                return new C147585b();
            case 5:
                return f398384c;
            case 6:
                C63010eb ebVar = f398385d;
                if (ebVar == null) {
                    synchronized (C147586c.class) {
                        ebVar = f398385d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398384c);
                            f398385d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
