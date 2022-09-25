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

/* renamed from: com.google.bb.a.bm */
/* compiled from: PG */
public final class C54982bm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54982bm f144669b;

    /* renamed from: c */
    public static final C62940bt f144670c;

    /* renamed from: e */
    private static volatile C63010eb f144671e;

    /* renamed from: a */
    public String f144672a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f144673d;

    static {
        C54982bm bmVar = new C54982bm();
        f144669b = bmVar;
        C62942bv.registerDefaultInstance(C54982bm.class, bmVar);
        f144670c = C62942bv.newSingularGeneratedExtension(C54948af.f144541h, bmVar, bmVar, (C62958ce) null, 115638397, C63066gd.MESSAGE, C54982bm.class);
    }

    private C54982bm() {
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
                return newMessageInfo(f144669b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C54982bm();
            case 4:
                return new C54981bl();
            case 5:
                return f144669b;
            case 6:
                C63010eb ebVar = f144671e;
                if (ebVar == null) {
                    synchronized (C54982bm.class) {
                        ebVar = f144671e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144669b);
                            f144671e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
