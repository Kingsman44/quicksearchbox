package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ak */
/* compiled from: PG */
public final class C57359ak extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C57359ak f153233f;

    /* renamed from: h */
    private static volatile C63010eb f153234h;

    /* renamed from: a */
    public int f153235a;

    /* renamed from: b */
    public int f153236b = 0;

    /* renamed from: c */
    public Object f153237c;

    /* renamed from: d */
    public String f153238d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C57385bj f153239e;

    /* renamed from: g */
    private byte f153240g = 2;

    static {
        C57359ak akVar = new C57359ak();
        f153233f = akVar;
        C62942bv.registerDefaultInstance(C57359ak.class, akVar);
    }

    private C57359ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153240g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153240g = b;
                return null;
            case 2:
                return newMessageInfo(f153233f, "\u0001\u000f\u0001\u0001\u0001\u0011\u000f\u0000\u0000\t\u0001ဈ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0007ျ\u0000\bᐼ\u0000\tြ\u0000\nᐼ\u0000\u000bᐼ\u0000\rဿ\u0000\u000eᐉ\u000e\u000fᐼ\u0000\u0010ျ\u0000\u0011ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C57366ar.class, C57492fi.class, C57488fe.class, C57414cl.class, C57394bs.class, C57381bf.class, C57501i.class, C57457ea.class, C57398bw.f153322a, "e", C57369au.class, C57418cp.class});
            case 3:
                return new C57359ak();
            case 4:
                return new C57358aj();
            case 5:
                return f153233f;
            case 6:
                C63010eb ebVar = f153234h;
                if (ebVar == null) {
                    synchronized (C57359ak.class) {
                        ebVar = f153234h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153233f);
                            f153234h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
