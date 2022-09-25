package com.google.p5277z.p5278a.p5279a.p5280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.a.a.a.h */
/* compiled from: PG */
public final class C67975h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67975h f184198c;

    /* renamed from: f */
    private static volatile C63010eb f184199f;

    /* renamed from: a */
    public C67977j f184200a;

    /* renamed from: b */
    public C62971cq f184201b;

    /* renamed from: d */
    private int f184202d;

    /* renamed from: e */
    private byte f184203e = 2;

    static {
        C67975h hVar = new C67975h();
        f184198c = hVar;
        C62942bv.registerDefaultInstance(C67975h.class, hVar);
    }

    private C67975h() {
        emptyProtobufList();
        this.f184201b = emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184203e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184203e = b;
                return null;
            case 2:
                return newMessageInfo(f184198c, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004ဉ\u0002\u0005\u001b", new Object[]{"d", "a", "b", C67973f.class});
            case 3:
                return new C67975h();
            case 4:
                return new C67974g();
            case 5:
                return f184198c;
            case 6:
                C63010eb ebVar = f184199f;
                if (ebVar == null) {
                    synchronized (C67975h.class) {
                        ebVar = f184199f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184198c);
                            f184199f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
