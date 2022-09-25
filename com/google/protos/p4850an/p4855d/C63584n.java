package com.google.protos.p4850an.p4855d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.n */
/* compiled from: PG */
public final class C63584n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63584n f171979d;

    /* renamed from: e */
    private static volatile C63010eb f171980e;

    /* renamed from: a */
    public int f171981a;

    /* renamed from: b */
    public C63563g f171982b;

    /* renamed from: c */
    public C62961ch f171983c = emptyIntList();

    static {
        C63584n nVar = new C63584n();
        f171979d = nVar;
        C62942bv.registerDefaultInstance(C63584n.class, nVar);
    }

    private C63584n() {
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
                return newMessageInfo(f171979d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"a", "b", C45240c.f118157a, C63557e.f171922a});
            case 3:
                return new C63584n();
            case 4:
                return new C63583m();
            case 5:
                return f171979d;
            case 6:
                C63010eb ebVar = f171980e;
                if (ebVar == null) {
                    synchronized (C63584n.class) {
                        ebVar = f171980e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171979d);
                            f171980e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
