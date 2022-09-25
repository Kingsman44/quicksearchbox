package com.google.p4283bv.p4287b.p4288a.p4323c.p4338o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab.C56626b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.o.b */
/* compiled from: PG */
public final class C56922b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56922b f151913f;

    /* renamed from: g */
    public static final C62940bt f151914g;

    /* renamed from: h */
    private static volatile C63010eb f151915h;

    /* renamed from: a */
    public int f151916a;

    /* renamed from: b */
    public String f151917b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151918c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151919d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56626b f151920e;

    static {
        C56922b bVar = new C56922b();
        f151913f = bVar;
        C62942bv.registerDefaultInstance(C56922b.class, bVar);
        f151914g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 355548442, C63066gd.MESSAGE, C56922b.class);
    }

    private C56922b() {
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
                return newMessageInfo(f151913f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56922b();
            case 4:
                return new C56921a();
            case 5:
                return f151913f;
            case 6:
                C63010eb ebVar = f151915h;
                if (ebVar == null) {
                    synchronized (C56922b.class) {
                        ebVar = f151915h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151913f);
                            f151915h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
