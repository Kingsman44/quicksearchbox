package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.aj */
/* compiled from: PG */
public final class C65980aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65980aj f179453c;

    /* renamed from: d */
    private static volatile C63010eb f179454d;

    /* renamed from: a */
    public int f179455a;

    /* renamed from: b */
    public C65991h f179456b;

    static {
        C65980aj ajVar = new C65980aj();
        f179453c = ajVar;
        C62942bv.registerDefaultInstance(C65980aj.class, ajVar);
    }

    private C65980aj() {
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
                return newMessageInfo(f179453c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65980aj();
            case 4:
                return new C65979ai();
            case 5:
                return f179453c;
            case 6:
                C63010eb ebVar = f179454d;
                if (ebVar == null) {
                    synchronized (C65980aj.class) {
                        ebVar = f179454d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179453c);
                            f179454d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
