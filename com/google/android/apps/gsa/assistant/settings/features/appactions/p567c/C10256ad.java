package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.ad */
/* compiled from: PG */
public final class C10256ad extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C10256ad f34765j;

    /* renamed from: k */
    private static volatile C63010eb f34766k;

    /* renamed from: a */
    public int f34767a;

    /* renamed from: b */
    public boolean f34768b;

    /* renamed from: c */
    public int f34769c;

    /* renamed from: d */
    public int f34770d;

    /* renamed from: e */
    public boolean f34771e;

    /* renamed from: f */
    public boolean f34772f;

    /* renamed from: g */
    public boolean f34773g;

    /* renamed from: h */
    public boolean f34774h;

    /* renamed from: i */
    public boolean f34775i;

    static {
        C10256ad adVar = new C10256ad();
        f34765j = adVar;
        C62942bv.registerDefaultInstance(C10256ad.class, adVar);
    }

    private C10256ad() {
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
                return newMessageInfo(f34765j, "\u0001\b\u0000\u0001\u0004\f\b\u0000\u0000\u0000\u0004ဇ\u0001\u0005ဌ\u0002\u0006ဌ\u0003\u0007ဇ\u0004\tဇ\u0006\nဇ\u0007\u000bဇ\b\fဇ\t", new Object[]{"a", "b", C45240c.f118157a, C10254ab.f34764a, "d", C10280y.f34838a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C10256ad();
            case 4:
                return new C10253aa();
            case 5:
                return f34765j;
            case 6:
                C63010eb ebVar = f34766k;
                if (ebVar == null) {
                    synchronized (C10256ad.class) {
                        ebVar = f34766k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34765j);
                            f34766k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
