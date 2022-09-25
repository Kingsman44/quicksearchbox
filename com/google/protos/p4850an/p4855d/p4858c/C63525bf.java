package com.google.protos.p4850an.p4855d.p4858c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.d.c.bf */
/* compiled from: PG */
public final class C63525bf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63525bf f171822a;

    /* renamed from: e */
    private static volatile C63010eb f171823e;

    /* renamed from: b */
    private int f171824b;

    /* renamed from: c */
    private C63389bg f171825c;

    /* renamed from: d */
    private byte f171826d = 2;

    static {
        C63525bf bfVar = new C63525bf();
        f171822a = bfVar;
        C62942bv.registerDefaultInstance(C63525bf.class, bfVar);
    }

    private C63525bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171826d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171826d = b;
                return null;
            case 2:
                return newMessageInfo(f171822a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63525bf();
            case 4:
                return new C63524be();
            case 5:
                return f171822a;
            case 6:
                C63010eb ebVar = f171823e;
                if (ebVar == null) {
                    synchronized (C63525bf.class) {
                        ebVar = f171823e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171822a);
                            f171823e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
