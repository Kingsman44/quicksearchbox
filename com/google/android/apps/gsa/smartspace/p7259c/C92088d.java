package com.google.android.apps.gsa.smartspace.p7259c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.C50706ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.smartspace.c.d */
/* compiled from: PG */
public final class C92088d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C92088d f256725d;

    /* renamed from: e */
    public static final C62940bt f256726e;

    /* renamed from: f */
    private static volatile C63010eb f256727f;

    /* renamed from: a */
    public int f256728a;

    /* renamed from: b */
    public String f256729b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C92087c f256730c;

    static {
        C92088d dVar = new C92088d();
        f256725d = dVar;
        C62942bv.registerDefaultInstance(C92088d.class, dVar);
        f256726e = C62942bv.newSingularGeneratedExtension(C50706ar.f131960a, dVar, dVar, (C62958ce) null, 318458803, C63066gd.MESSAGE, C92088d.class);
    }

    private C92088d() {
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
                return newMessageInfo(f256725d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C92088d();
            case 4:
                return new C92085a();
            case 5:
                return f256725d;
            case 6:
                C63010eb ebVar = f256727f;
                if (ebVar == null) {
                    synchronized (C92088d.class) {
                        ebVar = f256727f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256725d);
                            f256727f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
