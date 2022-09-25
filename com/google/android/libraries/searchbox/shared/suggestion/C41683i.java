package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.i */
/* compiled from: PG */
public final class C41683i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C41683i f109026d;

    /* renamed from: e */
    private static volatile C63010eb f109027e;

    /* renamed from: a */
    public int f109028a;

    /* renamed from: b */
    public String f109029b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f109030c;

    static {
        C41683i iVar = new C41683i();
        f109026d = iVar;
        C62942bv.registerDefaultInstance(C41683i.class, iVar);
    }

    private C41683i() {
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
                return newMessageInfo(f109026d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C41683i();
            case 4:
                return new C41682h();
            case 5:
                return f109026d;
            case 6:
                C63010eb ebVar = f109027e;
                if (ebVar == null) {
                    synchronized (C41683i.class) {
                        ebVar = f109027e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109026d);
                            f109027e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
