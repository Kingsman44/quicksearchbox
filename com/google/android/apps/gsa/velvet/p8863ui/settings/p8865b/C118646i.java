package com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.b.i */
/* compiled from: PG */
public final class C118646i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C118646i f330994d;

    /* renamed from: e */
    private static volatile C63010eb f330995e;

    /* renamed from: a */
    public int f330996a;

    /* renamed from: b */
    public String f330997b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f330998c = BuildConfig.FLAVOR;

    static {
        C118646i iVar = new C118646i();
        f330994d = iVar;
        C62942bv.registerDefaultInstance(C118646i.class, iVar);
    }

    private C118646i() {
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
                return newMessageInfo(f330994d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C118646i();
            case 4:
                return new C118645h();
            case 5:
                return f330994d;
            case 6:
                C63010eb ebVar = f330995e;
                if (ebVar == null) {
                    synchronized (C118646i.class) {
                        ebVar = f330995e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330994d);
                            f330995e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
