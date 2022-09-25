package com.google.assistant.p3886c.p3889c;

import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.c.n */
/* compiled from: PG */
public final class C50776n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50776n f132135c;

    /* renamed from: d */
    public static final C62940bt f132136d;

    /* renamed from: e */
    private static volatile C63010eb f132137e;

    /* renamed from: a */
    public C62971cq f132138a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f132139b = emptyProtobufList();

    static {
        C50776n nVar = new C50776n();
        f132135c = nVar;
        C62942bv.registerDefaultInstance(C50776n.class, nVar);
        f132136d = C62942bv.newSingularGeneratedExtension(C50770h.f132124g, nVar, nVar, (C62958ce) null, 101, C63066gd.MESSAGE, C50776n.class);
    }

    private C50776n() {
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
                return newMessageInfo(f132135c, "\u0001\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0002\u0000\u0005\u001b\u0006\u001b", new Object[]{"a", C50723h.class, "b", C50729n.class});
            case 3:
                return new C50776n();
            case 4:
                return new C50775m();
            case 5:
                return f132135c;
            case 6:
                C63010eb ebVar = f132137e;
                if (ebVar == null) {
                    synchronized (C50776n.class) {
                        ebVar = f132137e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132135c);
                            f132137e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
