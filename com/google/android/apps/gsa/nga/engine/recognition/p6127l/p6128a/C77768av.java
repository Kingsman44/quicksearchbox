package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19420x;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5218j.C66999hh;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.av */
/* compiled from: PG */
public final /* synthetic */ class C77768av implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C77772az f214228a;

    public /* synthetic */ C77768av(C77772az azVar) {
        this.f214228a = azVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C77772az azVar = this.f214228a;
        C66999hh a = azVar.f214242k.mo72814a();
        if (!azVar.f214240i.mo85405j(C89978aq.f246625x) && !azVar.f214240i.mo85405j(C89978aq.f246599D)) {
            ((C58970a) ((C58970a) C77772az.f214232a.mo56224b()).mo56372aa(4454)).mo56386p("Sheldon inference and training are not enabled. No p13n resources.");
            return C60856cj.m92900i(a);
        } else if (!azVar.f214243l.isPresent()) {
            ((C58970a) ((C58970a) C77772az.f214232a.mo56224b()).mo56372aa(4453)).mo56386p("Sheldon resource binding unavailable. No p13n resources.");
            return C60856cj.m92900i(a);
        } else {
            return C60846c.m92878g(C60922j.m93045h(C60838bs.m92859i(((C19420x) azVar.f214243l.get()).mo24612e(a)), new C77765as(a), C60826bg.f164896a), Throwable.class, new C77766at(a), C60826bg.f164896a);
        }
    }
}
