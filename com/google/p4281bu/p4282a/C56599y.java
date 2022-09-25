package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.y */
/* compiled from: PG */
public final class C56599y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56599y f151109e;

    /* renamed from: f */
    private static volatile C63010eb f151110f;

    /* renamed from: a */
    public int f151111a;

    /* renamed from: b */
    public String f151112b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62961ch f151113c = emptyIntList();

    /* renamed from: d */
    public int f151114d;

    static {
        C56599y yVar = new C56599y();
        f151109e = yVar;
        C62942bv.registerDefaultInstance(C56599y.class, yVar);
    }

    private C56599y() {
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
                return newMessageInfo(f151109e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003,\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56599y();
            case 4:
                return new C56598x();
            case 5:
                return f151109e;
            case 6:
                C63010eb ebVar = f151110f;
                if (ebVar == null) {
                    synchronized (C56599y.class) {
                        ebVar = f151110f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151109e);
                            f151110f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
