package com.google.p4283bv.p4287b.p4288a.p4323c.p4329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56704j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.f.f */
/* compiled from: PG */
public final class C56880f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56880f f151772f;

    /* renamed from: g */
    public static final C62940bt f151773g;

    /* renamed from: i */
    private static volatile C63010eb f151774i;

    /* renamed from: a */
    public int f151775a;

    /* renamed from: b */
    public String f151776b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151777c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151778d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56704j f151779e;

    /* renamed from: h */
    private byte f151780h = 2;

    static {
        C56880f fVar = new C56880f();
        f151772f = fVar;
        C62942bv.registerDefaultInstance(C56880f.class, fVar);
        f151773g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 324694558, C63066gd.MESSAGE, C56880f.class);
    }

    private C56880f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151780h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151780h = b;
                return null;
            case 2:
                return newMessageInfo(f151772f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56880f();
            case 4:
                return new C56879e();
            case 5:
                return f151772f;
            case 6:
                C63010eb ebVar = f151774i;
                if (ebVar == null) {
                    synchronized (C56880f.class) {
                        ebVar = f151774i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151772f);
                            f151774i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
