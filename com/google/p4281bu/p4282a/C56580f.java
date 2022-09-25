package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.f */
/* compiled from: PG */
public final class C56580f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56580f f151065c;

    /* renamed from: d */
    private static volatile C63010eb f151066d;

    /* renamed from: a */
    public C56575de f151067a;

    /* renamed from: b */
    public C56600z f151068b;

    static {
        C56580f fVar = new C56580f();
        f151065c = fVar;
        C62942bv.registerDefaultInstance(C56580f.class, fVar);
    }

    private C56580f() {
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
                return newMessageInfo(f151065c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C56580f();
            case 4:
                return new C56579e();
            case 5:
                return f151065c;
            case 6:
                C63010eb ebVar = f151066d;
                if (ebVar == null) {
                    synchronized (C56580f.class) {
                        ebVar = f151066d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151065c);
                            f151066d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
