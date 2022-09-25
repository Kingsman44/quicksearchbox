package android.support.p031v4.app;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.C0823s;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0821h;
import androidx.core.app.C1820g;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2384o;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4091g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.al */
/* compiled from: PG */
final class C0166al extends C0174at implements C2371bs, C0823s, C0821h, C4091g, C0203bv {

    /* renamed from: a */
    final /* synthetic */ C0167am f726a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0166al(C0167am amVar) {
        super(amVar, amVar, new Handler());
        this.f726a = amVar;
    }

    /* renamed from: a */
    public final View mo521a(int i) {
        return this.f726a.findViewById(i);
    }

    /* renamed from: b */
    public final boolean mo522b() {
        Window window = this.f726a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    /* renamed from: c */
    public final LayoutInflater mo532c() {
        return this.f726a.getLayoutInflater().cloneInContext(this.f726a);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo533f() {
        return this.f726a;
    }

    /* renamed from: g */
    public final void mo534g() {
        this.f726a.mo541fQ();
    }

    public final C2384o getLifecycle() {
        return this.f726a.f728b;
    }

    public final C4088d getSavedStateRegistry() {
        return this.f726a.f2706g.f13082a;
    }

    public final C2370br getViewModelStore() {
        return this.f726a.getViewModelStore();
    }

    /* renamed from: gz */
    public final OnBackPressedDispatcher mo535gz() {
        return this.f726a.f2707h;
    }

    /* renamed from: h */
    public final boolean mo536h(String str) {
        return C1820g.m4992b(this.f726a, str);
    }

    /* renamed from: i */
    public final void mo537i(PrintWriter printWriter, String[] strArr) {
        this.f726a.dump("  ", (FileDescriptor) null, printWriter, strArr);
    }

    /* renamed from: j */
    public final void mo538j(Fragment fragment) {
        this.f726a.mo543h();
    }

    /* renamed from: jy */
    public final ActivityResultRegistry mo539jy() {
        return this.f726a.f2708i;
    }
}
