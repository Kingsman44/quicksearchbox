package com.google.protos.p4850an.p4855d.p4859d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4855d.p4856a.C63446af;

/* renamed from: com.google.protos.an.d.d.b */
/* compiled from: PG */
public final class C63556b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63556b f171917a;

    /* renamed from: e */
    private static volatile C63010eb f171918e;

    /* renamed from: b */
    private int f171919b;

    /* renamed from: c */
    private C63446af f171920c;

    /* renamed from: d */
    private byte f171921d = 2;

    static {
        C63556b bVar = new C63556b();
        f171917a = bVar;
        C62942bv.registerDefaultInstance(C63556b.class, bVar);
    }

    private C63556b() {
        emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171921d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171921d = b;
                return null;
            case 2:
                return newMessageInfo(f171917a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63556b();
            case 4:
                return new C63555a();
            case 5:
                return f171917a;
            case 6:
                C63010eb ebVar = f171918e;
                if (ebVar == null) {
                    synchronized (C63556b.class) {
                        ebVar = f171918e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171917a);
                            f171918e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
