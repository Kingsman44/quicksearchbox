package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.c */
/* compiled from: PG */
public final class C80373c extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C80373c f220529m;

    /* renamed from: n */
    private static volatile C63010eb f220530n;

    /* renamed from: a */
    public boolean f220531a;

    /* renamed from: b */
    public boolean f220532b;

    /* renamed from: c */
    public boolean f220533c;

    /* renamed from: d */
    public boolean f220534d;

    /* renamed from: e */
    public boolean f220535e;

    /* renamed from: f */
    public boolean f220536f;

    /* renamed from: g */
    public boolean f220537g;

    /* renamed from: h */
    public boolean f220538h;

    /* renamed from: i */
    public int f220539i;

    /* renamed from: j */
    public boolean f220540j;

    /* renamed from: k */
    public boolean f220541k;

    /* renamed from: l */
    public boolean f220542l;

    static {
        C80373c cVar = new C80373c();
        f220529m = cVar;
        C62942bv.registerDefaultInstance(C80373c.class, cVar);
    }

    private C80373c() {
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
                return newMessageInfo(f220529m, "\u0000\f\u0000\u0000\u0001\u000f\f\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\t\u0007\n\u0004\u000b\u0007\u000e\u0007\u000f\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, C10662f.f35572a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C80373c();
            case 4:
                return new C80372b();
            case 5:
                return f220529m;
            case 6:
                C63010eb ebVar = f220530n;
                if (ebVar == null) {
                    synchronized (C80373c.class) {
                        ebVar = f220530n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220529m);
                            f220530n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
