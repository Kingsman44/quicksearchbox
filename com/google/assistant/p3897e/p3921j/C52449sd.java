package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.sd */
/* compiled from: PG */
public final class C52449sd extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C52449sd f137679j;

    /* renamed from: k */
    private static volatile C63010eb f137680k;

    /* renamed from: a */
    public int f137681a;

    /* renamed from: b */
    public int f137682b;

    /* renamed from: c */
    public C52403ql f137683c;

    /* renamed from: d */
    public C52403ql f137684d;

    /* renamed from: e */
    public C52393qb f137685e;

    /* renamed from: f */
    public C52460so f137686f;

    /* renamed from: g */
    public String f137687g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f137688h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f137689i;

    static {
        C52449sd sdVar = new C52449sd();
        f137679j = sdVar;
        C62942bv.registerDefaultInstance(C52449sd.class, sdVar);
    }

    private C52449sd() {
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
                return newMessageInfo(f137679j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"a", "b", C52448sc.m86639b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C52449sd();
            case 4:
                return new C52446sa();
            case 5:
                return f137679j;
            case 6:
                C63010eb ebVar = f137680k;
                if (ebVar == null) {
                    synchronized (C52449sd.class) {
                        ebVar = f137680k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137679j);
                            f137680k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
