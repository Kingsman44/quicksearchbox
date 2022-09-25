package com.google.p4283bv.p4287b.p4288a.p4323c.p4340q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae.C56644b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.q.b */
/* compiled from: PG */
public final class C56926b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56926b f151928f;

    /* renamed from: g */
    public static final C62940bt f151929g;

    /* renamed from: h */
    private static volatile C63010eb f151930h;

    /* renamed from: a */
    public int f151931a;

    /* renamed from: b */
    public String f151932b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151933c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151934d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56644b f151935e;

    static {
        C56926b bVar = new C56926b();
        f151928f = bVar;
        C62942bv.registerDefaultInstance(C56926b.class, bVar);
        f151929g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 458909378, C63066gd.MESSAGE, C56926b.class);
    }

    private C56926b() {
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
                return newMessageInfo(f151928f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56926b();
            case 4:
                return new C56925a();
            case 5:
                return f151928f;
            case 6:
                C63010eb ebVar = f151930h;
                if (ebVar == null) {
                    synchronized (C56926b.class) {
                        ebVar = f151930h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151928f);
                            f151930h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
