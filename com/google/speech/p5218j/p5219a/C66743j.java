package com.google.speech.p5218j.p5219a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67175t;

/* renamed from: com.google.speech.j.a.j */
/* compiled from: PG */
public final class C66743j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66743j f181525d;

    /* renamed from: e */
    private static volatile C63010eb f181526e;

    /* renamed from: a */
    public int f181527a;

    /* renamed from: b */
    public C67175t f181528b;

    /* renamed from: c */
    public boolean f181529c;

    static {
        C66743j jVar = new C66743j();
        f181525d = jVar;
        C62942bv.registerDefaultInstance(C66743j.class, jVar);
    }

    private C66743j() {
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
                return newMessageInfo(f181525d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66743j();
            case 4:
                return new C66742i();
            case 5:
                return f181525d;
            case 6:
                C63010eb ebVar = f181526e;
                if (ebVar == null) {
                    synchronized (C66743j.class) {
                        ebVar = f181526e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181525d);
                            f181526e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
