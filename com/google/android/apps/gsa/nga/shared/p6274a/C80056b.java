package com.google.android.apps.gsa.nga.shared.p6274a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.b */
/* compiled from: PG */
public final class C80056b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80056b f219686c;

    /* renamed from: d */
    private static volatile C63010eb f219687d;

    /* renamed from: a */
    public String f219688a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f219689b;

    static {
        C80056b bVar = new C80056b();
        f219686c = bVar;
        C62942bv.registerDefaultInstance(C80056b.class, bVar);
    }

    private C80056b() {
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
                return newMessageInfo(f219686c, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001Ȉ\u0004\u0007", new Object[]{"a", "b"});
            case 3:
                return new C80056b();
            case 4:
                return new C80046a();
            case 5:
                return f219686c;
            case 6:
                C63010eb ebVar = f219687d;
                if (ebVar == null) {
                    synchronized (C80056b.class) {
                        ebVar = f219687d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219686c);
                            f219687d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
