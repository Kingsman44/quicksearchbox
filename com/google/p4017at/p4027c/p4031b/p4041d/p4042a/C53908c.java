package com.google.p4017at.p4027c.p4031b.p4041d.p4042a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.c.b.d.a.c */
/* compiled from: PG */
public final class C53908c extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53908c f141452g;

    /* renamed from: i */
    private static volatile C63010eb f141453i;

    /* renamed from: a */
    public int f141454a;

    /* renamed from: b */
    public C62971cq f141455b = emptyProtobufList();

    /* renamed from: c */
    public int f141456c;

    /* renamed from: d */
    public C57338u f141457d;

    /* renamed from: e */
    public C57340w f141458e;

    /* renamed from: f */
    public C63042fg f141459f;

    /* renamed from: h */
    private byte f141460h = 2;

    static {
        C53908c cVar = new C53908c();
        f141452g = cVar;
        C62942bv.registerDefaultInstance(C53908c.class, cVar);
    }

    private C53908c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141460h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141460h = b;
                return null;
            case 2:
                return newMessageInfo(f141452g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0001\u0001\f\u0002\u001b\u0003\u0004\u0005Љ\u0006\t\u0007\t", new Object[]{"a", "b", C53917l.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C53908c();
            case 4:
                return new C53904a();
            case 5:
                return f141452g;
            case 6:
                C63010eb ebVar = f141453i;
                if (ebVar == null) {
                    synchronized (C53908c.class) {
                        ebVar = f141453i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141452g);
                            f141453i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
