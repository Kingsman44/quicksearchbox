package com.google.android.libraries.search.assistant.performer.p2754f.p2756b;

import com.google.assistant.p3897e.p3921j.C51809dy;
import java.util.Iterator;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.performer.f.b.f */
/* compiled from: PG */
public final /* synthetic */ class C36006f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36009i f94206a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f94207b;

    public /* synthetic */ C36006f(C36009i iVar, C51809dy dyVar) {
        this.f94206a = iVar;
        this.f94207b = dyVar;
    }

    public final void run() {
        C36009i iVar = this.f94206a;
        C51809dy dyVar = this.f94207b;
        Iterator it = iVar.f94213b.iterator();
        while (it.hasNext()) {
            ((C70862aj) it.next()).mo20123c(dyVar);
        }
    }
}
