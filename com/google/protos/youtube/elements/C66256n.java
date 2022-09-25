package com.google.protos.youtube.elements;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.n */
/* compiled from: PG */
public final class C66256n extends C62937bq implements C62938br {

    /* renamed from: o */
    public static final C66256n f180148o;

    /* renamed from: q */
    private static volatile C63010eb f180149q;

    /* renamed from: a */
    public int f180150a;

    /* renamed from: b */
    public int f180151b = 0;

    /* renamed from: c */
    public Object f180152c;

    /* renamed from: d */
    public String f180153d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f180154e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public float f180155f;

    /* renamed from: g */
    public int f180156g;

    /* renamed from: h */
    public int f180157h;

    /* renamed from: i */
    public boolean f180158i;

    /* renamed from: j */
    public float f180159j;

    /* renamed from: k */
    public int f180160k;

    /* renamed from: l */
    public int f180161l;

    /* renamed from: m */
    public int f180162m;

    /* renamed from: n */
    public float f180163n;

    /* renamed from: p */
    private byte f180164p = 2;

    static {
        C66256n nVar = new C66256n();
        f180148o = nVar;
        C62942bv.registerDefaultInstance(C66256n.class, nVar);
    }

    private C66256n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180164p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180164p = b;
                return null;
            case 2:
                Object[] objArr = new Object[18];
                objArr[0] = C45240c.f118157a;
                objArr[1] = "b";
                objArr[2] = "a";
                objArr[3] = "d";
                objArr[4] = C10662f.f35572a;
                objArr[5] = C30325g.f82003a;
                objArr[6] = C19618h.f54585a;
                C62959cf cfVar = C66253k.f180147a;
                objArr[12] = cfVar;
                objArr[7] = cfVar;
                objArr[8] = C66249g.f180145a;
                objArr[9] = "i";
                objArr[10] = "j";
                objArr[11] = C19621k.f54601a;
                objArr[13] = "l";
                objArr[14] = C66213e.f180055a;
                objArr[15] = "e";
                objArr[16] = "m";
                objArr[17] = C48004n.f124238a;
                return newMessageInfo(f180148o, "\u0001\r\u0001\u0001\u0003\u0010\r\u0000\u0000\u0000\u0003ဈ\u0002\u0004ခ\u0004\u0005ဋ\u0007\u0006ဌ\b\u0007ှ\u0000\bဿ\u0000\tဇ\u000b\u000bခ\r\fဌ\u000e\rဌ\u000f\u000eဈ\u0003\u000fဋ\u0010\u0010ခ\u0011", objArr);
            case 3:
                return new C66256n();
            case 4:
                return new C66255m();
            case 5:
                return f180148o;
            case 6:
                C63010eb ebVar = f180149q;
                if (ebVar == null) {
                    synchronized (C66256n.class) {
                        ebVar = f180149q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180148o);
                            f180149q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
