package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.C89622at;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.j */
/* compiled from: PG */
public final class C95535j implements C95538m {

    /* renamed from: a */
    public final Context f267351a;

    /* renamed from: b */
    public final C96628d f267352b;

    /* renamed from: c */
    public final C95307m f267353c;

    /* renamed from: d */
    public final C21370a f267354d;

    /* renamed from: e */
    public long f267355e;

    /* renamed from: f */
    private final C89622at f267356f;

    /* renamed from: g */
    private final C89656k f267357g;

    /* renamed from: h */
    private C94640d f267358h;

    public C95535j(Context context, C96628d dVar, C89622at atVar, C89656k kVar, C95307m mVar, C21370a aVar) {
        this.f267351a = context;
        this.f267352b = dVar;
        this.f267356f = atVar;
        this.f267357g = kVar;
        this.f267353c = mVar;
        this.f267354d = aVar;
        this.f267355e = dVar.mo90289a("DndAnnouncement", "timestamp", 0);
    }

    /* renamed from: a */
    public final C94640d mo89393a() {
        return this.f267358h;
    }

    /* renamed from: b */
    public final void mo89394b() {
        String str;
        if (this.f267354d.mo26870b() - this.f267355e >= this.f267357g.mo83546a("dnd_fetch_ann_freq")) {
            int a = this.f267356f.mo83486a();
            if (a == 4) {
                str = this.f267351a.getString(R.string.dnd_announcement_alarms);
            } else {
                str = a == 2 ? this.f267351a.getString(R.string.dnd_announcement_priority) : null;
            }
            if (str == null) {
                C58976aa aaVar = C58975e.f156826a;
                this.f267358h = null;
                return;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            this.f267358h = new C95534i(this, str);
            return;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        this.f267358h = null;
    }

    /* renamed from: c */
    public final boolean mo89395c() {
        return false;
    }
}
