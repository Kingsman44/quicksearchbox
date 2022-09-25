package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import android.content.Context;
import com.google.android.apps.gsa.nga.api.a.e;
import com.google.android.apps.gsa.nga.api.a.f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125117cr;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125118cs;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125119ct;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125120cu;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125121cv;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125122cw;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125930s;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.dw */
/* compiled from: PG */
public final class C126112dw {

    /* renamed from: b */
    private static final C59071e f347537b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.n.dw");

    /* renamed from: c */
    private static final C58528ij f347538c = C58528ij.m90011K(Integer.valueOf(R.string.assistant_keyboard_learning_center_entry_correct_text), Integer.valueOf(R.string.assistant_keyboard_learning_center_entry_keep_mic_open_text));

    /* renamed from: a */
    public final C125931t f347539a;

    /* renamed from: d */
    private final Context f347540d;

    public C126112dw(Context context, C125931t tVar) {
        this.f347540d = context;
        this.f347539a = tVar;
    }

    /* renamed from: b */
    private final C125122cw m206219b(int i, int i2) {
        C125121cv cvVar = (C125121cv) C125122cw.f345184b.createBuilder();
        String string = this.f347540d.getString(i);
        if (!f347538c.contains(Integer.valueOf(i))) {
            string = this.f347540d.getString(R.string.assistant_keyboard_voice_suggestion_quotes, new Object[]{string});
        }
        String string2 = this.f347540d.getString(i2);
        e createBuilder = f.g.createBuilder();
        createBuilder.copyOnWrite();
        string.getClass();
        createBuilder.instance.a = string;
        createBuilder.copyOnWrite();
        string2.getClass();
        createBuilder.instance.b = string2;
        cvVar.copyOnWrite();
        f build = createBuilder.build();
        build.getClass();
        ((C125122cw) cvVar.instance).f345186a = build;
        return (C125122cw) cvVar.build();
    }

