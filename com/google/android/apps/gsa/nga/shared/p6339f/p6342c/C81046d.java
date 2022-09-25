package com.google.android.apps.gsa.nga.shared.p6339f.p6342c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.c.d */
/* compiled from: PG */
public final class C81046d extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C81046d f222125k;

    /* renamed from: m */
    private static volatile C63010eb f222126m;

    /* renamed from: a */
    public int f222127a;

    /* renamed from: b */
    public boolean f222128b;

    /* renamed from: c */
    public C51334dw f222129c;

    /* renamed from: d */
    public String f222130d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f222131e;

    /* renamed from: f */
    public String f222132f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f222133g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C63088z f222134h = C63088z.f170246b;

    /* renamed from: i */
    public boolean f222135i;

    /* renamed from: j */
    public boolean f222136j;

    /* renamed from: l */
    private byte f222137l = 2;

    static {
        C81046d dVar = new C81046d();
        f222125k = dVar;
        C62942bv.registerDefaultInstance(C81046d.class, dVar);
    }

    private C81046d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f222137l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f222137l = b;
                return null;
            case 2:
                return newMessageInfo(f222125k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ည\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C81046d();
            case 4:
                return new C81045c();
            case 5:
                return f222125k;
            case 6:
                C63010eb ebVar = f222126m;
                if (ebVar == null) {
                    synchronized (C81046d.class) {
                        ebVar = f222126m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222125k);
                            f222126m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
