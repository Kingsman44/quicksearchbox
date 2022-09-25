package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.anl */
/* compiled from: PG */
public final class anl extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final anl f135434l;

    /* renamed from: m */
    private static volatile C63010eb f135435m;

    /* renamed from: a */
    public int f135436a;

    /* renamed from: b */
    public String f135437b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f135438c;

    /* renamed from: d */
    public String f135439d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f135440e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f135441f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f135442g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f135443h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f135444i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f135445j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public boolean f135446k = true;

    static {
        anl anl = new anl();
        f135434l = anl;
        C62942bv.registerDefaultInstance(anl.class, anl);
    }

    private anl() {
    }

    /* renamed from: a */
    public static C63010eb m86348a() {
        return f135434l.getParserForType();
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
                return newMessageInfo(f135434l, "\u0001\n\u0000\u0001\u0002\f\n\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0000\tဇ\t\u000bဈ\u0007\fဈ\b", new Object[]{"a", C45240c.f118157a, ani.f135433a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "b", C19621k.f54601a, "i", "j"});
            case 3:
                return new anl();
            case 4:
                return new ank();
            case 5:
                return f135434l;
            case 6:
                C63010eb ebVar = f135435m;
                if (ebVar == null) {
                    synchronized (anl.class) {
                        ebVar = f135435m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135434l);
                            f135435m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
