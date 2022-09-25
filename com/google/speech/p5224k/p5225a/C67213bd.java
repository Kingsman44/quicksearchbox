package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5230n.p5232b.C67398an;
import com.google.speech.p5230n.p5232b.C67402ar;

/* renamed from: com.google.speech.k.a.bd */
/* compiled from: PG */
public final class C67213bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67213bd f182675c;

    /* renamed from: e */
    private static volatile C63010eb f182676e;

    /* renamed from: a */
    public int f182677a = 0;

    /* renamed from: b */
    public Object f182678b;

    /* renamed from: d */
    private byte f182679d = 2;

    static {
        C67213bd bdVar = new C67213bd();
        f182675c = bdVar;
        C62942bv.registerDefaultInstance(C67213bd.class, bdVar);
    }

    private C67213bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182679d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182679d = b;
                return null;
            case 2:
                return newMessageInfo(f182675c, "\u0001\t\u0001\u0000\u0001\r\t\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\bြ\u0000\tᐼ\u0000\rြ\u0000", new Object[]{"b", "a", C67398an.class, C67211bb.class, C67206ax.class, C67217bh.class, C67402ar.class, C67202at.class, C67204av.class, C67208az.class, C67200ar.class});
            case 3:
                return new C67213bd();
            case 4:
                return new C67212bc();
            case 5:
                return f182675c;
            case 6:
                C63010eb ebVar = f182676e;
                if (ebVar == null) {
                    synchronized (C67213bd.class) {
                        ebVar = f182676e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182675c);
                            f182676e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
