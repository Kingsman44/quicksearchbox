package com.google.android.libraries.gsa.monet.internal.shared.p1890b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.internal.shared.b.b */
/* compiled from: PG */
public final class C23035b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C23035b f63367e;

    /* renamed from: f */
    private static volatile C63010eb f63368f;

    /* renamed from: a */
    public int f63369a;

    /* renamed from: b */
    public String f63370b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f63371c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f63372d = BuildConfig.FLAVOR;

    static {
        C23035b bVar = new C23035b();
        f63367e = bVar;
        C62942bv.registerDefaultInstance(C23035b.class, bVar);
    }

    private C23035b() {
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
                return newMessageInfo(f63367e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C23035b();
            case 4:
                return new C23034a();
            case 5:
                return f63367e;
            case 6:
                C63010eb ebVar = f63368f;
                if (ebVar == null) {
                    synchronized (C23035b.class) {
                        ebVar = f63368f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63367e);
                            f63368f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
