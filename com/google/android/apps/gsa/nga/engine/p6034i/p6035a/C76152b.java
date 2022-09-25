package com.google.android.apps.gsa.nga.engine.p6034i.p6035a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.i.a.b */
/* compiled from: PG */
public final class C76152b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C76152b f211127a;

    /* renamed from: b */
    private static volatile C63010eb f211128b;

    static {
        C76152b bVar = new C76152b();
        f211127a = bVar;
        C62942bv.registerDefaultInstance(C76152b.class, bVar);
    }

    private C76152b() {
        emptyProtobufList();
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
                return newMessageInfo(f211127a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C76152b();
            case 4:
                return new C76151a();
            case 5:
                return f211127a;
            case 6:
                C63010eb ebVar = f211128b;
                if (ebVar == null) {
                    synchronized (C76152b.class) {
                        ebVar = f211128b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211127a);
                            f211128b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
