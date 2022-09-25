package com.google.android.apps.gsa.staticplugins.avocado.p7420b;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.EnrollmentHelper;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.C92420a;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.ParentReauthScreenView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.b.f */
/* compiled from: PG */
public final class C94189f extends C83907bm {

    /* renamed from: b */
    public static final C59071e f263155b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.b.f");

    /* renamed from: c */
    public int f263156c = 1;

    /* renamed from: d */
    C9439b f263157d;

    /* renamed from: e */
    long f263158e;

    /* renamed from: f */
    public C86054o f263159f;

    /* renamed from: g */
    public C90929bz f263160g;

    /* renamed from: h */
    public C91189au f263161h;

    /* renamed from: i */
    public C92371d f263162i;

    /* renamed from: j */
    public C87677ae f263163j;

    /* renamed from: k */
    public EnrollmentHelper f263164k;

    /* renamed from: l */
    public ParentReauthScreenView f263165l;

    /* renamed from: m */
    C58833ax f263166m = C58836b.f156633a;

    /* renamed from: n */
    private C90584f f263167n;

    /* renamed from: e */
    public final C87673aa mo88385e() {
        if (!this.f263166m.mo56113h()) {
            this.f263166m = C58833ax.m90834k(this.f263163j.mo81958a(new C94184a(this), (C90757ba) null, C92408n.m151740b()));
        }
        return (C87673aa) this.f263166m.mo56107c();
    }

    /* renamed from: g */
    public final void mo88386g(int i) {
        this.f263156c = i;
        mo77318iT().mo77312a();
    }

    public final void onCreate(Bundle bundle) {
        C83891ay.m133615a(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f263157d = C9439b.m23955a(arguments.getInt("enrollment_entry_id"));
        this.f263158e = arguments.getLong("enrollment_request_id");
        C90584f fVar = C90584f.OK_HEY_GOOGLE;
        this.f263167n = fVar;
        this.f263164k.mo87039b(1129, this.f263157d, this.f263158e, fVar);
        if (bundle != null) {
            mo88385e().mo81945q(bundle);
        } else {
            mo88385e().mo81947s((Bundle) null);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f263165l = (ParentReauthScreenView) layoutInflater.inflate(R.layout.hotword_enrollment_parent_reauth_screen, (ViewGroup) null);
        C92420a aVar = new C92420a();
        aVar.mo87069f(false);
        aVar.mo87068e(false);
        aVar.mo87067d(true);
        aVar.mo87066c(false);
        aVar.mo87071h(getArguments().getString("parent_email"));
        aVar.mo87070g(getArguments().getString("parent_display_name"));
        aVar.mo87072i(this.f263162i.mo87022c());
        aVar.mo87073j(this.f263162i.mo87023d());
        aVar.mo87065b(this.f263164k);
        aVar.f257752a = new C94185b(this);
        aVar.f257753b = new C94186c(this);
        this.f263165l.mo87060d(aVar.mo87064a());
        ImageView a = this.f263165l.mo87057a();
        this.f263160g.mo85147l(this.f263161h.mo85419g(Uri.parse(getArguments().getString("parent_image_uri")), a), new C94187d(a));
        return this.f263165l;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f263164k.mo87039b(1130, this.f263157d, this.f263158e, this.f263167n);
    }

    public final void onStart() {
        super.onStart();
        mo88385e().mo81932c();
    }

    public final void onStop() {
        super.onStop();
        mo88385e().mo81933e();
    }
}
