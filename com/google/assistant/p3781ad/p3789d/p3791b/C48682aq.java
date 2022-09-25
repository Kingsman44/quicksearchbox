package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.aq */
/* compiled from: PG */
public final class C48682aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48682aq f125948c;

    /* renamed from: e */
    private static volatile C63010eb f125949e;

    /* renamed from: a */
    public int f125950a;

    /* renamed from: b */
    public C48680ao f125951b;

    /* renamed from: d */
    private byte f125952d = 2;

    static {
        C48682aq aqVar = new C48682aq();
        f125948c = aqVar;
        C62942bv.registerDefaultInstance(C48682aq.class, aqVar);
    }

    private C48682aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125952d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125952d = b;
                return null;
            case 2:
                return newMessageInfo(f125948c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48682aq();
            case 4:
                return new C48681ap();
            case 5:
                return f125948c;
            case 6:
                C63010eb ebVar = f125949e;
                if (ebVar == null) {
                    synchronized (C48682aq.class) {
                        ebVar = f125949e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125948c);
                            f125949e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
