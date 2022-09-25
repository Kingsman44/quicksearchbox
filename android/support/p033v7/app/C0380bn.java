package android.support.p033v7.app;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0683gr;
import android.support.p033v7.widget.C0685gt;
import android.support.p033v7.widget.C0687gv;
import android.view.View;
import android.widget.Spinner;
import com.google.android.apps.gsa.languagepack.p;

/* renamed from: android.support.v7.app.bn */
/* compiled from: PG */
public final class C0380bn extends C0382c {

    /* renamed from: a */
    public Object f1273a;

    /* renamed from: b */
    public int f1274b = -1;

    /* renamed from: c */
    final /* synthetic */ C0381bo f1275c;

    /* renamed from: d */
    public p f1276d;

    /* renamed from: e */
    private CharSequence f1277e;

    public C0380bn(C0381bo boVar) {
        this.f1275c = boVar;
    }

    /* renamed from: a */
    public final int mo1272a() {
        return this.f1274b;
    }

    /* renamed from: b */
    public final Drawable mo1273b() {
        return null;
    }

    /* renamed from: c */
    public final View mo1274c() {
        return null;
    }

    /* renamed from: d */
    public final CharSequence mo1275d() {
        return null;
    }

    /* renamed from: e */
    public final CharSequence mo1276e() {
        return this.f1277e;
    }

    /* renamed from: f */
    public final void mo1277f() {
        this.f1275c.mo1283I(this);
    }

    /* renamed from: g */
    public final void mo1278g(p pVar) {
        this.f1276d = pVar;
    }

    /* renamed from: h */
    public final void mo1279h(Object obj) {
        this.f1273a = obj;
    }

    /* renamed from: i */
    public final void mo1280i(int i) {
        this.f1277e = this.f1275c.f1287a.getResources().getText(i);
        int i2 = this.f1274b;
        if (i2 >= 0) {
            C0687gv gvVar = this.f1275c.f1293g;
            ((C0685gt) gvVar.f2513b.getChildAt(i2)).mo3155a();
            Spinner spinner = gvVar.f2514c;
            if (spinner != null) {
                ((C0683gr) spinner.getAdapter()).notifyDataSetChanged();
            }
            if (gvVar.f2515d) {
                gvVar.requestLayout();
            }
        }
    }
}
