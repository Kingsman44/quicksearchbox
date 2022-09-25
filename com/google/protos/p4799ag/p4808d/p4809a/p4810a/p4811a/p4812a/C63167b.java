package com.google.protos.p4799ag.p4808d.p4809a.p4810a.p4811a.p4812a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66244fd;

/* renamed from: com.google.protos.ag.d.a.a.a.a.b */
/* compiled from: PG */
public final class C63167b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63167b f170561b;

    /* renamed from: c */
    public static final C62940bt f170562c;

    /* renamed from: e */
    private static volatile C63010eb f170563e;

    /* renamed from: a */
    public String f170564a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f170565d;

    static {
        C63167b bVar = new C63167b();
        f170561b = bVar;
        C62942bv.registerDefaultInstance(C63167b.class, bVar);
        f170562c = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, bVar, bVar, (C62958ce) null, 317322567, C63066gd.MESSAGE, C63167b.class);
    }

    private C63167b() {
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
                return newMessageInfo(f170561b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C63167b();
            case 4:
                return new C63166a();
            case 5:
                return f170561b;
            case 6:
                C63010eb ebVar = f170563e;
                if (ebVar == null) {
                    synchronized (C63167b.class) {
                        ebVar = f170563e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170561b);
                            f170563e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
