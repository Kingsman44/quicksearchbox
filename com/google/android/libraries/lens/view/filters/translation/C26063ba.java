package com.google.android.libraries.lens.view.filters.translation;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ba */
/* compiled from: PG */
public final class C26063ba extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C26063ba f70840l;

    /* renamed from: m */
    private static volatile C63010eb f70841m;

    /* renamed from: a */
    public C26126i f70842a;

    /* renamed from: b */
    public C26126i f70843b;

    /* renamed from: c */
    public int f70844c;

    /* renamed from: d */
    public boolean f70845d;

    /* renamed from: e */
    public String f70846e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f70847f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f70848g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f70849h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f70850i;

    /* renamed from: j */
    public int f70851j;

    /* renamed from: k */
    public boolean f70852k;

    static {
        C26063ba baVar = new C26063ba();
        f70840l = baVar;
        C62942bv.registerDefaultInstance(C26063ba.class, baVar);
    }

    private C26063ba() {
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
                return newMessageInfo(f70840l, "\u0000\u000b\u0000\u0000\u0001\r\u000b\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ\b\u0004\nȈ\u000b\u0007\f\u0007\r\u0007", new Object[]{"a", "b", C45240c.f118157a, "e", C30325g.f82003a, C19618h.f54585a, "j", C10662f.f35572a, "d", C19621k.f54601a, "i"});
            case 3:
                return new C26063ba();
            case 4:
                return new C26061az();
            case 5:
                return f70840l;
            case 6:
                C63010eb ebVar = f70841m;
                if (ebVar == null) {
                    synchronized (C26063ba.class) {
                        ebVar = f70841m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f70840l);
                            f70841m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
