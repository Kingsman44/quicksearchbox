package com.google.android.apps.gsa.sidekick.main.p7199b;

import android.content.Context;
import android.widget.Toast;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.m */
/* compiled from: PG */
public final /* synthetic */ class C91273m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ Context f254739a;

    /* renamed from: b */
    public final /* synthetic */ String f254740b = "WARNING FOR DEVELOPERS: don't use deprecated Sidekick server android.googleapis.com override inside NowDevUtils!";

    public /* synthetic */ C91273m(Context context) {
        this.f254739a = context;
    }

    public final void run() {
        Toast.makeText(this.f254739a, this.f254740b, 1).show();
    }
}
