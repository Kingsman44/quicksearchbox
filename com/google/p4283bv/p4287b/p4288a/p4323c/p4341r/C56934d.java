package com.google.p4283bv.p4287b.p4288a.p4323c.p4341r;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4296af.C56650b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.r.d */
/* compiled from: PG */
public final class C56934d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56934d f151955e;

    /* renamed from: f */
    public static final C62940bt f151956f;

    /* renamed from: h */
    private static volatile C63010eb f151957h;

    /* renamed from: a */
    public int f151958a;

    /* renamed from: b */
    public String f151959b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151960c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56650b f151961d;

    /* renamed from: g */
    private byte f151962g = 2;

    static {
        C56934d dVar = new C56934d();
        f151955e = dVar;
        C62942bv.registerDefaultInstance(C56934d.class, dVar);
        f151956f = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 394273404, C63066gd.MESSAGE, C56934d.class);
    }

    private C56934d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151962g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151962g = b;
                return null;
            case 2:
                return newMessageInfo(f151955e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56934d();
            case 4:
                return new C56933c();
            case 5:
                return f151955e;
            case 6:
                C63010eb ebVar = f151957h;
                if (ebVar == null) {
                    synchronized (C56934d.class) {
                        ebVar = f151957h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151955e);
                            f151957h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
