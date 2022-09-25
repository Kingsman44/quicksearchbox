package com.google.protos.p5146w.p5147a.p5148a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p5146w.p5149b.p5157c.C65953c;

/* renamed from: com.google.protos.w.a.a.h */
/* compiled from: PG */
public final class C65930h extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C65930h f179300i;

    /* renamed from: k */
    private static volatile C63010eb f179301k;

    /* renamed from: a */
    public int f179302a;

    /* renamed from: b */
    public String f179303b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C65928f f179304c;

    /* renamed from: d */
    public C65928f f179305d;

    /* renamed from: e */
    public String f179306e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f179307f;

    /* renamed from: g */
    public String f179308g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f179309h;

    /* renamed from: j */
    private byte f179310j = 2;

    static {
        C65930h hVar = new C65930h();
        f179300i = hVar;
        C62942bv.registerDefaultInstance(C65930h.class, hVar);
    }

    private C65930h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179310j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179310j = b;
                return null;
            case 2:
                return newMessageInfo(f179300i, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0004\u0005ဈ\u0007\u0006ဌ\b\u0007ဈ\t\tဇ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C65953c.f179385a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C65930h();
            case 4:
                return new C65929g();
            case 5:
                return f179300i;
            case 6:
                C63010eb ebVar = f179301k;
                if (ebVar == null) {
                    synchronized (C65930h.class) {
                        ebVar = f179301k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179300i);
                            f179301k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
