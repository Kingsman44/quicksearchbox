package com.google.android.apps.gsa.search.core.p6773am;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.state.p6864a.C86793h;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.p4152bb.p4153a.C55421x;

/* renamed from: com.google.android.apps.gsa.search.core.am.a */
/* compiled from: PG */
public final /* synthetic */ class C85626a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C85627b f231437a;

    /* renamed from: b */
    public final /* synthetic */ String f231438b;

    /* renamed from: c */
    public final /* synthetic */ Intent f231439c;

    /* renamed from: d */
    public final /* synthetic */ C55421x f231440d;

    public /* synthetic */ C85626a(C85627b bVar, String str, Intent intent, C55421x xVar) {
        this.f231437a = bVar;
        this.f231438b = str;
        this.f231439c = intent;
        this.f231440d = xVar;
    }

    public final void run() {
        C85627b bVar = this.f231437a;
        String str = this.f231438b;
        Intent intent = this.f231439c;
        C55421x xVar = this.f231440d;
        ((C86793h) bVar.f231443a.mo27525b()).mo80450a(str, intent.getBooleanExtra("nav", false), intent.getBooleanExtra("freenav", false), intent.getBooleanExtra("fg", false), xVar, intent.getBooleanExtra("use_assistant", false));
    }
}
