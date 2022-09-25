package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.yt */
/* compiled from: PG */
public final class C60677yt extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60677yt f164618d;

    /* renamed from: e */
    private static volatile C63010eb f164619e;

    /* renamed from: a */
    public int f164620a;

    /* renamed from: b */
    public String f164621b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f164622c;

    static {
        C60677yt ytVar = new C60677yt();
        f164618d = ytVar;
        C62942bv.registerDefaultInstance(C60677yt.class, ytVar);
    }

    private C60677yt() {
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
                return newMessageInfo(f164618d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60677yt();
            case 4:
                return new C60676ys();
            case 5:
                return f164618d;
            case 6:
                C63010eb ebVar = f164619e;
                if (ebVar == null) {
                    synchronized (C60677yt.class) {
                        ebVar = f164619e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164618d);
                            f164619e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
