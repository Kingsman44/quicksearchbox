package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.bz */
/* compiled from: PG */
public final class C53593bz extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C53593bz f140658j;

    /* renamed from: l */
    private static volatile C63010eb f140659l;

    /* renamed from: a */
    public int f140660a;

    /* renamed from: b */
    public String f140661b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f140662c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f140663d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f140664e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f140665f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C53554an f140666g;

    /* renamed from: h */
    public C53569bb f140667h;

    /* renamed from: i */
    public C53585br f140668i;

    /* renamed from: k */
    private byte f140669k = 2;

    static {
        C53593bz bzVar = new C53593bz();
        f140658j = bzVar;
        C62942bv.registerDefaultInstance(C53593bz.class, bzVar);
    }

    private C53593bz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140669k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140669k = b;
                return null;
            case 2:
                return newMessageInfo(f140658j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဈ\u0003\bဉ\u0007\tဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C30325g.f82003a, C19618h.f54585a, "e", "i", C10662f.f35572a});
            case 3:
                return new C53593bz();
            case 4:
                return new C53592by();
            case 5:
                return f140658j;
            case 6:
                C63010eb ebVar = f140659l;
                if (ebVar == null) {
                    synchronized (C53593bz.class) {
                        ebVar = f140659l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140658j);
                            f140659l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
