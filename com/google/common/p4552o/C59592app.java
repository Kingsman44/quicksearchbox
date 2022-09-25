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

/* renamed from: com.google.common.o.app */
/* compiled from: PG */
public final class C59592app extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59592app f159690c;

    /* renamed from: d */
    public static final C62940bt f159691d;

    /* renamed from: e */
    private static volatile C63010eb f159692e;

    /* renamed from: a */
    public int f159693a;

    /* renamed from: b */
    public String f159694b = BuildConfig.FLAVOR;

    static {
        C59592app app = new C59592app();
        f159690c = app;
        C62942bv.registerDefaultInstance(C59592app.class, app);
        f159691d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, app, app, (C62958ce) null, 801, C63066gd.MESSAGE, C59592app.class);
    }

    private C59592app() {
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
                return newMessageInfo(f159690c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59592app();
            case 4:
                return new apo();
            case 5:
                return f159690c;
            case 6:
                C63010eb ebVar = f159692e;
                if (ebVar == null) {
                    synchronized (C59592app.class) {
                        ebVar = f159692e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159690c);
                            f159692e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
