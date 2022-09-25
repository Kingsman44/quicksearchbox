package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.de */
/* compiled from: PG */
public final class C8785de extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8785de f30157c;

    /* renamed from: d */
    private static volatile C63010eb f30158d;

    /* renamed from: a */
    public C62971cq f30159a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f30160b = C62942bv.emptyProtobufList();

    static {
        C8785de deVar = new C8785de();
        f30157c = deVar;
        C62942bv.registerDefaultInstance(C8785de.class, deVar);
    }

    private C8785de() {
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
                return newMessageInfo(f30157c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C8785de();
            case 4:
                return new C8784dd();
            case 5:
                return f30157c;
            case 6:
                C63010eb ebVar = f30158d;
                if (ebVar == null) {
                    synchronized (C8785de.class) {
                        ebVar = f30158d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30157c);
                            f30158d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
