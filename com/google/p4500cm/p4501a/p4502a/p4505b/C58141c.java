package com.google.p4500cm.p4501a.p4502a.p4505b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.a.a.b.c */
/* compiled from: PG */
public final class C58141c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C58141c f155430a;

    /* renamed from: g */
    private static volatile C63010eb f155431g;

    /* renamed from: b */
    private int f155432b;

    /* renamed from: c */
    private String f155433c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f155434d = 1;

    /* renamed from: e */
    private int f155435e;

    /* renamed from: f */
    private byte f155436f = 2;

    static {
        C58141c cVar = new C58141c();
        f155430a = cVar;
        C62942bv.registerDefaultInstance(C58141c.class, cVar);
    }

    private C58141c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155436f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155436f = b;
                return null;
            case 2:
                return newMessageInfo(f155430a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔌ\u0001\u0003ᔌ\u0002", new Object[]{"b", C45240c.f118157a, "d", C58142d.f155437a, "e", C58139a.f155429a});
            case 3:
                return new C58141c();
            case 4:
                return new C58140b();
            case 5:
                return f155430a;
            case 6:
                C63010eb ebVar = f155431g;
                if (ebVar == null) {
                    synchronized (C58141c.class) {
                        ebVar = f155431g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155430a);
                            f155431g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
