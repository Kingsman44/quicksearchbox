package com.google.p4283bv.p4287b.p4288a.p4323c.p4324a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56616h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.a.b */
/* compiled from: PG */
public final class C56854b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56854b f151680e;

    /* renamed from: f */
    public static final C62940bt f151681f;

    /* renamed from: h */
    private static volatile C63010eb f151682h;

    /* renamed from: a */
    public int f151683a;

    /* renamed from: b */
    public String f151684b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151685c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56616h f151686d;

    /* renamed from: g */
    private byte f151687g = 2;

    static {
        C56854b bVar = new C56854b();
        f151680e = bVar;
        C62942bv.registerDefaultInstance(C56854b.class, bVar);
        f151681f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 320020846, C63066gd.MESSAGE, C56854b.class);
    }

    private C56854b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151687g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151687g = b;
                return null;
            case 2:
                return newMessageInfo(f151680e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56854b();
            case 4:
                return new C56853a();
            case 5:
                return f151680e;
            case 6:
                C63010eb ebVar = f151682h;
                if (ebVar == null) {
                    synchronized (C56854b.class) {
                        ebVar = f151682h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151680e);
                            f151682h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
