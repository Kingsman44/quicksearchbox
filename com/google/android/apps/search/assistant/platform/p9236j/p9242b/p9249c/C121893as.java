package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.libraries.search.assistant.invocation.p2641k.p2644c.C33925a;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.locks.ReentrantLock;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.as */
/* compiled from: PG */
public final class C121893as implements C33925a {

    /* renamed from: a */
    private final String f338263a = "ApaVoiceInteractionHandler";

    /* renamed from: b */
    private final C121895au f338264b;

    public C121893as(C121895au auVar) {
        C69664n.m101061g(auVar, "eventProvider");
        this.f338264b = auVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo39134a(C69577g gVar) {
        StringBuilder sb = new StringBuilder("Events:\n");
        C121895au auVar = this.f338264b;
        ReentrantLock reentrantLock = auVar.f338265a;
        reentrantLock.lock();
        try {
            C58485gu b = C58479go.m89810b(auVar.f338266b);
            reentrantLock.unlock();
            C58485gu lD = b.mo55401lD();
            int size = lD.size();
            for (int i = 0; i < size; i++) {
                C121898ax axVar = (C121898ax) lD.get(i);
                new StringBuilder("  ").append(axVar);
                sb.append("  ".concat(String.valueOf(axVar)));
                sb.append(10);
            }
            return sb.toString();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final String mo39135b() {
        return this.f338263a;
    }
}
