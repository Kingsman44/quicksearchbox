package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.common.p4552o.C59794fv;
import com.google.protobuf.MessageLite;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.r */
/* compiled from: PG */
public final class C90982r extends C90983s {
    public C90982r(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        C59794fv fvVar = (C59794fv) messageLite;
        C90974j jVar = this.f254188a;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        C118575h a = C118575h.m196865a(fvVar.f161573b);
        if (a == null) {
            a = C118575h.ACTIVITY_ACCOUNT_DRAWER;
        }
        objArr[0] = a;
        jVar.mo85258b(String.format(locale, "Workload %s", objArr));
        this.f254188a.mo85261e();
        C90974j jVar2 = this.f254188a;
        Locale locale2 = Locale.US;
        Object[] objArr2 = new Object[1];
        C118575h a2 = C118575h.m196865a(fvVar.f161574c);
        if (a2 == null) {
            a2 = C118575h.ACTIVITY_ACCOUNT_DRAWER;
        }
        objArr2[0] = a2;
        jVar2.mo85257a(String.format(locale2, "Root: %s", objArr2));
        this.f254188a.mo85257a(String.format(Locale.US, "Custom: %s", new Object[]{Integer.valueOf(fvVar.f161576e)}));
        C90974j jVar3 = this.f254188a;
        Locale locale3 = Locale.US;
        Object[] objArr3 = new Object[1];
        C118569b a3 = C118569b.m196859a(fvVar.f161575d);
        if (a3 == null) {
            a3 = C118569b.UNKNOWN_METRIC_TYPE;
        }
        objArr3[0] = a3;
        jVar3.mo85257a(String.format(locale3, "Metric type: %s", objArr3));
        this.f254188a.mo85257a(String.format(Locale.US, "Max: %s", new Object[]{Long.valueOf(fvVar.f161577f)}));
        C90974j jVar4 = this.f254188a;
        Locale locale4 = Locale.US;
        double d = (double) fvVar.f161578g;
        double d2 = (double) fvVar.f161579h;
        Double.isNaN(d);
        Double.isNaN(d2);
        jVar4.mo85257a(String.format(locale4, "Avg: %.3f", new Object[]{Double.valueOf(d / d2)}));
        this.f254188a.mo85257a(String.format(Locale.US, "Count: %s", new Object[]{Integer.valueOf(fvVar.f161579h)}));
        this.f254188a.mo85260d();
    }
}
