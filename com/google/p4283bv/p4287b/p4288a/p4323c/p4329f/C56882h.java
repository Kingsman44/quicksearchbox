package com.google.p4283bv.p4287b.p4288a.p4323c.p4329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56708n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.f.h */
/* compiled from: PG */
public final class C56882h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56882h f151781f;

    /* renamed from: g */
    public static final C62940bt f151782g;

    /* renamed from: i */
    private static volatile C63010eb f151783i;

    /* renamed from: a */
    public int f151784a;

    /* renamed from: b */
    public String f151785b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151786c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151787d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56708n f151788e;

    /* renamed from: h */
    private byte f151789h = 2;

    static {
        C56882h hVar = new C56882h();
        f151781f = hVar;
        C62942bv.registerDefaultInstance(C56882h.class, hVar);
        f151782g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, hVar, hVar, (C62958ce) null, 324694723, C63066gd.MESSAGE, C56882h.class);
    }

    private C56882h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151789h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151789h = b;
                return null;
            case 2:
                return newMessageInfo(f151781f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56882h();
            case 4:
                return new C56881g();
            case 5:
                return f151781f;
            case 6:
                C63010eb ebVar = f151783i;
                if (ebVar == null) {
                    synchronized (C56882h.class) {
                        ebVar = f151783i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151781f);
                            f151783i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
