package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.p4552o.C59813gf;
import com.google.common.p4552o.C59816gi;
import com.google.common.p4552o.C59817gj;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.e */
/* compiled from: PG */
public final class C90969e extends C90983s {
    public C90969e(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        String str;
        C59817gj gjVar = (C59817gj) messageLite;
        if (gjVar != null) {
            this.f254188a.mo85258b("Build Info");
            this.f254188a.mo85261e();
            int a = C59816gi.m92510a(gjVar.f161648b);
            String lowerCase = ((a == 0 || a == 1) ? "DEV" : a != 2 ? "RELEASE" : "ALPHA").toLowerCase();
            int i = gjVar.f161650d;
            int a2 = C59813gf.m92509a(i);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 0 || i2 == 1 || i2 == 2) {
                int a3 = C59813gf.m92509a(i);
                str = ((a3 == 0 || a3 == 1) ? "ARM" : a3 != 2 ? a3 != 3 ? "UNKNOWN" : "X86" : "ARM64").toLowerCase();
            } else {
                str = "unknown";
            }
            this.f254188a.mo85257a(String.format("BUILD(%s.%s.%s)", new Object[]{gjVar.f161649c, lowerCase, str}));
            this.f254188a.mo85260d();
        }
    }
}
