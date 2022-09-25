package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.db */
/* compiled from: PG */
public final class C49898db extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49898db f129704b;

    /* renamed from: c */
    private static volatile C63010eb f129705c;

    /* renamed from: a */
    public C62971cq f129706a = emptyProtobufList();

    static {
        C49898db dbVar = new C49898db();
        f129704b = dbVar;
        C62942bv.registerDefaultInstance(C49898db.class, dbVar);
    }

    private C49898db() {
    }

    /* renamed from: a */
    public final void mo53374a() {
        C62971cq cqVar = this.f129706a;
        if (!cqVar.mo58948c()) {
            this.f129706a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f129704b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49903dg.class});
            case 3:
                return new C49898db();
            case 4:
                return new C49897da();
            case 5:
                return f129704b;
            case 6:
                C63010eb ebVar = f129705c;
                if (ebVar == null) {
                    synchronized (C49898db.class) {
                        ebVar = f129705c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129704b);
                            f129705c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
