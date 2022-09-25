package com.google.speech.p5213i.p5214a.p5215a.p5216a.p5217a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.i.a.a.a.a.b */
/* compiled from: PG */
public final class C66694b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66694b f181433b;

    /* renamed from: c */
    private static volatile C63010eb f181434c;

    /* renamed from: a */
    public C62971cq f181435a = C62942bv.emptyProtobufList();

    static {
        C66694b bVar = new C66694b();
        f181433b = bVar;
        C62942bv.registerDefaultInstance(C66694b.class, bVar);
    }

    private C66694b() {
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
                return newMessageInfo(f181433b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C66694b();
            case 4:
                return new C66693a();
            case 5:
                return f181433b;
            case 6:
                C63010eb ebVar = f181434c;
                if (ebVar == null) {
                    synchronized (C66694b.class) {
                        ebVar = f181434c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181433b);
                            f181434c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
