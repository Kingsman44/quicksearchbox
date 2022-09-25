package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.hb */
/* compiled from: PG */
public final class C52003hb extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C52003hb f136476i;

    /* renamed from: j */
    private static volatile C63010eb f136477j;

    /* renamed from: a */
    public int f136478a;

    /* renamed from: b */
    public String f136479b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f136480c = 1;

    /* renamed from: d */
    public C51098gh f136481d;

    /* renamed from: e */
    public boolean f136482e;

    /* renamed from: f */
    public boolean f136483f;

    /* renamed from: g */
    public int f136484g;

    /* renamed from: h */
    public int f136485h;

    static {
        C52003hb hbVar = new C52003hb();
        f136476i = hbVar;
        C62942bv.registerDefaultInstance(C52003hb.class, hbVar);
    }

    private C52003hb() {
    }

    /* renamed from: a */
    public static C63010eb m86466a() {
        return f136476i.getParserForType();
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
                return newMessageInfo(f136476i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", C45240c.f118157a, C52000gz.f136475a, "d", "e", C10662f.f35572a, C30325g.f82003a, C51998gx.f136474a, C19618h.f54585a, C51996gv.f136473a});
            case 3:
                return new C52003hb();
            case 4:
                return new C51995gu();
            case 5:
                return f136476i;
            case 6:
                C63010eb ebVar = f136477j;
                if (ebVar == null) {
                    synchronized (C52003hb.class) {
                        ebVar = f136477j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136476i);
                            f136477j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
