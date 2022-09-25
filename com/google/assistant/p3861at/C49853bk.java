package com.google.assistant.p3861at;

import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bk */
/* compiled from: PG */
public final class C49853bk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49853bk f129556b;

    /* renamed from: c */
    private static volatile C63010eb f129557c;

    /* renamed from: a */
    public C62971cq f129558a = emptyProtobufList();

    static {
        C49853bk bkVar = new C49853bk();
        f129556b = bkVar;
        C62942bv.registerDefaultInstance(C49853bk.class, bkVar);
    }

    private C49853bk() {
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
                return newMessageInfo(f129556b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C51058ev.class});
            case 3:
                return new C49853bk();
            case 4:
                return new C49852bj();
            case 5:
                return f129556b;
            case 6:
                C63010eb ebVar = f129557c;
                if (ebVar == null) {
                    synchronized (C49853bk.class) {
                        ebVar = f129557c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129556b);
                            f129557c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
