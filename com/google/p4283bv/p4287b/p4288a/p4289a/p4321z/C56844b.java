package com.google.p4283bv.p4287b.p4288a.p4289a.p4321z;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.z.b */
/* compiled from: PG */
public final class C56844b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56844b f151659a;

    /* renamed from: e */
    private static volatile C63010eb f151660e;

    /* renamed from: b */
    private int f151661b;

    /* renamed from: c */
    private C61748j f151662c;

    /* renamed from: d */
    private byte f151663d = 2;

    static {
        C56844b bVar = new C56844b();
        f151659a = bVar;
        C62942bv.registerDefaultInstance(C56844b.class, bVar);
    }

    private C56844b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151663d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151663d = b;
                return null;
            case 2:
                return newMessageInfo(f151659a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56844b();
            case 4:
                return new C56843a();
            case 5:
                return f151659a;
            case 6:
                C63010eb ebVar = f151660e;
                if (ebVar == null) {
                    synchronized (C56844b.class) {
                        ebVar = f151660e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151659a);
                            f151660e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
