package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.q.h */
/* compiled from: PG */
public final class C65247h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65247h f176544c;

    /* renamed from: d */
    private static volatile C63010eb f176545d;

    /* renamed from: a */
    public int f176546a;

    /* renamed from: b */
    public C65682h f176547b;

    static {
        C65247h hVar = new C65247h();
        f176544c = hVar;
        C62942bv.registerDefaultInstance(C65247h.class, hVar);
    }

    private C65247h() {
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
                return newMessageInfo(f176544c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65247h();
            case 4:
                return new C65220g();
            case 5:
                return f176544c;
            case 6:
                C63010eb ebVar = f176545d;
                if (ebVar == null) {
                    synchronized (C65247h.class) {
                        ebVar = f176545d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176544c);
                            f176545d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
