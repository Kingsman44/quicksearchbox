package com.google.android.apps.gsa.sidekick.main.trigger;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.main.trigger.e */
/* compiled from: PG */
public final class C91628e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C91628e f255567b;

    /* renamed from: c */
    private static volatile C63010eb f255568c;

    /* renamed from: a */
    public C62971cq f255569a = C62942bv.emptyProtobufList();

    static {
        C91628e eVar = new C91628e();
        f255567b = eVar;
        C62942bv.registerDefaultInstance(C91628e.class, eVar);
    }

    private C91628e() {
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
                return newMessageInfo(f255567b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C91628e();
            case 4:
                return new C91627d();
            case 5:
                return f255567b;
            case 6:
                C63010eb ebVar = f255568c;
                if (ebVar == null) {
                    synchronized (C91628e.class) {
                        ebVar = f255568c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255567b);
                            f255568c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
