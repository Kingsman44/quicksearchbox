package com.google.android.libraries.assistant.p1533o.p1534a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.a.b */
/* compiled from: PG */
public final class C18437b extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C18437b f52327e;

    /* renamed from: g */
    private static volatile C63010eb f52328g;

    /* renamed from: a */
    public int f52329a;

    /* renamed from: b */
    public int f52330b;

    /* renamed from: c */
    public int f52331c;

    /* renamed from: d */
    public String f52332d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f52333f = 2;

    static {
        C18437b bVar = new C18437b();
        f52327e = bVar;
        C62942bv.registerDefaultInstance(C18437b.class, bVar);
    }

    private C18437b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f52333f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f52333f = b;
                return null;
            case 2:
                return newMessageInfo(f52327e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C18437b();
            case 4:
                return new C18436a();
            case 5:
                return f52327e;
            case 6:
                C63010eb ebVar = f52328g;
                if (ebVar == null) {
                    synchronized (C18437b.class) {
                        ebVar = f52328g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52327e);
                            f52328g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
