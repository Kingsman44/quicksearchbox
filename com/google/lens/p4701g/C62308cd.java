package com.google.lens.p4701g;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4705i.p4706a.C62377h;
import com.google.lens.p4705i.p4706a.C62383n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.cd */
/* compiled from: PG */
public final class C62308cd extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62308cd f168200g;

    /* renamed from: i */
    private static volatile C63010eb f168201i;

    /* renamed from: a */
    public int f168202a;

    /* renamed from: b */
    public C62333db f168203b;

    /* renamed from: c */
    public C62324ct f168204c;

    /* renamed from: d */
    public C62383n f168205d;

    /* renamed from: e */
    public C62377h f168206e;

    /* renamed from: f */
    public C62306cb f168207f;

    /* renamed from: h */
    private byte f168208h = 2;

    static {
        C62308cd cdVar = new C62308cd();
        f168200g = cdVar;
        C62942bv.registerDefaultInstance(C62308cd.class, cdVar);
    }

    private C62308cd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168208h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168208h = b;
                return null;
            case 2:
                return newMessageInfo(f168200g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0001\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C62308cd();
            case 4:
                return new C62307cc();
            case 5:
                return f168200g;
            case 6:
                C63010eb ebVar = f168201i;
                if (ebVar == null) {
                    synchronized (C62308cd.class) {
                        ebVar = f168201i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168200g);
                            f168201i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
