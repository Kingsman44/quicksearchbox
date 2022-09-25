package com.google.android.gms.car;

import android.content.Context;
import android.support.p031v4.app.C0174at;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.C0823s;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2384o;
import androidx.p124l.p125a.C2305b;
import androidx.p124l.p125a.C2310g;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.car.aq */
/* compiled from: PG */
final class C143105aq extends C0174at implements C2371bs, C0823s {

    /* renamed from: a */
    final /* synthetic */ C143106ar f388172a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143105aq(C143106ar arVar, Context context) {
        super(context, new C144861c());
        this.f388172a = arVar;
    }

    /* renamed from: a */
    public final View mo521a(int i) {
        return this.f388172a.mo118025u(i);
    }

    /* renamed from: b */
    public final boolean mo522b() {
        Window v = this.f388172a.mo118026v();
        return (v == null || v.peekDecorView() == null) ? false : true;
    }

    /* renamed from: c */
    public final LayoutInflater mo532c() {
        return this.f388172a.mo118024t().cloneInContext(this.f388172a.getBaseContext());
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo533f() {
        return this.f388172a;
    }

    /* renamed from: g */
    public final void mo534g() {
        throw new UnsupportedOperationException();
    }

    public final C2384o getLifecycle() {
        return this.f388172a.f388173i;
    }

    public final C2370br getViewModelStore() {
        return this.f388172a.getViewModelStore();
    }

    /* renamed from: gz */
    public final OnBackPressedDispatcher mo535gz() {
        return this.f388172a.f387957h;
    }

    /* renamed from: i */
    public final void mo537i(PrintWriter printWriter, String[] strArr) {
        C143106ar arVar = this.f388172a;
        printWriter.print("  ");
        printWriter.print("Local CarFragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(arVar)));
        printWriter.println(" State:");
        printWriter.print("    ");
        printWriter.print("mCreated=");
        printWriter.print(arVar.f388175k);
        printWriter.print(" mResumed=");
        printWriter.print(arVar.f388176l);
        printWriter.print(" mStopped=");
        printWriter.print(arVar.f388177m);
        if (arVar.getBaseContext() != null) {
            ((C2310g) C2305b.m6238a(arVar)).f6463b.mo5685b("    ", printWriter);
        }
        arVar.f388174j.f739a.f744e.mo436C("  ", (FileDescriptor) null, printWriter, strArr);
        printWriter.print("  ");
        printWriter.println("View Hierarchy:");
        arVar.mo118045M("    ", printWriter, arVar.mo118026v().getDecorView());
    }
}
