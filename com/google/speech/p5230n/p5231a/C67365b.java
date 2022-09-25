package com.google.speech.p5230n.p5231a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.a.b */
/* compiled from: PG */
public final class C67365b extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C67365b f183113c;

    /* renamed from: e */
    private static volatile C63010eb f183114e;

    /* renamed from: a */
    public int f183115a;

    /* renamed from: b */
    public C67368e f183116b;

    /* renamed from: d */
    private byte f183117d = 2;

    static {
        C67365b bVar = new C67365b();
        f183113c = bVar;
        C62942bv.registerDefaultInstance(C67365b.class, bVar);
    }

    private C67365b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183117d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183117d = b;
                return null;
            case 2:
                return newMessageInfo(f183113c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0004", new Object[]{"a", "b"});
            case 3:
                return new C67365b();
            case 4:
                return new C67364a();
            case 5:
                return f183113c;
            case 6:
                C63010eb ebVar = f183114e;
                if (ebVar == null) {
                    synchronized (C67365b.class) {
                        ebVar = f183114e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183113c);
                            f183114e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
