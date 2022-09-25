package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.av */
/* compiled from: PG */
public final class C28716av extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C28716av f78018d;

    /* renamed from: e */
    private static volatile C63010eb f78019e;

    /* renamed from: a */
    public int f78020a;

    /* renamed from: b */
    public int f78021b;

    /* renamed from: c */
    public int f78022c;

    static {
        C28716av avVar = new C28716av();
        f78018d = avVar;
        C62942bv.registerDefaultInstance(C28716av.class, avVar);
    }

    private C28716av() {
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
                return newMessageInfo(f78018d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C28715au.f78017a, C45240c.f118157a, C28714at.f78016a});
            case 3:
                return new C28716av();
            case 4:
                return new C28713as();
            case 5:
                return f78018d;
            case 6:
                C63010eb ebVar = f78019e;
                if (ebVar == null) {
                    synchronized (C28716av.class) {
                        ebVar = f78019e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78018d);
                            f78019e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
