package com.google.p3562ao.p3563a.p3568d;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.at */
/* compiled from: PG */
public final class C45549at extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C45549at f119037g;

    /* renamed from: i */
    private static volatile C63010eb f119038i;

    /* renamed from: a */
    public C45545ap f119039a;

    /* renamed from: b */
    public C45541al f119040b;

    /* renamed from: c */
    public C45539aj f119041c;

    /* renamed from: d */
    public C45543an f119042d;

    /* renamed from: e */
    public C45532ac f119043e;

    /* renamed from: f */
    public C45535af f119044f;

    /* renamed from: h */
    private C62995dn f119045h = C62995dn.f170057a;

    static {
        C45549at atVar = new C45549at();
        f119037g = atVar;
        C62942bv.registerDefaultInstance(C45549at.class, atVar);
    }

    private C45549at() {
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
                return newMessageInfo(f119037g, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u00052\u0006\t\u0007\t", new Object[]{"a", "b", C45240c.f118157a, "e", C19618h.f54585a, C45548as.f119036a, "d", C10662f.f35572a});
            case 3:
                return new C45549at();
            case 4:
                return new C45533ad();
            case 5:
                return f119037g;
            case 6:
                C63010eb ebVar = f119038i;
                if (ebVar == null) {
                    synchronized (C45549at.class) {
                        ebVar = f119038i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119037g);
                            f119038i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
