package com.google.android.libraries.places.widget.internal.p2440a;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2358bf;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import com.google.android.libraries.places.widget.internal.common.C31915c;
import com.google.android.libraries.places.widget.internal.common.C31919g;
import com.google.android.libraries.places.widget.internal.common.C31920h;
import com.google.android.libraries.places.widget.internal.logging.AutocompleteWidgetSession;
import com.google.android.libraries.places.widget.internal.logging.C31924b;

/* renamed from: com.google.android.libraries.places.widget.internal.a.n */
/* compiled from: PG */
public final class C31912n extends C2358bf {

    /* renamed from: a */
    public final C31901c f85805a;

    /* renamed from: b */
    public final AutocompleteWidgetSession f85806b;

    /* renamed from: c */
    public final C2332ag f85807c = new C2332ag();

    /* renamed from: d */
    private final C31924b f85808d;

    /* renamed from: e */
    private final Handler f85809e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private Runnable f85810f;

    public C31912n(C31901c cVar, AutocompleteWidgetSession autocompleteWidgetSession, C31924b bVar) {
        this.f85805a = cVar;
        this.f85806b = autocompleteWidgetSession;
        this.f85808d = bVar;
    }

    /* renamed from: a */
    public static Status m59429a(Exception exc) {
        if (exc instanceof C143842n) {
            return ((C143842n) exc).f389919a;
        }
        return new Status(1, 13, exc.getMessage(), (PendingIntent) null, (ConnectionResult) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.f389621g;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m59430f(com.google.android.gms.common.api.Status r1) {
        /*
            boolean r0 = r1.mo119096b()
            if (r0 != 0) goto L_0x0013
            int r1 = r1.f389621g
            r0 = 9012(0x2334, float:1.2629E-41)
            if (r1 == r0) goto L_0x0013
            r0 = 9011(0x2333, float:1.2627E-41)
            if (r1 != r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r1 = 0
            return r1
        L_0x0013:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.p2440a.C31912n.m59430f(com.google.android.gms.common.api.Status):boolean");
    }

    /* renamed from: b */
    public final void mo37651b() {
        this.f85806b.f85850d = true;
        C31919g i = C31920h.m59473i(10);
        ((C31915c) i).f85839e = new Status(1, 16, (String) null, (PendingIntent) null, (ConnectionResult) null);
        mo37653e(i.mo37677a());
    }

    /* renamed from: c */
    public final void mo37652c(String str) {
        AutocompleteWidgetSession autocompleteWidgetSession = this.f85806b;
        autocompleteWidgetSession.f85859m++;
        autocompleteWidgetSession.f85858l = str;
        this.f85809e.removeCallbacks(this.f85810f);
        if (str.isEmpty()) {
            this.f85805a.mo37649a();
            mo37653e(C31920h.m59473i(2).mo37677a());
            return;
        }
        C31910l lVar = new C31910l(this, str);
        this.f85810f = lVar;
        this.f85809e.postDelayed(lVar, 100);
        mo37653e(C31920h.m59471g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        try {
            this.f85805a.mo37649a();
            this.f85809e.removeCallbacks(this.f85810f);
            AutocompleteWidgetSession autocompleteWidgetSession = this.f85806b;
            if (!autocompleteWidgetSession.f85850d && !autocompleteWidgetSession.f85857k) {
                autocompleteWidgetSession.f85851e = true;
            }
            this.f85808d.mo37694a(autocompleteWidgetSession);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: e */
    public final void mo37653e(C31920h hVar) {
        if (!hVar.equals(this.f85807c.mo3842a())) {
            this.f85807c.mo5708l(hVar);
        }
    }
}
