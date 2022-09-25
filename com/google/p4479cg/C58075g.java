package com.google.p4479cg;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cg.g */
/* compiled from: PG */
public final class C58075g extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C58075g f155227j;

    /* renamed from: k */
    private static volatile C63010eb f155228k;

    /* renamed from: a */
    public int f155229a = 0;

    /* renamed from: b */
    public Object f155230b;

    /* renamed from: c */
    public int f155231c;

    /* renamed from: d */
    public int f155232d;

    /* renamed from: e */
    public int f155233e;

    /* renamed from: f */
    public int f155234f;

    /* renamed from: g */
    public int f155235g;

    /* renamed from: h */
    public int f155236h;

    /* renamed from: i */
    public int f155237i;

    static {
        C58075g gVar = new C58075g();
        f155227j = gVar;
        C62942bv.registerDefaultInstance(C58075g.class, gVar);
    }

    private C58075g() {
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
                return newMessageInfo(f155227j, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C62910ar.class, C58083o.class});
            case 3:
                return new C58075g();
            case 4:
                return new C58073e();
            case 5:
                return f155227j;
            case 6:
                C63010eb ebVar = f155228k;
                if (ebVar == null) {
                    synchronized (C58075g.class) {
                        ebVar = f155228k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155227j);
                            f155228k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
