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

/* renamed from: com.google.common.o.uu */
/* compiled from: PG */
public final class C60570uu extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C60570uu f164299i;

    /* renamed from: j */
    private static volatile C63010eb f164300j;

    /* renamed from: a */
    public int f164301a;

    /* renamed from: b */
    public int f164302b;

    /* renamed from: c */
    public int f164303c;

    /* renamed from: d */
    public int f164304d;

    /* renamed from: e */
    public long f164305e;

    /* renamed from: f */
    public long f164306f;

    /* renamed from: g */
    public boolean f164307g;

    /* renamed from: h */
    public int f164308h;

    static {
        C60570uu uuVar = new C60570uu();
        f164299i = uuVar;
        C62942bv.registerDefaultInstance(C60570uu.class, uuVar);
    }

    private C60570uu() {
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
                return newMessageInfo(f164299i, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"a", "b", C60569ut.f164298a, C45240c.f118157a, C60568us.f164297a, "d", C60566uq.f164296a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C60570uu();
            case 4:
                return new C60567ur();
            case 5:
                return f164299i;
            case 6:
                C63010eb ebVar = f164300j;
                if (ebVar == null) {
                    synchronized (C60570uu.class) {
                        ebVar = f164300j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164299i);
                            f164300j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
