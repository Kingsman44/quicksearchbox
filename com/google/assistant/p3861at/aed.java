package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aed */
/* compiled from: PG */
public final class aed extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aed f129097f;

    /* renamed from: g */
    private static volatile C63010eb f129098g;

    /* renamed from: a */
    public int f129099a;

    /* renamed from: b */
    public adz f129100b;

    /* renamed from: c */
    public adz f129101c;

    /* renamed from: d */
    public aec f129102d;

    /* renamed from: e */
    public aec f129103e;

    static {
        aed aed = new aed();
        f129097f = aed;
        C62942bv.registerDefaultInstance(aed.class, aed);
    }

    private aed() {
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
                return newMessageInfo(f129097f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new aed();
            case 4:
                return new adw();
            case 5:
                return f129097f;
            case 6:
                C63010eb ebVar = f129098g;
                if (ebVar == null) {
                    synchronized (aed.class) {
                        ebVar = f129098g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129097f);
                            f129098g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
