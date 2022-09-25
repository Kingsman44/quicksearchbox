package com.google.p4283bv.p4287b.p4288a.p4323c.p4334k;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4314s.C56819f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.k.j */
/* compiled from: PG */
public final class C56908j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56908j f151870f;

    /* renamed from: g */
    public static final C62940bt f151871g;

    /* renamed from: h */
    private static volatile C63010eb f151872h;

    /* renamed from: a */
    public int f151873a;

    /* renamed from: b */
    public String f151874b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151875c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151876d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56819f f151877e;

    static {
        C56908j jVar = new C56908j();
        f151870f = jVar;
        C62942bv.registerDefaultInstance(C56908j.class, jVar);
        f151871g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, jVar, jVar, (C62958ce) null, 378121758, C63066gd.MESSAGE, C56908j.class);
    }

    private C56908j() {
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
                return newMessageInfo(f151870f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56908j();
            case 4:
                return new C56907i();
            case 5:
                return f151870f;
            case 6:
                C63010eb ebVar = f151872h;
                if (ebVar == null) {
                    synchronized (C56908j.class) {
                        ebVar = f151872h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151870f);
                            f151872h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
