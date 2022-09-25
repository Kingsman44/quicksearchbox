package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.at.dz */
/* compiled from: PG */
public final class C49922dz extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C49922dz f129751p;

    /* renamed from: q */
    private static volatile C63010eb f129752q;

    /* renamed from: a */
    public int f129753a;

    /* renamed from: b */
    public int f129754b;

    /* renamed from: c */
    public boolean f129755c;

    /* renamed from: d */
    public boolean f129756d;

    /* renamed from: e */
    public boolean f129757e;

    /* renamed from: f */
    public boolean f129758f;

    /* renamed from: g */
    public boolean f129759g;

    /* renamed from: h */
    public boolean f129760h;

    /* renamed from: i */
    public boolean f129761i;

    /* renamed from: j */
    public int f129762j;

    /* renamed from: k */
    public String f129763k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public boolean f129764l;

    /* renamed from: m */
    public int f129765m;

    /* renamed from: n */
    public int f129766n;

    /* renamed from: o */
    public int f129767o;

    static {
        C49922dz dzVar = new C49922dz();
        f129751p = dzVar;
        C62942bv.registerDefaultInstance(C49922dz.class, dzVar);
    }

    private C49922dz() {
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
                Object[] objArr = new Object[19];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C49921dy.f129750a;
                objArr[17] = cfVar;
                objArr[15] = cfVar;
                objArr[12] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[4] = "d";
                objArr[5] = "e";
                objArr[6] = C10662f.f35572a;
                objArr[7] = C19618h.f54585a;
                objArr[8] = "i";
                objArr[9] = C19621k.f54601a;
                objArr[10] = C30325g.f82003a;
                objArr[11] = "j";
                objArr[13] = "l";
                objArr[14] = "m";
                objArr[16] = C48004n.f124238a;
                objArr[18] = C66412o.f180592a;
                return newMessageInfo(f129751p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0006\u0007ဇ\u0007\bဈ\t\tဇ\u0005\nဌ\b\u000bဇ\n\fဌ\u000b\u000eဌ\r\u000fင\u000e", objArr);
            case 3:
                return new C49922dz();
            case 4:
                return new C49920dx();
            case 5:
                return f129751p;
            case 6:
                C63010eb ebVar = f129752q;
                if (ebVar == null) {
                    synchronized (C49922dz.class) {
                        ebVar = f129752q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129751p);
                            f129752q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
