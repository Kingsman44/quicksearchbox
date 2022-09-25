package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.cq */
/* compiled from: PG */
public final class C125116cq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125116cq f345173b;

    /* renamed from: c */
    private static volatile C63010eb f345174c;

    /* renamed from: a */
    public boolean f345175a;

    static {
        C125116cq cqVar = new C125116cq();
        f345173b = cqVar;
        C62942bv.registerDefaultInstance(C125116cq.class, cqVar);
    }

    private C125116cq() {
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
                return newMessageInfo(f345173b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C125116cq();
            case 4:
                return new C125115cp();
            case 5:
                return f345173b;
            case 6:
                C63010eb ebVar = f345174c;
                if (ebVar == null) {
                    synchronized (C125116cq.class) {
                        ebVar = f345174c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345173b);
                            f345174c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
