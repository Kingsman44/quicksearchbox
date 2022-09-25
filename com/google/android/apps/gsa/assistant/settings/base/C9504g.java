package com.google.android.apps.gsa.assistant.settings.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p033v7.app.C0391l;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.gsa.assistant.settings.p516d.C9525a;
import com.google.android.apps.gsa.assistant.settings.shared.C73775r;
import com.google.android.apps.gsa.assistant.settings.shared.s;
import com.google.android.apps.gsa.assistant.shared.n.c;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73892d;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7184t.C91098h;
import com.google.android.apps.gsa.staticplugins.p7815dk.C99639m;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: com.google.android.apps.gsa.assistant.settings.base.g */
/* compiled from: PG */
public class C9504g implements C9508j {

    /* renamed from: a */
    public static final C59071e f32985a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.base.g");

    /* renamed from: b */
    public C9525a f32986b;

    /* renamed from: c */
    public s f32987c;

    /* renamed from: d */
    public Context f32988d;

    /* renamed from: e */
    public final AtomicInteger f32989e = new AtomicInteger();

    /* renamed from: f */
    public final ConcurrentHashMap f32990f = new ConcurrentHashMap();

    /* renamed from: g */
    public C9509k f32991g;

    /* renamed from: h */
    public C91098h f32992h;

    /* renamed from: com.google.android.apps.gsa.assistant.settings.base.g$a */
    /* compiled from: PG */
    public interface C9505a {
        /* renamed from: a */
        void mo17816a(C9504g gVar);
    }

    /* renamed from: A */
    public final void mo17787A(String str) {
        this.f32991g.mo17763E(str);
    }

    /* renamed from: B */
    public final void mo17788B(String str, Bundle bundle, int i) {
        this.f32991g.mo17759A(str, bundle, i);
    }

    /* renamed from: C */
    public final void mo17789C(String str, Bundle bundle, CharSequence charSequence) {
        this.f32991g.mo17760B(str, bundle, charSequence);
    }

    /* renamed from: D */
    public final void mo17790D(boolean z) {
        this.f32991g.mo17761C(z);
    }

    /* renamed from: E */
    public final void mo17791E(C73892d dVar, boolean z) {
        if (z) {
            mo17790D(false);
        }
        int andIncrement = this.f32989e.getAndIncrement();
        C9525a aVar = this.f32986b;
        c a = dVar.mo65369a();
        a.d(new C9501d(this, z, dVar, andIncrement));
        C99639m b = aVar.mo17837b(a.a());
        if (b != null) {
            this.f32990f.put(Integer.valueOf(andIncrement), b);
        }
    }

    /* renamed from: e */
    public final PreferenceScreen mo17792e() {
        return this.f32991g.mo17819gi();
    }

    /* renamed from: f */
    public final C91097g mo17793f() {
        return this.f32992h.mo17775x();
    }

    /* renamed from: fX */
    public final Activity mo17794fX() {
        return this.f32991g.mo17766o();
    }

    /* renamed from: g */
    public final String mo17795g(int i) {
        return mo17792e().f12738j.getString(i);
    }

    /* renamed from: gh */
    public final C0391l mo17796gh() {
        return this.f32991g.mo17767p();
    }

    /* renamed from: h */
    public final String mo17797h(int i, Object... objArr) {
        return mo17792e().f12738j.getString(i, objArr);
    }

    /* renamed from: i */
    public final void mo17798i() {
        this.f32991g.mo17769r();
    }

    /* renamed from: j */
    public final void mo17799j(int i, Intent intent) {
        this.f32991g.mo17770s(i, intent);
    }

    /* renamed from: k */
    public final void mo17800k() {
        this.f32991g.mo17771t();
    }

    /* renamed from: l */
    public final void mo17801l() {
        this.f32991g.mo17772u();
    }

    /* renamed from: m */
    public final void mo17802m(PreferenceGroup preferenceGroup, Preference preference) {
        if (preference.mo8353T()) {
            String str = preference.f12748t;
            int j = preferenceGroup.mo8381j();
            while (true) {
                j--;
                if (j >= 0) {
                    Preference o = preferenceGroup.mo8383o(j);
                    if (o.mo8353T() && str.equals(o.f12748t)) {
                        preferenceGroup.mo8380ag(o);
                        preferenceGroup.mo8375z();
                    } else if (o instanceof PreferenceGroup) {
                        mo17802m((PreferenceGroup) o, preference);
                    }
                } else {
                    return;
                }
            }
        } else {
            C59104x d = f32985a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ASPrefControlBase");
            ((C59052c) ((C59052c) d).mo56372aa(323)).mo56389s("Skip hidePreferenceInGroup since %s doesn't have key", preference.f12745q);
        }
    }

    /* renamed from: n */
    public final void mo17803n(String str, int i, C73775r rVar) {
        this.f32987c.a(this.f32988d, str, i, rVar);
    }

    /* renamed from: o */
    public void mo17804o(Bundle bundle) {
    }

    /* renamed from: p */
    public void mo17805p() {
    }

    /* renamed from: q */
    public void mo17806q() {
    }

    /* renamed from: r */
    public void mo17807r() {
    }

    /* renamed from: s */
    public void mo17808s() {
    }

    /* renamed from: t */
    public void mo17809t(Bundle bundle) {
    }

    /* renamed from: u */
    public void mo17810u() {
    }

    /* renamed from: v */
    public void mo17811v() {
    }

    /* renamed from: w */
    public final void mo17812w() {
        this.f32991g.mo17773v();
    }

    @Deprecated
    /* renamed from: x */
    public final void mo17813x(acu acu, C9506h hVar, boolean z) {
        mo17790D(z);
        int andIncrement = this.f32989e.getAndIncrement();
        C99639m c = this.f32986b.mo17838c(acu, new C9500c(this, hVar, andIncrement));
        if (c != null) {
            this.f32990f.put(Integer.valueOf(andIncrement), c);
        }
    }

    /* renamed from: y */
    public final void mo17814y(acx acx, C9506h hVar) {
        int andIncrement = this.f32989e.getAndIncrement();
        C99639m g = this.f32986b.mo17842g(acx, new C9502e(this, hVar, andIncrement));
        if (g != null) {
            this.f32990f.put(Integer.valueOf(andIncrement), g);
        }
    }

    /* renamed from: z */
    public final void mo17815z(int i) {
        this.f32991g.mo17762D(i);
    }
}
