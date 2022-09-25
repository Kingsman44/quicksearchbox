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

/* renamed from: com.google.common.o.ach */
/* compiled from: PG */
public final class ach extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final ach f158293j;

    /* renamed from: k */
    private static volatile C63010eb f158294k;

    /* renamed from: a */
    public int f158295a;

    /* renamed from: b */
    public boolean f158296b;

    /* renamed from: c */
    public boolean f158297c;

    /* renamed from: d */
    public boolean f158298d;

    /* renamed from: e */
    public boolean f158299e;

    /* renamed from: f */
    public boolean f158300f;

    /* renamed from: g */
    public int f158301g;

    /* renamed from: h */
    public boolean f158302h;

    /* renamed from: i */
    public int f158303i;

    static {
        ach ach = new ach();
        f158293j = ach;
        C62942bv.registerDefaultInstance(ach.class, ach);
    }

    private ach() {
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
                return newMessageInfo(f158293j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006\bဌ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C60697zm.m92635b()});
            case 3:
                return new ach();
            case 4:
                return new acg();
            case 5:
                return f158293j;
            case 6:
                C63010eb ebVar = f158294k;
                if (ebVar == null) {
                    synchronized (ach.class) {
                        ebVar = f158294k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158293j);
                            f158294k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
