package com.google.p381aj.p382a.p383a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4273bs.p4274a.p4275a.p4276a.C56459b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.b */
/* compiled from: PG */
public final class C8247b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8247b f28970a;

    /* renamed from: e */
    private static volatile C63010eb f28971e;

    /* renamed from: b */
    private int f28972b;

    /* renamed from: c */
    private C56459b f28973c;

    /* renamed from: d */
    private byte f28974d = 2;

    static {
        C8247b bVar = new C8247b();
        f28970a = bVar;
        C62942bv.registerDefaultInstance(C8247b.class, bVar);
    }

    private C8247b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28974d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28974d = b;
                return null;
            case 2:
                return newMessageInfo(f28970a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8247b();
            case 4:
                return new C8210a();
            case 5:
                return f28970a;
            case 6:
                C63010eb ebVar = f28971e;
                if (ebVar == null) {
                    synchronized (C8247b.class) {
                        ebVar = f28971e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28970a);
                            f28971e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
