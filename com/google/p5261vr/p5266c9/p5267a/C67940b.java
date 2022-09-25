package com.google.p5261vr.p5266c9.p5267a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.vr.c9.a.b */
/* compiled from: PG */
public final class C67940b extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C67940b f184134c;

    /* renamed from: e */
    private static volatile C63010eb f184135e;

    /* renamed from: a */
    public int f184136a;

    /* renamed from: b */
    public C67946h f184137b;

    /* renamed from: d */
    private byte f184138d = 2;

    static {
        C67940b bVar = new C67940b();
        f184134c = bVar;
        C62942bv.registerDefaultInstance(C67940b.class, bVar);
    }

    private C67940b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184138d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184138d = b;
                return null;
            case 2:
                return newMessageInfo(f184134c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67940b();
            case 4:
                return new C67935a();
            case 5:
                return f184134c;
            case 6:
                C63010eb ebVar = f184135e;
                if (ebVar == null) {
                    synchronized (C67940b.class) {
                        ebVar = f184135e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184134c);
                            f184135e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
