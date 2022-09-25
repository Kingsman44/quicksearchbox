package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.aot;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.an */
/* compiled from: PG */
public final class C41674an extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C41674an f108986f;

    /* renamed from: h */
    private static volatile C63010eb f108987h;

    /* renamed from: a */
    public int f108988a;

    /* renamed from: b */
    public C41672al f108989b;

    /* renamed from: c */
    public C54228aq f108990c;

    /* renamed from: d */
    public int f108991d;

    /* renamed from: e */
    public String f108992e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f108993g = 2;

    static {
        C41674an anVar = new C41674an();
        f108986f = anVar;
        C62942bv.registerDefaultInstance(C41674an.class, anVar);
    }

    private C41674an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f108993g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f108993g = b;
                return null;
            case 2:
                return newMessageInfo(f108986f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", aot.f159509a, "e"});
            case 3:
                return new C41674an();
            case 4:
                return new C41673am();
            case 5:
                return f108986f;
            case 6:
                C63010eb ebVar = f108987h;
                if (ebVar == null) {
                    synchronized (C41674an.class) {
                        ebVar = f108987h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108986f);
                            f108987h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
