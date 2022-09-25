package com.google.android.apps.gsa.sidekick.main.p7219n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.sidekick.main.n.b */
/* compiled from: PG */
public final class C91476b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C91476b f255156c;

    /* renamed from: d */
    public static final C62940bt f255157d;

    /* renamed from: e */
    private static volatile C63010eb f255158e;

    /* renamed from: a */
    public int f255159a;

    /* renamed from: b */
    public String f255160b = BuildConfig.FLAVOR;

    static {
        C91476b bVar = new C91476b();
        f255156c = bVar;
        C62942bv.registerDefaultInstance(C91476b.class, bVar);
        f255157d = C62942bv.newSingularGeneratedExtension(C91000i.f254200e, bVar, bVar, (C62958ce) null, 253310860, C63066gd.MESSAGE, C91476b.class);
    }

    private C91476b() {
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
                return newMessageInfo(f255156c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C91476b();
            case 4:
                return new C91475a();
            case 5:
                return f255156c;
            case 6:
                C63010eb ebVar = f255158e;
                if (ebVar == null) {
                    synchronized (C91476b.class) {
                        ebVar = f255158e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255156c);
                            f255158e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
