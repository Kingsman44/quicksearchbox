package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48305dd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.w */
/* compiled from: PG */
public final class C80589w extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C80589w f221220i;

    /* renamed from: k */
    private static volatile C63010eb f221221k;

    /* renamed from: a */
    public int f221222a;

    /* renamed from: b */
    public String f221223b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f221224c;

    /* renamed from: d */
    public int f221225d;

    /* renamed from: e */
    public int f221226e;

    /* renamed from: f */
    public boolean f221227f;

    /* renamed from: g */
    public C63204j f221228g;

    /* renamed from: h */
    public C48305dd f221229h;

    /* renamed from: j */
    private byte f221230j = 2;

    static {
        C80589w wVar = new C80589w();
        f221220i = wVar;
        C62942bv.registerDefaultInstance(C80589w.class, wVar);
    }

    private C80589w() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221230j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221230j = b;
                return null;
            case 2:
                return newMessageInfo(f221220i, "\u0000\b\u0000\u0000\u0001\n\b\u0000\u0000\u0001\u0001\f\u0002Ȉ\u0003\f\u0005\u0003\u0007\u0004\b\u0007\tЉ\n\t", new Object[]{"a", "b", "d", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C80589w();
            case 4:
                return new C80588v();
            case 5:
                return f221220i;
            case 6:
                C63010eb ebVar = f221221k;
                if (ebVar == null) {
                    synchronized (C80589w.class) {
                        ebVar = f221221k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221220i);
                            f221221k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
