package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.au */
/* compiled from: PG */
public final class C64667au extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64667au f175280f;

    /* renamed from: h */
    private static volatile C63010eb f175281h;

    /* renamed from: a */
    public int f175282a;

    /* renamed from: b */
    public int f175283b;

    /* renamed from: c */
    public C62971cq f175284c = emptyProtobufList();

    /* renamed from: d */
    public C64708r f175285d;

    /* renamed from: e */
    public C64710t f175286e;

    /* renamed from: g */
    private byte f175287g = 2;

    static {
        C64667au auVar = new C64667au();
        f175280f = auVar;
        C62942bv.registerDefaultInstance(C64667au.class, auVar);
    }

    private C64667au() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo59290a() {
        C62971cq cqVar = this.f175284c;
        if (!cqVar.mo58948c()) {
            this.f175284c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175287g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175287g = b;
                return null;
            case 2:
                return newMessageInfo(f175280f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u001b\u0004ᐉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", C64651ae.f175247a, C45240c.f118157a, C64655ai.class, "d", "e"});
            case 3:
                return new C64667au();
            case 4:
                return new C64666at();
            case 5:
                return f175280f;
            case 6:
                C63010eb ebVar = f175281h;
                if (ebVar == null) {
                    synchronized (C64667au.class) {
                        ebVar = f175281h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175280f);
                            f175281h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
