package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.p5219a.C66752s;

/* renamed from: com.google.speech.j.mq */
/* compiled from: PG */
public final class C67143mq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67143mq f182508c;

    /* renamed from: d */
    public static final C62940bt f182509d;

    /* renamed from: f */
    private static volatile C63010eb f182510f;

    /* renamed from: a */
    public int f182511a;

    /* renamed from: b */
    public C66752s f182512b;

    /* renamed from: e */
    private byte f182513e = 2;

    static {
        C67143mq mqVar = new C67143mq();
        f182508c = mqVar;
        C62942bv.registerDefaultInstance(C67143mq.class, mqVar);
        f182509d = C62942bv.newSingularGeneratedExtension(C67105lf.f182433a, mqVar, mqVar, (C62958ce) null, 336125775, C63066gd.MESSAGE, C67143mq.class);
    }

    private C67143mq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182513e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182513e = b;
                return null;
            case 2:
                return newMessageInfo(f182508c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67143mq();
            case 4:
                return new C67142mp();
            case 5:
                return f182508c;
            case 6:
                C63010eb ebVar = f182510f;
                if (ebVar == null) {
                    synchronized (C67143mq.class) {
                        ebVar = f182510f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182508c);
                            f182510f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
