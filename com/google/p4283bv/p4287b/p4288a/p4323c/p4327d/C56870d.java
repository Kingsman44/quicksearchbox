package com.google.p4283bv.p4287b.p4288a.p4323c.p4327d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56690f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.d.d */
/* compiled from: PG */
public final class C56870d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56870d f151734e;

    /* renamed from: f */
    public static final C62940bt f151735f;

    /* renamed from: g */
    private static volatile C63010eb f151736g;

    /* renamed from: a */
    public int f151737a;

    /* renamed from: b */
    public String f151738b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151739c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56690f f151740d;

    static {
        C56870d dVar = new C56870d();
        f151734e = dVar;
        C62942bv.registerDefaultInstance(C56870d.class, dVar);
        f151735f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 328216538, C63066gd.MESSAGE, C56870d.class);
    }

    private C56870d() {
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
                return newMessageInfo(f151734e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56870d();
            case 4:
                return new C56869c();
            case 5:
                return f151734e;
            case 6:
                C63010eb ebVar = f151736g;
                if (ebVar == null) {
                    synchronized (C56870d.class) {
                        ebVar = f151736g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151734e);
                            f151736g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
