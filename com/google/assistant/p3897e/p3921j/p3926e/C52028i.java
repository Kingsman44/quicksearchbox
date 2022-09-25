package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.i */
/* compiled from: PG */
public final class C52028i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52028i f136556d;

    /* renamed from: e */
    private static volatile C63010eb f136557e;

    /* renamed from: a */
    public int f136558a;

    /* renamed from: b */
    public String f136559b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f136560c = BuildConfig.FLAVOR;

    static {
        C52028i iVar = new C52028i();
        f136556d = iVar;
        C62942bv.registerDefaultInstance(C52028i.class, iVar);
    }

    private C52028i() {
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
                return newMessageInfo(f136556d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52028i();
            case 4:
                return new C52001h();
            case 5:
                return f136556d;
            case 6:
                C63010eb ebVar = f136557e;
                if (ebVar == null) {
                    synchronized (C52028i.class) {
                        ebVar = f136557e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136556d);
                            f136557e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
