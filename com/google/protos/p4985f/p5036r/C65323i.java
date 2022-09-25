package com.google.protos.p4985f.p5036r;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.r.i */
/* compiled from: PG */
public final class C65323i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65323i f176655c;

    /* renamed from: e */
    private static volatile C63010eb f176656e;

    /* renamed from: a */
    public int f176657a;

    /* renamed from: b */
    public int f176658b;

    /* renamed from: d */
    private int f176659d;

    static {
        C65323i iVar = new C65323i();
        f176655c = iVar;
        C62942bv.registerDefaultInstance(C65323i.class, iVar);
    }

    private C65323i() {
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
                return newMessageInfo(f176655c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C65323i();
            case 4:
                return new C65322h();
            case 5:
                return f176655c;
            case 6:
                C63010eb ebVar = f176656e;
                if (ebVar == null) {
                    synchronized (C65323i.class) {
                        ebVar = f176656e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176655c);
                            f176656e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
