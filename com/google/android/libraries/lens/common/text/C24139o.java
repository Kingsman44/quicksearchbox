package com.google.android.libraries.lens.common.text;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62441br;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.common.text.o */
/* compiled from: PG */
public final class C24139o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C24139o f65907f;

    /* renamed from: g */
    private static volatile C63010eb f65908g;

    /* renamed from: a */
    public String f65909a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62441br f65910b;

    /* renamed from: c */
    public String f65911c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f65912d;

    /* renamed from: e */
    public int f65913e;

    static {
        C24139o oVar = new C24139o();
        f65907f = oVar;
        C62942bv.registerDefaultInstance(C24139o.class, oVar);
    }

    private C24139o() {
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
                return newMessageInfo(f65907f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0004\u0004\u0004\u0005Ȉ", new Object[]{"a", "b", "d", "e", C45240c.f118157a});
            case 3:
                return new C24139o();
            case 4:
                return new C24138n();
            case 5:
                return f65907f;
            case 6:
                C63010eb ebVar = f65908g;
                if (ebVar == null) {
                    synchronized (C24139o.class) {
                        ebVar = f65908g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f65907f);
                            f65908g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
