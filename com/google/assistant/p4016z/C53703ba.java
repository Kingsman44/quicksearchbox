package com.google.assistant.p4016z;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.ba */
/* compiled from: PG */
public final class C53703ba extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53703ba f140978d;

    /* renamed from: f */
    private static volatile C63010eb f140979f;

    /* renamed from: a */
    public int f140980a;

    /* renamed from: b */
    public C62971cq f140981b = emptyProtobufList();

    /* renamed from: c */
    public int f140982c;

    /* renamed from: e */
    private byte f140983e = 2;

    static {
        C53703ba baVar = new C53703ba();
        f140978d = baVar;
        C62942bv.registerDefaultInstance(C53703ba.class, baVar);
    }

    private C53703ba() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140983e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140983e = b;
                return null;
            case 2:
                return newMessageInfo(f140978d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002Л\u0003ဌ\u0000", new Object[]{"a", "b", C53692aq.class, C45240c.f118157a, C53691ap.m86885b()});
            case 3:
                return new C53703ba();
            case 4:
                return new C53701az();
            case 5:
                return f140978d;
            case 6:
                C63010eb ebVar = f140979f;
                if (ebVar == null) {
                    synchronized (C53703ba.class) {
                        ebVar = f140979f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140978d);
                            f140979f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
