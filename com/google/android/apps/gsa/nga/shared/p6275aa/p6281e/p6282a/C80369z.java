package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.z */
/* compiled from: PG */
public final class C80369z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80369z f220525c;

    /* renamed from: d */
    private static volatile C63010eb f220526d;

    /* renamed from: a */
    public String f220527a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f220528b;

    static {
        C80369z zVar = new C80369z();
        f220525c = zVar;
        C62942bv.registerDefaultInstance(C80369z.class, zVar);
    }

    private C80369z() {
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
                return newMessageInfo(f220525c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C80369z();
            case 4:
                return new C80368y();
            case 5:
                return f220525c;
            case 6:
                C63010eb ebVar = f220526d;
                if (ebVar == null) {
                    synchronized (C80369z.class) {
                        ebVar = f220526d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220525c);
                            f220526d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
