package com.google.p4017at.p4060h.p4068b.p4069a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p398b.p399a.p402b.p403a.p405b.C8433b;
import com.google.p4280bt.C56488d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.b.a.m */
/* compiled from: PG */
public final class C54196m extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C54196m f142231f;

    /* renamed from: h */
    private static volatile C63010eb f142232h;

    /* renamed from: a */
    public int f142233a;

    /* renamed from: b */
    public int f142234b = 0;

    /* renamed from: c */
    public Object f142235c;

    /* renamed from: d */
    public C56488d f142236d;

    /* renamed from: e */
    public boolean f142237e;

    /* renamed from: g */
    private byte f142238g = 2;

    static {
        C54196m mVar = new C54196m();
        f142231f = mVar;
        C62942bv.registerDefaultInstance(C54196m.class, mVar);
    }

    private C54196m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142238g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142238g = b;
                return null;
            case 2:
                return newMessageInfo(f142231f, "\u0001\u0005\u0001\u0001\u0003\b\u0005\u0000\u0000\u0003\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ဇ\u0004\u0006ᐼ\u0000\bဉ\u0000", new Object[]{C45240c.f118157a, "b", "a", C54204u.class, C54198o.class, "e", C8433b.class, "d"});
            case 3:
                return new C54196m();
            case 4:
                return new C54195l();
            case 5:
                return f142231f;
            case 6:
                C63010eb ebVar = f142232h;
                if (ebVar == null) {
                    synchronized (C54196m.class) {
                        ebVar = f142232h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142231f);
                            f142232h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
