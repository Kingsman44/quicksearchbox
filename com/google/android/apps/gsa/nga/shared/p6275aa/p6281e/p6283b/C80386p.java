package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.p */
/* compiled from: PG */
public final class C80386p extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C80386p f220578g;

    /* renamed from: i */
    private static volatile C63010eb f220579i;

    /* renamed from: a */
    public C80373c f220580a;

    /* renamed from: b */
    public C80385o f220581b;

    /* renamed from: c */
    public C80383m f220582c;

    /* renamed from: d */
    public C80377g f220583d;

    /* renamed from: e */
    public C80381k f220584e;

    /* renamed from: f */
    public C80379i f220585f;

    /* renamed from: h */
    private byte f220586h = 2;

    static {
        C80386p pVar = new C80386p();
        f220578g = pVar;
        C62942bv.registerDefaultInstance(C80386p.class, pVar);
    }

    private C80386p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220586h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220586h = b;
                return null;
            case 2:
                return newMessageInfo(f220578g, "\u0000\u0006\u0000\u0000\u0006\f\u0006\u0000\u0000\u0002\u0006\t\u0007\t\b\t\tЉ\nЉ\f\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C80386p();
            case 4:
                return new C80371a();
            case 5:
                return f220578g;
            case 6:
                C63010eb ebVar = f220579i;
                if (ebVar == null) {
                    synchronized (C80386p.class) {
                        ebVar = f220579i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220578g);
                            f220579i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
