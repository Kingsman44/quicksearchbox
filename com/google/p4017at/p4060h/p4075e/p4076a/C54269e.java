package com.google.p4017at.p4060h.p4075e.p4076a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.e.a.e */
/* compiled from: PG */
public final class C54269e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54269e f142498d;

    /* renamed from: g */
    private static volatile C63010eb f142499g;

    /* renamed from: a */
    public C57784p f142500a;

    /* renamed from: b */
    public String f142501b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f142502c;

    /* renamed from: e */
    private int f142503e;

    /* renamed from: f */
    private byte f142504f = 2;

    static {
        C54269e eVar = new C54269e();
        f142498d = eVar;
        C62942bv.registerDefaultInstance(C54269e.class, eVar);
    }

    private C54269e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142504f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142504f = b;
                return null;
            case 2:
                return newMessageInfo(f142498d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C54269e();
            case 4:
                return new C54268d();
            case 5:
                return f142498d;
            case 6:
                C63010eb ebVar = f142499g;
                if (ebVar == null) {
                    synchronized (C54269e.class) {
                        ebVar = f142499g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142498d);
                            f142499g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
