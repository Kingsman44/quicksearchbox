package com.google.android.apps.p489g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.g.k */
/* compiled from: PG */
public final class C9293k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9293k f32259d;

    /* renamed from: e */
    public static final C62940bt f32260e;

    /* renamed from: f */
    private static volatile C63010eb f32261f;

    /* renamed from: a */
    public int f32262a;

    /* renamed from: b */
    public C7669fo f32263b;

    /* renamed from: c */
    public String f32264c = BuildConfig.FLAVOR;

    static {
        C9293k kVar = new C9293k();
        f32259d = kVar;
        C62942bv.registerDefaultInstance(C9293k.class, kVar);
        f32260e = C62942bv.newSingularGeneratedExtension(C91000i.f254200e, kVar, kVar, (C62958ce) null, 229953741, C63066gd.MESSAGE, C9293k.class);
    }

    private C9293k() {
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
                return newMessageInfo(f32259d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9293k();
            case 4:
                return new C9292j();
            case 5:
                return f32259d;
            case 6:
                C63010eb ebVar = f32261f;
                if (ebVar == null) {
                    synchronized (C9293k.class) {
                        ebVar = f32261f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32259d);
                            f32261f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
