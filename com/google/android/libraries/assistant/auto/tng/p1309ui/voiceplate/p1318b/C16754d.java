package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d */
/* compiled from: PG */
public final class C16754d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C16754d f49023f;

    /* renamed from: g */
    private static volatile C63010eb f49024g;

    /* renamed from: a */
    public int f49025a;

    /* renamed from: b */
    public boolean f49026b;

    /* renamed from: c */
    public C16753c f49027c;

    /* renamed from: d */
    public C52846w f49028d;

    /* renamed from: e */
    public String f49029e = BuildConfig.FLAVOR;

    static {
        C16754d dVar = new C16754d();
        f49023f = dVar;
        C62942bv.registerDefaultInstance(C16754d.class, dVar);
    }

    private C16754d() {
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
                return newMessageInfo(f49023f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C16754d();
            case 4:
                return new C16712a();
            case 5:
                return f49023f;
            case 6:
                C63010eb ebVar = f49024g;
                if (ebVar == null) {
                    synchronized (C16754d.class) {
                        ebVar = f49024g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49023f);
                            f49024g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
