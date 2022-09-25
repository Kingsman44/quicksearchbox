package com.google.android.apps.gsa.startup;

import android.content.ComponentName;
import android.content.Context;
import android.os.UserManager;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6513aj.C84560t;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.startup.c */
/* compiled from: PG */
final class C92661c extends C90888av {

    /* renamed from: a */
    final /* synthetic */ StartUpReceiver f258660a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92661c(StartUpReceiver startUpReceiver) {
        super("Set component setting", 1, 8);
        this.f258660a = startUpReceiver;
    }

    public final void run() {
        C84560t tVar = (C84560t) this.f258660a.f258650h.mo27525b();
        if (!((C91123v) tVar.f230139c.mo27525b()).mo85390b() && !((C91123v) tVar.f230139c.mo27525b()).mo85393e()) {
            boolean z = !((UserManager) tVar.f230137a.getSystemService("user")).isManagedProfile();
            C84560t.m135283a(tVar.f230137a.getPackageManager(), new ComponentName(tVar.f230137a, "com.google.android.googlequicksearchbox.SearchActivity"), z);
            C84560t.m135283a(tVar.f230137a.getPackageManager(), new ComponentName(tVar.f230137a, "com.google.android.search.core.google.GoogleSearch"), z);
            Context context = tVar.f230137a;
            ((bm) tVar.f230138b.mo27525b()).A();
        }
    }
}
