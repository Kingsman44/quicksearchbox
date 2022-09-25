package com.google.protos.p4850an.p4855d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.o */
/* compiled from: PG */
public final class C63585o extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C63585o f171984i;

    /* renamed from: k */
    private static volatile C63010eb f171985k;

    /* renamed from: a */
    public int f171986a;

    /* renamed from: b */
    public int f171987b = 0;

    /* renamed from: c */
    public Object f171988c;

    /* renamed from: d */
    public int f171989d;

    /* renamed from: e */
    public C63577i f171990e;

    /* renamed from: f */
    public C63582l f171991f;

    /* renamed from: g */
    public C63563g f171992g;

    /* renamed from: h */
    public C63584n f171993h;

    /* renamed from: j */
    private byte f171994j = 2;

    static {
        C63585o oVar = new C63585o();
        f171984i = oVar;
        C62942bv.registerDefaultInstance(C63585o.class, oVar);
    }

    private C63585o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171994j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171994j = b;
                return null;
            case 2:
                return newMessageInfo(f171984i, "\u0001\u0007\u0001\u0001\u0001\n\u0007\u0000\u0000\u0001\u0001ဌ\u0000\u0002့\u0000\u0004ᐉ\u0004\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\n့\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C63554d.f171916a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C63585o();
            case 4:
                return new C63491c();
            case 5:
                return f171984i;
            case 6:
                C63010eb ebVar = f171985k;
                if (ebVar == null) {
                    synchronized (C63585o.class) {
                        ebVar = f171985k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171984i);
                            f171985k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
