package com.google.assistant.p3803ag.p3804a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.n */
/* compiled from: PG */
public final class C48871n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48871n f126470e;

    /* renamed from: h */
    private static volatile C63010eb f126471h;

    /* renamed from: a */
    public int f126472a;

    /* renamed from: b */
    public C48851br f126473b;

    /* renamed from: c */
    public C48877t f126474c;

    /* renamed from: d */
    public C62971cq f126475d = emptyProtobufList();

    /* renamed from: f */
    private C62724b f126476f;

    /* renamed from: g */
    private byte f126477g = 2;

    static {
        C48871n nVar = new C48871n();
        f126470e = nVar;
        C62942bv.registerDefaultInstance(C48871n.class, nVar);
    }

    private C48871n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126477g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126477g = b;
                return null;
            case 2:
                return newMessageInfo(f126470e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001ဉ\u0000\u0002ᐉ\u0002\u0004\u001c\u0005ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a});
            case 3:
                return new C48871n();
            case 4:
                return new C48870m();
            case 5:
                return f126470e;
            case 6:
                C63010eb ebVar = f126471h;
                if (ebVar == null) {
                    synchronized (C48871n.class) {
                        ebVar = f126471h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126470e);
                            f126471h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
