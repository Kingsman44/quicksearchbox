package com.google.p4283bv.p4287b.p4288a.p4323c.p4340q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae.C56646d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.q.d */
/* compiled from: PG */
public final class C56928d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56928d f151936e;

    /* renamed from: f */
    public static final C62940bt f151937f;

    /* renamed from: g */
    private static volatile C63010eb f151938g;

    /* renamed from: a */
    public int f151939a;

    /* renamed from: b */
    public String f151940b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151941c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56646d f151942d;

    static {
        C56928d dVar = new C56928d();
        f151936e = dVar;
        C62942bv.registerDefaultInstance(C56928d.class, dVar);
        f151937f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 384549906, C63066gd.MESSAGE, C56928d.class);
    }

    private C56928d() {
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
                return newMessageInfo(f151936e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56928d();
            case 4:
                return new C56927c();
            case 5:
                return f151936e;
            case 6:
                C63010eb ebVar = f151938g;
                if (ebVar == null) {
                    synchronized (C56928d.class) {
                        ebVar = f151938g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151936e);
                            f151938g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
