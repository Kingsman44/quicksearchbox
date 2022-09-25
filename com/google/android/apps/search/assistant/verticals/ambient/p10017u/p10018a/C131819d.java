package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import com.google.assistant.p4016z.C53686ak;
import com.google.common.p4522b.C58480gp;
import com.google.protobuf.C62974ct;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.d */
/* compiled from: PG */
public final /* synthetic */ class C131819d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131825j f360018a;

    /* renamed from: b */
    public final /* synthetic */ String f360019b;

    public /* synthetic */ C131819d(C131825j jVar, String str) {
        this.f360018a = jVar;
        this.f360019b = str;
    }

    public final Object call() {
        BufferedInputStream bufferedInputStream;
        C131825j jVar = this.f360018a;
        String str = this.f360019b;
        jVar.mo110326f();
        C58480gp gpVar = new C58480gp(4);
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(new File(jVar.f360026b.getFilesDir(), "ambient"), str)));
            while (true) {
                C53686ak akVar = (C53686ak) C53686ak.parseDelimitedFrom(C53686ak.f140913f, bufferedInputStream);
                if (akVar != null) {
                    gpVar.mo55395g(akVar);
                } else {
                    bufferedInputStream.close();
                    return gpVar.mo55394f();
                }
            }
        } catch (C62974ct e) {
            throw new IllegalStateException(String.format("Error parsing LogEntry from %s.", new Object[]{str}), e);
        } catch (Throwable th) {
            C131817b.m214297a(th, th);
        }
        throw th;
    }
}
