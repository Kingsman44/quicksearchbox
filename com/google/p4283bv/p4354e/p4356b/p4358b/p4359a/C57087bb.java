package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.bb */
/* compiled from: PG */
public final class C57087bb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57087bb f152401b;

    /* renamed from: d */
    private static volatile C63010eb f152402d;

    /* renamed from: a */
    public String f152403a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f152404c;

    static {
        C57087bb bbVar = new C57087bb();
        f152401b = bbVar;
        C62942bv.registerDefaultInstance(C57087bb.class, bbVar);
    }

    private C57087bb() {
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
                return newMessageInfo(f152401b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57087bb();
            case 4:
                return new C57086ba();
            case 5:
                return f152401b;
            case 6:
                C63010eb ebVar = f152402d;
                if (ebVar == null) {
                    synchronized (C57087bb.class) {
                        ebVar = f152402d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152401b);
                            f152402d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
