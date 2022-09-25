package com.google.android.apps.search.soundsearch.p10653b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.soundsearch.b.e */
/* compiled from: PG */
public final class C141643e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C141643e f384462c;

    /* renamed from: d */
    private static volatile C63010eb f384463d;

    /* renamed from: a */
    public int f384464a;

    /* renamed from: b */
    public int f384465b;

    static {
        C141643e eVar = new C141643e();
        f384462c = eVar;
        C62942bv.registerDefaultInstance(C141643e.class, eVar);
    }

    private C141643e() {
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
                return newMessageInfo(f384462c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C141641c.f384461a});
            case 3:
                return new C141643e();
            case 4:
                return new C141640b();
            case 5:
                return f384462c;
            case 6:
                C63010eb ebVar = f384463d;
                if (ebVar == null) {
                    synchronized (C141643e.class) {
                        ebVar = f384463d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384462c);
                            f384463d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
