package com.google.assistant.p3897e.p3921j.p3923b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.assistant.e.j.b.c */
/* compiled from: PG */
public final class C51702c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f135628c = new C51700a();

    /* renamed from: e */
    public static final C51702c f135629e;

    /* renamed from: f */
    private static volatile C63010eb f135630f;

    /* renamed from: a */
    public int f135631a;

    /* renamed from: b */
    public C62961ch f135632b = emptyIntList();

    /* renamed from: d */
    public String f135633d = BuildConfig.FLAVOR;

    static {
        C51702c cVar = new C51702c();
        f135629e = cVar;
        C62942bv.registerDefaultInstance(C51702c.class, cVar);
    }

    private C51702c() {
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
                return newMessageInfo(f135629e, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001e\u0003ဈ\u0001", new Object[]{"a", "b", C65753ak.m96798c(), "d"});
            case 3:
                return new C51702c();
            case 4:
                return new C51701b();
            case 5:
                return f135629e;
            case 6:
                C63010eb ebVar = f135630f;
                if (ebVar == null) {
                    synchronized (C51702c.class) {
                        ebVar = f135630f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135629e);
                            f135630f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
