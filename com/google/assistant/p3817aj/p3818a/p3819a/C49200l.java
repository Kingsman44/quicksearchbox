package com.google.assistant.p3817aj.p3818a.p3819a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.aj.a.a.l */
/* compiled from: PG */
public final class C49200l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49200l f127214b;

    /* renamed from: c */
    public static final C62940bt f127215c;

    /* renamed from: e */
    private static volatile C63010eb f127216e;

    /* renamed from: a */
    public String f127217a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f127218d;

    static {
        C49200l lVar = new C49200l();
        f127214b = lVar;
        C62942bv.registerDefaultInstance(C49200l.class, lVar);
        f127215c = C62942bv.newSingularGeneratedExtension(C79890l.f218968e, lVar, lVar, (C62958ce) null, 283369816, C63066gd.MESSAGE, C49200l.class);
    }

    private C49200l() {
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
                return newMessageInfo(f127214b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "a"});
            case 3:
                return new C49200l();
            case 4:
                return new C49199k();
            case 5:
                return f127214b;
            case 6:
                C63010eb ebVar = f127216e;
                if (ebVar == null) {
                    synchronized (C49200l.class) {
                        ebVar = f127216e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127214b);
                            f127216e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
