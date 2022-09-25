package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.dk */
/* compiled from: PG */
public final class C51904dk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51904dk f136149d;

    /* renamed from: e */
    private static volatile C63010eb f136150e;

    /* renamed from: a */
    public int f136151a;

    /* renamed from: b */
    public boolean f136152b;

    /* renamed from: c */
    public boolean f136153c = true;

    static {
        C51904dk dkVar = new C51904dk();
        f136149d = dkVar;
        C62942bv.registerDefaultInstance(C51904dk.class, dkVar);
    }

    private C51904dk() {
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
                return newMessageInfo(f136149d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51904dk();
            case 4:
                return new C51903dj();
            case 5:
                return f136149d;
            case 6:
                C63010eb ebVar = f136150e;
                if (ebVar == null) {
                    synchronized (C51904dk.class) {
                        ebVar = f136150e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136149d);
                            f136150e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
