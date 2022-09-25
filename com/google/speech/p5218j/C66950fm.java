package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.fm */
/* compiled from: PG */
public final class C66950fm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66950fm f181991d;

    /* renamed from: g */
    private static volatile C63010eb f181992g;

    /* renamed from: a */
    public int f181993a;

    /* renamed from: b */
    public C62971cq f181994b = emptyProtobufList();

    /* renamed from: c */
    public String f181995c = "en-US";

    /* renamed from: e */
    private C66956fs f181996e;

    /* renamed from: f */
    private byte f181997f = 2;

    static {
        C66950fm fmVar = new C66950fm();
        f181991d = fmVar;
        C62942bv.registerDefaultInstance(C66950fm.class, fmVar);
    }

    private C66950fm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181997f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181997f = b;
                return null;
            case 2:
                return newMessageInfo(f181991d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C66940fc.class, "e", C45240c.f118157a});
            case 3:
                return new C66950fm();
            case 4:
                return new C66949fl();
            case 5:
                return f181991d;
            case 6:
                C63010eb ebVar = f181992g;
                if (ebVar == null) {
                    synchronized (C66950fm.class) {
                        ebVar = f181992g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181991d);
                            f181992g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
