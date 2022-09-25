package com.google.p4242bp.p4243a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4671b.C61782aa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63352aw;

/* renamed from: com.google.bp.a.b */
/* compiled from: PG */
public final class C56141b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56141b f149568a;

    /* renamed from: f */
    private static volatile C63010eb f149569f;

    /* renamed from: b */
    private int f149570b;

    /* renamed from: c */
    private C63352aw f149571c;

    /* renamed from: d */
    private C61782aa f149572d;

    /* renamed from: e */
    private byte f149573e = 2;

    static {
        C56141b bVar = new C56141b();
        f149568a = bVar;
        C62942bv.registerDefaultInstance(C56141b.class, bVar);
    }

    private C56141b() {
        emptyProtobufList();
        emptyProtobufList();
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
                return Byte.valueOf(this.f149573e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149573e = b;
                return null;
            case 2:
                return newMessageInfo(f149568a, "\u0001\u0002\u0000\u0001\u0001\u000f\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u000fᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C56141b();
            case 4:
                return new C56126a();
            case 5:
                return f149568a;
            case 6:
                C63010eb ebVar = f149569f;
                if (ebVar == null) {
                    synchronized (C56141b.class) {
                        ebVar = f149569f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149568a);
                            f149569f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
