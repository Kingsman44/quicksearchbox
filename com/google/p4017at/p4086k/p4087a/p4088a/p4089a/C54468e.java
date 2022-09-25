package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57637d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.e */
/* compiled from: PG */
public final class C54468e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54468e f143019b;

    /* renamed from: d */
    private static volatile C63010eb f143020d;

    /* renamed from: a */
    public C57637d f143021a;

    /* renamed from: c */
    private byte f143022c = 2;

    static {
        C54468e eVar = new C54468e();
        f143019b = eVar;
        C62942bv.registerDefaultInstance(C54468e.class, eVar);
    }

    private C54468e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143022c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f143022c = b;
                return null;
            case 2:
                return newMessageInfo(f143019b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C54468e();
            case 4:
                return new C54467d();
            case 5:
                return f143019b;
            case 6:
                C63010eb ebVar = f143020d;
                if (ebVar == null) {
                    synchronized (C54468e.class) {
                        ebVar = f143020d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143019b);
                            f143020d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
