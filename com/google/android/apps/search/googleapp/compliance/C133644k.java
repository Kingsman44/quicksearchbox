package com.google.android.apps.search.googleapp.compliance;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.view.View;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0811d;
import androidx.core.content.C1882h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23939q;
import com.google.android.libraries.search.location.p3029a.C38586af;
import com.google.android.libraries.search.location.p3029a.C38590aj;
import com.google.android.libraries.search.location.p3029a.C38625bq;
import com.google.android.libraries.search.location.p3029a.C38626br;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.googleapp.compliance.k */
/* compiled from: PG */
public final class C133644k extends C133645l {

    /* renamed from: a */
    public final C133622c f364044a;

    /* renamed from: b */
    public final C38586af f364045b;

    /* renamed from: c */
    public final C28443m f364046c;

    /* renamed from: d */
    public final C47770dh f364047d;

    /* renamed from: e */
    public final C28310af f364048e;

    /* renamed from: f */
    public final C28306ab f364049f;

    /* renamed from: g */
    public final HelpAndFeedbackStarter f364050g;

    /* renamed from: h */
    public final C0816c f364051h;

    /* renamed from: j */
    private final Context f364052j;

    public C133644k(Context context, C133622c cVar, C38586af afVar, C28443m mVar, C47770dh dhVar, C28310af afVar2, C28306ab abVar, HelpAndFeedbackStarter helpAndFeedbackStarter) {
        this.f364052j = context;
        this.f364044a = cVar;
        this.f364045b = afVar;
        this.f364046c = mVar;
        this.f364047d = dhVar;
        this.f364048e = afVar2;
        this.f364049f = abVar;
        this.f364050g = helpAndFeedbackStarter;
        this.f364051h = cVar.registerForActivityResult(new C0811d(), new C133639f(cVar));
    }

    /* renamed from: g */
    public static void m216867g(C133622c cVar) {
        if (cVar.getActivity() != null) {
            C0167am activity = cVar.getActivity();
            activity.getClass();
            activity.finish();
        }
        cVar.dismiss();
    }

    /* renamed from: a */
    public final View mo111309a() {
        return this.f364044a.requireView().findViewById(R.id.positive_rounded_button_vertical);
    }

    /* renamed from: b */
    public final View mo111310b() {
        return this.f364044a.requireView().findViewById(R.id.negative_rounded_button_vertical);
    }

    /* renamed from: c */
    public final View mo111311c() {
        return this.f364044a.requireView().findViewById(R.id.description_paragraph);
    }

    /* renamed from: d */
    public final View mo111312d() {
        return this.f364044a.requireView().findViewById(R.id.temporary_positive_rounded_button_vertical);
    }

    /* renamed from: e */
    public final C23939q mo111313e() {
        View requireView = this.f364044a.requireView();
        requireView.getClass();
        return (C23939q) requireView;
    }

    /* renamed from: f */
    public final void mo111314f(C38590aj ajVar) {
        C38586af afVar = this.f364045b;
        C38625bq bqVar = (C38625bq) C38626br.f102069c.createBuilder();
        bqVar.copyOnWrite();
        C38626br brVar = (C38626br) bqVar.instance;
        brVar.f102072b = 1;
        brVar.f102071a |= 1;
        C46459k.m82829b(afVar.mo41511g(ajVar, (C38626br) bqVar.build()), "Unable to log users consent status.", new Object[0]);
        C0167am activity = this.f364044a.getActivity();
        activity.getClass();
        C38590aj ajVar2 = C38590aj.CONSENT_REASON_UNKNOWN;
        int ordinal = ajVar.ordinal();
        if (ordinal != 0) {
            int i = 2;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = 8;
                } else if (ordinal == 3) {
                    i = 4;
                } else if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new AssertionError();
                    }
                }
            }
            activity.setResult(i);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: h */
    public final boolean mo111315h() {
        return C1882h.m5137c(this.f364052j, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }
}
