package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.b */
/* compiled from: PG */
public final class C24791b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C24791b f67740b;

    /* renamed from: c */
    private static volatile C63010eb f67741c;

    /* renamed from: a */
    public C62971cq f67742a = emptyProtobufList();

    static {
        C24791b bVar = new C24791b();
        f67740b = bVar;
        C62942bv.registerDefaultInstance(C24791b.class, bVar);
    }

    private C24791b() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f67740b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C24793d.class});
            case 3:
                return new C24791b();
            case 4:
                return new C24767a();
            case 5:
                return f67740b;
            case 6:
                C63010eb ebVar = f67741c;
                if (ebVar == null) {
                    synchronized (C24791b.class) {
                        ebVar = f67741c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67740b);
                            f67741c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
