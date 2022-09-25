package com.google.p4658k.p4659a.p4660a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.k.a.a.i */
/* compiled from: PG */
public final class C61733i extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C61733i f166775f;

    /* renamed from: g */
    private static volatile C63010eb f166776g;

    /* renamed from: a */
    public int f166777a;

    /* renamed from: b */
    public C63088z f166778b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f166779c = C63088z.f170246b;

    /* renamed from: d */
    public C61731g f166780d;

    /* renamed from: e */
    public C61726b f166781e;

    static {
        C61733i iVar = new C61733i();
        f166775f = iVar;
        C62942bv.registerDefaultInstance(C61733i.class, iVar);
    }

    private C61733i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f166775f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C61733i();
            case 4:
                return new C61732h();
            case 5:
                return f166775f;
            case 6:
                C63010eb ebVar = f166776g;
                if (ebVar == null) {
                    synchronized (C61733i.class) {
                        ebVar = f166776g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166775f);
                            f166776g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
