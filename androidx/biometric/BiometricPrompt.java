package androidx.biometric;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class BiometricPrompt {

    /* compiled from: PG */
    public class ResetCallbackObserver implements C2376g {

        /* renamed from: a */
        private final WeakReference f2978a;

        public ResetCallbackObserver(C0908al alVar) {
            this.f2978a = new WeakReference(alVar);
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            if (this.f2978a.get() != null) {
                ((C0908al) this.f2978a.get()).f2994b = null;
            }
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    }

    /* renamed from: a */
    static C0908al m2791a(Fragment fragment, boolean z) {
        C2371bs activity = z ? fragment.getActivity() : null;
        if (activity == null) {
            activity = fragment.getParentFragment();
        }
        if (activity != null) {
            return (C0908al) new C2368bp(activity).mo5770a(C0908al.class);
        }
        throw new IllegalStateException("view model not found");
    }
}