    /* renamed from: a */
    public final C125120cu mo107355a(C125931t tVar) {
        C125930s c = tVar.mo107184c();
        ((C59052c) ((C59052c) f347537b.mo56224b()).mo56372aa(36834)).mo56389s("#getLearningCenterContent with ClearCpabilities=%s [SD]", C126290c.m206496a(c));
        C125117cr crVar = (C125117cr) C125118cs.f345176c.createBuilder();
        String string = this.f347540d.getString(R.string.assistant_keyboard_learning_center_category_compose);
        crVar.copyOnWrite();
        string.getClass();
        ((C125118cs) crVar.instance).f345178a = string;
        C58480gp e = C58485gu.m89837e();
        e.mo55371a(new C125122cw[]{m206219b(R.string.assistant_keyboard_learning_center_entry_send_text, R.string.assistant_keyboard_learning_center_entry_send_description), m206219b(R.string.assistant_keyboard_learning_center_entry_stop_text, R.string.assistant_keyboard_learning_center_entry_stop_description), m206219b(R.string.assistant_keyboard_learning_center_entry_keep_mic_open_text, R.string.assistant_keyboard_learning_center_entry_keep_mic_open_description)}, 3);
        C125930s sVar = C125930s.LAST_DICTATION_ONLY;
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            e.mo55395g(m206219b(R.string.assistant_keyboard_learning_center_entry_clear_dictation_text, R.string.assistant_keyboard_learning_center_entry_clear_dictation_description));
        } else if (ordinal == 1) {
            e.mo55395g(m206219b(R.string.assistant_keyboard_learning_center_entry_delete_text, R.string.assistant_keyboard_learning_center_entry_delete_description));
            e.mo55395g(m206219b(R.string.assistant_keyboard_learning_center_entry_clear_text, R.string.assistant_keyboard_learning_center_entry_clear_description));
            e.mo55395g(m206219b(R.string.assistant_keyboard_learning_center_entry_clear_all_text, R.string.assistant_keyboard_learning_center_entry_clear_all_description));
            e.mo55395g(m206219b(R.string.assistant_keyboard_learning_center_entry_undo_text, R.string.assistant_keyboard_learning_center_entry_undo_description));
        }
        e.mo55395g(m206219b(R.string.assistant_keyboard_learning_center_entry_correct_text, R.string.assistant_keyboard_learning_center_entry_correct_description));
        crVar.mo106804a(e.mo55394f());
        C125118cs csVar = (C125118cs) crVar.build();
        C58485gu B = C58485gu.m89832B(m206219b(R.string.assistant_keyboard_learning_center_entry_lol_emoji_text, R.string.assistant_keyboard_learning_center_entry_lol_emoji_description), m206219b(R.string.assistant_keyboard_learning_center_entry_heart_emoji_text, R.string.assistant_keyboard_learning_center_entry_heart_emoji_description), m206219b(R.string.assistant_keyboard_learning_center_entry_blow_kiss_emoji_text, R.string.assistant_keyboard_learning_center_entry_blow_kiss_emoji_description), m206219b(R.string.assistant_keyboard_learning_center_entry_crying_emoji_text, R.string.assistant_keyboard_learning_center_entry_crying_emoji_description), m206219b(R.string.assistant_keyboard_learning_center_entry_smiling_with_teeth_emoji_text, R.string.assistant_keyboard_learning_center_entry_smiling_with_teeth_emoji_description), m206219b(R.string.assistant_keyboard_learning_center_entry_heart_eyes_emoji_text, R.string.assistant_keyboard_learning_center_entry_heart_eyes_emoji_description), m206219b(R.string.assistant_keyboard_learning_center_entry_thumbs_up_emoji_text, R.string.assistant_keyboard_learning_center_entry_thumbs_up_emoji_description), m206219b(R.string.assistant_keyboard_learning_center_entry_happy_face_emoji_text, R.string.assistant_keyboard_learning_center_entry_happy_face_emoji_description), m206219b(R.string.assistant_keyboard_learning_center_entry_in_love_face_emoji_text, R.string.assistant_keyboard_learning_center_entry_in_love_face_emoji_description), m206219b(R.string.assistant_keyboard_learning_center_entry_thank_you_emoji_text, R.string.assistant_keyboard_learning_center_entry_thank_you_emoji_description));
        C125117cr crVar2 = (C125117cr) C125118cs.f345176c.createBuilder();
        String string2 = this.f347540d.getString(R.string.assistant_keyboard_learning_center_category_emojis);
        crVar2.copyOnWrite();
        string2.getClass();
        ((C125118cs) crVar2.instance).f345178a = string2;
        crVar2.mo106804a(B);
        C125118cs csVar2 = (C125118cs) crVar2.build();
        C125117cr crVar3 = (C125117cr) C125118cs.f345176c.createBuilder();
        String string3 = this.f347540d.getString(R.string.assistant_keyboard_learning_center_category_forms);
        crVar3.copyOnWrite();
        string3.getClass();
        ((C125118cs) crVar3.instance).f345178a = string3;
        crVar3.mo106805b(m206219b(R.string.assistant_keyboard_learning_center_entry_next_text, R.string.assistant_keyboard_learning_center_entry_next_description));
        crVar3.mo106805b(m206219b(R.string.assistant_keyboard_learning_center_entry_previous_text, R.string.assistant_keyboard_learning_center_entry_previous_description));
        crVar3.mo106805b(m206219b(R.string.assistant_keyboard_learning_center_entry_set_recipient_text, R.string.assistant_keyboard_learning_center_entry_set_recipient_description));
        crVar3.mo106805b(m206219b(R.string.assistant_keyboard_learning_center_entry_add_cc_text, R.string.assistant_keyboard_learning_center_entry_add_cc_description));
        crVar3.mo106805b(m206219b(R.string.assistant_keyboard_learning_center_entry_set_subject_text, R.string.assistant_keyboard_learning_center_entry_set_subject_description));
        C125118cs csVar3 = (C125118cs) crVar3.build();
        int i = tVar.mo107198q(tVar.f347136c) ? tVar.mo107198q(tVar.f347140g) ? R.string.assistant_keyboard_learning_center_entry_heyg_type_description_v3 : R.string.assistant_keyboard_learning_center_entry_heyg_type_description_v2 : R.string.assistant_keyboard_learning_center_entry_heyg_type_description;
        C125117cr crVar4 = (C125117cr) C125118cs.f345176c.createBuilder();
        String string4 = this.f347540d.getString(R.string.assistant_keyboard_learning_center_category_hands_free);
        crVar4.copyOnWrite();
        string4.getClass();
        ((C125118cs) crVar4.instance).f345178a = string4;
        crVar4.mo106805b(m206219b(R.string.assistant_keyboard_learning_center_entry_heyg_type_text, i));
        C125119ct ctVar = (C125119ct) C125120cu.f345180c.createBuilder();
        String string5 = this.f347540d.getString(R.string.assistant_keyboard_learning_center_title);
        ctVar.copyOnWrite();
        string5.getClass();
        ((C125120cu) ctVar.instance).f345182a = string5;
        ctVar.mo106807a(csVar);
        ctVar.mo106807a(csVar2);
        ctVar.mo106807a(csVar3);
        ctVar.mo106807a((C125118cs) crVar4.build());
        return (C125120cu) ctVar.build();
    }
}
