package com.google.android.libraries.p11016ak;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5285d.p5290b.p5291a.p5292a.C68181bq;

/* renamed from: com.google.android.libraries.ak.i */
/* compiled from: PG */
public final class C147727i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C147727i f398636e;

    /* renamed from: f */
    private static volatile C63010eb f398637f;

    /* renamed from: a */
    public C147628ai f398638a;

    /* renamed from: b */
    public C68181bq f398639b;

    /* renamed from: c */
    public String f398640c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f398641d;

    static {
        C147727i iVar = new C147727i();
        f398636e = iVar;
        C62942bv.registerDefaultInstance(C147727i.class, iVar);
    }

    private C147727i() {
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
                return newMessageInfo(f398636e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C147727i();
            case 4:
                return new C147726h();
            case 5:
                return f398636e;
            case 6:
                C63010eb ebVar = f398637f;
                if (ebVar == null) {
                    synchronized (C147727i.class) {
                        ebVar = f398637f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398636e);
                            f398637f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
