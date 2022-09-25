package com.google.android.libraries.lens.view.srpx.p2171b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.srpx.b.b */
/* compiled from: PG */
public final class C28036b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C28036b f76306e;

    /* renamed from: f */
    private static volatile C63010eb f76307f;

    /* renamed from: a */
    public String f76308a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f76309b;

    /* renamed from: c */
    public String f76310c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f76311d;

    static {
        C28036b bVar = new C28036b();
        f76306e = bVar;
        C62942bv.registerDefaultInstance(C28036b.class, bVar);
    }

    private C28036b() {
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
                return newMessageInfo(f76306e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C28036b();
            case 4:
                return new C28035a();
            case 5:
                return f76306e;
            case 6:
                C63010eb ebVar = f76307f;
                if (ebVar == null) {
                    synchronized (C28036b.class) {
                        ebVar = f76307f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f76306e);
                            f76307f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
