package com.google.p4283bv.p4287b.p4288a.p4323c.p4325b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4298c.C56670d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.b.d */
/* compiled from: PG */
public final class C56860d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56860d f151702e;

    /* renamed from: f */
    public static final C62940bt f151703f;

    /* renamed from: g */
    private static volatile C63010eb f151704g;

    /* renamed from: a */
    public int f151705a;

    /* renamed from: b */
    public String f151706b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151707c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56670d f151708d;

    static {
        C56860d dVar = new C56860d();
        f151702e = dVar;
        C62942bv.registerDefaultInstance(C56860d.class, dVar);
        f151703f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 313216375, C63066gd.MESSAGE, C56860d.class);
    }

    private C56860d() {
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
                return newMessageInfo(f151702e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56860d();
            case 4:
                return new C56859c();
            case 5:
                return f151702e;
            case 6:
                C63010eb ebVar = f151704g;
                if (ebVar == null) {
                    synchronized (C56860d.class) {
                        ebVar = f151704g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151702e);
                            f151704g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
