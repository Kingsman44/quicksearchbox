package com.google.p5277z.p5282c;

import com.google.p4242bp.p4252d.C56180b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.aq */
/* compiled from: PG */
public final class C68007aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68007aq f184262c;

    /* renamed from: e */
    private static volatile C63010eb f184263e;

    /* renamed from: a */
    public int f184264a;

    /* renamed from: b */
    public C56180b f184265b;

    /* renamed from: d */
    private byte f184266d = 2;

    static {
        C68007aq aqVar = new C68007aq();
        f184262c = aqVar;
        C62942bv.registerDefaultInstance(C68007aq.class, aqVar);
    }

    private C68007aq() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184266d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184266d = b;
                return null;
            case 2:
                return newMessageInfo(f184262c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C68007aq();
            case 4:
                return new C68006ap();
            case 5:
                return f184262c;
            case 6:
                C63010eb ebVar = f184263e;
                if (ebVar == null) {
                    synchronized (C68007aq.class) {
                        ebVar = f184263e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184262c);
                            f184263e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
