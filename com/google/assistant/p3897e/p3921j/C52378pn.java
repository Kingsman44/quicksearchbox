package com.google.assistant.p3897e.p3921j;

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

/* renamed from: com.google.assistant.e.j.pn */
/* compiled from: PG */
public final class C52378pn extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C52378pn f137444j;

    /* renamed from: k */
    private static volatile C63010eb f137445k;

    /* renamed from: a */
    public int f137446a;

    /* renamed from: b */
    public int f137447b = 0;

    /* renamed from: c */
    public Object f137448c;

    /* renamed from: d */
    public ade f137449d;

    /* renamed from: e */
    public String f137450e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C51098gh f137451f;

    /* renamed from: g */
    public String f137452g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C52374pj f137453h;

    /* renamed from: i */
    public String f137454i = BuildConfig.FLAVOR;

    static {
        C52378pn pnVar = new C52378pn();
        f137444j = pnVar;
        C62942bv.registerDefaultInstance(C52378pn.class, pnVar);
    }

    private C52378pn() {
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
                return newMessageInfo(f137444j, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဈ\u0007", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C52358ou.class, C52363oz.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C52378pn();
            case 4:
                return new C52377pm();
            case 5:
                return f137444j;
            case 6:
                C63010eb ebVar = f137445k;
                if (ebVar == null) {
                    synchronized (C52378pn.class) {
                        ebVar = f137445k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137444j);
                            f137445k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
