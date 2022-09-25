package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.io.File;
import java.util.concurrent.Callable;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.e */
/* compiled from: PG */
public final /* synthetic */ class C131820e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131825j f360020a;

    public /* synthetic */ C131820e(C131825j jVar) {
        this.f360020a = jVar;
    }

    public final Object call() {
        C131825j jVar = this.f360020a;
        jVar.mo110326f();
        return (C58485gu) DesugarArrays.stream((T[]) (File[]) Optional.ofNullable(new File(jVar.f360026b.getFilesDir(), "ambient").listFiles()).orElse(new File[0])).filter(C131821f.f360021a).filter(C131822g.f360022a).sorted(C131823h.f360023a).map(C131824i.f360024a).collect(C58370cn.f155946a);
    }
}
