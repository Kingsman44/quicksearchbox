package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.assistant.p3931f.p3939c.C52825b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.w */
/* compiled from: PG */
public final class C51633w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51633w f134558c;

    /* renamed from: d */
    private static volatile C63010eb f134559d;

    /* renamed from: a */
    public C62971cq f134560a = emptyProtobufList();

    /* renamed from: b */
    public C62995dn f134561b = C62995dn.f170057a;

    static {
        C51633w wVar = new C51633w();
        f134558c = wVar;
        C62942bv.registerDefaultInstance(C51633w.class, wVar);
    }

    private C51633w() {
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
                return newMessageInfo(f134558c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001\u001b\u00022", new Object[]{"a", C52825b.class, "b", C51632v.f134557a});
            case 3:
                return new C51633w();
            case 4:
                return new C51631u();
            case 5:
                return f134558c;
            case 6:
                C63010eb ebVar = f134559d;
                if (ebVar == null) {
                    synchronized (C51633w.class) {
                        ebVar = f134559d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134558c);
                            f134559d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
