package android.support.p033v7.app;

import android.content.Context;
import android.support.p033v7.view.C0434b;
import android.support.p033v7.view.C0435c;
import android.support.p033v7.view.C0442j;
import android.support.p033v7.view.menu.C0475o;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.bm */
/* compiled from: PG */
public final class C0379bm extends C0435c implements C0475o {

    /* renamed from: a */
    public final C0477q f1268a;

    /* renamed from: b */
    public C0434b f1269b;

    /* renamed from: c */
    final /* synthetic */ C0381bo f1270c;

    /* renamed from: f */
    private final Context f1271f;

    /* renamed from: g */
    private WeakReference f1272g;

    public C0379bm(C0381bo boVar, Context context, C0434b bVar) {
        this.f1270c = boVar;
        this.f1271f = context;
        this.f1269b = bVar;
        C0477q qVar = new C0477q(context);
        qVar.f1655f = 1;
        this.f1268a = qVar;
        qVar.f1651b = this;
    }

    /* renamed from: Q */
    public final void mo1164Q(C0477q qVar) {
        if (this.f1269b != null) {
            mo1264g();
            this.f1270c.f1291e.mo1839n();
        }
    }

    /* renamed from: U */
    public final boolean mo1168U(C0477q qVar, MenuItem menuItem) {
        C0434b bVar = this.f1269b;
        if (bVar != null) {
            return bVar.mo1124b(this, menuItem);
        }
        return false;
    }

    /* renamed from: a */
    public final Menu mo1258a() {
        return this.f1268a;
    }

    /* renamed from: b */
    public final MenuInflater mo1259b() {
        return new C0442j(this.f1271f);
    }

    /* renamed from: c */
    public final View mo1260c() {
        WeakReference weakReference = this.f1272g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public final CharSequence mo1261d() {
        return this.f1270c.f1291e.f1730h;
    }

    /* renamed from: e */
    public final CharSequence mo1262e() {
        return this.f1270c.f1291e.f1729g;
    }

    /* renamed from: g */
    public final void mo1264g() {
        if (this.f1270c.f1294h == this) {
            this.f1268a.mo1675s();
            try {
                this.f1269b.mo1126d(this, this.f1268a);
            } finally {
                this.f1268a.mo1672r();
            }
        }
    }

    /* renamed from: h */
    public final void mo1265h(View view) {
        this.f1270c.f1291e.mo1836k(view);
        this.f1272g = new WeakReference(view);
    }

    /* renamed from: i */
    public final void mo1266i(int i) {
        mo1267j(this.f1270c.f1287a.getResources().getString(i));
    }

    /* renamed from: j */
    public final void mo1267j(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f1270c.f1291e;
        actionBarContextView.f1730h = charSequence;
        actionBarContextView.mo1834i();
    }

    /* renamed from: k */
    public final void mo1268k(int i) {
        mo1269l(this.f1270c.f1287a.getResources().getString(i));
    }

    /* renamed from: l */
    public final void mo1269l(CharSequence charSequence) {
        this.f1270c.f1291e.mo1837l(charSequence);
    }

    /* renamed from: m */
    public final void mo1270m(boolean z) {
        this.f1443e = z;
        this.f1270c.f1291e.mo1838m(z);
    }

    /* renamed from: n */
    public final boolean mo1271n() {
        return this.f1270c.f1291e.f1732j;
    }

    /* renamed from: f */
    public final void mo1263f() {
        C0381bo boVar = this.f1270c;
        if (boVar.f1294h == this) {
            if (!C0381bo.m1211L(boVar.f1299m, boVar.f1300n, false)) {
                boVar.f1295i = this;
                boVar.f1296j = this.f1269b;
            } else {
                this.f1269b.mo1123a(this);
            }
            this.f1269b = null;
            this.f1270c.mo1282H(false);
            ActionBarContextView actionBarContextView = this.f1270c.f1291e;
            if (actionBarContextView.f1731i == null) {
                actionBarContextView.mo1835j();
            }
            C0381bo boVar2 = this.f1270c;
            boVar2.f1288b.mo1860k(boVar2.f1302p);
            this.f1270c.f1294h = null;
        }
    }
}
