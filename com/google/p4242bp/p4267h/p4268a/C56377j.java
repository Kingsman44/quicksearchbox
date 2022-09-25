package com.google.p4242bp.p4267h.p4268a;

import com.evernote.android.state.BuildConfig;
import com.google.p4152bb.p4153a.C55032di;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55224kl;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55247lh;
import com.google.p4152bb.p4153a.C55250lk;
import com.google.p4152bb.p4153a.C55296nc;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.bp.h.a.j */
/* compiled from: PG */
public final class C56377j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56377j f150344a;

    /* renamed from: b */
    public static final C62940bt f150345b = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 109696811, C63066gd.STRING, String.class);

    /* renamed from: c */
    public static final C62940bt f150346c = C62942bv.newSingularGeneratedExtension(C55247lh.f145477k, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 109696812, C63066gd.STRING, String.class);

    /* renamed from: d */
    public static final C62940bt f150347d = C62942bv.newSingularGeneratedExtension(C55224kl.f145394d, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 109696813, C63066gd.STRING, String.class);

    /* renamed from: e */
    public static final C62940bt f150348e = C62942bv.newSingularGeneratedExtension(C55296nc.f145663e, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 109696814, C63066gd.STRING, String.class);

    /* renamed from: f */
    public static final C62940bt f150349f = C62942bv.newSingularGeneratedExtension(C55250lk.f145489h, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 109696815, C63066gd.STRING, String.class);

    /* renamed from: g */
    public static final C62940bt f150350g = C62942bv.newSingularGeneratedExtension(C55305nl.f145689r, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 109696816, C63066gd.STRING, String.class);

    /* renamed from: h */
    public static final C62940bt f150351h = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 109696817, C63066gd.STRING, String.class);

    /* renamed from: i */
    public static final C62940bt f150352i = C62942bv.newSingularGeneratedExtension(C55032di.f144777j, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 114547872, C63066gd.STRING, String.class);

    /* renamed from: j */
    private static volatile C63010eb f150353j;

    static {
        C56377j jVar = new C56377j();
        f150344a = jVar;
        C62942bv.registerDefaultInstance(C56377j.class, jVar);
    }

    private C56377j() {
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
                return newMessageInfo(f150344a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56377j();
            case 4:
                return new C56376i();
            case 5:
                return f150344a;
            case 6:
                C63010eb ebVar = f150353j;
                if (ebVar == null) {
                    synchronized (C56377j.class) {
                        ebVar = f150353j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150344a);
                            f150353j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
