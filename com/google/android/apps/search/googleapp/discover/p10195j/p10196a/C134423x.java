package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57095j;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64227r;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.x */
/* compiled from: PG */
public final class C134423x implements C21312s {

    /* renamed from: a */
    private final C133939b f366137a;

    public C134423x(C133939b bVar) {
        this.f366137a = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64227r.f173655c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        CommandOuterClass$Command commandOuterClass$Command;
        C133939b bVar = this.f366137a;
        C57095j jVar = ((C64227r) obj).f173657a;
        if (jVar == null) {
            jVar = C57095j.f152420d;
        }
        C69664n.m101061g(jVar, "data");
        C69664n.m101061g(rVar, "eventData");
        C63042fg fgVar = jVar.f152424c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar, "data.expirationTimestamp");
        C69664n.m101061g(fgVar, "expirationTimestamp");
        Instant d = C62949a.m95469d(fgVar);
        Instant a = bVar.f364802k.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        if (a.isAfter(d)) {
            commandOuterClass$Command = jVar.f152423b;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
        } else {
            commandOuterClass$Command = jVar.f152422a;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
        }
        C69664n.m101060f(commandOuterClass$Command, "if (shouldUseExpiringCon…ta.defaultCommand\n      }");
        C69794a a2 = ((C40305b) bVar.f364806o.mo27525b()).mo32544c().mo26124a(commandOuterClass$Command, rVar);
        C69664n.m101060f(a2, "xUiKit.get().commandReso…lectedCommand, eventData)");
        return a2;
    }
}
