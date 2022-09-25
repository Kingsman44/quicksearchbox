package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.bo */
/* compiled from: PG */
public final class C55562bo extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55562bo f146595e;

    /* renamed from: g */
    private static volatile C63010eb f146596g;

    /* renamed from: a */
    public int f146597a;

    /* renamed from: b */
    public int f146598b;

    /* renamed from: c */
    public int f146599c;

    /* renamed from: d */
    public int f146600d;

    /* renamed from: f */
    private int f146601f;

    static {
        C55562bo boVar = new C55562bo();
        f146595e = boVar;
        C62942bv.registerDefaultInstance(C55562bo.class, boVar);
    }

    private C55562bo() {
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
                return newMessageInfo(f146595e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{C10662f.f35572a, "a", C55537aq.f146548a, "b", C55589y.f146681a, C45240c.f118157a, C55587w.f146680a, "d", C55559bl.f146594a});
            case 3:
                return new C55562bo();
            case 4:
                return new C55561bn();
            case 5:
                return f146595e;
            case 6:
                C63010eb ebVar = f146596g;
                if (ebVar == null) {
                    synchronized (C55562bo.class) {
                        ebVar = f146596g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146595e);
                            f146596g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
