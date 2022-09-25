package com.google.android.libraries.search.assistant.p2828y.p2845h.p2847b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.y.h.b.b */
/* compiled from: PG */
public final class C36967b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36967b f96240d;

    /* renamed from: e */
    private static volatile C63010eb f96241e;

    /* renamed from: a */
    public int f96242a;

    /* renamed from: b */
    public String f96243b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f96244c = BuildConfig.FLAVOR;

    static {
        C36967b bVar = new C36967b();
        f96240d = bVar;
        C62942bv.registerDefaultInstance(C36967b.class, bVar);
    }

    private C36967b() {
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
                return newMessageInfo(f96240d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36967b();
            case 4:
                return new C36966a();
            case 5:
                return f96240d;
            case 6:
                C63010eb ebVar = f96241e;
                if (ebVar == null) {
                    synchronized (C36967b.class) {
                        ebVar = f96241e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f96240d);
                            f96241e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
