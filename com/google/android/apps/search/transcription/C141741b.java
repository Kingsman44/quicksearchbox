package com.google.android.apps.search.transcription;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.transcription.b */
/* compiled from: PG */
public final class C141741b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141741b f384719d;

    /* renamed from: e */
    private static volatile C63010eb f384720e;

    /* renamed from: a */
    public int f384721a;

    /* renamed from: b */
    public long f384722b;

    /* renamed from: c */
    public long f384723c;

    static {
        C141741b bVar = new C141741b();
        f384719d = bVar;
        C62942bv.registerDefaultInstance(C141741b.class, bVar);
    }

    private C141741b() {
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
                return newMessageInfo(f384719d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C141741b();
            case 4:
                return new C141734a();
            case 5:
                return f384719d;
            case 6:
                C63010eb ebVar = f384720e;
                if (ebVar == null) {
                    synchronized (C141741b.class) {
                        ebVar = f384720e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384719d);
                            f384720e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
