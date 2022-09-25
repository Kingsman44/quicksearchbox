package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.g */
/* compiled from: PG */
public final class C22602g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C22602g f62262b;

    /* renamed from: c */
    private static volatile C63010eb f62263c;

    /* renamed from: a */
    public C62971cq f62264a = C62942bv.emptyProtobufList();

    static {
        C22602g gVar = new C22602g();
        f62262b = gVar;
        C62942bv.registerDefaultInstance(C22602g.class, gVar);
    }

    private C22602g() {
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
                return newMessageInfo(f62262b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C22602g();
            case 4:
                return new C22601f();
            case 5:
                return f62262b;
            case 6:
                C63010eb ebVar = f62263c;
                if (ebVar == null) {
                    synchronized (C22602g.class) {
                        ebVar = f62263c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62262b);
                            f62263c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
