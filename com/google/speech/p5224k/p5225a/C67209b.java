package com.google.speech.p5224k.p5225a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55140hi;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.speech.k.a.b */
/* compiled from: PG */
public final class C67209b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67209b f182666d;

    /* renamed from: e */
    public static final C62940bt f182667e;

    /* renamed from: g */
    private static volatile C63010eb f182668g;

    /* renamed from: a */
    public int f182669a;

    /* renamed from: b */
    public C55140hi f182670b;

    /* renamed from: c */
    public C63088z f182671c = C63088z.f170246b;

    /* renamed from: f */
    private byte f182672f = 2;

    static {
        C67209b bVar = new C67209b();
        f182666d = bVar;
        C62942bv.registerDefaultInstance(C67209b.class, bVar);
        f182667e = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, bVar, bVar, (C62958ce) null, 26599812, C63066gd.MESSAGE, C67209b.class);
    }

    private C67209b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182672f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182672f = b;
                return null;
            case 2:
                return newMessageInfo(f182666d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67209b();
            case 4:
                return new C67182a();
            case 5:
                return f182666d;
            case 6:
                C63010eb ebVar = f182668g;
                if (ebVar == null) {
                    synchronized (C67209b.class) {
                        ebVar = f182668g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182666d);
                            f182668g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
