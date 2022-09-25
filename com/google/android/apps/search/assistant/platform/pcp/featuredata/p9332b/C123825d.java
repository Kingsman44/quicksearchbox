package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9332b;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123707aa;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123708ab;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131241j;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3897e.p3921j.aaf;
import com.google.assistant.p3897e.p3921j.aag;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.b.d */
/* compiled from: PG */
public final class C123825d {

    /* renamed from: a */
    public static final long f342075a = Duration.ofMinutes(5).toMillis();

    /* renamed from: b */
    public final Duration f342076b;

    /* renamed from: c */
    public final Duration f342077c;

    /* renamed from: d */
    public final Duration f342078d;

    /* renamed from: e */
    public final Duration f342079e;

    /* renamed from: f */
    public final Duration f342080f;

    public C123825d(C62910ar arVar, C62910ar arVar2, C62910ar arVar3, C62910ar arVar4, C62910ar arVar5) {
        this.f342076b = C62950b.m95473d(arVar);
        this.f342077c = C62950b.m95473d(arVar2);
        this.f342078d = C62950b.m95473d(arVar3);
        this.f342079e = C62950b.m95473d(arVar4);
        this.f342080f = C62950b.m95473d(arVar5);
    }

    /* renamed from: a */
    public static long m203135a(C123708ab abVar) {
        C123707aa aaVar = abVar.f341690d;
        if (aaVar == null) {
            aaVar = C123707aa.f341680d;
        }
        C52395qd qdVar = aaVar.f341684c;
        if (qdVar == null) {
            qdVar = C52395qd.f137485e;
        }
        return C131241j.m213734a(qdVar).toEpochMilli();
    }

    /* renamed from: b */
    public static long m203136b(C123708ab abVar) {
        C123707aa aaVar = abVar.f341690d;
        if (aaVar == null) {
            aaVar = C123707aa.f341680d;
        }
        C52395qd qdVar = aaVar.f341683b;
        if (qdVar == null) {
            qdVar = C52395qd.f137485e;
        }
        return C131241j.m213734a(qdVar).toEpochMilli();
    }

    /* renamed from: c */
    public static long m203137c(aag aag) {
        aaf aaf = aag.f134636d;
        if (aaf == null) {
            aaf = aaf.f134626c;
        }
        C52395qd qdVar = aaf.f134628a;
        if (qdVar == null) {
            qdVar = C52395qd.f137485e;
        }
        return C131241j.m213734a(qdVar).toEpochMilli();
    }
}
