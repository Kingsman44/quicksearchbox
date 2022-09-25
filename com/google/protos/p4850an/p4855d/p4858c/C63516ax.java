package com.google.protos.p4850an.p4855d.p4858c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.d.c.ax */
/* compiled from: PG */
public final class C63516ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63516ax f171799b;

    /* renamed from: f */
    private static volatile C63010eb f171800f;

    /* renamed from: a */
    public String f171801a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f171802c;

    /* renamed from: d */
    private C63389bg f171803d;

    /* renamed from: e */
    private byte f171804e = 2;

    static {
        C63516ax axVar = new C63516ax();
        f171799b = axVar;
        C62942bv.registerDefaultInstance(C63516ax.class, axVar);
    }

    private C63516ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171804e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171804e = b;
                return null;
            case 2:
                return newMessageInfo(f171799b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "d", "a"});
            case 3:
                return new C63516ax();
            case 4:
                return new C63515aw();
            case 5:
                return f171799b;
            case 6:
                C63010eb ebVar = f171800f;
                if (ebVar == null) {
                    synchronized (C63516ax.class) {
                        ebVar = f171800f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171799b);
                            f171800f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
