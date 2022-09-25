package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.activity.k */
/* compiled from: PG */
public class C0798k extends Dialog implements C2391v, C0823s {

    /* renamed from: a */
    private C2393x f2743a;

    /* renamed from: b */
    public final OnBackPressedDispatcher f2744b = new OnBackPressedDispatcher(new C0797j(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0798k(Context context, int i) {
        super(context, i);
        C69664n.m101061g(context, "context");
    }

    /* renamed from: a */
    private final C2393x mo36444a() {
        C2393x xVar = this.f2743a;
        if (xVar != null) {
            return xVar;
        }
        C2393x xVar2 = new C2393x(this);
        this.f2743a = xVar2;
        return xVar2;
    }

    /* renamed from: b */
    private final void mo1197b() {
        Window window = getWindow();
        C69664n.m101058d(window);
        window.getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        C69664n.m101058d(window2);
        View decorView = window2.getDecorView();
        C69664n.m101060f(decorView, "window!!.decorView");
        C0824t.m2679a(decorView, this);
    }

    /* renamed from: f */
    public static final void m2639f(C0798k kVar) {
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C69664n.m101061g(view, "view");
        mo1197b();
        super.addContentView(view, layoutParams);
    }

    public final C2384o getLifecycle() {
        return mo36444a();
    }

    /* renamed from: gz */
    public final OnBackPressedDispatcher mo535gz() {
        return this.f2744b;
    }

    public void onBackPressed() {
        this.f2744b.mo3340c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f2744b;
            onBackPressedDispatcher.f2720b = getOnBackInvokedDispatcher();
            onBackPressedDispatcher.mo3341d();
        }
        mo36444a().mo5793e(C2382m.ON_CREATE);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo36444a().mo5793e(C2382m.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        mo36444a().mo5793e(C2382m.ON_DESTROY);
        this.f2743a = null;
        super.onStop();
    }

    public void setContentView(int i) {
        mo1197b();
        super.setContentView(i);
    }

    public void setContentView(View view) {
        C69664n.m101061g(view, "view");
        mo1197b();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C69664n.m101061g(view, "view");
        mo1197b();
        super.setContentView(view, layoutParams);
    }
}
