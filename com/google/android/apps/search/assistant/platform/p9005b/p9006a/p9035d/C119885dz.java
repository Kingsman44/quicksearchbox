package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.dz */
/* compiled from: PG */
public final class C119885dz extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C119885dz f333865f;

    /* renamed from: g */
    private static volatile C63010eb f333866g;

    /* renamed from: a */
    public int f333867a;

    /* renamed from: b */
    public String f333868b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f333869c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f333870d;

    /* renamed from: e */
    public boolean f333871e;

    static {
        C119885dz dzVar = new C119885dz();
        f333865f = dzVar;
        C62942bv.registerDefaultInstance(C119885dz.class, dzVar);
    }

    private C119885dz() {
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
                return newMessageInfo(f333865f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ဌ\u0001\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C119885dz();
            case 4:
                return new C119883dx();
            case 5:
                return f333865f;
            case 6:
                C63010eb ebVar = f333866g;
                if (ebVar == null) {
                    synchronized (C119885dz.class) {
                        ebVar = f333866g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333865f);
                            f333866g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
