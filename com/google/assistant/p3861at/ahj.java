package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4159be.C55431b;
import com.google.p5234t.C67483e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ahj */
/* compiled from: PG */
public final class ahj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final ahj f129309e;

    /* renamed from: g */
    private static volatile C63010eb f129310g;

    /* renamed from: a */
    public int f129311a;

    /* renamed from: b */
    public C67483e f129312b;

    /* renamed from: c */
    public C62971cq f129313c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C55431b f129314d;

    /* renamed from: f */
    private byte f129315f = 2;

    static {
        ahj ahj = new ahj();
        f129309e = ahj;
        C62942bv.registerDefaultInstance(ahj.class, ahj);
    }

    private ahj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129315f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129315f = b;
                return null;
            case 2:
                return newMessageInfo(f129309e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new ahj();
            case 4:
                return new ahi();
            case 5:
                return f129309e;
            case 6:
                C63010eb ebVar = f129310g;
                if (ebVar == null) {
                    synchronized (ahj.class) {
                        ebVar = f129310g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129309e);
                            f129310g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
