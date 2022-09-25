package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.d */
/* compiled from: PG */
public final class C59712d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59712d f160227d;

    /* renamed from: e */
    public static final C62940bt f160228e;

    /* renamed from: f */
    private static volatile C63010eb f160229f;

    /* renamed from: a */
    public int f160230a;

    /* renamed from: b */
    public String f160231b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f160232c = BuildConfig.FLAVOR;

    static {
        C59712d dVar = new C59712d();
        f160227d = dVar;
        C62942bv.registerDefaultInstance(C59712d.class, dVar);
        f160228e = C62942bv.newSingularGeneratedExtension(aqs.f159780k, dVar, dVar, (C62958ce) null, 652, C63066gd.MESSAGE, C59712d.class);
    }

    private C59712d() {
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
                return newMessageInfo(f160227d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59712d();
            case 4:
                return new C59673c();
            case 5:
                return f160227d;
            case 6:
                C63010eb ebVar = f160229f;
                if (ebVar == null) {
                    synchronized (C59712d.class) {
                        ebVar = f160229f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160227d);
                            f160229f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
