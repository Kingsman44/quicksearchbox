package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.bo */
/* compiled from: PG */
public final class C20145bo extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C20145bo f56487d;

    /* renamed from: e */
    private static volatile C63010eb f56488e;

    /* renamed from: a */
    public int f56489a;

    /* renamed from: b */
    public String f56490b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f56491c = BuildConfig.FLAVOR;

    static {
        C20145bo boVar = new C20145bo();
        f56487d = boVar;
        C62942bv.registerDefaultInstance(C20145bo.class, boVar);
    }

    private C20145bo() {
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
                return newMessageInfo(f56487d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C20145bo();
            case 4:
                return new C20144bn();
            case 5:
                return f56487d;
            case 6:
                C63010eb ebVar = f56488e;
                if (ebVar == null) {
                    synchronized (C20145bo.class) {
                        ebVar = f56488e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56487d);
                            f56488e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
