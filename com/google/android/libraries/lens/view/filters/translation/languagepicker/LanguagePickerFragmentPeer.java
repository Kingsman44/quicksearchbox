package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.Context;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60901do;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class LanguagePickerFragmentPeer {

    /* renamed from: A */
    public final C47770dh f71001A;

    /* renamed from: B */
    public final C46440f f71002B = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C26149ar arVar = LanguagePickerFragmentPeer.this.f71020q;
            arVar.getClass();
            arVar.dismiss();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: C */
    private final C60888db f71003C;

    /* renamed from: a */
    public RecyclerView f71004a;

    /* renamed from: b */
    public Locale f71005b;

    /* renamed from: c */
    public Locale f71006c;

    /* renamed from: d */
    public C26197x f71007d;

    /* renamed from: e */
    public C26197x f71008e;

    /* renamed from: f */
    public LiveData f71009f;

    /* renamed from: g */
    public LiveData f71010g;

    /* renamed from: h */
    public LiveData f71011h;

    /* renamed from: i */
    public LiveData f71012i;

    /* renamed from: j */
    public LiveData f71013j;

    /* renamed from: k */
    public LiveData f71014k;

    /* renamed from: l */
    public boolean f71015l;

    /* renamed from: m */
    public LayoutInflater f71016m;

    /* renamed from: n */
    public Context f71017n;

    /* renamed from: o */
    public int f71018o;

    /* renamed from: p */
    public final int f71019p;

    /* renamed from: q */
    public final C26149ar f71020q;

    /* renamed from: r */
    public final LensConnectivityManager f71021r;

    /* renamed from: s */
    public final C26059ax f71022s;

    /* renamed from: t */
    public final C28306ab f71023t;

    /* renamed from: u */
    public final C28443m f71024u;

    /* renamed from: v */
    public final C25684e f71025v;

    /* renamed from: w */
    public final LanguagePickerLifecycleObserver f71026w = new LanguagePickerLifecycleObserver();

    /* renamed from: x */
    public final C37215b f71027x;

    /* renamed from: y */
    public final C46439e f71028y;

    /* renamed from: z */
    public final C26198y f71029z;

    /* compiled from: PG */
    final class LanguagePickerLifecycleObserver implements C2376g {
        public LanguagePickerLifecycleObserver() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            LanguagePickerFragmentPeer.this.f71022s.mo31262q(true);
            LanguagePickerFragmentPeer.this.f71027x.mo19974a(C37194a.f98500bJ);
            LanguagePickerFragmentPeer.this.f71015l = false;
        }

        /* renamed from: ha */
        public final void mo3525ha(C2391v vVar) {
            LanguagePickerFragmentPeer.this.f71022s.mo31262q(false);
            LanguagePickerFragmentPeer languagePickerFragmentPeer = LanguagePickerFragmentPeer.this;
            if (!languagePickerFragmentPeer.f71015l) {
                languagePickerFragmentPeer.f71027x.mo19974a(C37194a.f98501bK.mo40815i(C62722b.CANCELLED));
            }
        }
    }

    public LanguagePickerFragmentPeer(String str, C26149ar arVar, LensConnectivityManager lensConnectivityManager, C26059ax axVar, C28306ab abVar, C28443m mVar, C25684e eVar, C37215b bVar, C60888db dbVar, C46439e eVar2, C26198y yVar, C47770dh dhVar) {
        this.f71019p = Boolean.parseBoolean(str) ^ true ? 1 : 0;
        this.f71020q = arVar;
        this.f71021r = lensConnectivityManager;
        this.f71022s = axVar;
        this.f71023t = abVar;
        this.f71024u = mVar;
        this.f71025v = eVar;
        this.f71027x = bVar;
        this.f71003C = dbVar;
        this.f71028y = eVar2;
        this.f71029z = yVar;
        this.f71001A = dhVar;
    }

    /* renamed from: a */
    public final void mo31336a() {
        this.f71007d.mo31421d();
        this.f71008e.mo31421d();
    }

    /* renamed from: c */
    public final void mo31338c(Locale locale, Locale locale2) {
        this.f71015l = true;
        this.f71005b = locale;
        this.f71006c = locale2;
        this.f71022s.mo31258m(locale, locale2, true);
        C60872cz d = this.f71003C.mo29164d(C60901do.f165001a, (long) this.f71018o, TimeUnit.MILLISECONDS);
        if (!this.f71020q.isStateSaved()) {
            this.f71028y.mo50445g(C46438d.m82810b(d), new C46436b((Object) null), this.f71002B);
        }
    }

    /* renamed from: b */
    public final void mo31337b() {
        C0653fo foVar = this.f71004a.mLayout;
        foVar.getClass();
        foVar.scrollToPosition(0);
    }
}
