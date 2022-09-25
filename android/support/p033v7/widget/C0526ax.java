package android.support.p033v7.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.p033v7.app.C0388i;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: android.support.v7.widget.ax */
/* compiled from: PG */
final class C0526ax implements DialogInterface.OnClickListener, C0535be {

    /* renamed from: a */
    C0392m f2082a;

    /* renamed from: b */
    final /* synthetic */ AppCompatSpinner f2083b;

    /* renamed from: c */
    private ListAdapter f2084c;

    /* renamed from: d */
    private CharSequence f2085d;

    public C0526ax(AppCompatSpinner appCompatSpinner) {
        this.f2083b = appCompatSpinner;
    }

    /* renamed from: a */
    public final int mo2528a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo2529b() {
        return 0;
    }

    /* renamed from: c */
    public final Drawable mo2530c() {
        return null;
    }

    /* renamed from: d */
    public final CharSequence mo2531d() {
        return this.f2085d;
    }

    /* renamed from: e */
    public final void mo2532e(ListAdapter listAdapter) {
        this.f2084c = listAdapter;
    }

    /* renamed from: f */
    public final void mo2533f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    /* renamed from: g */
    public final void mo2534g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    /* renamed from: h */
    public final void mo2535h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    /* renamed from: i */
    public final void mo2536i(CharSequence charSequence) {
        this.f2085d = charSequence;
    }

    /* renamed from: j */
    public final void mo2537j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    /* renamed from: k */
    public final void mo2538k(int i, int i2) {
        if (this.f2084c != null) {
            C0391l lVar = new C0391l(this.f2083b.f1808a);
            CharSequence charSequence = this.f2085d;
            if (charSequence != null) {
                lVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f2084c;
            int selectedItemPosition = this.f2083b.getSelectedItemPosition();
            C0388i iVar = lVar.f1347a;
            iVar.f1338s = listAdapter;
            iVar.f1339t = this;
            iVar.f1345z = selectedItemPosition;
            iVar.f1344y = true;
            C0392m create = lVar.create();
            this.f2082a = create;
            ListView listView = create.f1349a.f1106f;
            C0524av.m1929d(listView, i);
            C0524av.m1928c(listView, i2);
            this.f2082a.show();
        }
    }

    /* renamed from: m */
    public final void mo2539m() {
        C0392m mVar = this.f2082a;
        if (mVar != null) {
            mVar.dismiss();
            this.f2082a = null;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2083b.setSelection(i);
        if (this.f2083b.getOnItemClickListener() != null) {
            this.f2083b.performItemClick((View) null, i, this.f2084c.getItemId(i));
        }
        mo2539m();
    }

    /* renamed from: x */
    public final boolean mo2541x() {
        C0392m mVar = this.f2082a;
        if (mVar != null) {
            return mVar.isShowing();
        }
        return false;
    }
}
