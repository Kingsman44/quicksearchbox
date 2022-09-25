package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5230n.p5232b.C67400ap;

/* renamed from: com.google.assistant.at.fd */
/* compiled from: PG */
public final class C49954fd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49954fd f129868c;

    /* renamed from: e */
    private static volatile C63010eb f129869e;

    /* renamed from: a */
    public int f129870a;

    /* renamed from: b */
    public C67400ap f129871b;

    /* renamed from: d */
    private byte f129872d = 2;

    static {
        C49954fd fdVar = new C49954fd();
        f129868c = fdVar;
        C62942bv.registerDefaultInstance(C49954fd.class, fdVar);
    }

    private C49954fd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129872d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129872d = b;
                return null;
            case 2:
                return newMessageInfo(f129868c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49954fd();
            case 4:
                return new C49953fc();
            case 5:
                return f129868c;
            case 6:
                C63010eb ebVar = f129869e;
                if (ebVar == null) {
                    synchronized (C49954fd.class) {
                        ebVar = f129869e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129868c);
                            f129869e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
