package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.p5219a.C66722az;

/* renamed from: com.google.speech.j.nn */
/* compiled from: PG */
public final class C67167nn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67167nn f182564c;

    /* renamed from: d */
    public static final C62940bt f182565d;

    /* renamed from: f */
    private static volatile C63010eb f182566f;

    /* renamed from: a */
    public int f182567a;

    /* renamed from: b */
    public C66722az f182568b;

    /* renamed from: e */
    private byte f182569e = 2;

    static {
        C67167nn nnVar = new C67167nn();
        f182564c = nnVar;
        C62942bv.registerDefaultInstance(C67167nn.class, nnVar);
        f182565d = C62942bv.newSingularGeneratedExtension(C67105lf.f182433a, nnVar, nnVar, (C62958ce) null, 357861857, C63066gd.MESSAGE, C67167nn.class);
    }

    private C67167nn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182569e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182569e = b;
                return null;
            case 2:
                return newMessageInfo(f182564c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67167nn();
            case 4:
                return new C67166nm();
            case 5:
                return f182564c;
            case 6:
                C63010eb ebVar = f182566f;
                if (ebVar == null) {
                    synchronized (C67167nn.class) {
                        ebVar = f182566f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182564c);
                            f182566f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
