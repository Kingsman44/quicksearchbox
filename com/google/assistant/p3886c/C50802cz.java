package com.google.assistant.p3886c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.cz */
/* compiled from: PG */
public final class C50802cz extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50802cz f132236g;

    /* renamed from: h */
    private static volatile C63010eb f132237h;

    /* renamed from: a */
    public int f132238a;

    /* renamed from: b */
    public C50723h f132239b;

    /* renamed from: c */
    public C50723h f132240c;

    /* renamed from: d */
    public C50723h f132241d;

    /* renamed from: e */
    public C50723h f132242e;

    /* renamed from: f */
    public C50723h f132243f;

    static {
        C50802cz czVar = new C50802cz();
        f132236g = czVar;
        C62942bv.registerDefaultInstance(C50802cz.class, czVar);
    }

    private C50802cz() {
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
                return newMessageInfo(f132236g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0004\u0004ဉ\u0001\u0005ဉ\u0003", new Object[]{"a", "b", "d", C10662f.f35572a, C45240c.f118157a, "e"});
            case 3:
                return new C50802cz();
            case 4:
                return new C50801cy();
            case 5:
                return f132236g;
            case 6:
                C63010eb ebVar = f132237h;
                if (ebVar == null) {
                    synchronized (C50802cz.class) {
                        ebVar = f132237h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132236g);
                            f132237h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
