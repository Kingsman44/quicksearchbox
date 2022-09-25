package androidx.biometric;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.biometric.o */
/* compiled from: PG */
public final /* synthetic */ class C0941o implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C0951y f3042a;

    public /* synthetic */ C0941o(C0951y yVar) {
        this.f3042a = yVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C0951y yVar = this.f3042a;
        if (((Boolean) obj).booleanValue()) {
            if (yVar.f3048a.mo3537e() == null) {
                yVar.getString(R.string.default_error_msg);
            }
            yVar.mo3565f(13);
            yVar.mo3560a();
            yVar.mo3563d();
            yVar.f3048a.mo3546n(false);
        }
    }
}
