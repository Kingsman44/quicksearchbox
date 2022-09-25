package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.pk */
/* compiled from: PG */
public final class C50231pk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50231pk f130600c;

    /* renamed from: d */
    private static volatile C63010eb f130601d;

    /* renamed from: a */
    public C62971cq f130602a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f130603b = C62942bv.emptyProtobufList();

    static {
        C50231pk pkVar = new C50231pk();
        f130600c = pkVar;
        C62942bv.registerDefaultInstance(C50231pk.class, pkVar);
    }

    private C50231pk() {
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
                return newMessageInfo(f130600c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"a", "b"});
            case 3:
                return new C50231pk();
            case 4:
                return new C50230pj();
            case 5:
                return f130600c;
            case 6:
                C63010eb ebVar = f130601d;
                if (ebVar == null) {
                    synchronized (C50231pk.class) {
                        ebVar = f130601d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130600c);
                            f130601d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
