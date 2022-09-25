package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.ar */
/* compiled from: PG */
public final class C80103ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80103ar f219810d;

    /* renamed from: e */
    private static volatile C63010eb f219811e;

    /* renamed from: a */
    public int f219812a;

    /* renamed from: b */
    public String f219813b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f219814c;

    static {
        C80103ar arVar = new C80103ar();
        f219810d = arVar;
        C62942bv.registerDefaultInstance(C80103ar.class, arVar);
    }

    private C80103ar() {
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
                return newMessageInfo(f219810d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, e.b()});
            case 3:
                return new C80103ar();
            case 4:
                return new C80102aq();
            case 5:
                return f219810d;
            case 6:
                C63010eb ebVar = f219811e;
                if (ebVar == null) {
                    synchronized (C80103ar.class) {
                        ebVar = f219811e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219810d);
                            f219811e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
