package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.aj.a.a.a.af */
/* compiled from: PG */
public final class C8217af extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8217af f28849b;

    /* renamed from: f */
    private static volatile C63010eb f28850f;

    /* renamed from: a */
    public C63088z f28851a;

    /* renamed from: c */
    private int f28852c;

    /* renamed from: d */
    private C63771b f28853d;

    /* renamed from: e */
    private byte f28854e = 2;

    static {
        C8217af afVar = new C8217af();
        f28849b = afVar;
        C62942bv.registerDefaultInstance(C8217af.class, afVar);
    }

    private C8217af() {
        emptyProtobufList();
        this.f28851a = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28854e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28854e = b;
                return null;
            case 2:
                return newMessageInfo(f28849b, "\u0001\u0002\u0000\u0001\u0005\u000f\u0002\u0000\u0000\u0001\u0005ည\u0000\u000fᐉ\u0006", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C8217af();
            case 4:
                return new C8216ae();
            case 5:
                return f28849b;
            case 6:
                C63010eb ebVar = f28850f;
                if (ebVar == null) {
                    synchronized (C8217af.class) {
                        ebVar = f28850f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28849b);
                            f28850f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
