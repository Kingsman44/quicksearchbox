package com.google.protos.p5132q;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.C55745f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.q.q */
/* compiled from: PG */
public final class C65874q extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C65874q f179080k;

    /* renamed from: m */
    private static volatile C63010eb f179081m;

    /* renamed from: a */
    public int f179082a;

    /* renamed from: b */
    public int f179083b = -1;

    /* renamed from: c */
    public C65861d f179084c;

    /* renamed from: d */
    public int f179085d;

    /* renamed from: e */
    public C55745f f179086e;

    /* renamed from: f */
    public float f179087f;

    /* renamed from: g */
    public C65868k f179088g;

    /* renamed from: h */
    public String f179089h;

    /* renamed from: i */
    public C65864g f179090i;

    /* renamed from: j */
    public C65871n f179091j;

    /* renamed from: l */
    private byte f179092l = 2;

    static {
        C65874q qVar = new C65874q();
        f179080k = qVar;
        C62942bv.registerDefaultInstance(C65874q.class, qVar);
    }

    private C65874q() {
        emptyIntList();
        this.f179085d = 2;
        this.f179089h = BuildConfig.FLAVOR;
        C62942bv.emptyProtobufList();
        emptyFloatList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179092l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179092l = b;
                return null;
            case 2:
                return newMessageInfo(f179080k, "\u0001\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0003\u0001င\u0000\u0002ᐉ\u0001\u0004ဌ\u0003\u0006ဉ\u0005\u0007ခ\t\rᐉ\u000b\u000fဈ\f\u0010ᐉ\r\u0011ဉ\u000e", new Object[]{"a", "b", C45240c.f118157a, "d", C65873p.m96818b(), "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C65874q();
            case 4:
                return new C65869l();
            case 5:
                return f179080k;
            case 6:
                C63010eb ebVar = f179081m;
                if (ebVar == null) {
                    synchronized (C65874q.class) {
                        ebVar = f179081m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179080k);
                            f179081m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
