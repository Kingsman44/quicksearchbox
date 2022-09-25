package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.f */
/* compiled from: PG */
public final class C91799f extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C91799f f256001h;

    /* renamed from: j */
    private static volatile C63010eb f256002j;

    /* renamed from: a */
    public int f256003a;

    /* renamed from: b */
    public C7726hr f256004b;

    /* renamed from: c */
    public int f256005c = -1;

    /* renamed from: d */
    public C7669fo f256006d;

    /* renamed from: e */
    public int f256007e;

    /* renamed from: f */
    public C7669fo f256008f;

    /* renamed from: g */
    public String f256009g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f256010i = 2;

    static {
        C91799f fVar = new C91799f();
        f256001h = fVar;
        C62942bv.registerDefaultInstance(C91799f.class, fVar);
    }

    private C91799f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f256010i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f256010i = b;
                return null;
            case 2:
                return newMessageInfo(f256001h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003ဉ\u0002\u0007ဌ\u0003\tဉ\u0004\nဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C8142xb.m22955b(), C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C91799f();
            case 4:
                return new C91798e();
            case 5:
                return f256001h;
            case 6:
                C63010eb ebVar = f256002j;
                if (ebVar == null) {
                    synchronized (C91799f.class) {
                        ebVar = f256002j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256001h);
                            f256002j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
