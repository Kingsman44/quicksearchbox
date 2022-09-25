package com.google.android.libraries.assistant.p1594s.p1599c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.c.q */
/* compiled from: PG */
public final class C19215q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19215q f53805d;

    /* renamed from: f */
    private static volatile C63010eb f53806f;

    /* renamed from: a */
    public int f53807a;

    /* renamed from: b */
    public C62971cq f53808b = emptyProtobufList();

    /* renamed from: c */
    public int f53809c;

    /* renamed from: e */
    private byte f53810e = 2;

    static {
        C19215q qVar = new C19215q();
        f53805d = qVar;
        C62942bv.registerDefaultInstance(C19215q.class, qVar);
    }

    private C19215q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53810e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53810e = b;
                return null;
            case 2:
                return newMessageInfo(f53805d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000", new Object[]{"a", "b", C19210l.class, C45240c.f118157a});
            case 3:
                return new C19215q();
            case 4:
                return new C19214p();
            case 5:
                return f53805d;
            case 6:
                C63010eb ebVar = f53806f;
                if (ebVar == null) {
                    synchronized (C19215q.class) {
                        ebVar = f53806f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53805d);
                            f53806f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
