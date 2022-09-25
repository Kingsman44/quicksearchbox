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

/* renamed from: com.google.common.o.re */
/* compiled from: PG */
public final class C60473re extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60473re f163662j;

    /* renamed from: k */
    private static volatile C63010eb f163663k;

    /* renamed from: a */
    public int f163664a;

    /* renamed from: b */
    public int f163665b;

    /* renamed from: c */
    public long f163666c;

    /* renamed from: d */
    public long f163667d;

    /* renamed from: e */
    public int f163668e;

    /* renamed from: f */
    public int f163669f = -1;

    /* renamed from: g */
    public int f163670g = -1;

    /* renamed from: h */
    public boolean f163671h;

    /* renamed from: i */
    public boolean f163672i;

    static {
        C60473re reVar = new C60473re();
        f163662j = reVar;
        C62942bv.registerDefaultInstance(C60473re.class, reVar);
    }

    private C60473re() {
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
                return newMessageInfo(f163662j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C60473re();
            case 4:
                return new C60472rd();
            case 5:
                return f163662j;
            case 6:
                C63010eb ebVar = f163663k;
                if (ebVar == null) {
                    synchronized (C60473re.class) {
                        ebVar = f163663k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163662j);
                            f163663k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
