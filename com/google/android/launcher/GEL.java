package com.google.android.launcher;

import android.os.Bundle;
import com.android.launcher3.Launcher;
import com.google.android.apps.gsa.launcher.a.e;
import com.google.android.apps.gsa.launcher.p5872a.C74629d;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.apps.tiktok.inject.C47266f;

/* compiled from: PG */
public class GEL extends Launcher {

    /* renamed from: a */
    public e f396003a;

    /* renamed from: com.google.android.launcher.GEL$a */
    /* compiled from: PG */
    public interface C146617a {
        /* renamed from: ri */
        void mo123420ri(GEL gel);
    }

    public final void onCreate(Bundle bundle) {
        ((C146617a) C47266f.m84076a(getApplicationContext(), C146617a.class)).mo123420ri(this);
        e eVar = this.f396003a;
        C91142g gVar = (C91142g) eVar.a.mo17428b();
        gVar.getClass();
        C90932cb cbVar = (C90932cb) eVar.b.mo17428b();
        cbVar.getClass();
        this.mLauncherCallbacks$ar$class_merging = new C74629d(gVar, cbVar, this);
        super.onCreate(bundle);
    }
}
