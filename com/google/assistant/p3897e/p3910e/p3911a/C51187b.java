package com.google.assistant.p3897e.p3910e.p3911a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3898a.C50870f;
import com.google.assistant.p3897e.p3929l.p3930a.C52684aq;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.e.a.b */
/* compiled from: PG */
public final class C51187b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C51187b f133235h;

    /* renamed from: l */
    private static volatile C63010eb f133236l;

    /* renamed from: a */
    public int f133237a;

    /* renamed from: b */
    public String f133238b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C54201r f133239c;

    /* renamed from: d */
    public C51205t f133240d;

    /* renamed from: e */
    public C50870f f133241e;

    /* renamed from: f */
    public String f133242f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f133243g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private boolean f133244i;

    /* renamed from: j */
    private C52684aq f133245j;

    /* renamed from: k */
    private byte f133246k = 2;

    static {
        C51187b bVar = new C51187b();
        f133235h = bVar;
        C62942bv.registerDefaultInstance(C51187b.class, bVar);
    }

    private C51187b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133246k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133246k = b;
                return null;
            case 2:
                return newMessageInfo(f133235h, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0005ဇ\u0003\u0006ဉ\u0004\u0007ဈ\u0005\fဈ\t\u000fဉ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "i", "e", C10662f.f35572a, C30325g.f82003a, "j"});
            case 3:
                return new C51187b();
            case 4:
                return new C51186a();
            case 5:
                return f133235h;
            case 6:
                C63010eb ebVar = f133236l;
                if (ebVar == null) {
                    synchronized (C51187b.class) {
                        ebVar = f133236l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133235h);
                            f133236l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
