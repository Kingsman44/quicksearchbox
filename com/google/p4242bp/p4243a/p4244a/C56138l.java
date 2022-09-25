package com.google.p4242bp.p4243a.p4244a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.a.l */
/* compiled from: PG */
public final class C56138l extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C56138l f149554i;

    /* renamed from: j */
    private static volatile C63010eb f149555j;

    /* renamed from: a */
    public int f149556a;

    /* renamed from: b */
    public int f149557b;

    /* renamed from: c */
    public C56133g f149558c;

    /* renamed from: d */
    public int f149559d;

    /* renamed from: e */
    public int f149560e;

    /* renamed from: f */
    public int f149561f;

    /* renamed from: g */
    public boolean f149562g;

    /* renamed from: h */
    public int f149563h;

    static {
        C56138l lVar = new C56138l();
        f149554i = lVar;
        C62942bv.registerDefaultInstance(C56138l.class, lVar);
    }

    private C56138l() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f149554i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0005ဋ\u0003\u0006င\u0004\u0007ဇ\u0006\bဌ\u0007", new Object[]{"a", "b", C56135i.f149553a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C56131e.f149544a});
            case 3:
                return new C56138l();
            case 4:
                return new C56137k();
            case 5:
                return f149554i;
            case 6:
                C63010eb ebVar = f149555j;
                if (ebVar == null) {
                    synchronized (C56138l.class) {
                        ebVar = f149555j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149554i);
                            f149555j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
