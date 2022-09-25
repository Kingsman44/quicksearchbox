package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bl */
/* compiled from: PG */
public final class C80317bl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80317bl f220400f;

    /* renamed from: g */
    private static volatile C63010eb f220401g;

    /* renamed from: a */
    public String f220402a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C80348e f220403b;

    /* renamed from: c */
    public String f220404c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f220405d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f220406e;

    static {
        C80317bl blVar = new C80317bl();
        f220400f = blVar;
        C62942bv.registerDefaultInstance(C80317bl.class, blVar);
    }

    private C80317bl() {
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
                return newMessageInfo(f220400f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0004Ȉ\u0005Ȉ\u0006\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C80317bl();
            case 4:
                return new C80316bk();
            case 5:
                return f220400f;
            case 6:
                C63010eb ebVar = f220401g;
                if (ebVar == null) {
                    synchronized (C80317bl.class) {
                        ebVar = f220401g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220400f);
                            f220401g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
