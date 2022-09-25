package com.google.android.libraries.assistant.soda.p1611f;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5218j.p5219a.C66722az;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.soda.f.b */
/* compiled from: PG */
public final /* synthetic */ class C19322b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19329i f54075a;

    /* renamed from: b */
    public final /* synthetic */ C66722az f54076b;

    public /* synthetic */ C19322b(C19329i iVar, C66722az azVar) {
        this.f54075a = iVar;
        this.f54076b = azVar;
    }

    public final Object call() {
        C19329i iVar = this.f54075a;
        C66722az azVar = this.f54076b;
        Soda soda = iVar.f54090e;
        if (soda != null) {
            soda.mo24351r(azVar);
            return null;
        }
        ((C59052c) ((C59052c) C19329i.f54086a.mo56225c()).mo56372aa(47770)).mo56386p("Soda is not initialized!");
        throw new Exception("Soda is not initialized!");
    }
}
