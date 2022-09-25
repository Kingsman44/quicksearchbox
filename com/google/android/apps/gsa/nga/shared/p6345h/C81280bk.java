package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4671b.C61826s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bk */
/* compiled from: PG */
public final class C81280bk extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C81280bk f222496l;

    /* renamed from: m */
    private static volatile C63010eb f222497m;

    /* renamed from: a */
    public int f222498a;

    /* renamed from: b */
    public boolean f222499b;

    /* renamed from: c */
    public boolean f222500c;

    /* renamed from: d */
    public boolean f222501d;

    /* renamed from: e */
    public boolean f222502e = true;

    /* renamed from: f */
    public boolean f222503f;

    /* renamed from: g */
    public int f222504g;

    /* renamed from: h */
    public boolean f222505h;

    /* renamed from: i */
    public boolean f222506i;

    /* renamed from: j */
    public boolean f222507j;

    /* renamed from: k */
    public C62995dn f222508k = C62995dn.f170057a;

    static {
        C81280bk bkVar = new C81280bk();
        f222496l = bkVar;
        C62942bv.registerDefaultInstance(C81280bk.class, bkVar);
    }

    private C81280bk() {
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
                return newMessageInfo(f222496l, "\u0001\n\u0000\u0001\u0002\f\n\u0001\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0002\u0004ဇ\u0004\u0005ဇ\u0003\u0006ဇ\u0007\u0007ဇ\b\t2\nဇ\u0001\u000bဇ\u0006\fဌ\u0005", new Object[]{"a", "b", "d", C10662f.f35572a, "e", "i", "j", C19621k.f54601a, C81279bj.f222495a, C45240c.f118157a, C19618h.f54585a, C30325g.f82003a, C61826s.m94482b()});
            case 3:
                return new C81280bk();
            case 4:
                return new C81278bi();
            case 5:
                return f222496l;
            case 6:
                C63010eb ebVar = f222497m;
                if (ebVar == null) {
                    synchronized (C81280bk.class) {
                        ebVar = f222497m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222496l);
                            f222497m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
