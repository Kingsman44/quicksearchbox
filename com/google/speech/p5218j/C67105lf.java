package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.lf */
/* compiled from: PG */
public final class C67105lf extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C67105lf f182433a;

    /* renamed from: c */
    private static volatile C63010eb f182434c;

    /* renamed from: b */
    private byte f182435b = 2;

    static {
        C67105lf lfVar = new C67105lf();
        f182433a = lfVar;
        C62942bv.registerDefaultInstance(C67105lf.class, lfVar);
    }

    private C67105lf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182435b);
            case 1:
                this.f182435b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f182433a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67105lf();
            case 4:
                return new C67104le();
            case 5:
                return f182433a;
            case 6:
                C63010eb ebVar = f182434c;
                if (ebVar == null) {
                    synchronized (C67105lf.class) {
                        ebVar = f182434c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182433a);
                            f182434c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
