package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4757ac.p4758a.C63113l;

/* renamed from: com.google.at.j.a.da */
/* compiled from: PG */
public final class C54402da extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54402da f142888d;

    /* renamed from: e */
    private static volatile C63010eb f142889e;

    /* renamed from: a */
    public int f142890a;

    /* renamed from: b */
    public C63113l f142891b;

    /* renamed from: c */
    public C62995dn f142892c = C62995dn.f170057a;

    static {
        C54402da daVar = new C54402da();
        f142888d = daVar;
        C62942bv.registerDefaultInstance(C54402da.class, daVar);
    }

    private C54402da() {
    }

    /* renamed from: a */
    public final C62995dn mo54115a() {
        C62995dn dnVar = this.f142892c;
        if (!dnVar.f170058b) {
            this.f142892c = dnVar.mo58980a();
        }
        return this.f142892c;
    }

    /* renamed from: b */
    public final boolean mo54116b(String str) {
        str.getClass();
        return this.f142892c.containsKey(str);
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
                return newMessageInfo(f142888d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\f\u0002\t\u00032", new Object[]{"a", "b", C45240c.f118157a, C54399cy.f142882a});
            case 3:
                return new C54402da();
            case 4:
                return new C54398cx();
            case 5:
                return f142888d;
            case 6:
                C63010eb ebVar = f142889e;
                if (ebVar == null) {
                    synchronized (C54402da.class) {
                        ebVar = f142889e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142888d);
                            f142889e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
