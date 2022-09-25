package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.dp */
/* compiled from: PG */
public final class C54417dp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54417dp f142913c;

    /* renamed from: d */
    private static volatile C63010eb f142914d;

    /* renamed from: a */
    public C62995dn f142915a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f142916b = C62995dn.f170057a;

    static {
        C54417dp dpVar = new C54417dp();
        f142913c = dpVar;
        C62942bv.registerDefaultInstance(C54417dp.class, dpVar);
    }

    private C54417dp() {
        emptyProtobufList();
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
                return newMessageInfo(f142913c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0002\u0000\u0000\u00022\u00032", new Object[]{"a", C54416do.f142912a, "b", C54415dn.f142911a});
            case 3:
                return new C54417dp();
            case 4:
                return new C54414dm();
            case 5:
                return f142913c;
            case 6:
                C63010eb ebVar = f142914d;
                if (ebVar == null) {
                    synchronized (C54417dp.class) {
                        ebVar = f142914d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142913c);
                            f142914d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
