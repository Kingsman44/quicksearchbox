package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4402b;

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

/* renamed from: com.google.bv.j.b.a.b.b.c.b.b */
/* compiled from: PG */
public final class C57726b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57726b f154218b;

    /* renamed from: c */
    public static final C62940bt f154219c;

    /* renamed from: e */
    private static volatile C63010eb f154220e;

    /* renamed from: a */
    public String f154221a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f154222d;

    static {
        C57726b bVar = new C57726b();
        f154218b = bVar;
        C62942bv.registerDefaultInstance(C57726b.class, bVar);
        f154219c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 421287491, C63066gd.MESSAGE, C57726b.class);
    }

    private C57726b() {
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
                return newMessageInfo(f154218b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C57726b();
            case 4:
                return new C57725a();
            case 5:
                return f154218b;
            case 6:
                C63010eb ebVar = f154220e;
                if (ebVar == null) {
                    synchronized (C57726b.class) {
                        ebVar = f154220e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154218b);
                            f154220e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
