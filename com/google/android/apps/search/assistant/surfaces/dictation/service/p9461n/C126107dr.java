package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125141do;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125039e;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9462a.C125941c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C125970a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126030f;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126031g;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126032h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.dr */
/* compiled from: PG */
public final class C126107dr {

    /* renamed from: a */
    private final C125941c f347531a;

    /* renamed from: b */
    private final C125937z f347532b;

    public C126107dr(C125941c cVar, C125937z zVar) {
        this.f347531a = cVar;
        this.f347532b = zVar;
    }

    /* renamed from: n */
    public static final C126032h m206200n() {
        C126031g g = C126032h.m206067g();
        ((C125970a) g).f347197c = 5;
        return g.mo107213a();
    }

    /* renamed from: a */
    public final C126032h mo107342a(Locale locale) {
        return mo107344c(locale, R.string.assistant_keyboard_clear_all_text, R.string.assistant_keyboard_clear_all_button_description, C125044j.CLEAR_ALL);
    }

    /* renamed from: b */
    public final C126032h mo107343b(Locale locale) {
        return mo107344c(locale, R.string.assistant_keyboard_clear_text, R.string.assistant_keyboard_clear_button_description, C125044j.CLEAR);
    }

    /* renamed from: c */
    public final C126032h mo107344c(Locale locale, int i, int i2, C125044j jVar) {
        C126031g g = C126032h.m206067g();
        g.mo107218f(this.f347531a.mo107211a(locale).getString(i, new Object[0]));
        g.mo107216d(this.f347531a.mo107211a(locale).getString(i2, new Object[0]));
        g.mo107215c(jVar);
        ((C125970a) g).f347197c = 3;
        return g.mo107213a();
    }

    /* renamed from: d */
    public final C126032h mo107345d(C125143dq dqVar, boolean z, Locale locale) {
        String str;
        if (z) {
            C125941c cVar = this.f347531a;
            Object[] objArr = new Object[1];
            C125141do doVar = dqVar.f345224b;
            if (doVar == null) {
                doVar = C125141do.f345217c;
            }
            objArr[0] = doVar.f345220b;
            str = cVar.mo107211a(locale).getString(R.string.assistant_keyboard_emoji_button_text, objArr);
        } else {
            str = BuildConfig.FLAVOR;
        }
        C126031g g = C126032h.m206067g();
        g.mo107218f(dqVar.f345223a);
        g.mo107216d(str);
        g.mo107215c(C125044j.EMOJI_SUGGESTION);
        ((C125970a) g).f347197c = 4;
        C125039e eVar = (C125039e) C125040f.f344977e.createBuilder();
        eVar.copyOnWrite();
        ((C125040f) eVar.instance).f344981c = z;
        String str2 = dqVar.f345223a;
        eVar.copyOnWrite();
        str2.getClass();
        ((C125040f) eVar.instance).f344979a = str2;
        eVar.copyOnWrite();
        str.getClass();
        ((C125040f) eVar.instance).f344980b = str;
        eVar.copyOnWrite();
        dqVar.getClass();
        ((C125040f) eVar.instance).f344982d = dqVar;
        g.mo107217e((C125040f) eVar.build());
        return g.mo107213a();
    }

    /* renamed from: e */
    public final C126032h mo107346e(Locale locale, int i) {
        C126031g g = C126032h.m206067g();
        g.mo107218f(this.f347531a.mo107211a(locale).getString(i, new Object[0]));
        ((C125970a) g).f347197c = 2;
        return g.mo107213a();
    }

    /* renamed from: f */
    public final C126032h mo107347f(Locale locale, int i) {
        C126031g g = C126032h.m206067g();
        g.mo107218f(this.f347531a.mo107211a(locale).getString(i, new Object[0]));
        ((C125970a) g).f347197c = 2;
        g.mo107214b(C126030f.DO_NOT_ANNOUNCE);
        return g.mo107213a();
    }

    /* renamed from: g */
    public final C126032h mo107348g(Locale locale) {
        return mo107344c(locale, R.string.assistant_keyboard_next_text, R.string.assistant_keyboard_next_button_description, C125044j.NEXT);
    }

    /* renamed from: h */
    public final C126032h mo107349h(Locale locale) {
        return mo107344c(locale, R.string.assistant_keyboard_previous_text, R.string.assistant_keyboard_previous_button_description, C125044j.PREVIOUS);
    }

    /* renamed from: i */
    public final C126032h mo107350i(Locale locale) {
        return mo107344c(locale, R.string.assistant_keyboard_search_text, R.string.assistant_keyboard_search_button_description, C125044j.SEARCH);
    }

    /* renamed from: j */
    public final C126032h mo107351j(Locale locale) {
        return mo107344c(locale, R.string.assistant_keyboard_send_text, R.string.assistant_keyboard_send_button_description, C125044j.SEND);
    }

    /* renamed from: k */
    public final C126032h mo107352k(Locale locale) {
        return mo107347f(locale, true != this.f347532b.mo107203b().f347148c.v ? R.string.assistant_keyboard_start_dictating : R.string.assistant_keyboard_start_dictating_nav_redesign);
    }

    /* renamed from: l */
    public final C126032h mo107353l(Locale locale) {
        return mo107344c(locale, R.string.assistant_keyboard_undo_text, R.string.assistant_keyboard_undo_button_description, C125044j.UNDO);
    }

    /* renamed from: m */
    public final C58485gu mo107354m(Locale locale) {
        return C58485gu.m89847o(m206200n(), mo107352k(locale));
    }
}
