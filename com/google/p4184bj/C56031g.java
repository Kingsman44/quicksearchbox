package com.google.p4184bj;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.g */
/* compiled from: PG */
public final class C56031g extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C56031g f149214a;

    /* renamed from: e */
    private static volatile C63010eb f149215e;

    /* renamed from: b */
    private int f149216b;

    /* renamed from: c */
    private C56023e f149217c;

    /* renamed from: d */
    private byte f149218d = 2;

    static {
        C56031g gVar = new C56031g();
        f149214a = gVar;
        C62942bv.registerDefaultInstance(C56031g.class, gVar);
    }

    private C56031g() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149218d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149218d = b;
                return null;
            case 2:
                return newMessageInfo(f149214a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56031g();
            case 4:
                return new C56026f();
            case 5:
                return f149214a;
            case 6:
                C63010eb ebVar = f149215e;
                if (ebVar == null) {
                    synchronized (C56031g.class) {
                        ebVar = f149215e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149214a);
                            f149215e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
