package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.dm */
/* compiled from: PG */
public final class C125139dm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125139dm f345214b;

    /* renamed from: c */
    private static volatile C63010eb f345215c;

    /* renamed from: a */
    public C62971cq f345216a = emptyProtobufList();

    static {
        C125139dm dmVar = new C125139dm();
        f345214b = dmVar;
        C62942bv.registerDefaultInstance(C125139dm.class, dmVar);
    }

    private C125139dm() {
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
                return newMessageInfo(f345214b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C125143dq.class});
            case 3:
                return new C125139dm();
            case 4:
                return new C125138dl();
            case 5:
                return f345214b;
            case 6:
                C63010eb ebVar = f345215c;
                if (ebVar == null) {
                    synchronized (C125139dm.class) {
                        ebVar = f345215c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345214b);
                            f345215c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
