package com.google.protos.p4850an.p4855d.p4858c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.c.p */
/* compiled from: PG */
public final class C63543p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63543p f171881a;

    /* renamed from: h */
    private static volatile C63010eb f171882h;

    /* renamed from: b */
    private int f171883b;

    /* renamed from: c */
    private C63547t f171884c;

    /* renamed from: d */
    private C63549v f171885d;

    /* renamed from: e */
    private C63553z f171886e;

    /* renamed from: f */
    private C63551x f171887f;

    /* renamed from: g */
    private byte f171888g = 2;

    static {
        C63543p pVar = new C63543p();
        f171881a = pVar;
        C62942bv.registerDefaultInstance(C63543p.class, pVar);
    }

    private C63543p() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171888g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171888g = b;
                return null;
            case 2:
                return newMessageInfo(f171881a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0005ᐉ\u0002\u0006ᐉ\u0003\bᐉ\u0005", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C63543p();
            case 4:
                return new C63542o();
            case 5:
                return f171881a;
            case 6:
                C63010eb ebVar = f171882h;
                if (ebVar == null) {
                    synchronized (C63543p.class) {
                        ebVar = f171882h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171881a);
                            f171882h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
