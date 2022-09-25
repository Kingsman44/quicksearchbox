package com.google.p4283bv.p4287b.p4288a.p4323c.p4324a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56618j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.a.d */
/* compiled from: PG */
public final class C56856d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56856d f151688e;

    /* renamed from: f */
    public static final C62940bt f151689f;

    /* renamed from: g */
    private static volatile C63010eb f151690g;

    /* renamed from: a */
    public int f151691a;

    /* renamed from: b */
    public String f151692b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151693c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56618j f151694d;

    static {
        C56856d dVar = new C56856d();
        f151688e = dVar;
        C62942bv.registerDefaultInstance(C56856d.class, dVar);
        f151689f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 320020542, C63066gd.MESSAGE, C56856d.class);
    }

    private C56856d() {
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
                return newMessageInfo(f151688e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56856d();
            case 4:
                return new C56855c();
            case 5:
                return f151688e;
            case 6:
                C63010eb ebVar = f151690g;
                if (ebVar == null) {
                    synchronized (C56856d.class) {
                        ebVar = f151690g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151688e);
                            f151690g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
