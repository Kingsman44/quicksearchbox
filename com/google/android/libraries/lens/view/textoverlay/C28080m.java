package com.google.android.libraries.lens.view.textoverlay;

import android.content.Intent;
import android.graphics.Point;
import com.google.android.libraries.lens.view.p2069am.C25336l;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.m */
/* compiled from: PG */
public final /* synthetic */ class C28080m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28093z f76433a;

    /* renamed from: b */
    public final /* synthetic */ C25336l f76434b;

    public /* synthetic */ C28080m(C28093z zVar, C25336l lVar) {
        this.f76433a = zVar;
        this.f76434b = lVar;
    }

    public final void run() {
        C28093z zVar = this.f76433a;
        C25336l lVar = this.f76434b;
        if (zVar.f76456i != null && zVar.f76460m.size() != 0) {
            zVar.f76456i.f66071d = new Intent(new Intent().putExtra("invocation_mode", 0).putExtra("selection_start", lVar.f68959a).putExtra("selection_end", lVar.f68960b).putExtra("invocation_point", new Point(0, 0)));
            zVar.f76461n = true;
            zVar.f76456i.mo29636b();
            zVar.f76461n = false;
        }
    }
}
