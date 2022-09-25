package com.google.p4283bv.p4345d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7832lp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.h */
/* compiled from: PG */
public final class C57029h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57029h f152248f;

    /* renamed from: h */
    private static volatile C63010eb f152249h;

    /* renamed from: a */
    public int f152250a;

    /* renamed from: b */
    public C56964b f152251b;

    /* renamed from: c */
    public C62971cq f152252c = emptyProtobufList();

    /* renamed from: d */
    public C7832lp f152253d;

    /* renamed from: e */
    public int f152254e;

    /* renamed from: g */
    private byte f152255g = 2;

    static {
        C57029h hVar = new C57029h();
        f152248f = hVar;
        C62942bv.registerDefaultInstance(C57029h.class, hVar);
    }

    private C57029h() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152255g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152255g = b;
                return null;
            case 2:
                return newMessageInfo(f152248f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ဉ\u0001\u0005ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C57033l.class, "d", "e", C57027f.f152247a});
            case 3:
                return new C57029h();
            case 4:
                return new C57026e();
            case 5:
                return f152248f;
            case 6:
                C63010eb ebVar = f152249h;
                if (ebVar == null) {
                    synchronized (C57029h.class) {
                        ebVar = f152249h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152248f);
                            f152249h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
