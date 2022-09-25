package android.support.p033v7.view;

import android.content.Context;
import android.support.p033v7.view.menu.C0455ai;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.core.p087b.p088a.C1840a;

/* renamed from: android.support.v7.view.g */
/* compiled from: PG */
public final class C0439g extends ActionMode {

    /* renamed from: a */
    final Context f1454a;

    /* renamed from: b */
    final C0435c f1455b;

    public C0439g(Context context, C0435c cVar) {
        this.f1454a = context;
        this.f1455b = cVar;
    }

    public final void finish() {
        this.f1455b.mo1263f();
    }

    public final View getCustomView() {
        return this.f1455b.mo1260c();
    }

    public final Menu getMenu() {
        return new C0455ai(this.f1454a, (C1840a) this.f1455b.mo1258a());
    }

    public final MenuInflater getMenuInflater() {
        return this.f1455b.mo1259b();
    }

    public final CharSequence getSubtitle() {
        return this.f1455b.mo1261d();
    }

    public final Object getTag() {
        return this.f1455b.f1442d;
    }

    public final CharSequence getTitle() {
        return this.f1455b.mo1262e();
    }

    public final boolean getTitleOptionalHint() {
        return this.f1455b.f1443e;
    }

    public final void invalidate() {
        this.f1455b.mo1264g();
    }

    public final boolean isTitleOptional() {
        return this.f1455b.mo1271n();
    }

    public final void setCustomView(View view) {
        this.f1455b.mo1265h(view);
    }

    public final void setSubtitle(int i) {
        this.f1455b.mo1266i(i);
    }

    public final void setTag(Object obj) {
        this.f1455b.f1442d = obj;
    }

    public final void setTitle(int i) {
        this.f1455b.mo1268k(i);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f1455b.mo1270m(z);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f1455b.mo1267j(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f1455b.mo1269l(charSequence);
    }
}
