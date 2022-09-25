package com.google.android.apps.gsa.staticplugins.avocado;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.assistant.settings.features.av.eq;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.speech.utils.p7317ui.C92658d;
import com.google.android.googlequicksearchbox.R;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.fm */
/* compiled from: PG */
public final class C94315fm extends C83907bm {

    /* renamed from: b */
    public OpaPageLayout f263540b;

    /* renamed from: c */
    public bh f263541c;

    /* renamed from: d */
    public int f263542d = 0;

    /* renamed from: e */
    public ei f263543e;

    /* renamed from: f */
    public dn f263544f;

    /* renamed from: g */
    public eq f263545g;

    /* renamed from: h */
    public C90743b f263546h;

    /* renamed from: i */
    public C83880an f263547i;

    /* renamed from: j */
    public ai f263548j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final ar mo88452e() {
        aq createBuilder = ar.f.createBuilder();
        C9439b a = C9439b.m23955a(this.f263547i.mo77235i().f158062c);
        if (a == null) {
            a = C9439b.UNKNOWN_ENTRY;
        }
        C45595b i = dn.i(a);
        createBuilder.copyOnWrite();
        ar arVar = createBuilder.instance;
        arVar.b = i.f119929nK;
        arVar.a |= 1;
        return createBuilder.build();
    }

    /* renamed from: g */
    public final ItemView mo88453g(String str, int i) {
        ItemView itemView = new ItemView(this.f263540b.getContext());
        itemView.p(str);
        itemView.h(i);
        return itemView;
    }

    /* renamed from: h */
    public final int mo88454h() {
        eq eqVar = this.f263545g;
        bh bhVar = this.f263541c;
        return eqVar.a(bhVar.a == 2 ? (String) bhVar.b : BuildConfig.FLAVOR, 2, this.f263548j.d());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        this.f263540b = (OpaPageLayout) layoutInflater.inflate(R.layout.structure_level_face_match_consent, viewGroup, false);
        Bundle arguments = getArguments();
        arguments.getClass();
        bh e = ProtoParsers.m95522e(arguments, "recognition_settings_selector_key", bh.c, C62921ba.m95368a());
        this.f263541c = e;
        int i = e.a;
        if (i == 1 || i == 2) {
            HeaderLayout headerLayout = (HeaderLayout) this.f263540b.findViewById(R.id.opa_header);
            Resources resources = getContext().getResources();
            if (this.f263541c.a == 1) {
                str = resources.getString(R.string.structure_level_face_match_prop_header_title_device_level);
            } else {
                boolean d = this.f263548j.d();
                String str2 = BuildConfig.FLAVOR;
                if (d) {
                    Object[] objArr = new Object[2];
                    objArr[0] = this.f263548j.b();
                    ei eiVar = this.f263543e;
                    bh bhVar = this.f263541c;
                    if (bhVar.a == 2) {
                        str2 = (String) bhVar.b;
                    }
                    objArr[1] = eiVar.d(str2);
                    str = resources.getString(R.string.structure_level_face_match_prop_header_title_kid, objArr);
                } else {
                    Object[] objArr2 = new Object[1];
                    ei eiVar2 = this.f263543e;
                    bh bhVar2 = this.f263541c;
                    if (bhVar2.a == 2) {
                        str2 = (String) bhVar2.b;
                    }
                    objArr2[0] = eiVar2.d(str2);
                    str = resources.getString(R.string.structure_level_face_match_prop_header_title, objArr2);
                }
            }
            C84018m.m133908c(headerLayout.f228718a, str, TextView.BufferType.NORMAL, headerLayout);
            Resources resources2 = getContext().getResources();
            if (this.f263541c.a == 1) {
                String string = resources2.getString(R.string.fm_learn_more);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(resources2.getString(R.string.structure_level_face_match_prop_header_description_device_level, new Object[]{string}));
                C92658d.m152614a(spannableStringBuilder2, string, new C94314fl(this));
                spannableStringBuilder = spannableStringBuilder2;
            } else if (this.f263548j.d()) {
                spannableStringBuilder = C5114a.m13988b(Locale.getDefault(), resources2.getString(R.string.structure_level_face_match_prop_header_description_kid, new Object[]{this.f263548j.b()}), "GENDER", this.f263548j.c());
            } else {
                spannableStringBuilder = resources2.getString(R.string.structure_level_face_match_prop_header_description);
            }
            C84018m.m133908c(headerLayout.f228719b, spannableStringBuilder, TextView.BufferType.NORMAL, headerLayout);
            headerLayout.f228719b.setMovementMethod(LinkMovementMethod.getInstance());
            headerLayout.f228719b.setClickable(true);
            FooterLayout footerLayout = this.f263540b.f228726a;
            footerLayout.mo77362c(2);
            if (this.f263541c.a == 1) {
                footerLayout.mo77363d(true);
            }
            Button a = footerLayout.mo77360a();
            if (this.f263541c.a == 1) {
                a.setText(R.string.structure_level_face_match_prop_action_button_text_device_level);
            } else {
                a.setText(R.string.structure_level_face_match_prop_action_button_text);
            }
            a.setOnClickListener(new C94307fe(this));
            Button b = footerLayout.mo77361b();
            if (this.f263541c.a == 1) {
                b.setText(R.string.structure_level_face_match_prop_cancel_button_text_device_level);
            } else if (mo88454h() == 3) {
                b.setVisibility(8);
            } else {
                b.setText(R.string.structure_level_face_match_prop_cancel_button_text);
            }
            b.setOnClickListener(new C94306fd(this));
            if (this.f263546h.mo85090c()) {
                C90743b.m148214a(headerLayout.f228718a, 500);
            }
            return this.f263540b;
        }
        throw new IllegalArgumentException("Structure or device ID is required");
    }
}
