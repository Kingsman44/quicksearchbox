package com.google.android.libraries.assistant.p1363c.p1364a.p1370c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.a.c.h */
/* compiled from: PG */
public final class C16984h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16984h f49615b;

    /* renamed from: d */
    private static volatile C63010eb f49616d;

    /* renamed from: a */
    public C62971cq f49617a = emptyProtobufList();

    /* renamed from: c */
    private byte f49618c = 2;

    static {
        C16984h hVar = new C16984h();
        f49615b = hVar;
        C62942bv.registerDefaultInstance(C16984h.class, hVar);
    }

    private C16984h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49618c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49618c = b;
                return null;
            case 2:
                return newMessageInfo(f49615b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C16980d.class});
            case 3:
                return new C16984h();
            case 4:
                return new C16983g();
            case 5:
                return f49615b;
            case 6:
                C63010eb ebVar = f49616d;
                if (ebVar == null) {
                    synchronized (C16984h.class) {
                        ebVar = f49616d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49615b);
                            f49616d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
