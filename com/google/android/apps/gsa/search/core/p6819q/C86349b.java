package com.google.android.apps.gsa.search.core.p6819q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.q.b */
/* compiled from: PG */
public final class C86349b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C86349b f233460a;

    /* renamed from: c */
    private static volatile C63010eb f233461c;

    /* renamed from: b */
    private byte f233462b = 2;

    static {
        C86349b bVar = new C86349b();
        f233460a = bVar;
        C62942bv.registerDefaultInstance(C86349b.class, bVar);
    }

    private C86349b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f233462b);
            case 1:
                this.f233462b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f233460a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C86349b();
            case 4:
                return new C86348a();
            case 5:
                return f233460a;
            case 6:
                C63010eb ebVar = f233461c;
                if (ebVar == null) {
                    synchronized (C86349b.class) {
                        ebVar = f233461c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f233460a);
                            f233461c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
