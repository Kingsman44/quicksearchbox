package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83983ah;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ay */
/* compiled from: PG */
public final class C94181ay extends C83907bm {

    /* renamed from: b */
    public static final C59071e f263133b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.ay");

    /* renamed from: c */
    public C68214a f263134c;

    /* renamed from: d */
    public ai f263135d;

    /* renamed from: e */
    public C83893b f263136e;

    /* renamed from: f */
    public C58833ax f263137f;

    /* renamed from: g */
    public C92371d f263138g;

    /* renamed from: h */
    public OpaPageLayout f263139h;

    /* renamed from: i */
    public int f263140i = 0;

    /* renamed from: j */
    public C83923j f263141j;

    /* renamed from: k */
    public C101495ac f263142k;

    /* renamed from: e */
    private final Spannable m155453e(int i) {
        String str;
        String string = getString(i);
        Object[] objArr = new Object[4];
        objArr[0] = "GENDER";
        ai aiVar = this.f263135d;
        if (aiVar == null || !aiVar.e()) {
            str = this.f263138g.mo87023d();
        } else {
            str = this.f263135d.c();
        }
        objArr[1] = str;
        objArr[2] = "PERSON";
        objArr[3] = m155454g();
        return AvocadoUtils.m155378b(C5114a.m13988b(Locale.getDefault(), string, objArr), getResources().getColor(R.color.link_text_color));
    }

    /* renamed from: g */
    private final String m155454g() {
        ai aiVar = this.f263135d;
        if (aiVar == null || !aiVar.e()) {
            return this.f263138g.mo87022c();
        }
        return this.f263135d.b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f263139h = (OpaPageLayout) layoutInflater.inflate(R.layout.kids_avocado_consent, (ViewGroup) null);
        Bundle arguments = getArguments();
        arguments.getClass();
        C83923j jVar = (C83923j) C90734ar.m148199b(arguments, "device_id_list_key", C83923j.f228570d.getParserForType());
        this.f263141j = jVar;
        C58838bb.m90867b(jVar, "Must supply DeviceScanResult under key %s", "device_id_list_key");
        HeaderLayout headerLayout = (HeaderLayout) this.f263139h.f228728c.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, getString(R.string.delegated_unicorn_consent_screen_title, new Object[]{m155454g()}), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, m155453e(R.string.delegated_unicorn_consent_screen_message), TextView.BufferType.NORMAL, headerLayout);
        ((TextView) this.f263139h.findViewById(R.id.delegated_consent_screen_unicorn_message_content_1_1)).setText(m155453e(R.string.delegated_consent_screen_unicorn_message_content_1_1));
        ((TextView) this.f263139h.findViewById(R.id.delegated_consent_screen_unicorn_message_content_1_2)).setText(m155453e(R.string.delegated_consent_screen_unicorn_message_content_1_2));
        ((TextView) this.f263139h.findViewById(R.id.delegated_consent_screen_unicorn_message_content_1_3)).setText(m155453e(R.string.delegated_consent_screen_unicorn_message_content_1_3));
        ((TextView) this.f263139h.findViewById(R.id.delegated_consent_screen_unicorn_message_content_2)).setText(m155453e(R.string.delegated_consent_screen_unicorn_message_content_2));
        ((TextView) this.f263139h.findViewById(R.id.delegated_consent_screen_unicorn_message_content_3)).setText(getString(R.string.delegated_consent_screen_unicorn_message_content_3, new Object[]{m155454g()}));
        C83983ah.m133842b(this.f263139h, new C94180ax(this)).mo77412a();
        return this.f263139h;
    }

    public final void onDestroyView() {
        C89849ae aeVar;
        super.onDestroyView();
        if (this.f263140i == 1) {
            aeVar = C89849ae.FACE_MATCH_CONSENT_AGREED;
        } else {
            aeVar = C89849ae.FACE_MATCH_CONSENT_SCREEN_EXIT;
        }
        ((C89859i) this.f263134c.mo27525b()).mo83702b(aeVar);
    }
}
