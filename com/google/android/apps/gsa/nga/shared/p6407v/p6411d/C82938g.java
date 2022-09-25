package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.g */
/* compiled from: PG */
public final class C82938g extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C82938g f226273j;

    /* renamed from: k */
    private static volatile C63010eb f226274k;

    /* renamed from: a */
    public int f226275a;

    /* renamed from: b */
    public int f226276b;

    /* renamed from: c */
    public int f226277c;

    /* renamed from: d */
    public int f226278d;

    /* renamed from: e */
    public int f226279e;

    /* renamed from: f */
    public String f226280f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f226281g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C82907ew f226282h;

    /* renamed from: i */
    public C82907ew f226283i;

    static {
        C82938g gVar = new C82938g();
        f226273j = gVar;
        C62942bv.registerDefaultInstance(C82938g.class, gVar);
    }

    private C82938g() {
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
                Object[] objArr = new Object[13];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C82884e.f225976a;
                objArr[4] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[5] = "d";
                objArr[6] = C83016y.m132449b();
                objArr[7] = "e";
                objArr[8] = C83016y.m132449b();
                objArr[9] = C10662f.f35572a;
                objArr[10] = C30325g.f82003a;
                objArr[11] = C19618h.f54585a;
                objArr[12] = "i";
                return newMessageInfo(f226273j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0005ဌ\u0004\u0006ဌ\u0005\bဈ\u0007\tဈ\b\nဉ\t\u000bဉ\n", objArr);
            case 3:
                return new C82938g();
            case 4:
                return new C82857d();
            case 5:
                return f226273j;
            case 6:
                C63010eb ebVar = f226274k;
                if (ebVar == null) {
                    synchronized (C82938g.class) {
                        ebVar = f226274k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226273j);
                            f226274k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
