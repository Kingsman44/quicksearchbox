package com.google.p4242bp.p4250c.p4251a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.bp.c.a.b */
/* compiled from: PG */
public final class C56178b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56178b f149677a;

    /* renamed from: g */
    private static volatile C63010eb f149678g;

    /* renamed from: b */
    private int f149679b;

    /* renamed from: c */
    private int f149680c;

    /* renamed from: d */
    private C63771b f149681d;

    /* renamed from: e */
    private C63771b f149682e;

    /* renamed from: f */
    private byte f149683f = 2;

    static {
        C56178b bVar = new C56178b();
        f149677a = bVar;
        C62942bv.registerDefaultInstance(C56178b.class, bVar);
    }

    private C56178b() {
        C63088z zVar = C63088z.f170246b;
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return Byte.valueOf(this.f149683f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149683f = b;
                return null;
            case 2:
                return newMessageInfo(f149677a, "\u0001\u0002\u0000\u0002\u0016\u0018\u0002\u0000\u0000\u0002\u0016ᐉ\u0013\u0018ᐉ'", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56178b();
            case 4:
                return new C56177a();
            case 5:
                return f149677a;
            case 6:
                C63010eb ebVar = f149678g;
                if (ebVar == null) {
                    synchronized (C56178b.class) {
                        ebVar = f149678g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149677a);
                            f149678g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
