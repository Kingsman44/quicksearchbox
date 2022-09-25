package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import com.google.assistant.p4016z.C53686ak;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.io.IOException;
import java.util.concurrent.Callable;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneId;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.c */
/* compiled from: PG */
public final /* synthetic */ class C131818c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131825j f360016a;

    /* renamed from: b */
    public final /* synthetic */ C53686ak f360017b;

    public /* synthetic */ C131818c(C131825j jVar, C53686ak akVar) {
        this.f360016a = jVar;
        this.f360017b = akVar;
    }

    public final Object call() {
        C131825j jVar = this.f360016a;
        C53686ak akVar = this.f360017b;
        C63042fg fgVar = akVar.f140918d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        LocalDate localDate = Instant.ofEpochMilli(C62953e.m95478c(fgVar)).atZone(ZoneId.systemDefault()).toLocalDate();
        if (jVar.f360027c.mo59164a() >= 512 || !jVar.f360028d.equals(localDate)) {
            jVar.mo110326f();
        }
        try {
            akVar.writeDelimitedTo(jVar.f360027c);
            jVar.f360028d = localDate;
            akVar.getSerializedSize();
            return null;
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) jVar.f360025a.mo56226d()).mo56382g(e)).mo56372aa(39325)).mo56386p("Failure writing to buffer");
            return null;
        }
    }
}
