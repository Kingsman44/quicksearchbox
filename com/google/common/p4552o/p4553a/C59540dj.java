package com.google.common.p4552o.p4553a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.dj */
/* compiled from: PG */
public final class C59540dj extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59540dj f157989g;

    /* renamed from: h */
    private static volatile C63010eb f157990h;

    /* renamed from: a */
    public int f157991a;

    /* renamed from: b */
    public int f157992b;

    /* renamed from: c */
    public float f157993c;

    /* renamed from: d */
    public int f157994d;

    /* renamed from: e */
    public int f157995e;

    /* renamed from: f */
    public C62971cq f157996f = emptyProtobufList();

    static {
        C59540dj djVar = new C59540dj();
        f157989g = djVar;
        C62942bv.registerDefaultInstance(C59540dj.class, djVar);
    }

    private C59540dj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f157989g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဌ\u0002\u0004\u001b\u0005င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C59538dh.f157988a, C10662f.f35572a, C59532db.class, "e"});
            case 3:
                return new C59540dj();
            case 4:
                return new C59539di();
            case 5:
                return f157989g;
            case 6:
                C63010eb ebVar = f157990h;
                if (ebVar == null) {
                    synchronized (C59540dj.class) {
                        ebVar = f157990h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157989g);
                            f157990h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
