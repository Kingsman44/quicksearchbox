package com.google.protos.p4893av.p4894a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.av.a.h */
/* compiled from: PG */
public final class C63851h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63851h f172662a;

    /* renamed from: g */
    private static volatile C63010eb f172663g;

    /* renamed from: b */
    private int f172664b;

    /* renamed from: c */
    private C63849f f172665c;

    /* renamed from: d */
    private C63853j f172666d;

    /* renamed from: e */
    private C63771b f172667e;

    /* renamed from: f */
    private byte f172668f = 2;

    static {
        C63851h hVar = new C63851h();
        f172662a = hVar;
        C62942bv.registerDefaultInstance(C63851h.class, hVar);
    }

    private C63851h() {
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
                return Byte.valueOf(this.f172668f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172668f = b;
                return null;
            case 2:
                return newMessageInfo(f172662a, "\u0001\u0003\u0000\u0001\u0002\b\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0000\bᐉ\u0004", new Object[]{"b", "d", C45240c.f118157a, "e"});
            case 3:
                return new C63851h();
            case 4:
                return new C63850g();
            case 5:
                return f172662a;
            case 6:
                C63010eb ebVar = f172663g;
                if (ebVar == null) {
                    synchronized (C63851h.class) {
                        ebVar = f172663g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172662a);
                            f172663g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
