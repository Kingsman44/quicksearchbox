package android.support.p031v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p097i.C1974i;
import androidx.lifecycle.C2371bs;
import androidx.savedstate.C4091g;

/* renamed from: android.support.v4.app.ar */
/* compiled from: PG */
public final class C0172ar {

    /* renamed from: a */
    public final C0174at f739a;

    private C0172ar(C0174at atVar) {
        this.f739a = atVar;
    }

    /* renamed from: b */
    public static C0172ar m374b(C0174at atVar) {
        C1974i.m5319g(atVar, "callbacks == null");
        return new C0172ar(atVar);
    }

    @Deprecated
    /* renamed from: a */
    public final Parcelable mo571a() {
        FragmentManager fragmentManager = this.f739a.f744e;
        if (fragmentManager.f647n instanceof C4091g) {
            fragmentManager.mo453T(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        return fragmentManager.mo472c();
    }

    /* renamed from: c */
    public final View mo572c(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f739a.f744e.f636c.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: d */
    public final void mo573d(Fragment fragment) {
        C0174at atVar = this.f739a;
        atVar.f744e.mo479l(atVar, atVar, fragment);
    }

    /* renamed from: e */
    public final void mo574e() {
        this.f739a.f744e.mo483o();
    }

    /* renamed from: f */
    public final void mo575f(Configuration configuration) {
        this.f739a.f744e.mo484p(configuration);
    }

    /* renamed from: g */
    public final void mo576g() {
        this.f739a.f744e.mo485q();
    }

    /* renamed from: h */
    public final void mo577h() {
        this.f739a.f744e.mo486r();
    }

    /* renamed from: i */
    public final void mo578i() {
        this.f739a.f744e.mo487s();
    }

    /* renamed from: j */
    public final void mo579j() {
        this.f739a.f744e.mo434A(5);
    }

    /* renamed from: k */
    public final void mo580k() {
        this.f739a.f744e.mo494y();
    }

    /* renamed from: l */
    public final void mo581l() {
        this.f739a.f744e.mo495z();
    }

    /* renamed from: m */
    public final void mo582m() {
        this.f739a.f744e.mo435B();
    }

    /* renamed from: n */
    public final void mo583n() {
        this.f739a.f744e.noteStateNotSaved();
    }

    @Deprecated
    /* renamed from: o */
    public final void mo584o(Parcelable parcelable) {
        C0174at atVar = this.f739a;
        if (atVar instanceof C2371bs) {
            FragmentManager fragmentManager = atVar.f744e;
            if (fragmentManager.f647n instanceof C4091g) {
                fragmentManager.mo453T(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            }
            fragmentManager.mo446M(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: p */
    public final void mo585p() {
        this.f739a.f744e.mo470an(true);
    }
}
