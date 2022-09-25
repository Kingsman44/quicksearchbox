package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.eh */
/* compiled from: PG */
public final class C80760eh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80760eh f221668f;

    /* renamed from: g */
    private static volatile C63010eb f221669g;

    /* renamed from: a */
    public int f221670a = 0;

    /* renamed from: b */
    public Object f221671b;

    /* renamed from: c */
    public C80736dk f221672c;

    /* renamed from: d */
    public int f221673d;

    /* renamed from: e */
    public String f221674e = BuildConfig.FLAVOR;

    static {
        C80760eh ehVar = new C80760eh();
        f221668f = ehVar;
        C62942bv.registerDefaultInstance(C80760eh.class, ehVar);
    }

    private C80760eh() {
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
                return newMessageInfo(f221668f, "\u0000\u0006\u0001\u0000\u0002\u0007\u0006\u0000\u0000\u0000\u0002\u0004\u0003<\u0000\u0004<\u0000\u0005Ȉ\u0006\t\u0007<\u0000", new Object[]{"b", "a", "d", C80747dv.class, C80756ed.class, "e", C45240c.f118157a, C80798fs.class});
            case 3:
                return new C80760eh();
            case 4:
                return new C80759eg();
            case 5:
                return f221668f;
            case 6:
                C63010eb ebVar = f221669g;
                if (ebVar == null) {
                    synchronized (C80760eh.class) {
                        ebVar = f221669g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221668f);
                            f221669g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
