package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aad */
/* compiled from: PG */
public final class aad extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final aad f237059j;

    /* renamed from: k */
    private static volatile C63010eb f237060k;

    /* renamed from: a */
    public int f237061a;

    /* renamed from: b */
    public boolean f237062b;

    /* renamed from: c */
    public boolean f237063c;

    /* renamed from: d */
    public boolean f237064d;

    /* renamed from: e */
    public boolean f237065e;

    /* renamed from: f */
    public boolean f237066f;

    /* renamed from: g */
    public boolean f237067g;

    /* renamed from: h */
    public C63088z f237068h = C63088z.f170246b;

    /* renamed from: i */
    public C87709ar f237069i;

    static {
        aad aad = new aad();
        f237059j = aad;
        C62942bv.registerDefaultInstance(aad.class, aad);
    }

    private aad() {
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
                return newMessageInfo(f237059j, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\rည\u0006\u000eဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new aad();
            case 4:
                return new aac();
            case 5:
                return f237059j;
            case 6:
                C63010eb ebVar = f237060k;
                if (ebVar == null) {
                    synchronized (aad.class) {
                        ebVar = f237060k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237059j);
                            f237060k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
