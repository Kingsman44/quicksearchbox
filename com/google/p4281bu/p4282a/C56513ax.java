package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.ax */
/* compiled from: PG */
public final class C56513ax extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56513ax f150922d;

    /* renamed from: e */
    private static volatile C63010eb f150923e;

    /* renamed from: a */
    public int f150924a;

    /* renamed from: b */
    public int f150925b;

    /* renamed from: c */
    public String f150926c = BuildConfig.FLAVOR;

    static {
        C56513ax axVar = new C56513ax();
        f150922d = axVar;
        C62942bv.registerDefaultInstance(C56513ax.class, axVar);
    }

    private C56513ax() {
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
                return newMessageInfo(f150922d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56513ax();
            case 4:
                return new C56512aw();
            case 5:
                return f150922d;
            case 6:
                C63010eb ebVar = f150923e;
                if (ebVar == null) {
                    synchronized (C56513ax.class) {
                        ebVar = f150923e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150922d);
                            f150923e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
