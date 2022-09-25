package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.yg */
/* compiled from: PG */
public final class C50470yg extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50470yg f131350g;

    /* renamed from: h */
    private static volatile C63010eb f131351h;

    /* renamed from: a */
    public int f131352a;

    /* renamed from: b */
    public String f131353b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131354c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f131355d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f131356e;

    /* renamed from: f */
    public boolean f131357f;

    static {
        C50470yg ygVar = new C50470yg();
        f131350g = ygVar;
        C62942bv.registerDefaultInstance(C50470yg.class, ygVar);
    }

    private C50470yg() {
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
                return newMessageInfo(f131350g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C50470yg();
            case 4:
                return new C50469yf();
            case 5:
                return f131350g;
            case 6:
                C63010eb ebVar = f131351h;
                if (ebVar == null) {
                    synchronized (C50470yg.class) {
                        ebVar = f131351h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131350g);
                            f131351h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
