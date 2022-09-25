package com.google.p395al.p408c.p411b.p412a.p413a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.b.a.a.b */
/* compiled from: PG */
public final class C8450b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8450b f29357d;

    /* renamed from: e */
    private static volatile C63010eb f29358e;

    /* renamed from: a */
    public String f29359a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f29360b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f29361c = BuildConfig.FLAVOR;

    static {
        C8450b bVar = new C8450b();
        f29357d = bVar;
        C62942bv.registerDefaultInstance(C8450b.class, bVar);
    }

    private C8450b() {
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
                return newMessageInfo(f29357d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8450b();
            case 4:
                return new C8449a();
            case 5:
                return f29357d;
            case 6:
                C63010eb ebVar = f29358e;
                if (ebVar == null) {
                    synchronized (C8450b.class) {
                        ebVar = f29358e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29357d);
                            f29358e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
