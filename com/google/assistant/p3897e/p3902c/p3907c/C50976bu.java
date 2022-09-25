package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.bu */
/* compiled from: PG */
public final class C50976bu extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50976bu f132703h;

    /* renamed from: j */
    private static volatile C63010eb f132704j;

    /* renamed from: a */
    public int f132705a;

    /* renamed from: b */
    public String f132706b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52393qb f132707c;

    /* renamed from: d */
    public boolean f132708d;

    /* renamed from: e */
    public C51016dg f132709e;

    /* renamed from: f */
    public String f132710f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f132711g;

    /* renamed from: i */
    private byte f132712i = 2;

    static {
        C50976bu buVar = new C50976bu();
        f132703h = buVar;
        C62942bv.registerDefaultInstance(C50976bu.class, buVar);
    }

    private C50976bu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132712i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132712i = b;
                return null;
            case 2:
                return newMessageInfo(f132703h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဇ\u0003\u0004ᐉ\u0004\u0005ဉ\u0002\u0006ဈ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", "d", "e", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, C50974bs.f132702a});
            case 3:
                return new C50976bu();
            case 4:
                return new C50973br();
            case 5:
                return f132703h;
            case 6:
                C63010eb ebVar = f132704j;
                if (ebVar == null) {
                    synchronized (C50976bu.class) {
                        ebVar = f132704j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132703h);
                            f132704j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
