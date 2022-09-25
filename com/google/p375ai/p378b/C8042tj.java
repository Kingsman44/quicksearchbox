package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.tj */
/* compiled from: PG */
public final class C8042tj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8042tj f28242f;

    /* renamed from: h */
    private static volatile C63010eb f28243h;

    /* renamed from: a */
    public int f28244a;

    /* renamed from: b */
    public String f28245b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f28246c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C8150xj f28247d;

    /* renamed from: e */
    public C7536ax f28248e;

    /* renamed from: g */
    private byte f28249g = 2;

    static {
        C8042tj tjVar = new C8042tj();
        f28242f = tjVar;
        C62942bv.registerDefaultInstance(C8042tj.class, tjVar);
    }

    private C8042tj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28249g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28249g = b;
                return null;
            case 2:
                return newMessageInfo(f28242f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0002\u0003ᐉ\u0003\u0004ဈ\u0001", new Object[]{"a", "b", "d", "e", C45240c.f118157a});
            case 3:
                return new C8042tj();
            case 4:
                return new C8041ti();
            case 5:
                return f28242f;
            case 6:
                C63010eb ebVar = f28243h;
                if (ebVar == null) {
                    synchronized (C8042tj.class) {
                        ebVar = f28243h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28242f);
                            f28243h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
