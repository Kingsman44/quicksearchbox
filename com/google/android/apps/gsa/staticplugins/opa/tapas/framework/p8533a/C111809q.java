package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a.q */
/* compiled from: PG */
public abstract class C111809q implements C90991b {
    /* renamed from: a */
    public abstract long mo99239a();

    /* renamed from: b */
    public abstract C58485gu mo99240b();

    /* renamed from: c */
    public abstract Optional mo99241c();

    /* renamed from: e */
    public abstract String mo99242e();

    /* renamed from: f */
    public abstract String mo99244f();

    /* renamed from: g */
    public abstract int mo99245g();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85292s(C90752i.m148229c(toString()));
    }

    /* renamed from: h */
    public final String mo99252h() {
        String str;
        int g = mo99245g();
        if (g != 0) {
            if (g == 1) {
                str = mo99239a() + " ms";
            } else {
                str = "N/A";
            }
            return String.format(Locale.US, "'%s', %s, latency=%s, %s, suggestionSize=%d", new Object[]{mo99242e(), mo99244f(), str, C111808p.m185661a(mo99245g()), Integer.valueOf(mo99240b().size())});
        }
        throw null;
    }
}
