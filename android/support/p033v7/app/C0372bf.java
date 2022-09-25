package android.support.p033v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.ActionMenuView;
import android.support.p033v7.widget.C0556bz;
import android.support.p033v7.widget.C0745iz;
import android.support.p033v7.widget.C0750jd;
import android.support.p033v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.bf */
/* compiled from: PG */
final class C0372bf extends C0383d {

    /* renamed from: a */
    final C0556bz f1246a;

    /* renamed from: b */
    final Window.Callback f1247b;

    /* renamed from: c */
    boolean f1248c;

    /* renamed from: d */
    final C0371be f1249d;

    /* renamed from: e */
    private boolean f1250e;

    /* renamed from: f */
    private boolean f1251f;

    /* renamed from: g */
    private final ArrayList f1252g = new ArrayList();

    /* renamed from: h */
    private final Runnable f1253h = new C0367ba(this);

    /* renamed from: i */
    private final C0745iz f1254i;

    public C0372bf(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C0368bb bbVar = new C0368bb(this);
        this.f1254i = bbVar;
        C0750jd jdVar = new C0750jd(toolbar, false);
        this.f1246a = jdVar;
        callback.getClass();
        this.f1247b = callback;
        C0750jd jdVar2 = jdVar;
        jdVar.f2619f = callback;
        toolbar.f1961u = bbVar;
        jdVar.mo2657t(charSequence);
        this.f1249d = new C0371be(this);
    }

    /* renamed from: A */
    public final void mo1223A() {
        C0750jd jdVar = (C0750jd) this.f1246a;
        jdVar.f2618e = "close";
        jdVar.mo3257F();
    }

    /* renamed from: B */
    public final void mo1224B() {
        this.f1246a.mo2634B();
    }

    /* renamed from: C */
    public final void mo1225C() {
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    /* renamed from: D */
    public final void mo1226D() {
        C0556bz bzVar = this.f1246a;
        bzVar.mo2654q(((C0750jd) bzVar).f2614a.getContext().getText(R.string.language_pack_installer_title));
    }

    /* renamed from: E */
    public final void mo1227E() {
        C2043bi.m5548ab(((C0750jd) this.f1246a).f2614a, 0.0f);
    }

    /* renamed from: F */
    public final void mo1228F() {
    }

    /* renamed from: G */
    public final Menu mo1229G() {
        if (!this.f1250e) {
            C0556bz bzVar = this.f1246a;
            C0369bc bcVar = new C0369bc(this);
            C0370bd bdVar = new C0370bd(this);
            Toolbar toolbar = ((C0750jd) bzVar).f2614a;
            toolbar.f1964x = bcVar;
            toolbar.f1965y = bdVar;
            ActionMenuView actionMenuView = toolbar.f1941a;
            if (actionMenuView != null) {
                actionMenuView.f1787d = bcVar;
                actionMenuView.f1788e = bdVar;
            }
            this.f1250e = true;
        }
        return ((C0750jd) this.f1246a).f2614a.mo2393g();
    }

    /* renamed from: H */
    public final void mo1230H(int i, int i2) {
        C0556bz bzVar = this.f1246a;
        bzVar.mo2649l((i & i2) | ((i2 ^ -1) & ((C0750jd) bzVar).f2615b));
    }

    /* renamed from: a */
    public final int mo1231a() {
        return ((C0750jd) this.f1246a).f2615b;
    }

    /* renamed from: b */
    public final Context mo1232b() {
        return ((C0750jd) this.f1246a).f2614a.getContext();
    }

    /* renamed from: c */
    public final C0382c mo1233c() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: e */
    public final void mo1234e(C0382c cVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: f */
    public final void mo1235f(boolean z) {
        if (z != this.f1251f) {
            this.f1251f = z;
            int size = this.f1252g.size();
            for (int i = 0; i < size; i++) {
                ((C0366b) this.f1252g.get(i)).mo1220a();
            }
        }
    }

    /* renamed from: g */
    public final void mo1236g() {
        ((C0750jd) this.f1246a).f2614a.setVisibility(8);
    }

    /* renamed from: h */
    public final void mo1237h() {
        ((C0750jd) this.f1246a).f2614a.removeCallbacks(this.f1253h);
    }

    /* renamed from: i */
    public final void mo1238i(boolean z) {
    }

    /* renamed from: j */
    public final void mo1239j(boolean z) {
        mo1230H(true != z ? 0 : 4, 4);
    }

    /* renamed from: k */
    public final void mo1240k(boolean z) {
        mo1230H(true != z ? 0 : 2, 2);
    }

    /* renamed from: l */
    public final void mo1241l(Drawable drawable) {
        C0750jd jdVar = (C0750jd) this.f1246a;
        jdVar.f2616c = drawable;
        jdVar.mo3258G();
    }

    /* renamed from: n */
    public final void mo1243n(boolean z) {
    }

    /* renamed from: o */
    public final void mo1244o(CharSequence charSequence) {
        this.f1246a.mo2654q(charSequence);
    }

    /* renamed from: p */
    public final void mo1245p(CharSequence charSequence) {
        this.f1246a.mo2657t(charSequence);
    }

    /* renamed from: q */
    public final void mo1246q() {
        ((C0750jd) this.f1246a).f2614a.setVisibility(0);
    }

    /* renamed from: r */
    public final boolean mo1247r() {
        return ((C0750jd) this.f1246a).f2614a.mo2384B();
    }

    /* renamed from: s */
    public final boolean mo1248s() {
        Toolbar toolbar = ((C0750jd) this.f1246a).f2614a;
        if (!toolbar.mo2383A()) {
            return false;
        }
        toolbar.mo2398i();
        return true;
    }

    /* renamed from: t */
    public final boolean mo1249t() {
        ((C0750jd) this.f1246a).f2614a.removeCallbacks(this.f1253h);
        C2043bi.m5520N(((C0750jd) this.f1246a).f2614a, this.f1253h);
        return true;
    }

    /* renamed from: u */
    public final boolean mo1250u(int i, KeyEvent keyEvent) {
        Menu G = mo1229G();
        if (G == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        G.setQwertyMode(z);
        return G.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: v */
    public final boolean mo1251v(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo1252w();
        }
        return true;
    }

    /* renamed from: w */
    public final boolean mo1252w() {
        return ((C0750jd) this.f1246a).f2614a.mo2386D();
    }

    /* renamed from: x */
    public final void mo1253x() {
    }

    /* renamed from: y */
    public final void mo1254y() {
        mo1230H(14, -1);
    }

    /* renamed from: z */
    public final void mo1255z() {
        mo1230H(8, 8);
    }

    /* renamed from: m */
    public final void mo1242m(int i) {
        C0556bz bzVar = this.f1246a;
        if (((C0750jd) bzVar).f2621h == 1) {
            bzVar.mo2636D();
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }
}
