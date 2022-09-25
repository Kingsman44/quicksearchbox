package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.e */
/* compiled from: PG */
final class C97570e {

    /* renamed from: a */
    public static final Double f272574a = Double.valueOf(-1.0d);

    /* renamed from: e */
    private static final C59071e f272575e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ce.e");

    /* renamed from: f */
    private static C97570e f272576f = null;

    /* renamed from: b */
    public final Runtime f272577b = Runtime.getRuntime();

    /* renamed from: c */
    public Process f272578c = null;

    /* renamed from: d */
    public List f272579d = null;

    private C97570e() {
    }

    /* renamed from: a */
    static C97570e m161702a() {
        if (f272576f == null) {
            f272576f = new C97570e();
        }
        return f272576f;
    }

    /* renamed from: b */
    public final void mo90751b(String str, Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f272575e.mo56225c()).mo56382g(th)).mo56372aa(22122)).mo56389s("%s", str);
        throw new RuntimeException(str, th);
    }

    /* renamed from: c */
    public final void mo90752c() {
        try {
            Process process = this.f272578c;
            if (process != null) {
                process.waitFor();
            }
        } catch (InterruptedException e) {
            mo90751b("Fail at terminating perf event tool", e);
        } finally {
            this.f272578c = null;
            this.f272579d = null;
        }
    }
}
