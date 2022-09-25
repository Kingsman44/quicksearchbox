package com.google.speech.p5197b.p5198a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.b.a.b */
/* compiled from: PG */
public final class C66455b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66455b f180698a;

    /* renamed from: h */
    private static volatile C63010eb f180699h;

    /* renamed from: b */
    private int f180700b;

    /* renamed from: c */
    private float f180701c;

    /* renamed from: d */
    private float f180702d;

    /* renamed from: e */
    private float f180703e;

    /* renamed from: f */
    private float f180704f;

    /* renamed from: g */
    private byte f180705g = 2;

    static {
        C66455b bVar = new C66455b();
        f180698a = bVar;
        C62942bv.registerDefaultInstance(C66455b.class, bVar);
    }

    private C66455b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180705g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180705g = b;
                return null;
            case 2:
                return newMessageInfo(f180698a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C66455b();
            case 4:
                return new C66454a();
            case 5:
                return f180698a;
            case 6:
                C63010eb ebVar = f180699h;
                if (ebVar == null) {
                    synchronized (C66455b.class) {
                        ebVar = f180699h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180698a);
                            f180699h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
