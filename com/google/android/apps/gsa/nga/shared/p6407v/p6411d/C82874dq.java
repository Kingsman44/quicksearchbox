package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.dq */
/* compiled from: PG */
public final class C82874dq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82874dq f225959a;

    /* renamed from: b */
    private static volatile C63010eb f225960b;

    static {
        C82874dq dqVar = new C82874dq();
        f225959a = dqVar;
        C62942bv.registerDefaultInstance(C82874dq.class, dqVar);
    }

    private C82874dq() {
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
                return newMessageInfo(f225959a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82874dq();
            case 4:
                return new C82873dp();
            case 5:
                return f225959a;
            case 6:
                C63010eb ebVar = f225960b;
                if (ebVar == null) {
                    synchronized (C82874dq.class) {
                        ebVar = f225960b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225959a);
                            f225960b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
