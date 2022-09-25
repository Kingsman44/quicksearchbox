package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.aw */
/* compiled from: PG */
public final class C82799aw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82799aw f225620a;

    /* renamed from: b */
    private static volatile C63010eb f225621b;

    static {
        C82799aw awVar = new C82799aw();
        f225620a = awVar;
        C62942bv.registerDefaultInstance(C82799aw.class, awVar);
    }

    private C82799aw() {
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
                return newMessageInfo(f225620a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82799aw();
            case 4:
                return new C82798av();
            case 5:
                return f225620a;
            case 6:
                C63010eb ebVar = f225621b;
                if (ebVar == null) {
                    synchronized (C82799aw.class) {
                        ebVar = f225621b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225620a);
                            f225621b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
