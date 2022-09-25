package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aoh */
/* compiled from: PG */
public final class aoh extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final aoh f159483h;

    /* renamed from: i */
    private static volatile C63010eb f159484i;

    /* renamed from: a */
    public int f159485a;

    /* renamed from: b */
    public String f159486b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f159487c;

    /* renamed from: d */
    public long f159488d;

    /* renamed from: e */
    public String f159489e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f159490f;

    /* renamed from: g */
    public boolean f159491g;

    static {
        aoh aoh = new aoh();
        f159483h = aoh;
        C62942bv.registerDefaultInstance(aoh.class, aoh);
    }

    private aoh() {
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
                return newMessageInfo(f159483h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0006ဂ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new aoh();
            case 4:
                return new aog();
            case 5:
                return f159483h;
            case 6:
                C63010eb ebVar = f159484i;
                if (ebVar == null) {
                    synchronized (aoh.class) {
                        ebVar = f159484i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159483h);
                            f159484i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
