package com.google.p4283bv.p4287b.p4288a.p4323c.p4329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.f.b */
/* compiled from: PG */
public final class C56876b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56876b f151754f;

    /* renamed from: g */
    public static final C62940bt f151755g;

    /* renamed from: i */
    private static volatile C63010eb f151756i;

    /* renamed from: a */
    public int f151757a;

    /* renamed from: b */
    public String f151758b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151759c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151760d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56696b f151761e;

    /* renamed from: h */
    private byte f151762h = 2;

    static {
        C56876b bVar = new C56876b();
        f151754f = bVar;
        C62942bv.registerDefaultInstance(C56876b.class, bVar);
        f151755g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 324685229, C63066gd.MESSAGE, C56876b.class);
    }

    private C56876b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151762h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151762h = b;
                return null;
            case 2:
                return newMessageInfo(f151754f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56876b();
            case 4:
                return new C56875a();
            case 5:
                return f151754f;
            case 6:
                C63010eb ebVar = f151756i;
                if (ebVar == null) {
                    synchronized (C56876b.class) {
                        ebVar = f151756i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151754f);
                            f151756i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
