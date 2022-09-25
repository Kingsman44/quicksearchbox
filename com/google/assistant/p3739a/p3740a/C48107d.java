package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.assistant.a.a.d */
/* compiled from: PG */
public final class C48107d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48107d f124510c;

    /* renamed from: e */
    private static volatile C63010eb f124511e;

    /* renamed from: a */
    public int f124512a = 0;

    /* renamed from: b */
    public Object f124513b;

    /* renamed from: d */
    private byte f124514d = 2;

    static {
        C48107d dVar = new C48107d();
        f124510c = dVar;
        C62942bv.registerDefaultInstance(C48107d.class, dVar);
    }

    private C48107d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124514d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124514d = b;
                return null;
            case 2:
                return newMessageInfo(f124510c, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000bм\u0000", new Object[]{"b", "a", C48102ci.class, C48117n.class, C48043ad.class, C48097cd.class, C48072bf.class, C48104ck.class, C48053an.class, C48049aj.class, C48061av.class, C48070bd.class, C67087ko.class});
            case 3:
                return new C48107d();
            case 4:
                return new C48093c();
            case 5:
                return f124510c;
            case 6:
                C63010eb ebVar = f124511e;
                if (ebVar == null) {
                    synchronized (C48107d.class) {
                        ebVar = f124511e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124510c);
                            f124511e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
