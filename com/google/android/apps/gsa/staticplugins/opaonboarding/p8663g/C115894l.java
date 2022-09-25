package com.google.android.apps.gsa.staticplugins.opaonboarding.p8663g;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.g.l */
/* compiled from: PG */
public final class C115894l extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C115894l f321351j;

    /* renamed from: k */
    private static volatile C63010eb f321352k;

    /* renamed from: a */
    public int f321353a;

    /* renamed from: b */
    public boolean f321354b;

    /* renamed from: c */
    public C62995dn f321355c = C62995dn.f170057a;

    /* renamed from: d */
    public C62971cq f321356d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public boolean f321357e;

    /* renamed from: f */
    public boolean f321358f;

    /* renamed from: g */
    public boolean f321359g;

    /* renamed from: h */
    public boolean f321360h;

    /* renamed from: i */
    public boolean f321361i;

    static {
        C115894l lVar = new C115894l();
        f321351j = lVar;
        C62942bv.registerDefaultInstance(C115894l.class, lVar);
    }

    private C115894l() {
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
                return newMessageInfo(f321351j, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0001\u0000\u0001ဇ\u0000\u00022\u0003\u001a\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, C115893k.f321350a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C115894l();
            case 4:
                return new C115892j();
            case 5:
                return f321351j;
            case 6:
                C63010eb ebVar = f321352k;
                if (ebVar == null) {
                    synchronized (C115894l.class) {
                        ebVar = f321352k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f321351j);
                            f321352k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
