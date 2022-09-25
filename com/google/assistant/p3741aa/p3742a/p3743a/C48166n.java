package com.google.assistant.p3741aa.p3742a.p3743a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.n */
/* compiled from: PG */
public final class C48166n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48166n f124622e;

    /* renamed from: g */
    private static volatile C63010eb f124623g;

    /* renamed from: a */
    public int f124624a;

    /* renamed from: b */
    public String f124625b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f124626c;

    /* renamed from: d */
    public C48154b f124627d;

    /* renamed from: f */
    private byte f124628f = 2;

    static {
        C48166n nVar = new C48166n();
        f124622e = nVar;
        C62942bv.registerDefaultInstance(C48166n.class, nVar);
    }

    private C48166n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124628f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124628f = b;
                return null;
            case 2:
                return newMessageInfo(f124622e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C48164l.f124621a, "d"});
            case 3:
                return new C48166n();
            case 4:
                return new C48163k();
            case 5:
                return f124622e;
            case 6:
                C63010eb ebVar = f124623g;
                if (ebVar == null) {
                    synchronized (C48166n.class) {
                        ebVar = f124623g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124622e);
                            f124623g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
