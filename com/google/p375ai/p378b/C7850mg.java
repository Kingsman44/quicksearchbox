package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.mg */
/* compiled from: PG */
public final class C7850mg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7850mg f27512e;

    /* renamed from: g */
    private static volatile C63010eb f27513g;

    /* renamed from: a */
    public int f27514a;

    /* renamed from: b */
    public int f27515b;

    /* renamed from: c */
    public C7536ax f27516c;

    /* renamed from: d */
    public int f27517d;

    /* renamed from: f */
    private byte f27518f = 2;

    static {
        C7850mg mgVar = new C7850mg();
        f27512e = mgVar;
        C62942bv.registerDefaultInstance(C7850mg.class, mgVar);
    }

    private C7850mg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27518f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27518f = b;
                return null;
            case 2:
                Object[] objArr = new Object[6];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C7847md.f27511a;
                objArr[5] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[4] = "d";
                return newMessageInfo(f27512e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", objArr);
            case 3:
                return new C7850mg();
            case 4:
                return new C7849mf();
            case 5:
                return f27512e;
            case 6:
                C63010eb ebVar = f27513g;
                if (ebVar == null) {
                    synchronized (C7850mg.class) {
                        ebVar = f27513g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27512e);
                            f27513g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
