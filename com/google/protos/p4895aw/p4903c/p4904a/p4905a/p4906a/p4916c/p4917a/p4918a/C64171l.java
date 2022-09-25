package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.a.a.l */
/* compiled from: PG */
public final class C64171l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64171l f173499f;

    /* renamed from: g */
    public static final C62940bt f173500g;

    /* renamed from: i */
    private static volatile C63010eb f173501i;

    /* renamed from: a */
    public String f173502a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f173503b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f173504c;

    /* renamed from: d */
    public double f173505d;

    /* renamed from: e */
    public int f173506e;

    /* renamed from: h */
    private int f173507h;

    static {
        C64171l lVar = new C64171l();
        f173499f = lVar;
        C62942bv.registerDefaultInstance(C64171l.class, lVar);
        f173500g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, lVar, lVar, (C62958ce) null, 270943294, C63066gd.MESSAGE, C64171l.class);
    }

    private C64171l() {
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
                return newMessageInfo(f173499f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004က\u0003\u0005င\u0004", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64171l();
            case 4:
                return new C64170k();
            case 5:
                return f173499f;
            case 6:
                C63010eb ebVar = f173501i;
                if (ebVar == null) {
                    synchronized (C64171l.class) {
                        ebVar = f173501i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173499f);
                            f173501i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
