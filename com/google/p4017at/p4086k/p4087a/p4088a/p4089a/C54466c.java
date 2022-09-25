package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57583b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.c */
/* compiled from: PG */
public final class C54466c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54466c f143013d;

    /* renamed from: f */
    private static volatile C63010eb f143014f;

    /* renamed from: a */
    public C57583b f143015a;

    /* renamed from: b */
    public C62995dn f143016b = C62995dn.f170057a;

    /* renamed from: c */
    public String f143017c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f143018e = 2;

    static {
        C54466c cVar = new C54466c();
        f143013d = cVar;
        C62942bv.registerDefaultInstance(C54466c.class, cVar);
    }

    private C54466c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143018e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143018e = b;
                return null;
            case 2:
                return newMessageInfo(f143013d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0001\u0001Љ\u00022\u0003Ȉ", new Object[]{"a", "b", C54465b.f143012a, C45240c.f118157a});
            case 3:
                return new C54466c();
            case 4:
                return new C54462a();
            case 5:
                return f143013d;
            case 6:
                C63010eb ebVar = f143014f;
                if (ebVar == null) {
                    synchronized (C54466c.class) {
                        ebVar = f143014f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143013d);
                            f143014f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
