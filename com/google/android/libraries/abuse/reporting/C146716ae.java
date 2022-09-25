package com.google.android.libraries.abuse.reporting;

import com.google.p335a.p336a.C6588j;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.abuse.reporting.ae */
/* compiled from: PG */
final class C146716ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f396208a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f396209b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f396210c;

    /* renamed from: d */
    final /* synthetic */ C146718ag f396211d;

    public C146716ae(C146718ag agVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f396211d = agVar;
        this.f396208a = str;
        this.f396209b = arrayList;
        this.f396210c = arrayList2;
    }

    public final void run() {
        this.f396211d.mo123545a(this.f396208a, this.f396209b, this.f396210c, (C6588j) null, 0, 3, false);
        this.f396211d.f396214c.mo123561f();
        this.f396211d.f396212a.set(true);
    }
}
