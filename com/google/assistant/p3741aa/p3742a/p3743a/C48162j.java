package com.google.assistant.p3741aa.p3742a.p3743a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.j */
/* compiled from: PG */
public final class C48162j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48162j f124614e;

    /* renamed from: g */
    private static volatile C63010eb f124615g;

    /* renamed from: a */
    public int f124616a;

    /* renamed from: b */
    public String f124617b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C48154b f124618c;

    /* renamed from: d */
    public C52428rj f124619d;

    /* renamed from: f */
    private byte f124620f = 2;

    static {
        C48162j jVar = new C48162j();
        f124614e = jVar;
        C62942bv.registerDefaultInstance(C48162j.class, jVar);
    }

    private C48162j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124620f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124620f = b;
                return null;
            case 2:
                return newMessageInfo(f124614e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48162j();
            case 4:
                return new C48161i();
            case 5:
                return f124614e;
            case 6:
                C63010eb ebVar = f124615g;
                if (ebVar == null) {
                    synchronized (C48162j.class) {
                        ebVar = f124615g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124614e);
                            f124615g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
