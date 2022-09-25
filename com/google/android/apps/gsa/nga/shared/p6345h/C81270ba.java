package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.ba */
/* compiled from: PG */
public final class C81270ba extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C81270ba f222463g;

    /* renamed from: j */
    private static volatile C63010eb f222464j;

    /* renamed from: a */
    public C62995dn f222465a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f222466b;

    /* renamed from: c */
    public C62995dn f222467c;

    /* renamed from: d */
    public C62995dn f222468d;

    /* renamed from: e */
    public C62995dn f222469e;

    /* renamed from: f */
    public C62995dn f222470f;

    /* renamed from: h */
    private C62995dn f222471h;

    /* renamed from: i */
    private C62995dn f222472i;

    static {
        C81270ba baVar = new C81270ba();
        f222463g = baVar;
        C62942bv.registerDefaultInstance(C81270ba.class, baVar);
    }

    private C81270ba() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f222466b = dnVar;
        this.f222471h = dnVar;
        this.f222472i = dnVar;
        this.f222467c = dnVar;
        this.f222468d = dnVar;
        this.f222469e = dnVar;
        this.f222470f = dnVar;
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
                return newMessageInfo(f222463g, "\u0001\b\u0000\u0000\u0001\b\b\b\u0000\u0000\u00012\u00022\u00032\u00042\u00052\u00062\u00072\b2", new Object[]{"a", C81260ay.f222456a, "b", C81261az.f222457a, C19618h.f54585a, C81255at.f222451a, "i", C81257av.f222453a, C45240c.f118157a, C81254as.f222450a, "d", C81256au.f222452a, "e", C81258aw.f222454a, C10662f.f35572a, C81259ax.f222455a});
            case 3:
                return new C81270ba();
            case 4:
                return new C81253ar();
            case 5:
                return f222463g;
            case 6:
                C63010eb ebVar = f222464j;
                if (ebVar == null) {
                    synchronized (C81270ba.class) {
                        ebVar = f222464j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222463g);
                            f222464j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
