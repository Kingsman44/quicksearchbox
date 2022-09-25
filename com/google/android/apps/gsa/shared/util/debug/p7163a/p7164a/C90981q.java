package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C59755el;
import com.google.common.p4552o.C59757en;
import com.google.common.p4552o.C59788fp;
import com.google.common.p4552o.C59791fs;
import com.google.common.p4552o.C59792ft;
import com.google.protobuf.MessageLite;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.q */
/* compiled from: PG */
final class C90981q extends C90983s {
    public C90981q(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        C59792ft ftVar = (C59792ft) messageLite;
        C90974j jVar = this.f254188a;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        C59791fs a = C59791fs.m92505a(ftVar.f161564b);
        if (a == null) {
            a = C59791fs.UNKNOWN;
        }
        objArr[0] = a.name();
        objArr[1] = ftVar.f161565c;
        jVar.mo85258b(String.format(locale, "%s %s", objArr));
        this.f254188a.mo85261e();
        this.f254188a.mo85257a(String.format(Locale.US, "Total runs: %d", new Object[]{Integer.valueOf(ftVar.f161566d)}));
        this.f254188a.mo85257a(String.format(Locale.US, "Success count: %s", new Object[]{Integer.valueOf(ftVar.f161567e)}));
        this.f254188a.mo85257a(String.format(Locale.US, "Error count: %s", new Object[]{Integer.valueOf(ftVar.f161568f)}));
        if (ftVar.f161569g.size() > 0) {
            this.f254188a.mo85258b("Error details");
            this.f254188a.mo85261e();
            for (C59788fp fpVar : ftVar.f161569g) {
                this.f254188a.mo85257a(String.format(Locale.US, "%d times:", new Object[]{Integer.valueOf(fpVar.f161553c)}));
                C59753ej ejVar = fpVar.f161552b;
                if (ejVar == null) {
                    ejVar = C59753ej.f161449e;
                }
                this.f254188a.mo85261e();
                for (C59755el elVar : ejVar.f161453c) {
                    this.f254188a.mo85257a(String.format(Locale.US, "%s", new Object[]{elVar.f161458b}));
                    if (elVar.f161459c.size() > 0) {
                        this.f254188a.mo85261e();
                        for (C59757en enVar : elVar.f161459c) {
                            this.f254188a.mo85257a(String.format(Locale.US, "at %s.%s (%s:%s)", new Object[]{enVar.f161463b, enVar.f161464c, enVar.f161465d, Integer.valueOf(enVar.f161466e)}));
                        }
                        this.f254188a.mo85260d();
                    }
                }
                this.f254188a.mo85260d();
            }
            this.f254188a.mo85260d();
        }
        this.f254188a.mo85260d();
    }
}
