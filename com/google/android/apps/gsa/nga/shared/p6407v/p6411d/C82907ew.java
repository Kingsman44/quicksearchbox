package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4553a.C59562r;
import com.google.common.p4552o.p4553a.C59563s;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ew */
/* compiled from: PG */
public final class C82907ew extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C82907ew f226160o;

    /* renamed from: p */
    private static volatile C63010eb f226161p;

    /* renamed from: a */
    public int f226162a;

    /* renamed from: b */
    public int f226163b;

    /* renamed from: c */
    public String f226164c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f226165d;

    /* renamed from: e */
    public long f226166e;

    /* renamed from: f */
    public long f226167f;

    /* renamed from: g */
    public int f226168g;

    /* renamed from: h */
    public long f226169h;

    /* renamed from: i */
    public boolean f226170i;

    /* renamed from: j */
    public int f226171j;

    /* renamed from: k */
    public String f226172k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public float f226173l;

    /* renamed from: m */
    public float f226174m;

    /* renamed from: n */
    public boolean f226175n;

    static {
        C82907ew ewVar = new C82907ew();
        f226160o = ewVar;
        C62942bv.registerDefaultInstance(C82907ew.class, ewVar);
    }

    private C82907ew() {
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
                return newMessageInfo(f226160o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0003\u0003ဂ\u0004\u0004ဌ\u0005\u0005ဈ\u0001\u0006ဌ\u0002\u0007ဂ\u0006\bဇ\u0007\tဌ\b\nဈ\t\u000bခ\n\fခ\u000b\rဇ\f", new Object[]{"a", "b", e.b(), "e", C10662f.f35572a, C30325g.f82003a, C59563s.f158050a, C45240c.f118157a, "d", C59562r.m92366b(), C19618h.f54585a, "i", "j", C82976hk.f226377a, C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C82907ew();
            case 4:
                return new C82906ev();
            case 5:
                return f226160o;
            case 6:
                C63010eb ebVar = f226161p;
                if (ebVar == null) {
                    synchronized (C82907ew.class) {
                        ebVar = f226161p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226160o);
                            f226161p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
