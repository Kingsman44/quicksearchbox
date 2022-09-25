package com.google.android.apps.search.googleapp.googleappbrowser;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4185a.p4186a.p4187a.p4188a.C55866a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.bq */
/* compiled from: PG */
public final class C135524bq extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C135524bq f369183j;

    /* renamed from: k */
    private static volatile C63010eb f369184k;

    /* renamed from: a */
    public int f369185a;

    /* renamed from: b */
    public String f369186b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f369187c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f369188d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f369189e;

    /* renamed from: f */
    public int f369190f;

    /* renamed from: g */
    public int f369191g;

    /* renamed from: h */
    public C62971cq f369192h;

    /* renamed from: i */
    public String f369193i;

    static {
        C135524bq bqVar = new C135524bq();
        f369183j = bqVar;
        C62942bv.registerDefaultInstance(C135524bq.class, bqVar);
    }

    private C135524bq() {
        C63088z zVar = C63088z.f170246b;
        this.f369192h = emptyProtobufList();
        this.f369193i = BuildConfig.FLAVOR;
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
                return newMessageInfo(f369183j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006င\u0005\bဌ\u0007\tင\b\n\u001b\u000bဈ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C55866a.f148676a, C30325g.f82003a, C19618h.f54585a, C135523bp.class, "i"});
            case 3:
                return new C135524bq();
            case 4:
                return new C135521bn();
            case 5:
                return f369183j;
            case 6:
                C63010eb ebVar = f369184k;
                if (ebVar == null) {
                    synchronized (C135524bq.class) {
                        ebVar = f369184k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369183j);
                            f369184k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
