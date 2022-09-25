package androidx.biometric;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.biometric.l */
/* compiled from: PG */
public final /* synthetic */ class C0938l implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C0951y f3039a;

    public /* synthetic */ C0938l(C0951y yVar) {
        this.f3039a = yVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C0951y yVar = this.f3039a;
        C0933g gVar = (C0933g) obj;
        if (gVar != null) {
            int i = gVar.f3032a;
            CharSequence charSequence = gVar.f3033b;
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    i = 8;
                    break;
            }
            yVar.mo3564e();
            if (charSequence == null) {
                yVar.getString(R.string.default_error_msg);
            }
            yVar.mo3565f(i);
            yVar.mo3560a();
            yVar.f3048a.mo3541i((C0933g) null);
        }
    }
}
