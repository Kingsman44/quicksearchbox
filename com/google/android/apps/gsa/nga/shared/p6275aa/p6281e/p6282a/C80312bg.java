package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bg */
/* compiled from: PG */
public final class C80312bg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80312bg f220391b;

    /* renamed from: c */
    private static volatile C63010eb f220392c;

    /* renamed from: a */
    public String f220393a = BuildConfig.FLAVOR;

    static {
        C80312bg bgVar = new C80312bg();
        f220391b = bgVar;
        C62942bv.registerDefaultInstance(C80312bg.class, bgVar);
    }

    private C80312bg() {
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
                return newMessageInfo(f220391b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C80312bg();
            case 4:
                return new C80311bf();
            case 5:
                return f220391b;
            case 6:
                C63010eb ebVar = f220392c;
                if (ebVar == null) {
                    synchronized (C80312bg.class) {
                        ebVar = f220392c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220391b);
                            f220392c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
