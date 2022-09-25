package com.google.p4283bv.p4287b.p4288a.p4323c.p4331h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56730f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.h.d */
/* compiled from: PG */
public final class C56888d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56888d f151803f;

    /* renamed from: g */
    public static final C62940bt f151804g;

    /* renamed from: h */
    private static volatile C63010eb f151805h;

    /* renamed from: a */
    public int f151806a;

    /* renamed from: b */
    public String f151807b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151808c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151809d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56730f f151810e;

    static {
        C56888d dVar = new C56888d();
        f151803f = dVar;
        C62942bv.registerDefaultInstance(C56888d.class, dVar);
        f151804g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 381011171, C63066gd.MESSAGE, C56888d.class);
    }

    private C56888d() {
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
                return newMessageInfo(f151803f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56888d();
            case 4:
                return new C56887c();
            case 5:
                return f151803f;
            case 6:
                C63010eb ebVar = f151805h;
                if (ebVar == null) {
                    synchronized (C56888d.class) {
                        ebVar = f151805h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151803f);
                            f151805h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
