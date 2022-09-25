package com.google.protos.p4895aw.p4902b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.db */
/* compiled from: PG */
public final class C64046db extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C64046db f173167h;

    /* renamed from: i */
    private static volatile C63010eb f173168i;

    /* renamed from: a */
    public int f173169a;

    /* renamed from: b */
    public C64054dj f173170b;

    /* renamed from: c */
    public C64095m f173171c;

    /* renamed from: d */
    public C64098p f173172d;

    /* renamed from: e */
    public long f173173e = -1;

    /* renamed from: f */
    public int f173174f = -1;

    /* renamed from: g */
    public long f173175g = -1;

    static {
        C64046db dbVar = new C64046db();
        f173167h = dbVar;
        C62942bv.registerDefaultInstance(C64046db.class, dbVar);
    }

    private C64046db() {
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
                return newMessageInfo(f173167h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C64046db();
            case 4:
                return new C64045da();
            case 5:
                return f173167h;
            case 6:
                C63010eb ebVar = f173168i;
                if (ebVar == null) {
                    synchronized (C64046db.class) {
                        ebVar = f173168i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173167h);
                            f173168i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
