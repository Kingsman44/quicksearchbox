package com.google.android.apps.search.googleapp.compliance;

import android.app.Dialog;
import android.support.p031v4.app.Fragment;
import android.view.Window;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.compliance.bc */
/* compiled from: PG */
public final class C133617bc {

    /* renamed from: a */
    final C46440f f363991a = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((Dialog) Objects.requireNonNull(C133617bc.this.f363993c)).dismiss();
            Snackbar.m79660p(((Fragment) Objects.requireNonNull(C133617bc.this.f363992b)).requireView(), R.string.googleapp_compliance_server_sync_failed, 0).mo48343h();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
            C133617bc bcVar = C133617bc.this;
            bcVar.f363993c = new Dialog(((Fragment) Objects.requireNonNull(bcVar.f363992b)).requireContext());
            C133617bc.this.f363993c.requestWindowFeature(1);
            C133617bc.this.f363993c.setCancelable(false);
            C133617bc.this.f363993c.setCanceledOnTouchOutside(false);
            C133617bc.this.f363993c.setContentView(R.layout.googleapp_compliance_sync_spinner_dialog);
            Window window = C133617bc.this.f363993c.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(17170445);
                window.setDimAmount(0.5f);
            }
            ((Dialog) Objects.requireNonNull(C133617bc.this.f363993c)).show();
        }
    };

    /* renamed from: b */
    public final Fragment f363992b;

    /* renamed from: c */
    public Dialog f363993c;

    public C133617bc(Fragment fragment) {
        this.f363992b = fragment;
    }

    /* renamed from: a */
    public final void mo111292a() {
        Dialog dialog = this.f363993c;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
