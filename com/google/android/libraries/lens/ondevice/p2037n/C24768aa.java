package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.aa */
/* compiled from: PG */
public final class C24768aa extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C24768aa f67673g;

    /* renamed from: h */
    private static volatile C63010eb f67674h;

    /* renamed from: a */
    public int f67675a;

    /* renamed from: b */
    public boolean f67676b;

    /* renamed from: c */
    public float f67677c;

    /* renamed from: d */
    public boolean f67678d;

    /* renamed from: e */
    public boolean f67679e;

    /* renamed from: f */
    public boolean f67680f;

    static {
        C24768aa aaVar = new C24768aa();
        f67673g = aaVar;
        C62942bv.registerDefaultInstance(C24768aa.class, aaVar);
    }

    private C24768aa() {
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
                return newMessageInfo(f67673g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C24768aa();
            case 4:
                return new C24815z();
            case 5:
                return f67673g;
            case 6:
                C63010eb ebVar = f67674h;
                if (ebVar == null) {
                    synchronized (C24768aa.class) {
                        ebVar = f67674h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67673g);
                            f67674h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
