package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.cw */
/* compiled from: PG */
public final class C59708cw extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C59708cw f160195j;

    /* renamed from: k */
    private static volatile C63010eb f160196k;

    /* renamed from: a */
    public int f160197a;

    /* renamed from: b */
    public boolean f160198b;

    /* renamed from: c */
    public int f160199c;

    /* renamed from: d */
    public int f160200d;

    /* renamed from: e */
    public boolean f160201e;

    /* renamed from: f */
    public boolean f160202f;

    /* renamed from: g */
    public boolean f160203g;

    /* renamed from: h */
    public int f160204h;

    /* renamed from: i */
    public double f160205i;

    static {
        C59708cw cwVar = new C59708cw();
        f160195j = cwVar;
        C62942bv.registerDefaultInstance(C59708cw.class, cwVar);
    }

    private C59708cw() {
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
                return newMessageInfo(f160195j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဌ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဌ\u0007\tက\b", new Object[]{"a", "b", C45240c.f118157a, C59705ct.f160193a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C59707cv.f160194a, "i"});
            case 3:
                return new C59708cw();
            case 4:
                return new C59706cu();
            case 5:
                return f160195j;
            case 6:
                C63010eb ebVar = f160196k;
                if (ebVar == null) {
                    synchronized (C59708cw.class) {
                        ebVar = f160196k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160195j);
                            f160196k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
