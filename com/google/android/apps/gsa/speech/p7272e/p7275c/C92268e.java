package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.libraries.gsa.p1876k.C22869e;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.speech.e.c.e */
/* compiled from: PG */
public final /* synthetic */ class C92268e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C92271h f257271a;

    /* renamed from: b */
    public final /* synthetic */ File f257272b;

    /* renamed from: c */
    public final /* synthetic */ boolean f257273c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f257274d;

    public /* synthetic */ C92268e(C92271h hVar, File file, boolean z, Runnable runnable) {
        this.f257271a = hVar;
        this.f257272b = file;
        this.f257273c = z;
        this.f257274d = runnable;
    }

    public final void run() {
        C92271h hVar = this.f257271a;
        File file = this.f257272b;
        boolean z = this.f257273c;
        Runnable runnable = this.f257274d;
        hVar.mo86953d(file, z);
        if (runnable != null) {
            runnable.run();
        }
    }
}
