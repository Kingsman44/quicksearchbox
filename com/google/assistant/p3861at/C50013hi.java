package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.hi */
/* compiled from: PG */
public final class C50013hi extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50013hi f130020e;

    /* renamed from: f */
    private static volatile C63010eb f130021f;

    /* renamed from: a */
    public int f130022a;

    /* renamed from: b */
    public boolean f130023b;

    /* renamed from: c */
    public boolean f130024c;

    /* renamed from: d */
    public C62971cq f130025d = emptyProtobufList();

    static {
        C50013hi hiVar = new C50013hi();
        f130020e = hiVar;
        C62942bv.registerDefaultInstance(C50013hi.class, hiVar);
    }

    private C50013hi() {
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
                return newMessageInfo(f130020e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C50012hh.class});
            case 3:
                return new C50013hi();
            case 4:
                return new C50010hf();
            case 5:
                return f130020e;
            case 6:
                C63010eb ebVar = f130021f;
                if (ebVar == null) {
                    synchronized (C50013hi.class) {
                        ebVar = f130021f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130020e);
                            f130021f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
