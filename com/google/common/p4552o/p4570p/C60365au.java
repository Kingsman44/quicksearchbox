package com.google.common.p4552o.p4570p;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.au */
/* compiled from: PG */
public final class C60365au extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60365au f163371j;

    /* renamed from: k */
    private static volatile C63010eb f163372k;

    /* renamed from: a */
    public int f163373a;

    /* renamed from: b */
    public long f163374b;

    /* renamed from: c */
    public long f163375c;

    /* renamed from: d */
    public long f163376d;

    /* renamed from: e */
    public long f163377e;

    /* renamed from: f */
    public long f163378f;

    /* renamed from: g */
    public long f163379g;

    /* renamed from: h */
    public long f163380h;

    /* renamed from: i */
    public long f163381i;

    static {
        C60365au auVar = new C60365au();
        f163371j = auVar;
        C62942bv.registerDefaultInstance(C60365au.class, auVar);
    }

    private C60365au() {
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
                return newMessageInfo(f163371j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0003\u0003ဂ\u0004\u0004ဂ\u0005\u0005ဂ\u0006\u0006ဂ\u0007\u0007ဂ\u0001\bဂ\u0002", new Object[]{"a", "b", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C45240c.f118157a, "d"});
            case 3:
                return new C60365au();
            case 4:
                return new C60364at();
            case 5:
                return f163371j;
            case 6:
                C63010eb ebVar = f163372k;
                if (ebVar == null) {
                    synchronized (C60365au.class) {
                        ebVar = f163372k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163371j);
                            f163372k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
