package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.gc */
/* compiled from: PG */
public final class C7684gc extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C7684gc f26842l;

    /* renamed from: n */
    private static volatile C63010eb f26843n;

    /* renamed from: a */
    public int f26844a;

    /* renamed from: b */
    public String f26845b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f26846c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f26847d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C8178yk f26848e;

    /* renamed from: f */
    public C8178yk f26849f;

    /* renamed from: g */
    public C8178yk f26850g;

    /* renamed from: h */
    public C8178yk f26851h;

    /* renamed from: i */
    public C8178yk f26852i;

    /* renamed from: j */
    public C8178yk f26853j;

    /* renamed from: k */
    public C8178yk f26854k;

    /* renamed from: m */
    private byte f26855m = 2;

    static {
        C7684gc gcVar = new C7684gc();
        f26842l = gcVar;
        C62942bv.registerDefaultInstance(C7684gc.class, gcVar);
    }

    private C7684gc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26855m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26855m = b;
                return null;
            case 2:
                return newMessageInfo(f26842l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0007\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C10662f.f35572a});
            case 3:
                return new C7684gc();
            case 4:
                return new C7683gb();
            case 5:
                return f26842l;
            case 6:
                C63010eb ebVar = f26843n;
                if (ebVar == null) {
                    synchronized (C7684gc.class) {
                        ebVar = f26843n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26842l);
                            f26843n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
