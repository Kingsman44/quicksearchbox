package com.google.android.apps.gsa.search.core.google;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6796f.C85979a;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.search.core.google.by */
/* compiled from: PG */
public final class C85902by extends C85979a {

    /* renamed from: a */
    private final C86130z f232238a;

    /* renamed from: b */
    private final C86319j f232239b;

    /* renamed from: c */
    private final C21370a f232240c;

    /* renamed from: d */
    private final AtomicReference f232241d;

    /* renamed from: e */
    private final C86054o f232242e;

    /* renamed from: f */
    private final C68214a f232243f;

    /* renamed from: g */
    private final Resources f232244g;

    /* renamed from: h */
    private final Context f232245h;

    /* renamed from: i */
    private final C68214a f232246i;

    /* renamed from: j */
    private final C86338r f232247j;

    /* renamed from: k */
    private final C86106b f232248k;

    /* renamed from: l */
    private final C58881cr f232249l = C58886cw.m90973a(new C85901bx());

    public C85902by(C86130z zVar, C86319j jVar, C21370a aVar, AtomicReference atomicReference, C86054o oVar, C68214a aVar2, Resources resources, Context context, C68214a aVar3, C86338r rVar, C86106b bVar) {
        this.f232238a = zVar;
        this.f232239b = jVar;
        this.f232240c = aVar;
        this.f232241d = atomicReference;
        this.f232242e = oVar;
        this.f232243f = aVar2;
        this.f232244g = resources;
        this.f232245h = context;
        this.f232246i = aVar3;
        this.f232247j = rVar;
        this.f232248k = bVar;
    }

    /* renamed from: j */
    public static final void m138030j(C85981c cVar) {
        cVar.mo79638d("ctzn", TimeZone.getDefault().getID());
    }

    /* renamed from: k */
    private static void m138031k(C85981c cVar, boolean z) {
        cVar.mo79638d("fheit", true != z ? "0" : "1");
    }

    /* renamed from: a */
    public final void mo79491a(C85981c cVar) {
        mo79530g(cVar);
    }

    /* renamed from: b */
    public final String mo79526b() {
        if (true != this.f232242e.mo79682p()) {
            return null;
        }
        return Integer.toString(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo79527c(C85981c cVar) {
        String b = this.f232248k.mo79727b();
        if (!TextUtils.isEmpty(b)) {
            cVar.mo79637c(cVar.f232497e, "X-Client-Instance-Id", b);
        }
    }

    /* renamed from: e */
    public final void mo79528e(C85981c cVar) {
        cVar.mo79638d("gcc", this.f232238a.mo79764c(R.string.device_country));
    }

    /* renamed from: f */
    public final void mo79529f(C85981c cVar) {
        String format;
        synchronized (this.f232249l) {
            format = ((SimpleDateFormat) this.f232249l.mo6453a()).format(new Date(this.f232240c.mo26870b()));
        }
        cVar.mo79637c(cVar.f232497e, "Date", format);
    }

    /* renamed from: g */
    public final void mo79530g(C85981c cVar) {
        mo79531h(cVar);
        mo79527c(cVar);
        mo79528e(cVar);
        mo79529f(cVar);
        m138030j(cVar);
        boolean z = true;
        cVar.mo79638d("ctf", true != DateFormat.is24HourFormat(this.f232245h) ? "0" : "1");
        mo79532i(cVar);
        int e = this.f232239b.mo80040a().mo80037e();
        if (e != 0) {
            if (e != 2) {
                z = false;
            }
            m138031k(cVar, z);
        } else {
            int i = this.f232247j.getInt("temp_units", -1);
            if (i != -1) {
                if (i != 1) {
                    z = false;
                }
                m138031k(cVar, z);
            }
        }
        C58833ax axVar = (C58833ax) this.f232241d.get();
        if (axVar.mo56113h()) {
            Point point = (Point) axVar.mo56107c();
            C58976aa aaVar = C58975e.f156826a;
            int i2 = point.x;
            int i3 = point.y;
            cVar.mo79638d("biw", Integer.toString(point.x));
            cVar.mo79638d("bih", Integer.toString(point.y));
        }
        cVar.mo79638d("ntyp", Integer.toString(C89034be.m144791a(((C89037bh) this.f232246i.mo27525b()).mo27377b()).f181028z));
        int i4 = this.f232247j.getInt("ram_mb", -1);
        if (i4 != -1) {
            cVar.mo79638d("ram_mb", Integer.toString(i4));
        }
        String b = mo79526b();
        if (b != null) {
            cVar.mo79638d("agsad", b);
        }
    }

    /* renamed from: h */
    public final void mo79531h(C85981c cVar) {
        cVar.mo79638d("oe", "utf-8");
        if (this.f232242e.mo79668a() == null) {
            cVar.mo79638d("safe", this.f232244g.getString(true != this.f232247j.getBoolean("safe_search", false) ? R.string.safe_search_inactive : R.string.safe_search_active));
        }
    }

    /* renamed from: i */
    public final void mo79532i(C85981c cVar) {
        cVar.mo79638d("v", (String) this.f232243f.mo27525b());
    }
}
