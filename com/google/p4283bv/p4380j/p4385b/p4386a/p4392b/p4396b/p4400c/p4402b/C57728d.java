package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4402b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.j.b.a.b.b.c.b.d */
/* compiled from: PG */
public final class C57728d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57728d f154223b;

    /* renamed from: c */
    public static final C62940bt f154224c;

    /* renamed from: e */
    private static volatile C63010eb f154225e;

    /* renamed from: a */
    public String f154226a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f154227d;

    static {
        C57728d dVar = new C57728d();
        f154223b = dVar;
        C62942bv.registerDefaultInstance(C57728d.class, dVar);
        f154224c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 420147741, C63066gd.MESSAGE, C57728d.class);
    }

    private C57728d() {
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
                return newMessageInfo(f154223b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C57728d();
            case 4:
                return new C57727c();
            case 5:
                return f154223b;
            case 6:
                C63010eb ebVar = f154225e;
                if (ebVar == null) {
                    synchronized (C57728d.class) {
                        ebVar = f154225e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154223b);
                            f154225e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
