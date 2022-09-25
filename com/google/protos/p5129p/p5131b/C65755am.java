package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p471d.p472a.p473a.p474a.C9026h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.am */
/* compiled from: PG */
public final class C65755am extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65755am f178758e;

    /* renamed from: f */
    public static final C62940bt f178759f;

    /* renamed from: g */
    private static volatile C63010eb f178760g;

    /* renamed from: a */
    public int f178761a;

    /* renamed from: b */
    public C9026h f178762b;

    /* renamed from: c */
    public String f178763c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C52428rj f178764d;

    static {
        C65755am amVar = new C65755am();
        f178758e = amVar;
        C62942bv.registerDefaultInstance(C65755am.class, amVar);
        f178759f = C62942bv.newSingularGeneratedExtension(C65768az.f178793f, amVar, amVar, (C62958ce) null, 139, C63066gd.MESSAGE, C65755am.class);
    }

    private C65755am() {
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
                return newMessageInfo(f178758e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65755am();
            case 4:
                return new C65754al();
            case 5:
                return f178758e;
            case 6:
                C63010eb ebVar = f178760g;
                if (ebVar == null) {
                    synchronized (C65755am.class) {
                        ebVar = f178760g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178758e);
                            f178760g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
