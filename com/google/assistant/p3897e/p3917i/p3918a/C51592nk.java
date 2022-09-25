package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.nk */
/* compiled from: PG */
public final class C51592nk extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C51592nk f134462k;

    /* renamed from: l */
    private static volatile C63010eb f134463l;

    /* renamed from: a */
    public int f134464a;

    /* renamed from: b */
    public int f134465b = 0;

    /* renamed from: c */
    public Object f134466c;

    /* renamed from: d */
    public String f134467d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f134468e;

    /* renamed from: f */
    public long f134469f;

    /* renamed from: g */
    public String f134470g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C52407qp f134471h;

    /* renamed from: i */
    public C52407qp f134472i;

    /* renamed from: j */
    public String f134473j = BuildConfig.FLAVOR;

    static {
        C51592nk nkVar = new C51592nk();
        f134462k = nkVar;
        C62942bv.registerDefaultInstance(C51592nk.class, nkVar);
    }

    private C51592nk() {
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
                return newMessageInfo(f134462k, "\u0001\t\u0001\u0001\u0001\f\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဵ\u0000\u0005ဵ\u0000\u0006ဈ\u0005\bဉ\u0007\nဈ\n\fဉ\b", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C51591nj.m86228b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j", "i"});
            case 3:
                return new C51592nk();
            case 4:
                return new C51588ng();
            case 5:
                return f134462k;
            case 6:
                C63010eb ebVar = f134463l;
                if (ebVar == null) {
                    synchronized (C51592nk.class) {
                        ebVar = f134463l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134462k);
                            f134463l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
