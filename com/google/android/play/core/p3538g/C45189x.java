package com.google.android.play.core.p3538g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.g.x */
/* compiled from: PG */
final class C45189x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C45122ah f117939a;

    /* renamed from: b */
    final /* synthetic */ C45190y f117940b;

    public C45189x(C45190y yVar, C45122ah ahVar) {
        this.f117940b = yVar;
        this.f117939a = ahVar;
    }

    public final void run() {
        C45186u uVar = this.f117940b.f117941a;
        C45122ah ahVar = this.f117939a;
        List list = ahVar.f117807a;
        List j = C45190y.m80460j(ahVar.f117808b);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList(list));
        }
        if (!j.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList(j));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        uVar.mo49016g(C45137aw.m80340j(bundle));
    }
}
