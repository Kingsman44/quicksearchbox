package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66686t;

/* renamed from: com.google.speech.recognizer.a.ar */
/* compiled from: PG */
public final class C67449ar extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C62962ci f183299b = new C67447ap();

    /* renamed from: c */
    public static final C67449ar f183300c;

    /* renamed from: e */
    private static volatile C63010eb f183301e;

    /* renamed from: a */
    public C62961ch f183302a = emptyIntList();

    /* renamed from: d */
    private byte f183303d = 2;

    static {
        C67449ar arVar = new C67449ar();
        f183300c = arVar;
        C62942bv.registerDefaultInstance(C67449ar.class, arVar);
    }

    private C67449ar() {
        emptyFloatList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183303d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183303d = b;
                return null;
            case 2:
                return newMessageInfo(f183300c, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001e", new Object[]{"a", C66686t.m97301b()});
            case 3:
                return new C67449ar();
            case 4:
                return new C67448aq();
            case 5:
                return f183300c;
            case 6:
                C63010eb ebVar = f183301e;
                if (ebVar == null) {
                    synchronized (C67449ar.class) {
                        ebVar = f183301e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183300c);
                            f183301e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
