package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.at.h.a.a.a.ah */
/* compiled from: PG */
public final class C54084ah extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C54084ah f141910d;

    /* renamed from: g */
    private static volatile C63010eb f141911g;

    /* renamed from: a */
    public int f141912a = 0;

    /* renamed from: b */
    public Object f141913b;

    /* renamed from: c */
    public C63204j f141914c;

    /* renamed from: e */
    private int f141915e;

    /* renamed from: f */
    private byte f141916f = 2;

    static {
        C54084ah ahVar = new C54084ah();
        f141910d = ahVar;
        C62942bv.registerDefaultInstance(C54084ah.class, ahVar);
    }

    private C54084ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141916f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141916f = b;
                return null;
            case 2:
                return newMessageInfo(f141910d, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0006\u0001ᐼ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ᐉ\u0007\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ᐼ\u0000\bြ\u0000", new Object[]{"b", "a", "e", C54079ac.class, C54090an.class, C54092ap.class, C45240c.f118157a, C54096at.class, C54126y.class, C54086aj.class, C54094ar.class});
            case 3:
                return new C54084ah();
            case 4:
                return new C54083ag();
            case 5:
                return f141910d;
            case 6:
                C63010eb ebVar = f141911g;
                if (ebVar == null) {
                    synchronized (C54084ah.class) {
                        ebVar = f141911g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141910d);
                            f141911g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
