package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.gl */
/* compiled from: PG */
public final class C65232gl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65232gl f176518b;

    /* renamed from: d */
    private static volatile C63010eb f176519d;

    /* renamed from: a */
    public String f176520a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f176521c;

    static {
        C65232gl glVar = new C65232gl();
        f176518b = glVar;
        C62942bv.registerDefaultInstance(C65232gl.class, glVar);
    }

    private C65232gl() {
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
                return newMessageInfo(f176518b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65232gl();
            case 4:
                return new C65231gk();
            case 5:
                return f176518b;
            case 6:
                C63010eb ebVar = f176519d;
                if (ebVar == null) {
                    synchronized (C65232gl.class) {
                        ebVar = f176519d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176518b);
                            f176519d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
