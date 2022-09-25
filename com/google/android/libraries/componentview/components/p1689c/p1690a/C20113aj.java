package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.aj */
/* compiled from: PG */
public final class C20113aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20113aj f56368c;

    /* renamed from: e */
    private static volatile C63010eb f56369e;

    /* renamed from: a */
    public String f56370a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f56371b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f56372d;

    static {
        C20113aj ajVar = new C20113aj();
        f56368c = ajVar;
        C62942bv.registerDefaultInstance(C20113aj.class, ajVar);
    }

    private C20113aj() {
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
                return newMessageInfo(f56368c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C20113aj();
            case 4:
                return new C20112ai();
            case 5:
                return f56368c;
            case 6:
                C63010eb ebVar = f56369e;
                if (ebVar == null) {
                    synchronized (C20113aj.class) {
                        ebVar = f56369e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56368c);
                            f56369e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
