package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6066c;

import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.c.b */
/* compiled from: PG */
public final class C76652b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C76652b f211910b;

    /* renamed from: c */
    private static volatile C63010eb f211911c;

    /* renamed from: a */
    public C52081en f211912a;

    static {
        C76652b bVar = new C76652b();
        f211910b = bVar;
        C62942bv.registerDefaultInstance(C76652b.class, bVar);
    }

    private C76652b() {
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
                return newMessageInfo(f211910b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C76652b();
            case 4:
                return new C76651a();
            case 5:
                return f211910b;
            case 6:
                C63010eb ebVar = f211911c;
                if (ebVar == null) {
                    synchronized (C76652b.class) {
                        ebVar = f211911c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211910b);
                            f211911c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
