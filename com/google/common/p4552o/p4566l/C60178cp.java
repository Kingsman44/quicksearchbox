package com.google.common.p4552o.p4566l;

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
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.cp */
/* compiled from: PG */
public final class C60178cp extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C60178cp f162787o;

    /* renamed from: p */
    private static volatile C63010eb f162788p;

    /* renamed from: a */
    public int f162789a;

    /* renamed from: b */
    public C60161bz f162790b;

    /* renamed from: c */
    public int f162791c;

    /* renamed from: d */
    public String f162792d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f162793e;

    /* renamed from: f */
    public boolean f162794f;

    /* renamed from: g */
    public boolean f162795g;

    /* renamed from: h */
    public C60175cm f162796h;

    /* renamed from: i */
    public C60177co f162797i;

    /* renamed from: j */
    public long f162798j = -1;

    /* renamed from: k */
    public C62961ch f162799k = emptyIntList();

    /* renamed from: l */
    public boolean f162800l;

    /* renamed from: m */
    public boolean f162801m;

    /* renamed from: n */
    public String f162802n = BuildConfig.FLAVOR;

    static {
        C60178cp cpVar = new C60178cp();
        f162787o = cpVar;
        C62942bv.registerDefaultInstance(C60178cp.class, cpVar);
    }

    private C60178cp() {
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
                return newMessageInfo(f162787o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u000e\u0002ဌ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဉ\u0000\bဉ\u0006\tဉ\u0007\nဂ\b\u000b\u001e\fဇ\f\rဇ\r", new Object[]{"a", C48004n.f124238a, C45240c.f118157a, C60194de.m92540b(), "d", "e", C10662f.f35572a, C30325g.f82003a, "b", C19618h.f54585a, "i", "j", C19621k.f54601a, C60192dc.m92538b(), "l", "m"});
            case 3:
                return new C60178cp();
            case 4:
                return new C60173ck();
            case 5:
                return f162787o;
            case 6:
                C63010eb ebVar = f162788p;
                if (ebVar == null) {
                    synchronized (C60178cp.class) {
                        ebVar = f162788p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162787o);
                            f162788p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
