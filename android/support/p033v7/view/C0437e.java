package android.support.p033v7.view;

import android.content.Context;
import android.support.p033v7.view.menu.C0475o;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
/* compiled from: PG */
public final class C0437e extends C0435c implements C0475o {

    /* renamed from: a */
    public final C0477q f1444a;

    /* renamed from: b */
    private final Context f1445b;

    /* renamed from: c */
    private final ActionBarContextView f1446c;

    /* renamed from: f */
    private final C0434b f1447f;

    /* renamed from: g */
    private WeakReference f1448g;

    /* renamed from: h */
    private boolean f1449h;

    public C0437e(Context context, ActionBarContextView actionBarContextView, C0434b bVar) {
        this.f1445b = context;
        this.f1446c = actionBarContextView;
        this.f1447f = bVar;
        C0477q qVar = new C0477q(actionBarContextView.getContext());
        qVar.f1655f = 1;
        this.f1444a = qVar;
        qVar.f1651b = this;
    }

    /* renamed from: Q */
    public final void mo1164Q(C0477q qVar) {
        mo1264g();
        this.f1446c.mo1839n();
    }

    /* renamed from: U */
    public final boolean mo1168U(C0477q qVar, MenuItem menuItem) {
        return this.f1447f.mo1124b(this, menuItem);
    }

    /* renamed from: a */
    public final Menu mo1258a() {
        return this.f1444a;
    }

    /* renamed from: b */
    public final MenuInflater mo1259b() {
        return new C0442j(this.f1446c.getContext());
    }

    /* renamed from: c */
    public final View mo1260c() {
        WeakReference weakReference = this.f1448g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public final CharSequence mo1261d() {
        return this.f1446c.f1730h;
    }

    /* renamed from: e */
    public final CharSequence mo1262e() {
        return this.f1446c.f1729g;
    }

    /* renamed from: f */
    public final void mo1263f() {
        if (!this.f1449h) {
            this.f1449h = true;
            this.f1447f.mo1123a(this);
        }
    }

    /* renamed from: g */
    public final void mo1264g() {
        this.f1447f.mo1126d(this, this.f1444a);
    }

    /* renamed from: h */
    public final void mo1265h(View view) {
        this.f1446c.mo1836k(view);
        this.f1448g = view != null ? new WeakReference(view) : null;
    }

    /* renamed from: i */
    public final void mo1266i(int i) {
        String string = this.f1445b.getString(i);
        ActionBarContextView actionBarContextView = this.f1446c;
        actionBarContextView.f1730h = string;
        actionBarContextView.mo1834i();
    }

    /* renamed from: j */
    public final void mo1267j(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.f1446c;
        actionBarContextView.f1730h = charSequence;
        actionBarContextView.mo1834i();
    }

    /* renamed from: k */
    public final void mo1268k(int i) {
        this.f1446c.mo1837l(this.f1445b.getString(i));
    }

    /* renamed from: l */
    public final void mo1269l(CharSequence charSequence) {
        this.f1446c.mo1837l(charSequence);
    }

    /* renamed from: m */
    public final void mo1270m(boolean z) {
        this.f1443e = z;
        this.f1446c.mo1838m(z);
    }

    /* renamed from: n */
    public final boolean mo1271n() {
        return this.f1446c.f1732j;
    }
}
