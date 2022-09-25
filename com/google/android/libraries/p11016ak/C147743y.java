package com.google.android.libraries.p11016ak;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5285d.p5290b.p5291a.p5292a.C68181bq;
import p5285d.p5290b.p5291a.p5292a.C68189by;

/* renamed from: com.google.android.libraries.ak.y */
/* compiled from: PG */
public final class C147743y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C147743y f398676f;

    /* renamed from: g */
    private static volatile C63010eb f398677g;

    /* renamed from: a */
    public C147628ai f398678a;

    /* renamed from: b */
    public C68181bq f398679b;

    /* renamed from: c */
    public C68189by f398680c;

    /* renamed from: d */
    public String f398681d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C147702d f398682e;

    static {
        C147743y yVar = new C147743y();
        f398676f = yVar;
        C62942bv.registerDefaultInstance(C147743y.class, yVar);
    }

    private C147743y() {
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
                return newMessageInfo(f398676f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0005Ȉ\u0006\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C147743y();
            case 4:
                return new C147742x();
            case 5:
                return f398676f;
            case 6:
                C63010eb ebVar = f398677g;
                if (ebVar == null) {
                    synchronized (C147743y.class) {
                        ebVar = f398677g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398676f);
                            f398677g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
