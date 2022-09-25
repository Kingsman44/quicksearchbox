package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77568au;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82317as;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82546je;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82547jf;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.t */
/* compiled from: PG */
public final /* synthetic */ class C77536t implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C77541y f213628a;

    /* renamed from: b */
    public final /* synthetic */ Duration f213629b;

    public /* synthetic */ C77536t(C77541y yVar, Duration duration) {
        this.f213628a = yVar;
        this.f213629b = duration;
    }

    public final void run() {
        C77541y yVar = this.f213628a;
        Duration duration = this.f213629b;
        yVar.close();
        C77509a aVar = yVar.f213644j;
        C77566as asVar = yVar.f213643i;
        C83305i iVar = aVar.f213571a;
        C82546je h = C82547jf.m131449h();
        C82317as asVar2 = (C82317as) h;
        asVar2.f224865b = "AudioLibrary";
        int m = asVar.mo72690m();
        String a = C77568au.m124486a(m);
        if (m != 0) {
            asVar2.f224866c = a;
            h.mo75677c(aVar.f213573c.mo72021b().mo72042g());
            h.mo75676b();
            iVar.mo75579d(h.mo75675a());
            ((C58970a) ((C58970a) C77541y.f213634a.mo56226d()).mo56372aa(4293)).mo56388r("NGA stayed %d milliseconds with the mic opened", duration.toMillis());
            return;
        }
        throw null;
    }
}
