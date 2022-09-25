package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.as */
/* compiled from: PG */
public final class C51831as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51831as f135976c;

    /* renamed from: e */
    private static volatile C63010eb f135977e;

    /* renamed from: a */
    public int f135978a = 0;

    /* renamed from: b */
    public Object f135979b;

    /* renamed from: d */
    private byte f135980d = 2;

    static {
        C51831as asVar = new C51831as();
        f135976c = asVar;
        C62942bv.registerDefaultInstance(C51831as.class, asVar);
    }

    private C51831as() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135980d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135980d = b;
                return null;
            case 2:
                return newMessageInfo(f135976c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ᐼ\u0000", new Object[]{"b", "a", C52560wg.class, C51835aw.class, C51829aq.class, C51833au.class});
            case 3:
                return new C51831as();
            case 4:
                return new C51830ar();
            case 5:
                return f135976c;
            case 6:
                C63010eb ebVar = f135977e;
                if (ebVar == null) {
                    synchronized (C51831as.class) {
                        ebVar = f135977e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135976c);
                            f135977e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
