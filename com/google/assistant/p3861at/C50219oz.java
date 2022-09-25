package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p368ae.p369a.C7487a;
import com.google.p4109av.p4110a.p4111a.C54603b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.oz */
/* compiled from: PG */
public final class C50219oz extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50219oz f130579f;

    /* renamed from: g */
    private static volatile C63010eb f130580g;

    /* renamed from: a */
    public int f130581a;

    /* renamed from: b */
    public int f130582b;

    /* renamed from: c */
    public String f130583c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C54603b f130584d;

    /* renamed from: e */
    public String f130585e = BuildConfig.FLAVOR;

    static {
        C50219oz ozVar = new C50219oz();
        f130579f = ozVar;
        C62942bv.registerDefaultInstance(C50219oz.class, ozVar);
    }

    private C50219oz() {
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
                return newMessageInfo(f130579f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0006ဈ\u0003", new Object[]{"a", "b", C7487a.f24686a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C50219oz();
            case 4:
                return new C50218oy();
            case 5:
                return f130579f;
            case 6:
                C63010eb ebVar = f130580g;
                if (ebVar == null) {
                    synchronized (C50219oz.class) {
                        ebVar = f130580g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130579f);
                            f130580g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
