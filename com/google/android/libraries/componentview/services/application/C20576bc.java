package com.google.android.libraries.componentview.services.application;

import android.app.Dialog;
import android.util.Log;
import com.google.android.libraries.componentview.components.p1689c.C20193am;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.services.application.bc */
/* compiled from: PG */
public abstract class C20576bc {

    /* renamed from: a */
    public Dialog f57755a;

    /* renamed from: b */
    public C56429h f57756b;

    /* renamed from: a */
    public abstract void mo25512a(C56425d dVar, C20193am amVar);

    /* renamed from: b */
    public final void mo25513b() {
        if (!mo25514c()) {
            Log.e("DialogLauncher", "There is no open dialog to dismiss");
        } else {
            this.f57755a.dismiss();
        }
    }

    /* renamed from: c */
    public final boolean mo25514c() {
        return this.f57755a != null;
    }
}
