package com.google.p4273bs.p4274a.p4275a.p4276a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.a.a.a.b */
/* compiled from: PG */
public final class C56459b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56459b f150801a;

    /* renamed from: e */
    private static volatile C63010eb f150802e;

    /* renamed from: b */
    private int f150803b;

    /* renamed from: c */
    private int f150804c;

    /* renamed from: d */
    private byte f150805d = 2;

    static {
        C56459b bVar = new C56459b();
        f150801a = bVar;
        C62942bv.registerDefaultInstance(C56459b.class, bVar);
    }

    private C56459b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150805d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150805d = b;
                return null;
            case 2:
                return newMessageInfo(f150801a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᔄ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56459b();
            case 4:
                return new C56458a();
            case 5:
                return f150801a;
            case 6:
                C63010eb ebVar = f150802e;
                if (ebVar == null) {
                    synchronized (C56459b.class) {
                        ebVar = f150802e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150801a);
                            f150802e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
