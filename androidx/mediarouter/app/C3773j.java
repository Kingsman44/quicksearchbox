package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import androidx.mediarouter.p175a.C3753z;

/* renamed from: androidx.mediarouter.app.j */
/* compiled from: PG */
public class C3773j extends C0260w {

    /* renamed from: a */
    public final boolean f12188a = false;

    /* renamed from: b */
    public Dialog f12189b;

    /* renamed from: c */
    public C3753z f12190c;

    public C3773j() {
        setCancelable(true);
    }

    /* renamed from: a */
    public final void mo7995a() {
        if (this.f12190c == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f12190c = C3753z.m10882a(arguments.getBundle("selector"));
            }
            if (this.f12190c == null) {
                this.f12190c = C3753z.f12042a;
            }
        }
    }

    /* renamed from: b */
    public C3772i mo7996b(Context context) {
        return new C3772i(context);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f12189b;
        if (dialog != null) {
            ((C3772i) dialog).mo7991i();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C3772i b = mo7996b(getContext());
        this.f12189b = b;
        mo7995a();
        C3772i iVar = b;
        b.mo7990h(this.f12190c);
        return this.f12189b;
    }
}
