package com.google.android.libraries.assistant.soda.p1611f;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.soda.f.f */
/* compiled from: PG */
public final /* synthetic */ class C19326f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19329i f54082a;

    public /* synthetic */ C19326f(C19329i iVar) {
        this.f54082a = iVar;
    }

    public final Object call() {
        Soda soda = this.f54082a.f54090e;
        if (soda != null) {
            soda.mo24338j();
            return null;
        }
        ((C59052c) ((C59052c) C19329i.f54086a.mo56225c()).mo56372aa(47758)).mo56386p("Soda is not initialized!");
        throw new Exception("Soda is not initialized!");
    }
}
