package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.aj.a.a.a.b */
/* compiled from: PG */
public final class C8222b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8222b f28869a;

    /* renamed from: f */
    private static volatile C63010eb f28870f;

    /* renamed from: b */
    private int f28871b;

    /* renamed from: c */
    private C63771b f28872c;

    /* renamed from: d */
    private C8222b f28873d;

    /* renamed from: e */
    private byte f28874e = 2;

    static {
        C8222b bVar = new C8222b();
        f28869a = bVar;
        C62942bv.registerDefaultInstance(C8222b.class, bVar);
    }

    private C8222b() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28874e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28874e = b;
                return null;
            case 2:
                return newMessageInfo(f28869a, "\u0001\u0002\u0000\u0001\b\u000b\u0002\u0000\u0000\u0002\bᐉ\u0001\u000bᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C8222b();
            case 4:
                return new C8211a();
            case 5:
                return f28869a;
            case 6:
                C63010eb ebVar = f28870f;
                if (ebVar == null) {
                    synchronized (C8222b.class) {
                        ebVar = f28870f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28869a);
                            f28870f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
