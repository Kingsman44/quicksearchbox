package com.google.p4283bv.p4287b.p4288a.p4323c.p4326c;

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

/* renamed from: com.google.bv.b.a.c.c.d */
/* compiled from: PG */
public final class C56866d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56866d f151721c;

    /* renamed from: d */
    public static final C62940bt f151722d;

    /* renamed from: e */
    private static volatile C63010eb f151723e;

    /* renamed from: a */
    public int f151724a;

    /* renamed from: b */
    public String f151725b = BuildConfig.FLAVOR;

    static {
        C56866d dVar = new C56866d();
        f151721c = dVar;
        C62942bv.registerDefaultInstance(C56866d.class, dVar);
        f151722d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 453249873, C63066gd.MESSAGE, C56866d.class);
    }

    private C56866d() {
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
                return newMessageInfo(f151721c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56866d();
            case 4:
                return new C56865c();
            case 5:
                return f151721c;
            case 6:
                C63010eb ebVar = f151723e;
                if (ebVar == null) {
                    synchronized (C56866d.class) {
                        ebVar = f151723e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151721c);
                            f151723e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
