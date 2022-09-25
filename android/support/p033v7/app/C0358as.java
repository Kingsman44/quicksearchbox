package android.support.p033v7.app;

import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.view.C0435c;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0798k;
import androidx.core.p098j.C2102q;
import androidx.core.p098j.C2103r;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.app.as */
/* compiled from: PG */
public class C0358as extends C0798k implements C0396q {

    /* renamed from: a */
    private C0401v f1228a;

    /* renamed from: c */
    private final C2102q f1229c = new C0357ar(this);

    public C0358as(Context context, int i) {
        super(context, m1134a(context, i));
        C0401v b = mo1197b();
        ((C0356aq) b).f1183H = m1134a(context, i);
        b.mo1149A();
    }

    /* renamed from: a */
    private static int m1134a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1197b().mo1178g(view, layoutParams);
    }

    /* renamed from: b */
    public final C0401v mo1197b() {
        if (this.f1228a == null) {
            this.f1228a = C0401v.m1323c(this, this);
        }
        return this.f1228a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo1198c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void dismiss() {
        super.dismiss();
        mo1197b().mo1182k();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return C2103r.m5787a(this.f1229c, keyEvent);
    }

    /* renamed from: e */
    public final void mo1201e() {
        mo1197b().mo1150B(1);
    }

    public final View findViewById(int i) {
        return mo1197b().mo1177e(i);
    }

    public final void invalidateOptionsMenu() {
        mo1197b().mo1180i();
    }

    /* renamed from: l */
    public final void mo1204l(C0435c cVar) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo1197b().mo1179h();
        super.onCreate(bundle);
        mo1197b().mo1149A();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo1197b().mo1185n();
    }

    /* renamed from: p */
    public final C0435c mo1207p() {
        return null;
    }

    /* renamed from: r */
    public final void mo1208r() {
    }

    public void setContentView(int i) {
        mo1197b().mo1188p(i);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo1197b().mo1193u(getContext().getString(i));
    }

    public void setContentView(View view) {
        mo1197b().mo1189q(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1197b().mo1190r(view, layoutParams);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo1197b().mo1193u(charSequence);
    }
}
