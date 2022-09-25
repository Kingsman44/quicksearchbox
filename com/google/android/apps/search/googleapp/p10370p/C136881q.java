package com.google.android.apps.search.googleapp.p10370p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.p.q */
/* compiled from: PG */
public final class C136881q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136881q f372552c;

    /* renamed from: d */
    private static volatile C63010eb f372553d;

    /* renamed from: a */
    public C62995dn f372554a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f372555b = C62995dn.f170057a;

    static {
        C136881q qVar = new C136881q();
        f372552c = qVar;
        C62942bv.registerDefaultInstance(C136881q.class, qVar);
    }

    private C136881q() {
    }

    /* renamed from: a */
    public final C62995dn mo113422a() {
        C62995dn dnVar = this.f372555b;
        if (!dnVar.f170058b) {
            this.f372555b = dnVar.mo58980a();
        }
        return this.f372555b;
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
                return newMessageInfo(f372552c, "\u0001\u0002\u0000\u0000\u0005\u0006\u0002\u0002\u0000\u0000\u00052\u00062", new Object[]{"a", C136880p.f372551a, "b", C136878n.f372550a});
            case 3:
                return new C136881q();
            case 4:
                return new C136879o();
            case 5:
                return f372552c;
            case 6:
                C63010eb ebVar = f372553d;
                if (ebVar == null) {
                    synchronized (C136881q.class) {
                        ebVar = f372553d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372552c);
                            f372553d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
