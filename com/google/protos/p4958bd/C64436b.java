package com.google.protos.p4958bd;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4947b.C64366b;

/* renamed from: com.google.protos.bd.b */
/* compiled from: PG */
public final class C64436b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64436b f174798a;

    /* renamed from: e */
    private static volatile C63010eb f174799e;

    /* renamed from: b */
    private int f174800b;

    /* renamed from: c */
    private C64366b f174801c;

    /* renamed from: d */
    private byte f174802d = 2;

    static {
        C64436b bVar = new C64436b();
        f174798a = bVar;
        C62942bv.registerDefaultInstance(C64436b.class, bVar);
    }

    private C64436b() {
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        C62942bv.emptyProtobufList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f174802d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f174802d = b;
                return null;
            case 2:
                return newMessageInfo(f174798a, "\u0001\u0001\u0000\u0001̴̴\u0001\u0000\u0000\u0001̴ᐉ\u0006", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C64436b();
            case 4:
                return new C64435a();
            case 5:
                return f174798a;
            case 6:
                C63010eb ebVar = f174799e;
                if (ebVar == null) {
                    synchronized (C64436b.class) {
                        ebVar = f174799e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174798a);
                            f174799e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
