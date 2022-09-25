package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.speech.k.a.e */
/* compiled from: PG */
public final class C67227e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67227e f182706c;

    /* renamed from: d */
    public static final C62940bt f182707d;

    /* renamed from: f */
    private static volatile C63010eb f182708f;

    /* renamed from: a */
    public int f182709a;

    /* renamed from: b */
    public int f182710b;

    /* renamed from: e */
    private byte f182711e = 2;

    static {
        C67227e eVar = new C67227e();
        f182706c = eVar;
        C62942bv.registerDefaultInstance(C67227e.class, eVar);
        f182707d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, eVar, eVar, (C62958ce) null, 214820992, C63066gd.MESSAGE, C67227e.class);
    }

    private C67227e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182711e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182711e = b;
                return null;
            case 2:
                return newMessageInfo(f182706c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C67225c.f182705a});
            case 3:
                return new C67227e();
            case 4:
                return new C67226d();
            case 5:
                return f182706c;
            case 6:
                C63010eb ebVar = f182708f;
                if (ebVar == null) {
                    synchronized (C67227e.class) {
                        ebVar = f182708f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182706c);
                            f182708f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
