package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.el */
/* compiled from: PG */
public final class C29388el extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C29388el f79664d;

    /* renamed from: e */
    private static volatile C63010eb f79665e;

    /* renamed from: a */
    public C62995dn f79666a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f79667b = C62995dn.f170057a;

    /* renamed from: c */
    public C62971cq f79668c = emptyProtobufList();

    static {
        C29388el elVar = new C29388el();
        f79664d = elVar;
        C62942bv.registerDefaultInstance(C29388el.class, elVar);
    }

    private C29388el() {
    }

    /* renamed from: a */
    public final C62995dn mo34701a() {
        C62995dn dnVar = this.f79666a;
        if (!dnVar.f170058b) {
            this.f79666a = dnVar.mo58980a();
        }
        return this.f79666a;
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
                return newMessageInfo(f79664d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"a", C29386ej.f79662a, "b", C29387ek.f79663a, C45240c.f118157a, C29334dr.class});
            case 3:
                return new C29388el();
            case 4:
                return new C29385ei();
            case 5:
                return f79664d;
            case 6:
                C63010eb ebVar = f79665e;
                if (ebVar == null) {
                    synchronized (C29388el.class) {
                        ebVar = f79665e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79664d);
                            f79665e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
