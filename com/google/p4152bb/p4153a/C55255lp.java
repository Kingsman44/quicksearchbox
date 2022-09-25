package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.lp */
/* compiled from: PG */
public final class C55255lp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55255lp f145514c;

    /* renamed from: d */
    public static final C62940bt f145515d;

    /* renamed from: g */
    private static volatile C63010eb f145516g;

    /* renamed from: a */
    public String f145517a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f145518b;

    /* renamed from: e */
    private int f145519e;

    /* renamed from: f */
    private byte f145520f = 2;

    static {
        C55255lp lpVar = new C55255lp();
        f145514c = lpVar;
        C62942bv.registerDefaultInstance(C55255lp.class, lpVar);
        f145515d = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, lpVar, lpVar, (C62958ce) null, 65861893, C63066gd.MESSAGE, C55255lp.class);
    }

    private C55255lp() {
        C62942bv.emptyProtobufList();
        this.f145518b = true;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145520f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145520f = b;
                return null;
            case 2:
                return newMessageInfo(f145514c, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0006ဇ\u0004", new Object[]{"e", "a", "b"});
            case 3:
                return new C55255lp();
            case 4:
                return new C55254lo();
            case 5:
                return f145514c;
            case 6:
                C63010eb ebVar = f145516g;
                if (ebVar == null) {
                    synchronized (C55255lp.class) {
                        ebVar = f145516g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145514c);
                            f145516g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
