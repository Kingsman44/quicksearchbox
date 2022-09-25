package com.google.protos.p4985f.p5030q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ax */
/* compiled from: PG */
public final class C65011ax extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65011ax f176055d;

    /* renamed from: e */
    private static volatile C63010eb f176056e;

    /* renamed from: a */
    public int f176057a;

    /* renamed from: b */
    public C52236kg f176058b;

    /* renamed from: c */
    public ade f176059c;

    static {
        C65011ax axVar = new C65011ax();
        f176055d = axVar;
        C62942bv.registerDefaultInstance(C65011ax.class, axVar);
    }

    private C65011ax() {
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
                return newMessageInfo(f176055d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65011ax();
            case 4:
                return new C65010aw();
            case 5:
                return f176055d;
            case 6:
                C63010eb ebVar = f176056e;
                if (ebVar == null) {
                    synchronized (C65011ax.class) {
                        ebVar = f176056e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176055d);
                            f176056e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
