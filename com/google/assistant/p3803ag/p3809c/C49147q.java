package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.q */
/* compiled from: PG */
public final class C49147q extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49147q f127093f;

    /* renamed from: g */
    private static volatile C63010eb f127094g;

    /* renamed from: a */
    public int f127095a;

    /* renamed from: b */
    public C62995dn f127096b = C62995dn.f170057a;

    /* renamed from: c */
    public long f127097c;

    /* renamed from: d */
    public long f127098d;

    /* renamed from: e */
    public long f127099e;

    static {
        C49147q qVar = new C49147q();
        f127093f = qVar;
        C62942bv.registerDefaultInstance(C49147q.class, qVar);
    }

    private C49147q() {
    }

    /* renamed from: a */
    public final C62995dn mo53219a() {
        C62995dn dnVar = this.f127096b;
        if (!dnVar.f170058b) {
            this.f127096b = dnVar.mo58980a();
        }
        return this.f127096b;
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
                return newMessageInfo(f127093f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u00012\u0002ဃ\u0000\u0003ဃ\u0001\u0004ဃ\u0002", new Object[]{"a", "b", C49146p.f127092a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C49147q();
            case 4:
                return new C49145o();
            case 5:
                return f127093f;
            case 6:
                C63010eb ebVar = f127094g;
                if (ebVar == null) {
                    synchronized (C49147q.class) {
                        ebVar = f127094g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127093f);
                            f127094g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
