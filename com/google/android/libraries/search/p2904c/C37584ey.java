package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.ey */
/* compiled from: PG */
public final class C37584ey extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C37584ey f99862e;

    /* renamed from: g */
    private static volatile C63010eb f99863g;

    /* renamed from: a */
    public int f99864a;

    /* renamed from: b */
    public C37602fn f99865b;

    /* renamed from: c */
    public C62971cq f99866c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f99867d = emptyProtobufList();

    /* renamed from: f */
    private byte f99868f = 2;

    static {
        C37584ey eyVar = new C37584ey();
        f99862e = eyVar;
        C62942bv.registerDefaultInstance(C37584ey.class, eyVar);
    }

    private C37584ey() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f99868f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f99868f = b;
                return null;
            case 2:
                return newMessageInfo(f99862e, "\u0001\u0003\u0000\u0001\u0002e\u0003\u0000\u0002\u0001\u0002ဉ\u0000dЛe\u001b", new Object[]{"a", "b", C45240c.f118157a, C37570ek.class, "d", C37580eu.class});
            case 3:
                return new C37584ey();
            case 4:
                return new C37583ex();
            case 5:
                return f99862e;
            case 6:
                C63010eb ebVar = f99863g;
                if (ebVar == null) {
                    synchronized (C37584ey.class) {
                        ebVar = f99863g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99862e);
                            f99863g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
