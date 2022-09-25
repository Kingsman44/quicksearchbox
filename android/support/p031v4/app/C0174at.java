package android.support.p031v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.C1845a;
import androidx.core.p097i.C1974i;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.at */
/* compiled from: PG */
public abstract class C0174at extends C0171aq {

    /* renamed from: b */
    public final Activity f741b;

    /* renamed from: c */
    public final Context f742c;

    /* renamed from: d */
    public final Handler f743d;

    /* renamed from: e */
    public final FragmentManager f744e;

    public C0174at(Activity activity, Context context, Handler handler) {
        this.f744e = new C0199br();
        this.f741b = activity;
        C1974i.m5319g(context, "context == null");
        this.f742c = context;
        C1974i.m5319g(handler, "handler == null");
        this.f743d = handler;
    }

    /* renamed from: a */
    public View mo521a(int i) {
        throw null;
    }

    /* renamed from: b */
    public boolean mo522b() {
        return true;
    }

    /* renamed from: c */
    public LayoutInflater mo532c() {
        throw null;
    }

    /* renamed from: f */
    public abstract Object mo533f();

    /* renamed from: g */
    public void mo534g() {
    }

    /* renamed from: h */
    public boolean mo536h(String str) {
        return false;
    }

    /* renamed from: i */
    public void mo537i(PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: k */
    public final void mo587k(Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C1845a.m5059b(this.f742c, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0174at(Context context, Handler handler) {
        this(context instanceof Activity ? (Activity) context : null, context, handler);
    }
}
