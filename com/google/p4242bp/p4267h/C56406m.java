package com.google.p4242bp.p4267h;

import com.evernote.android.state.BuildConfig;
import com.google.p4152bb.p4153a.C55136he;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.bp.h.m */
/* compiled from: PG */
public final class C56406m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56406m f150430a;

    /* renamed from: b */
    public static final C62940bt f150431b = C62942bv.newSingularGeneratedExtension(C55136he.f145130j, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 109696813, C63066gd.STRING, String.class);

    /* renamed from: c */
    public static final C62940bt f150432c = C62942bv.newRepeatedGeneratedExtension(C55136he.f145130j, C56405l.f150424e, (C62958ce) null, 109696814, C63066gd.MESSAGE, false, C56405l.class);

    /* renamed from: d */
    public static final C62940bt f150433d = C62942bv.newRepeatedGeneratedExtension(C55136he.f145130j, C56402i.f150417d, (C62958ce) null, 109696815, C63066gd.MESSAGE, false, C56402i.class);

    /* renamed from: e */
    private static volatile C63010eb f150434e;

    static {
        C56406m mVar = new C56406m();
        f150430a = mVar;
        C62942bv.registerDefaultInstance(C56406m.class, mVar);
    }

    private C56406m() {
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
                return newMessageInfo(f150430a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56406m();
            case 4:
                return new C56403j();
            case 5:
                return f150430a;
            case 6:
                C63010eb ebVar = f150434e;
                if (ebVar == null) {
                    synchronized (C56406m.class) {
                        ebVar = f150434e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150430a);
                            f150434e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
