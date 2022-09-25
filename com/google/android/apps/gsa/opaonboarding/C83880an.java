package com.google.android.apps.gsa.opaonboarding;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s;
import com.google.android.libraries.p1646ay.C19601c;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.opaonboarding.an */
/* compiled from: PG */
public abstract class C83880an {

    /* renamed from: a */
    public static final C59071e f228526a = C59071e.m91332i("com.google.android.apps.gsa.opaonboarding.an");

    /* renamed from: o */
    public static C83879am m133553o() {
        C83940g gVar = new C83940g();
        Bundle bundle = Bundle.EMPTY;
        if (bundle != null) {
            gVar.f228606b = bundle;
            gVar.f228610f = C58836b.f156633a;
            gVar.mo77223c(false);
            gVar.mo77226f(0);
            gVar.mo77225e(2);
            gVar.f228611g = "com.google.android.googlequicksearchbox";
            gVar.f228612h = (byte) (gVar.f228612h | 16);
            gVar.mo77224d(0);
            return gVar;
        }
        throw new NullPointerException("Null sequenceArguments");
    }

    /* renamed from: a */
    public abstract int mo77227a();

    /* renamed from: b */
    public abstract int mo77228b();

    /* renamed from: c */
    public abstract int mo77229c();

    /* renamed from: d */
    public abstract Bundle mo77230d();

    /* renamed from: e */
    public abstract C83818a mo77231e();

    /* renamed from: f */
    public abstract C58833ax mo77232f();

    /* renamed from: g */
    public abstract C58833ax mo77233g();

    /* renamed from: h */
    public abstract C58833ax mo77234h();

    /* renamed from: i */
    public abstract C59567w mo77235i();

    /* renamed from: j */
    public abstract String mo77236j();

    /* renamed from: k */
    public abstract String mo77237k();

    /* renamed from: l */
    public abstract boolean mo77238l();

    /* renamed from: m */
    public abstract boolean mo77239m();

    /* renamed from: n */
    public final Intent mo77240n() {
        Bundle bundle;
        C83818a e = mo77231e();
        String j = mo77236j();
        Intent putExtra = new Intent().putExtra("seq_name", mo77237k());
        byte[] bArr = null;
        if (e == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putInt("account_config:use_gsa_account", e.mo77201a());
            bundle.putString("account_config:fixed_account_name", e.mo77202b());
            bundle.putString("account_config:impersonated_user_id", e.mo77203c());
        }
        Intent putExtra2 = putExtra.putExtra("acc_config", bundle).putExtra("unicorn_config", (Bundle) mo77233g().mo56106b(C83878al.f228525a).mo56111f()).putExtra("unicorn_enrollment_config", mo77234h().mo56113h() ? ((C92395s) mo77234h().mo56107c()).toByteArray() : null).putExtra("seq_args", mo77230d());
        if (mo77232f().mo56113h()) {
            bArr = ((C83915b) mo77232f().mo56107c()).toByteArray();
        }
        return C19601c.m37394a("named-sequence-activity", putExtra2.putExtra("confirm_cancel_dialog", bArr).putExtra("onboarding_data", mo77235i().toByteArray()).putExtra("hide_caption_bar", mo77238l()).putExtra("sequence_theme", mo77229c()).putExtra("material_next_mode", mo77227a()).putExtra("sequence_orientation_mode", mo77228b()).putExtra("package_name", j), new ComponentName((String) C58831av.m90830c(j, "com.google.android.googlequicksearchbox"), (mo77228b() == 4 || mo77239m()) ? "com.google.android.apps.gsa.velour.dynamichosts.NoOrientationConfigVelvetDynamicHostActivity" : "com.google.android.apps.gsa.velour.dynamichosts.TransparentVelvetDynamicHostActivity"), true);
    }
}
