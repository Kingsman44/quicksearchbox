package com.google.p4481ch.p4485b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8222b;
import com.google.p381aj.p382a.p383a.p384a.C8224d;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ch.b.b */
/* compiled from: PG */
public final class C58087b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C58087b f155268a;

    /* renamed from: g */
    private static volatile C63010eb f155269g;

    /* renamed from: b */
    private int f155270b;

    /* renamed from: c */
    private C8242v f155271c;

    /* renamed from: d */
    private C8224d f155272d;

    /* renamed from: e */
    private C8222b f155273e;

    /* renamed from: f */
    private byte f155274f = 2;

    static {
        C58087b bVar = new C58087b();
        f155268a = bVar;
        C62942bv.registerDefaultInstance(C58087b.class, bVar);
    }

    private C58087b() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155274f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155274f = b;
                return null;
            case 2:
                return newMessageInfo(f155268a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0004ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C58087b();
            case 4:
                return new C58086a();
            case 5:
                return f155268a;
            case 6:
                C63010eb ebVar = f155269g;
                if (ebVar == null) {
                    synchronized (C58087b.class) {
                        ebVar = f155269g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155268a);
                            f155269g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
