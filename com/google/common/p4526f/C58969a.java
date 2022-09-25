package com.google.common.p4526f;

import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59033h;
import com.google.common.p4526f.p4534f.C59081b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: com.google.common.f.a */
/* compiled from: PG */
public abstract class C58969a {

    /* renamed from: a */
    public final C59033h f156823a;

    protected C58969a(C59033h hVar) {
        C59081b.m91349a(hVar, "backend");
        this.f156823a = hVar;
    }

    /* renamed from: e */
    public static void m91127e(String str, C59031f fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(fVar.mo56303d()))));
        sb.append(": logging error [");
        C59095o e = fVar.mo56304e();
        if (e != C59095o.f157068a) {
            sb.append(e.mo56239b());
            sb.append('.');
            sb.append(e.mo56241d());
            sb.append(':');
            sb.append(e.mo56238a());
        }
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    /* renamed from: a */
    public abstract C59104x mo56223a(Level level);

    /* renamed from: b */
    public final C59104x mo56224b() {
        return mo56223a(Level.INFO);
    }

    /* renamed from: c */
    public final C59104x mo56225c() {
        return mo56223a(Level.SEVERE);
    }

    /* renamed from: d */
    public final C59104x mo56226d() {
        return mo56223a(Level.WARNING);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo56227f(Level level) {
        return this.f156823a.mo36922b(level);
    }
}
