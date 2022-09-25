package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.p4531c.C59053a;
import com.google.common.p4526f.p4531c.C59055c;
import com.google.common.p4526f.p4531c.C59064l;
import com.google.common.p4526f.p4534f.C59083d;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: com.google.common.f.b.af */
/* compiled from: PG */
public abstract class C59011af {

    /* renamed from: a */
    private static String f156902a = "com.google.common.f.b.a.e";

    /* renamed from: b */
    private static String f156903b = "com.google.common.flogger.backend.google.GooglePlatform";

    /* renamed from: c */
    private static String f156904c = "com.google.common.f.b.b.f";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String[] f156905d = {"com.google.common.f.b.a.e", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.f.b.b.f"};

    /* renamed from: a */
    public static int m91223a() {
        return ((C59083d) C59083d.f157045a.get()).f157046b;
    }

    /* renamed from: b */
    public static long m91224b() {
        return C59009ad.f156901a.mo56277c();
    }

    /* renamed from: d */
    public static C59033h m91225d(String str) {
        return C59009ad.f156901a.mo56248e(str);
    }

    /* renamed from: f */
    public static C59037l m91226f() {
        return m91228i().mo56262a();
    }

    /* renamed from: g */
    public static C59010ae m91227g() {
        return C59009ad.f156901a.mo56249h();
    }

    /* renamed from: i */
    public static C59053a m91228i() {
        return C59009ad.f156901a.mo56250j();
    }

    /* renamed from: k */
    public static C59064l m91229k() {
        return m91228i().mo56263b();
    }

    /* renamed from: l */
    public static String m91230l() {
        return C59009ad.f156901a.mo56251m();
    }

    /* renamed from: n */
    public static boolean m91231n(String str, Level level, boolean z) {
        return m91228i().mo56264c(str, level, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo56277c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C59033h mo56248e(String str);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C59010ae mo56249h();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C59053a mo56250j() {
        return C59055c.f156977a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract String mo56251m();
}
