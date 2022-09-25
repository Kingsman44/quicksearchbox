package com.google.common.p4526f.p4528b.p4529a;

import android.os.Build;
import android.util.Log;
import com.google.common.p4526f.C59095o;
import com.google.common.p4526f.p4528b.C59010ae;
import com.google.common.p4526f.p4528b.C59011af;
import com.google.common.p4526f.p4528b.C59033h;
import com.google.common.p4526f.p4531c.C59053a;
import com.google.common.p4526f.p4534f.C59080a;
import dalvik.system.VMStack;

/* renamed from: com.google.common.f.b.a.e */
/* compiled from: PG */
public final class C58986e extends C59011af {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final boolean f156847a = C58988a.m91171a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f156848b;

    /* renamed from: c */
    private static final C59010ae f156849c = new C59010ae() {
        /* renamed from: a */
        public C59095o mo56252a(Class cls, int i) {
            return C59095o.f157068a;
        }

        /* renamed from: b */
        public String mo56253b(Class cls) {
            StackTraceElement a;
            if (C58986e.f156847a) {
                try {
                    if (cls.equals(C58986e.m91160p())) {
                        return VMStack.getStackClass2().getName();
                    }
                } catch (Throwable unused) {
                }
            }
            if (!C58986e.f156848b || (a = C59080a.m91347a(cls, 1)) == null) {
                return null;
            }
            return a.getClassName();
        }
    };

    /* renamed from: com.google.common.f.b.a.e$a */
    /* compiled from: PG */
    final class C58988a {
        C58988a() {
        }

        /* renamed from: a */
        static boolean m91171a() {
            return C58986e.m91164t();
        }
    }

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        f156848b = z;
        Class<Log> cls = Log.class;
    }

    /* renamed from: p */
    static Class m91160p() {
        return VMStack.getStackClass2();
    }

    /* renamed from: q */
    static String m91161q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t */
    static boolean m91164t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return C58988a.class.getName().equals(m91161q());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C59033h mo56248e(String str) {
        if (C58998o.f156861a.get() != null) {
            return ((C58984c) C58998o.f156861a.get()).mo36920a(str);
        }
        C58998o oVar = new C58998o(str.replace('$', '.'));
        C58996m.f156858a.offer(oVar);
        if (C58998o.f156861a.get() == null) {
            return oVar;
        }
        C58998o.m91184e();
        return oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C59010ae mo56249h() {
        return f156849c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C59053a mo56250j() {
        return C58999p.f156865a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo56251m() {
        return "platform: Android";
    }
}
