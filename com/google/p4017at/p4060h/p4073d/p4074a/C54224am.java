package com.google.p4017at.p4060h.p4073d.p4074a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.am */
/* compiled from: PG */
public final class C54224am extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54224am f142322b;

    /* renamed from: e */
    private static volatile C63010eb f142323e;

    /* renamed from: a */
    public C62995dn f142324a = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f142325c;

    /* renamed from: d */
    private C62995dn f142326d;

    static {
        C54224am amVar = new C54224am();
        f142322b = amVar;
        C62942bv.registerDefaultInstance(C54224am.class, amVar);
    }

    private C54224am() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f142325c = dnVar;
        this.f142326d = dnVar;
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
                return newMessageInfo(f142322b, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u0002࠲\u00032", new Object[]{"a", C54220ai.f142318a, "d", C54219ah.f142317a, C54218ag.f142316a, C45240c.f118157a, C54223al.f142321a});
            case 3:
                return new C54224am();
            case 4:
                return new C54217af();
            case 5:
                return f142322b;
            case 6:
                C63010eb ebVar = f142323e;
                if (ebVar == null) {
                    synchronized (C54224am.class) {
                        ebVar = f142323e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142322b);
                            f142323e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
