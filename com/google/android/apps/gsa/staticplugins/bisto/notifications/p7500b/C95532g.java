package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7505g.C95640a;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124713k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.g */
/* compiled from: PG */
public final class C95532g implements C95538m, C89495cg {

    /* renamed from: a */
    static final long f267338a = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: b */
    public final Map f267339b = new HashMap();

    /* renamed from: c */
    public final C68214a f267340c;

    /* renamed from: d */
    public final C21370a f267341d;

    /* renamed from: e */
    private final C95640a f267342e;

    /* renamed from: f */
    private final Context f267343f;

    /* renamed from: g */
    private final C95307m f267344g;

    /* renamed from: h */
    private final String f267345h;

    public C95532g(Context context, C95640a aVar, C68214a aVar2, C21370a aVar3, C95307m mVar, String str) {
        this.f267343f = context;
        this.f267342e = aVar;
        this.f267340c = aVar2;
        this.f267341d = aVar3;
        this.f267344g = mVar;
        this.f267345h = str;
        ((C89492cd) aVar2.mo27525b()).mo83360B(Collections.singleton(1), this);
    }

    /* renamed from: a */
    public final C94640d mo89393a() {
        Integer num;
        int i;
        C95531f fVar = (C95531f) this.f267339b.get(this.f267345h);
        if (fVar == null || fVar.f267336a < this.f267341d.mo26870b() - f267338a || (i = fVar.f267337b) <= 0 || i > 20) {
            C58976aa aaVar = C58975e.f156826a;
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        if (num == null) {
            return null;
        }
        String string = this.f267343f.getString(R.string.battery_level, new Object[]{num});
        C58976aa aaVar2 = C58975e.f156826a;
        return new C94650n(this.f267343f, this.f267344g, this.f267341d, string, (Uri) null);
    }

    /* renamed from: b */
    public final void mo89394b() {
        this.f267342e.mo89603b();
    }

    /* renamed from: c */
    public final boolean mo89395c() {
        return false;
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (set.contains(0)) {
            C124713k i = dVar.mo106511i();
            if (!i.equals(C124713k.CHARGER_DISABLED_ERROR) && !i.equals(C124713k.CHARGER_NO_POWER) && !i.equals(C124713k.CHARGER_UNKNOWN)) {
                this.f267339b.remove(str);
                return;
            }
        }
        if (set.contains(1) && dVar.mo106489ac()) {
            dVar.mo106468I().ifPresent(new C95530e(this, str));
        }
    }
}
