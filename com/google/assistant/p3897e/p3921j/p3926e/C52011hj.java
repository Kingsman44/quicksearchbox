package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.hj */
/* compiled from: PG */
public final class C52011hj extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52011hj f136498g;

    /* renamed from: j */
    private static volatile C63010eb f136499j;

    /* renamed from: a */
    public String f136500a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f136501b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51012dc f136502c;

    /* renamed from: d */
    public String f136503d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f136504e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f136505f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private int f136506h;

    /* renamed from: i */
    private byte f136507i = 2;

    static {
        C52011hj hjVar = new C52011hj();
        f136498g = hjVar;
        C62942bv.registerDefaultInstance(C52011hj.class, hjVar);
    }

    private C52011hj() {
    }

    /* renamed from: a */
    public static C63010eb m86468a() {
        return f136498g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136507i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136507i = b;
                return null;
            case 2:
                return newMessageInfo(f136498g, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002ဈ\u0000\u0003ဈ\u0001\u0005ᐉ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C52011hj();
            case 4:
                return new C52010hi();
            case 5:
                return f136498g;
            case 6:
                C63010eb ebVar = f136499j;
                if (ebVar == null) {
                    synchronized (C52011hj.class) {
                        ebVar = f136499j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136498g);
                            f136499j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
