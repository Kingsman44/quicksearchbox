package com.google.android.apps.gsa.staticplugins.smartspace;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.p */
/* compiled from: PG */
final class C117435p extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C117436q f325964a;

    /* renamed from: b */
    private final Intent f325965b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117435p(C117436q qVar, Intent intent) {
        super("SmartspaceUpdateOEMInte");
        this.f325964a = qVar;
        this.f325965b = intent;
    }

    /* renamed from: d */
    private final void m195178d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f325964a.mo103299c(this.f325965b);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (drawable != null) {
            this.f325965b.putExtra("com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON", ((BitmapDrawable) drawable).getBitmap());
            m195178d();
            return;
        }
        m195178d();
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        mo76757c((Object) null);
        C59104x c = C117436q.f325966a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SmartspaceUpdateOEMInte");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(32998)).mo56386p("Error on loading OEMSysUI weather icon");
        m195178d();
    }
}
