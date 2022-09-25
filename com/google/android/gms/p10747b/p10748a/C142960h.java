package com.google.android.gms.p10747b.p10748a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.b.a.h */
/* compiled from: PG */
public final class C142960h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142960h f387889c;

    /* renamed from: d */
    private static volatile C63010eb f387890d;

    /* renamed from: a */
    public int f387891a;

    /* renamed from: b */
    public C62971cq f387892b = C62942bv.emptyProtobufList();

    static {
        C142960h hVar = new C142960h();
        f387889c = hVar;
        C62942bv.registerDefaultInstance(C142960h.class, hVar);
    }

    private C142960h() {
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
                return newMessageInfo(f387889c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C142960h();
            case 4:
                return new C142959g();
            case 5:
                return f387889c;
            case 6:
                C63010eb ebVar = f387890d;
                if (ebVar == null) {
                    synchronized (C142960h.class) {
                        ebVar = f387890d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387889c);
                            f387890d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
