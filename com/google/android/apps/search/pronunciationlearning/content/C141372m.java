package com.google.android.apps.search.pronunciationlearning.content;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.pronunciationlearning.content.m */
/* compiled from: PG */
public final class C141372m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C141372m f383778b;

    /* renamed from: c */
    private static volatile C63010eb f383779c;

    /* renamed from: a */
    public C62971cq f383780a = C62942bv.emptyProtobufList();

    static {
        C141372m mVar = new C141372m();
        f383778b = mVar;
        C62942bv.registerDefaultInstance(C141372m.class, mVar);
    }

    private C141372m() {
    }

    /* renamed from: a */
    public final void mo116391a() {
        C62971cq cqVar = this.f383780a;
        if (!cqVar.mo58948c()) {
            this.f383780a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f383778b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C141372m();
            case 4:
                return new C141371l();
            case 5:
                return f383778b;
            case 6:
                C63010eb ebVar = f383779c;
                if (ebVar == null) {
                    synchronized (C141372m.class) {
                        ebVar = f383779c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383778b);
                            f383779c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
