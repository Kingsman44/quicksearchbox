package com.google.p4242bp.p4257f.p4262c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4481ch.p4485b.C58095j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4958bd.C64436b;

/* renamed from: com.google.bp.f.c.d */
/* compiled from: PG */
public final class C56342d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56342d f150268a;

    /* renamed from: g */
    private static volatile C63010eb f150269g;

    /* renamed from: b */
    private int f150270b;

    /* renamed from: c */
    private C58095j f150271c;

    /* renamed from: d */
    private C56344f f150272d;

    /* renamed from: e */
    private C64436b f150273e;

    /* renamed from: f */
    private byte f150274f = 2;

    static {
        C56342d dVar = new C56342d();
        f150268a = dVar;
        C62942bv.registerDefaultInstance(C56342d.class, dVar);
    }

    private C56342d() {
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150274f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150274f = b;
                return null;
            case 2:
                return newMessageInfo(f150268a, "\u0001\u0003\u0000\u0001\u0003\n\u0003\u0000\u0000\u0003\u0003ᐉ\u0001\u0007ᐉ\u0005\nᐉ\b", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56342d();
            case 4:
                return new C56341c();
            case 5:
                return f150268a;
            case 6:
                C63010eb ebVar = f150269g;
                if (ebVar == null) {
                    synchronized (C56342d.class) {
                        ebVar = f150269g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150268a);
                            f150269g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
