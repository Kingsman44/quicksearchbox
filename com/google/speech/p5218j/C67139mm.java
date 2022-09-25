package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.mm */
/* compiled from: PG */
public final class C67139mm extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C67139mm f182496e;

    /* renamed from: g */
    private static volatile C63010eb f182497g;

    /* renamed from: a */
    public int f182498a;

    /* renamed from: b */
    public boolean f182499b;

    /* renamed from: c */
    public C67131me f182500c;

    /* renamed from: d */
    public C62961ch f182501d = emptyIntList();

    /* renamed from: f */
    private byte f182502f = 2;

    static {
        C67139mm mmVar = new C67139mm();
        f182496e = mmVar;
        C62942bv.registerDefaultInstance(C67139mm.class, mmVar);
    }

    private C67139mm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182502f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182502f = b;
                return null;
            case 2:
                return newMessageInfo(f182496e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0005\u0016", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67139mm();
            case 4:
                return new C67138ml();
            case 5:
                return f182496e;
            case 6:
                C63010eb ebVar = f182497g;
                if (ebVar == null) {
                    synchronized (C67139mm.class) {
                        ebVar = f182497g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182496e);
                            f182497g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
