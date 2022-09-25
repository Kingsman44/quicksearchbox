package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aer */
/* compiled from: PG */
public final class aer extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aer f129124d;

    /* renamed from: f */
    private static volatile C63010eb f129125f;

    /* renamed from: a */
    public int f129126a;

    /* renamed from: b */
    public C50149mj f129127b;

    /* renamed from: c */
    public acx f129128c;

    /* renamed from: e */
    private byte f129129e = 2;

    static {
        aer aer = new aer();
        f129124d = aer;
        C62942bv.registerDefaultInstance(aer.class, aer);
    }

    private aer() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129129e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129129e = b;
                return null;
            case 2:
                return newMessageInfo(f129124d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aer();
            case 4:
                return new aeq();
            case 5:
                return f129124d;
            case 6:
                C63010eb ebVar = f129125f;
                if (ebVar == null) {
                    synchronized (aer.class) {
                        ebVar = f129125f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129124d);
                            f129125f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
