package com.google.android.apps.search.googleapp.discover.p10214s;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.ak */
/* compiled from: PG */
public final class C134546ak extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C134546ak f366404f;

    /* renamed from: h */
    private static volatile C63010eb f366405h;

    /* renamed from: a */
    public int f366406a;

    /* renamed from: b */
    public int f366407b = 0;

    /* renamed from: c */
    public Object f366408c;

    /* renamed from: d */
    public String f366409d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f366410e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f366411g = 2;

    static {
        C134546ak akVar = new C134546ak();
        f366404f = akVar;
        C62942bv.registerDefaultInstance(C134546ak.class, akVar);
    }

    private C134546ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366411g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366411g = b;
                return null;
            case 2:
                return newMessageInfo(f366404f, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0005ᐼ\u0000\u0006ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C57315dp.class, C57315dp.class});
            case 3:
                return new C134546ak();
            case 4:
                return new C134545aj();
            case 5:
                return f366404f;
            case 6:
                C63010eb ebVar = f366405h;
                if (ebVar == null) {
                    synchronized (C134546ak.class) {
                        ebVar = f366405h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366404f);
                            f366405h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
