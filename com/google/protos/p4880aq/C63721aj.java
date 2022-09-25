package com.google.protos.p4880aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.aj */
/* compiled from: PG */
public final class C63721aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63721aj f172281b;

    /* renamed from: c */
    private static volatile C63010eb f172282c;

    /* renamed from: a */
    public C62995dn f172283a = C62995dn.f170057a;

    static {
        C63721aj ajVar = new C63721aj();
        f172281b = ajVar;
        C62942bv.registerDefaultInstance(C63721aj.class, ajVar);
    }

    private C63721aj() {
    }

    /* renamed from: a */
    public final boolean mo59234a(int i) {
        return this.f172283a.containsKey(Integer.valueOf(i));
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
                return newMessageInfo(f172281b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C63720ai.f172280a});
            case 3:
                return new C63721aj();
            case 4:
                return new C63719ah();
            case 5:
                return f172281b;
            case 6:
                C63010eb ebVar = f172282c;
                if (ebVar == null) {
                    synchronized (C63721aj.class) {
                        ebVar = f172282c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172281b);
                            f172282c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
