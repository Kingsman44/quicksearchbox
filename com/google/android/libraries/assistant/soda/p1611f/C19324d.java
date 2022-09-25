package com.google.android.libraries.assistant.soda.p1611f;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.soda.f.d */
/* compiled from: PG */
public final /* synthetic */ class C19324d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19329i f54078a;

    /* renamed from: b */
    public final /* synthetic */ int f54079b;

    public /* synthetic */ C19324d(C19329i iVar, int i) {
        this.f54078a = iVar;
        this.f54079b = i;
    }

    public final Object call() {
        C19329i iVar = this.f54078a;
        int i = this.f54079b;
        Soda soda = iVar.f54090e;
        if (soda != null) {
            soda.mo24357x(i);
            return null;
        }
        ((C59052c) ((C59052c) C19329i.f54086a.mo56225c()).mo56372aa(47764)).mo56386p("Soda is not initialized!");
        throw new Exception("Soda is not initialized!");
    }
}
