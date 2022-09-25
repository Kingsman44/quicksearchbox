package com.google.p5277z.p5282c;

import com.google.p4152bb.p4153a.C54976bg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.z.c.p */
/* compiled from: PG */
public final class C68026p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68026p f184306b;

    /* renamed from: c */
    public static final C62940bt f184307c;

    /* renamed from: e */
    private static volatile C63010eb f184308e;

    /* renamed from: a */
    public C62971cq f184309a = emptyProtobufList();

    /* renamed from: d */
    private byte f184310d = 2;

    static {
        C68026p pVar = new C68026p();
        f184306b = pVar;
        C62942bv.registerDefaultInstance(C68026p.class, pVar);
        f184307c = C62942bv.newSingularGeneratedExtension(C54976bg.f144641o, pVar, pVar, (C62958ce) null, 68249552, C63066gd.MESSAGE, C68026p.class);
    }

    private C68026p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184310d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184310d = b;
                return null;
            case 2:
                return newMessageInfo(f184306b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C68024n.class});
            case 3:
                return new C68026p();
            case 4:
                return new C68025o();
            case 5:
                return f184306b;
            case 6:
                C63010eb ebVar = f184308e;
                if (ebVar == null) {
                    synchronized (C68026p.class) {
                        ebVar = f184308e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184306b);
                            f184308e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
