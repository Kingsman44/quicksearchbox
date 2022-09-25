package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.assistant.p3803ag.p3809c.C49027dt;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.y */
/* compiled from: PG */
public final class C18995y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C18995y f53366e;

    /* renamed from: g */
    private static volatile C63010eb f53367g;

    /* renamed from: a */
    public int f53368a;

    /* renamed from: b */
    public C49019dl f53369b;

    /* renamed from: c */
    public C49027dt f53370c;

    /* renamed from: d */
    public C62971cq f53371d = emptyProtobufList();

    /* renamed from: f */
    private byte f53372f = 2;

    static {
        C18995y yVar = new C18995y();
        f53366e = yVar;
        C62942bv.registerDefaultInstance(C18995y.class, yVar);
    }

    private C18995y() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53372f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53372f = b;
                return null;
            case 2:
                return newMessageInfo(f53366e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C49027dt.class});
            case 3:
                return new C18995y();
            case 4:
                return new C18994x();
            case 5:
                return f53366e;
            case 6:
                C63010eb ebVar = f53367g;
                if (ebVar == null) {
                    synchronized (C18995y.class) {
                        ebVar = f53367g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53366e);
                            f53367g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
