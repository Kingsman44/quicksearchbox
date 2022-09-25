package com.google.p4017at.p4060h.p4073d.p4074a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.av */
/* compiled from: PG */
public final class C54233av extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54233av f142381d;

    /* renamed from: e */
    private static volatile C63010eb f142382e;

    /* renamed from: a */
    public int f142383a;

    /* renamed from: b */
    public int f142384b;

    /* renamed from: c */
    public C62961ch f142385c = emptyIntList();

    static {
        C54233av avVar = new C54233av();
        f142381d = avVar;
        C62942bv.registerDefaultInstance(C54233av.class, avVar);
    }

    private C54233av() {
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
                return newMessageInfo(f142381d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001d", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54233av();
            case 4:
                return new C54232au();
            case 5:
                return f142381d;
            case 6:
                C63010eb ebVar = f142382e;
                if (ebVar == null) {
                    synchronized (C54233av.class) {
                        ebVar = f142382e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142381d);
                            f142382e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
