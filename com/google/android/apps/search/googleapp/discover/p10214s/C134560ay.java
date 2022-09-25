package com.google.android.apps.search.googleapp.discover.p10214s;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p4283bv.p4354e.C57051b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57118ab;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57208n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57216v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.ay */
/* compiled from: PG */
public final class C134560ay extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C134560ay f366453g;

    /* renamed from: i */
    private static volatile C63010eb f366454i;

    /* renamed from: a */
    public int f366455a;

    /* renamed from: b */
    public int f366456b = 0;

    /* renamed from: c */
    public Object f366457c;

    /* renamed from: d */
    public String f366458d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C60220t f366459e;

    /* renamed from: f */
    public C57051b f366460f;

    /* renamed from: h */
    private byte f366461h = 2;

    static {
        C134560ay ayVar = new C134560ay();
        f366453g = ayVar;
        C62942bv.registerDefaultInstance(C134560ay.class, ayVar);
    }

    private C134560ay() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366461h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366461h = b;
                return null;
            case 2:
                return newMessageInfo(f366453g, "\u0001\u000b\u0001\u0001\u0001\u0015\u000b\u0000\u0000\u0005\u0001ဈ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0007ြ\u0000\bᐉ\u0001\u0010ᐼ\u0000\u0012ြ\u0000\u0013ြ\u0000\u0014ᐉ\u0002\u0015ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C134544ai.class, C134546ak.class, C57216v.class, C57208n.class, "e", C57118ab.class, C134587e.class, C134550ao.class, C10662f.f35572a, C134575bm.class});
            case 3:
                return new C134560ay();
            case 4:
                return new C134559ax();
            case 5:
                return f366453g;
            case 6:
                C63010eb ebVar = f366454i;
                if (ebVar == null) {
                    synchronized (C134560ay.class) {
                        ebVar = f366454i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366453g);
                            f366454i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
