package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.ab */
/* compiled from: PG */
public final class C17872ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C17872ab f51209b;

    /* renamed from: c */
    private static volatile C63010eb f51210c;

    /* renamed from: a */
    public C62971cq f51211a = emptyProtobufList();

    static {
        C17872ab abVar = new C17872ab();
        f51209b = abVar;
        C62942bv.registerDefaultInstance(C17872ab.class, abVar);
    }

    private C17872ab() {
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
                return newMessageInfo(f51209b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C17924z.class});
            case 3:
                return new C17872ab();
            case 4:
                return new C17871aa();
            case 5:
                return f51209b;
            case 6:
                C63010eb ebVar = f51210c;
                if (ebVar == null) {
                    synchronized (C17872ab.class) {
                        ebVar = f51210c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51209b);
                            f51210c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
