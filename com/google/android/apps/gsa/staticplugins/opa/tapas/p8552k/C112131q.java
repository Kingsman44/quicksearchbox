package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.n.f.b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.q */
/* compiled from: PG */
public final class C112131q {

    /* renamed from: a */
    public static final C59071e f311376a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.k.q");

    /* renamed from: b */
    public final C86124t f311377b;

    /* renamed from: c */
    public final b f311378c;

    /* renamed from: d */
    public final C68214a f311379d;

    /* renamed from: e */
    public final C21370a f311380e;

    /* renamed from: f */
    public long f311381f = -1;

    /* renamed from: g */
    private final Object f311382g = new Object();

    /* renamed from: h */
    private final C89037bh f311383h;

    /* renamed from: i */
    private final Map f311384i;

    /* renamed from: j */
    private final Map f311385j;

    public C112131q(C86124t tVar, C89037bh bhVar, b bVar, C68214a aVar, C21370a aVar2) {
        this.f311377b = tVar;
        this.f311383h = bhVar;
        this.f311378c = bVar;
        this.f311379d = aVar;
        this.f311380e = aVar2;
        this.f311384i = new HashMap();
        this.f311385j = new HashMap();
    }

    /* renamed from: a */
    public final long mo99409a() {
        if (this.f311377b.mo79746e(C90063do.f249372cL) && this.f311381f == -1) {
            this.f311381f = ((SharedPreferences) this.f311379d.mo27525b()).getLong("tapas_setting_first_run_tapas_server_latest_ts", 0);
        }
        return this.f311381f;
    }

    /* renamed from: b */
    public final void mo99410b(String str) {
        synchronized (this.f311382g) {
            this.f311384i.put(str, true);
            ((SharedPreferences) this.f311379d.mo27525b()).edit().putBoolean(str, true).apply();
        }
    }

    /* renamed from: c */
    public final boolean mo99411c() {
        C89062r rVar = (C89062r) C90877ak.m148475i(this.f311383h.mo27378c(), C89062r.f241369a);
        if (!rVar.mo83040a()) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (rVar.f241371c) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else if (rVar.f241372d) {
            C58976aa aaVar3 = C58975e.f156826a;
            return false;
        } else if (!this.f311383h.mo27385k()) {
            return true;
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo99412d(String str) {
        synchronized (this.f311382g) {
            if (this.f311384i.containsKey(str)) {
                boolean z = !((Boolean) this.f311384i.get(str)).booleanValue();
                return z;
            } else if (this.f311385j.containsKey(str)) {
                boolean booleanValue = ((Boolean) this.f311385j.get(str)).booleanValue();
                return booleanValue;
            } else {
                boolean z2 = !((SharedPreferences) this.f311379d.mo27525b()).getBoolean(str, true);
                this.f311385j.put(str, Boolean.valueOf(z2));
                return z2;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo99413e(String str) {
        synchronized (this.f311382g) {
            if (this.f311384i.get(str) != null) {
                boolean booleanValue = ((Boolean) this.f311384i.get(str)).booleanValue();
                return booleanValue;
            }
            this.f311384i.put(str, false);
            boolean z = ((SharedPreferences) this.f311379d.mo27525b()).getBoolean(str, true);
            ((SharedPreferences) this.f311379d.mo27525b()).edit().putBoolean(str, false).apply();
            return z;
        }
    }
}
