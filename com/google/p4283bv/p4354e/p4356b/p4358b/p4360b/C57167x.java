package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57299d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66208dv;

/* renamed from: com.google.bv.e.b.b.b.x */
/* compiled from: PG */
public final class C57167x extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C57167x f152615e;

    /* renamed from: f */
    public static final C62940bt f152616f;

    /* renamed from: h */
    private static volatile C63010eb f152617h;

    /* renamed from: a */
    public int f152618a;

    /* renamed from: b */
    public boolean f152619b;

    /* renamed from: c */
    public C57299d f152620c;

    /* renamed from: d */
    public String f152621d = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f152622g = 2;

    static {
        C57167x xVar = new C57167x();
        f152615e = xVar;
        C62942bv.registerDefaultInstance(C57167x.class, xVar);
        f152616f = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, xVar, xVar, (C62958ce) null, 276276193, C63066gd.MESSAGE, C57167x.class);
    }

    private C57167x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152622g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152622g = b;
                return null;
            case 2:
                return newMessageInfo(f152615e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0003ᐉ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57167x();
            case 4:
                return new C57166w();
            case 5:
                return f152615e;
            case 6:
                C63010eb ebVar = f152617h;
                if (ebVar == null) {
                    synchronized (C57167x.class) {
                        ebVar = f152617h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152615e);
                            f152617h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
