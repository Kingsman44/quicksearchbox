package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.fm */
/* compiled from: PG */
public final class C52107fm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52107fm f136742d;

    /* renamed from: e */
    private static volatile C63010eb f136743e;

    /* renamed from: a */
    public C62995dn f136744a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f136745b;

    /* renamed from: c */
    public C62995dn f136746c;

    static {
        C52107fm fmVar = new C52107fm();
        f136742d = fmVar;
        C62942bv.registerDefaultInstance(C52107fm.class, fmVar);
    }

    private C52107fm() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f136745b = dnVar;
        this.f136746c = dnVar;
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
                return newMessageInfo(f136742d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"a", C52105fk.f136740a, "b", C52106fl.f136741a, C45240c.f118157a, C52104fj.f136739a});
            case 3:
                return new C52107fm();
            case 4:
                return new C52098fd();
            case 5:
                return f136742d;
            case 6:
                C63010eb ebVar = f136743e;
                if (ebVar == null) {
                    synchronized (C52107fm.class) {
                        ebVar = f136743e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136742d);
                            f136743e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
