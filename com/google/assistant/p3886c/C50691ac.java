package com.google.assistant.p3886c;

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

/* renamed from: com.google.assistant.c.ac */
/* compiled from: PG */
public final class C50691ac extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C50691ac f131878i;

    /* renamed from: j */
    private static volatile C63010eb f131879j;

    /* renamed from: a */
    public int f131880a;

    /* renamed from: b */
    public C50846r f131881b;

    /* renamed from: c */
    public String f131882c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f131883d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f131884e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f131885f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f131886g;

    /* renamed from: h */
    public String f131887h = BuildConfig.FLAVOR;

    static {
        C50691ac acVar = new C50691ac();
        f131878i = acVar;
        C62942bv.registerDefaultInstance(C50691ac.class, acVar);
    }

    private C50691ac() {
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
                return newMessageInfo(f131878i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C50690ab.m85885b(), C19618h.f54585a});
            case 3:
                return new C50691ac();
            case 4:
                return new C50854z();
            case 5:
                return f131878i;
            case 6:
                C63010eb ebVar = f131879j;
                if (ebVar == null) {
                    synchronized (C50691ac.class) {
                        ebVar = f131879j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131878i);
                            f131879j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
