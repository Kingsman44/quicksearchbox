package com.google.android.libraries.lens.view.ris;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60901do;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.ris.e */
/* compiled from: PG */
public final class C27679e {

    /* renamed from: k */
    private static final long f75580k = Duration.ofSeconds(3).toMillis();

    /* renamed from: a */
    public String f75581a;

    /* renamed from: b */
    public final C27677c f75582b;

    /* renamed from: c */
    public final int f75583c;

    /* renamed from: d */
    public final C28443m f75584d;

    /* renamed from: e */
    public final C28306ab f75585e;

    /* renamed from: f */
    public final C28310af f75586f;

    /* renamed from: g */
    public C60870cx f75587g;

    /* renamed from: h */
    public final C46439e f75588h;

    /* renamed from: i */
    public final boolean f75589i;

    /* renamed from: j */
    public final C46440f f75590j = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C27679e eVar = C27679e.this;
            C60870cx cxVar = eVar.f75587g;
            if (!(cxVar == null || eVar.f75582b == null || cxVar.isCancelled())) {
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) C27679e.this.f75582b.requireView().findViewById(R.id.ris_button);
                extendedFloatingActionButton.getClass();
                extendedFloatingActionButton.mo47890r(extendedFloatingActionButton.f116351m);
            }
            C27679e.this.f75587g = null;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: l */
    private final C25989d f75591l;

    /* renamed from: m */
    private final C60888db f75592m;

    /* renamed from: n */
    private final boolean f75593n;

    public C27679e(C27677c cVar, C25989d dVar, C28443m mVar, C28306ab abVar, C28310af afVar, C46439e eVar, C60888db dbVar, boolean z, boolean z2) {
        this.f75582b = cVar;
        this.f75583c = R.id.lens_info_panel;
        this.f75591l = dVar;
        this.f75584d = mVar;
        this.f75585e = abVar;
        this.f75586f = afVar;
        this.f75592m = dbVar;
        this.f75593n = z;
        this.f75589i = z2;
        this.f75588h = eVar;
        this.f75581a = BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public static C27677c m51514a(AccountId accountId) {
        C27677c cVar = new C27677c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        return cVar;
    }

    /* renamed from: b */
    public final void mo33170b(boolean z) {
        C60870cx cxVar;
        View findViewById = this.f75582b.requireView().findViewById(R.id.ris_button);
        findViewById.getClass();
        if (!z || !this.f75591l.f70642a.f70649b.equals(C25980d.AUTO_FILTER) || this.f75581a.isEmpty()) {
            if (this.f75593n && (cxVar = this.f75587g) != null) {
                cxVar.cancel(false);
            }
            findViewById.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) findViewById.findViewById(R.id.ris_button);
        extendedFloatingActionButton.getClass();
        if (this.f75593n) {
            C60888db dbVar = this.f75592m;
            dbVar.getClass();
            C60872cz d = dbVar.mo29164d(C60901do.f165001a, f75580k, TimeUnit.MILLISECONDS);
            this.f75587g = d;
            this.f75588h.mo50445g(C46438d.m82810b(d), new C46436b((Object) null), this.f75590j);
            return;
        }
        extendedFloatingActionButton.mo47890r(extendedFloatingActionButton.f116351m);
    }
}
