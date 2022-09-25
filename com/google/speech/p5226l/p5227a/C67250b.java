package com.google.speech.p5226l.p5227a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.l.a.b */
/* compiled from: PG */
public final class C67250b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C67250b f182809a;

    /* renamed from: c */
    private static volatile C63010eb f182810c;

    /* renamed from: b */
    private byte f182811b = 2;

    static {
        C67250b bVar = new C67250b();
        f182809a = bVar;
        C62942bv.registerDefaultInstance(C67250b.class, bVar);
    }

    private C67250b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182811b);
            case 1:
                this.f182811b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f182809a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67250b();
            case 4:
                return new C67249a();
            case 5:
                return f182809a;
            case 6:
                C63010eb ebVar = f182810c;
                if (ebVar == null) {
                    synchronized (C67250b.class) {
                        ebVar = f182810c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182809a);
                            f182810c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
