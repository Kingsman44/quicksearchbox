package com.google.android.gms.wearable.p10888a.p10889a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.wearable.a.a.j */
/* compiled from: PG */
public final class C146405j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C146405j f395514b;

    /* renamed from: d */
    private static volatile C63010eb f395515d;

    /* renamed from: a */
    public C62971cq f395516a = emptyProtobufList();

    /* renamed from: c */
    private byte f395517c = 2;

    static {
        C146405j jVar = new C146405j();
        f395514b = jVar;
        C62942bv.registerDefaultInstance(C146405j.class, jVar);
    }

    private C146405j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f395517c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f395517c = b;
                return null;
            case 2:
                return newMessageInfo(f395514b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C146404i.class});
            case 3:
                return new C146405j();
            case 4:
                return new C146396a();
            case 5:
                return f395514b;
            case 6:
                C63010eb ebVar = f395515d;
                if (ebVar == null) {
                    synchronized (C146405j.class) {
                        ebVar = f395515d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f395514b);
                            f395515d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
