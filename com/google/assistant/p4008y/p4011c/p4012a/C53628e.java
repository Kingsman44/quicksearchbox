package com.google.assistant.p4008y.p4011c.p4012a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p4008y.p4013d.C53658j;
import com.google.assistant.p4008y.p4013d.C53660l;
import com.google.assistant.p4008y.p4013d.p4014a.C53645n;
import com.google.assistant.p4008y.p4013d.p4014a.C53649r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.c.a.e */
/* compiled from: PG */
public final class C53628e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53628e f140751f;

    /* renamed from: g */
    private static volatile C63010eb f140752g;

    /* renamed from: a */
    public int f140753a;

    /* renamed from: b */
    public C53645n f140754b;

    /* renamed from: c */
    public C62971cq f140755c = emptyProtobufList();

    /* renamed from: d */
    public C53649r f140756d;

    /* renamed from: e */
    public C53660l f140757e;

    static {
        C53628e eVar = new C53628e();
        f140751f = eVar;
        C62942bv.registerDefaultInstance(C53628e.class, eVar);
    }

    private C53628e() {
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
                return newMessageInfo(f140751f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C53658j.class, "d", "e"});
            case 3:
                return new C53628e();
            case 4:
                return new C53627d();
            case 5:
                return f140751f;
            case 6:
                C63010eb ebVar = f140752g;
                if (ebVar == null) {
                    synchronized (C53628e.class) {
                        ebVar = f140752g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140751f);
                            f140752g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
