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

/* renamed from: com.google.bb.a.cc */
/* compiled from: PG */
public final class C54999cc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54999cc f144704c;

    /* renamed from: d */
    public static final C62940bt f144705d;

    /* renamed from: e */
    private static volatile C63010eb f144706e;

    /* renamed from: a */
    public int f144707a;

    /* renamed from: b */
    public String f144708b = BuildConfig.FLAVOR;

    static {
        C54999cc ccVar = new C54999cc();
        f144704c = ccVar;
        C62942bv.registerDefaultInstance(C54999cc.class, ccVar);
        f144705d = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, ccVar, ccVar, (C62958ce) null, 28717426, C63066gd.MESSAGE, C54999cc.class);
    }

    private C54999cc() {
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
                return newMessageInfo(f144704c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54999cc();
            case 4:
                return new C54998cb();
            case 5:
                return f144704c;
            case 6:
                C63010eb ebVar = f144706e;
                if (ebVar == null) {
                    synchronized (C54999cc.class) {
                        ebVar = f144706e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144704c);
                            f144706e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
