package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80336cd;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.au */
/* compiled from: PG */
public final /* synthetic */ class C76310au implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76311av f211362a;

    /* renamed from: b */
    public final /* synthetic */ C80336cd f211363b;

    /* renamed from: c */
    public final /* synthetic */ C65475b f211364c;

    public /* synthetic */ C76310au(C76311av avVar, C80336cd cdVar, C65475b bVar) {
        this.f211362a = avVar;
        this.f211363b = cdVar;
        this.f211364c = bVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76311av avVar = this.f211362a;
        C80336cd cdVar = this.f211363b;
        C65475b bVar = this.f211364c;
        return ((Boolean) obj).booleanValue() ? avVar.mo72165e(cdVar, bVar) : avVar.mo72163c(R.string.nga_message_failed_to_send_screenshot, bVar);
    }
}
