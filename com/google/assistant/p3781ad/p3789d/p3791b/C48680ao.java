package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.ao */
/* compiled from: PG */
public final class C48680ao extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48680ao f125940f;

    /* renamed from: h */
    private static volatile C63010eb f125941h;

    /* renamed from: a */
    public int f125942a;

    /* renamed from: b */
    public C48708bp f125943b;

    /* renamed from: c */
    public String f125944c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f125945d;

    /* renamed from: e */
    public int f125946e;

    /* renamed from: g */
    private byte f125947g = 2;

    static {
        C48680ao aoVar = new C48680ao();
        f125940f = aoVar;
        C62942bv.registerDefaultInstance(C48680ao.class, aoVar);
    }

    private C48680ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125947g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125947g = b;
                return null;
            case 2:
                return newMessageInfo(f125940f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C48580an.m85242c(), "e", C48670ae.m85257b()});
            case 3:
                return new C48680ao();
            case 4:
                return new C48679an();
            case 5:
                return f125940f;
            case 6:
                C63010eb ebVar = f125941h;
                if (ebVar == null) {
                    synchronized (C48680ao.class) {
                        ebVar = f125941h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125940f);
                            f125941h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
