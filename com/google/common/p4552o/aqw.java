package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.aqw */
/* compiled from: PG */
public final class aqw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aqw f159795c;

    /* renamed from: d */
    public static final C62940bt f159796d;

    /* renamed from: e */
    private static volatile C63010eb f159797e;

    /* renamed from: a */
    public int f159798a;

    /* renamed from: b */
    public String f159799b = BuildConfig.FLAVOR;

    static {
        aqw aqw = new aqw();
        f159795c = aqw;
        C62942bv.registerDefaultInstance(aqw.class, aqw);
        f159796d = C62942bv.newSingularGeneratedExtension(C60313nz.f163201a, aqw, aqw, (C62958ce) null, 163, C63066gd.MESSAGE, aqw.class);
    }

    private aqw() {
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
                return newMessageInfo(f159795c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqw();
            case 4:
                return new aqv();
            case 5:
                return f159795c;
            case 6:
                C63010eb ebVar = f159797e;
                if (ebVar == null) {
                    synchronized (aqw.class) {
                        ebVar = f159797e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159795c);
                            f159797e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
