package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3828b.p3829a.C49250a;
import com.google.assistant.p3825an.p3832d.p3833a.C49351b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.abf */
/* compiled from: PG */
public final class abf extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final abf f128759j;

    /* renamed from: k */
    private static volatile C63010eb f128760k;

    /* renamed from: a */
    public int f128761a;

    /* renamed from: b */
    public String f128762b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f128763c;

    /* renamed from: d */
    public abv f128764d;

    /* renamed from: e */
    public int f128765e;

    /* renamed from: f */
    public C50515zy f128766f;

    /* renamed from: g */
    public abb f128767g;

    /* renamed from: h */
    public int f128768h;

    /* renamed from: i */
    public boolean f128769i = true;

    static {
        abf abf = new abf();
        f128759j = abf;
        C62942bv.registerDefaultInstance(abf.class, abf);
    }

    private abf() {
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
                return newMessageInfo(f128759j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဌ\u0006\bဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, C49351b.m85420b(), "d", "e", abd.f128758a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C49250a.f127319a, "i"});
            case 3:
                return new abf();
            case 4:
                return new abc();
            case 5:
                return f128759j;
            case 6:
                C63010eb ebVar = f128760k;
                if (ebVar == null) {
                    synchronized (abf.class) {
                        ebVar = f128760k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128759j);
                            f128760k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
