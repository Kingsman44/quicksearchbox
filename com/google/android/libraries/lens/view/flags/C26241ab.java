package com.google.android.libraries.lens.view.flags;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.flags.ab */
/* compiled from: PG */
public final class C26241ab extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C26241ab f71364i;

    /* renamed from: l */
    private static volatile C63010eb f71365l;

    /* renamed from: a */
    public int f71366a;

    /* renamed from: b */
    public C62995dn f71367b = C62995dn.f170057a;

    /* renamed from: c */
    public C62995dn f71368c;

    /* renamed from: d */
    public C62995dn f71369d;

    /* renamed from: e */
    public C62995dn f71370e;

    /* renamed from: f */
    public C62961ch f71371f;

    /* renamed from: g */
    public String f71372g;

    /* renamed from: h */
    public C62961ch f71373h;

    /* renamed from: j */
    private C62995dn f71374j;

    /* renamed from: k */
    private C62995dn f71375k;

    static {
        C26241ab abVar = new C26241ab();
        f71364i = abVar;
        C62942bv.registerDefaultInstance(C26241ab.class, abVar);
    }

    private C26241ab() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f71368c = dnVar;
        this.f71369d = dnVar;
        this.f71370e = dnVar;
        this.f71374j = dnVar;
        this.f71375k = dnVar;
        this.f71371f = emptyIntList();
        this.f71372g = BuildConfig.FLAVOR;
        this.f71373h = emptyIntList();
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
                return newMessageInfo(f71364i, "\u0001\t\u0000\u0001\u0001\t\t\u0006\u0002\u0000\u00012\u00022\u00032\u00042\u00052\u0006'\u0007ဈ\u0000\b2\t'", new Object[]{"a", "b", C26258p.f71391a, C45240c.f118157a, C26260r.f71392a, "d", C26261s.f71393a, "e", C26267y.f71400a, "j", C26268z.f71401a, C10662f.f35572a, C30325g.f82003a, C19621k.f54601a, C26240aa.f71363a, C19618h.f54585a});
            case 3:
                return new C26241ab();
            case 4:
                return new C26259q();
            case 5:
                return f71364i;
            case 6:
                C63010eb ebVar = f71365l;
                if (ebVar == null) {
                    synchronized (C26241ab.class) {
                        ebVar = f71365l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f71364i);
                            f71365l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
