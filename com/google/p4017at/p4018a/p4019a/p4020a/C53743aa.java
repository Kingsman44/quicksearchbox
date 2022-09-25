package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.aa */
/* compiled from: PG */
public final class C53743aa extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53743aa f141085f;

    /* renamed from: g */
    private static volatile C63010eb f141086g;

    /* renamed from: a */
    public int f141087a;

    /* renamed from: b */
    public C53811v f141088b;

    /* renamed from: c */
    public C53808s f141089c;

    /* renamed from: d */
    public C53815z f141090d;

    /* renamed from: e */
    public C53813x f141091e;

    static {
        C53743aa aaVar = new C53743aa();
        f141085f = aaVar;
        C62942bv.registerDefaultInstance(C53743aa.class, aaVar);
    }

    private C53743aa() {
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
                return newMessageInfo(f141085f, "\u0001\u0004\u0000\u0001\u0001\r\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0007ဉ\t\rဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C53743aa();
            case 4:
                return new C53809t();
            case 5:
                return f141085f;
            case 6:
                C63010eb ebVar = f141086g;
                if (ebVar == null) {
                    synchronized (C53743aa.class) {
                        ebVar = f141086g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141085f);
                            f141086g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
