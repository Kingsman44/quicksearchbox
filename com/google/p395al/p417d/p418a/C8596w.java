package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.al.d.a.w */
/* compiled from: PG */
public final class C8596w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8596w f29744d;

    /* renamed from: e */
    public static final C62940bt f29745e;

    /* renamed from: f */
    private static volatile C63010eb f29746f;

    /* renamed from: a */
    public int f29747a;

    /* renamed from: b */
    public int f29748b;

    /* renamed from: c */
    public String f29749c = BuildConfig.FLAVOR;

    static {
        C8596w wVar = new C8596w();
        f29744d = wVar;
        C62942bv.registerDefaultInstance(C8596w.class, wVar);
        f29745e = C62942bv.newSingularGeneratedExtension(C8523ac.f29564e, wVar, wVar, (C62958ce) null, 104, C63066gd.MESSAGE, C8596w.class);
    }

    private C8596w() {
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
                return newMessageInfo(f29744d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8596w();
            case 4:
                return new C8595v();
            case 5:
                return f29744d;
            case 6:
                C63010eb ebVar = f29746f;
                if (ebVar == null) {
                    synchronized (C8596w.class) {
                        ebVar = f29746f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29744d);
                            f29746f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
