package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.s */
/* compiled from: PG */
public final class C80022s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80022s f219597d;

    /* renamed from: e */
    private static volatile C63010eb f219598e;

    /* renamed from: a */
    public int f219599a;

    /* renamed from: b */
    public String f219600b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f219601c;

    static {
        C80022s sVar = new C80022s();
        f219597d = sVar;
        C62942bv.registerDefaultInstance(C80022s.class, sVar);
    }

    private C80022s() {
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
                return newMessageInfo(f219597d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80022s();
            case 4:
                return new C80021r();
            case 5:
                return f219597d;
            case 6:
                C63010eb ebVar = f219598e;
                if (ebVar == null) {
                    synchronized (C80022s.class) {
                        ebVar = f219598e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219597d);
                            f219598e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
