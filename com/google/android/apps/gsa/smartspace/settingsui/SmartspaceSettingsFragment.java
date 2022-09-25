package com.google.android.apps.gsa.smartspace.settingsui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.features.c.ak;
import com.google.android.apps.gsa.assistant.settings.features.c.al;
import com.google.android.apps.gsa.assistant.settings.features.c.am;
import com.google.android.apps.gsa.assistant.settings.features.c.ao;
import com.google.android.apps.gsa.assistant.settings.features.c.ap;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.settingsui.C88993h;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.apps.tiktok.inject.C47266f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class SmartspaceSettingsFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public SharedPreferences f256851a;

    /* renamed from: b */
    public Context f256852b;

    /* renamed from: c */
    public C86124t f256853c;

    /* renamed from: d */
    public C83794j f256854d;

    /* renamed from: e */
    public C92125t f256855e;

    /* renamed from: f */
    public ap f256856f;

    /* renamed from: g */
    private PreferenceScreen f256857g;

    /* renamed from: com.google.android.apps.gsa.smartspace.settingsui.SmartspaceSettingsFragment$a */
    /* compiled from: PG */
    public interface C92124a {
        /* renamed from: qo */
        void mo86778qo(SmartspaceSettingsFragment smartspaceSettingsFragment);
    }

    /* renamed from: a */
    private final void m151203a(C90048d dVar, SwitchPreference switchPreference) {
        if (!this.f256853c.mo79746e(dVar)) {
            this.f256857g.removePreference(switchPreference);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C92124a) C47266f.m84076a(getActivity(), C92124a.class)).mo86778qo(this);
        C88993h.m144664a(getPreferenceManager());
        addPreferencesFromResource(R.xml.smartspace_preference);
        this.f256857g = getPreferenceScreen();
        Preference findPreference = findPreference("smartspace_no_settings");
        if (findPreference != null) {
            this.f256857g.removePreference(findPreference);
        }
        SwitchPreference switchPreference = (SwitchPreference) findPreference("smartspace_calendar_enabled");
        if (switchPreference != null) {
            switchPreference.setChecked(this.f256851a.getBoolean("smartspace_calendar_enabled", true));
        }
        SwitchPreference switchPreference2 = (SwitchPreference) findPreference("smartspace_commute_enabled");
        if (switchPreference2 != null) {
            m151203a(C90014bt.f247648lC, switchPreference2);
            switchPreference2.setChecked(this.f256851a.getBoolean("smartspace_commute_enabled", true));
        }
        SwitchPreference switchPreference3 = (SwitchPreference) findPreference("smartspace_flight_enabled");
        if (switchPreference3 != null) {
            m151203a(C90014bt.f247650lE, switchPreference3);
            switchPreference3.setChecked(this.f256851a.getBoolean("smartspace_flight_enabled", true));
        }
        SwitchPreference switchPreference4 = (SwitchPreference) findPreference("smartspace_reminder_enabled");
        if (switchPreference4 != null) {
            switchPreference4.setChecked(this.f256851a.getBoolean("smartspace_reminder_enabled", true));
        }
        SwitchPreference switchPreference5 = (SwitchPreference) findPreference("smartspace_birthday_enabled");
        if (switchPreference5 != null) {
            m151203a(C90014bt.f247696ly, switchPreference5);
            switchPreference5.setChecked(this.f256851a.getBoolean("smartspace_birthday_enabled", true));
        }
        SwitchPreference switchPreference6 = (SwitchPreference) findPreference("smartspace_alarm_enabled");
        m151203a(C90014bt.f247694lw, switchPreference6);
        if (switchPreference6 != null) {
            switchPreference6.setChecked(this.f256851a.getBoolean("smartspace_alarm_enabled", true));
        }
        SwitchPreference switchPreference7 = (SwitchPreference) findPreference("smartspace_weather_enabled");
        if (switchPreference7 != null) {
            m151203a(C89985ax.f246674aA, switchPreference7);
            switchPreference7.setChecked(this.f256851a.getBoolean("smartspace_weather_enabled", true));
        }
        SwitchPreference switchPreference8 = (SwitchPreference) findPreference("smartspace_weather_alert_enabled");
        if (switchPreference8 != null) {
            m151203a(C90014bt.f247661lP, switchPreference8);
            switchPreference8.setChecked(this.f256851a.getBoolean("smartspace_weather_alert_enabled", true));
        }
        SwitchPreference switchPreference9 = (SwitchPreference) findPreference("smartspace_sports_enabled");
        if (switchPreference9 != null) {
            m151203a(C90014bt.f247656lK, switchPreference9);
            switchPreference9.setChecked(this.f256851a.getBoolean("smartspace_sports_enabled", true));
        }
        SwitchPreference switchPreference10 = (SwitchPreference) findPreference("smartspace_media_suggestions_enabled");
        if (switchPreference10 != null) {
            m151203a(C90017bw.f247919ah, switchPreference10);
            if ((this.f256854d.mo77187z() || this.f256854d.mo77181t()) && !this.f256854d.mo77163H()) {
                this.f256857g.removePreference(switchPreference10);
            }
            ap apVar = this.f256856f;
            C92094j jVar = C92094j.HEADPHONES;
            al alVar = new al(apVar, jVar);
            switchPreference10.setOnPreferenceChangeListener(alVar);
            switchPreference10.setEnabled(false);
            C60870cx e = apVar.c.e(jVar);
            am amVar = new am(switchPreference10, alVar);
            C60856cj.m92911t(e, C47810es.m84974n(amVar), apVar.d);
        }
        SwitchPreference switchPreference11 = (SwitchPreference) findPreference("smartspace_stock_price_change_enabled");
        if (switchPreference11 != null) {
            m151203a(C90014bt.f247659lN, switchPreference11);
            switchPreference11.setChecked(this.f256851a.getBoolean("smartspace_stock_price_change_enabled", true));
        }
        SwitchPreference switchPreference12 = (SwitchPreference) findPreference("smartspace_work_profile_access_enabled");
        m151203a(C90014bt.f247663lR, switchPreference12);
        if (switchPreference12 != null) {
            switchPreference12.setChecked(this.f256851a.getBoolean("smartspace_work_profile_access_enabled", true));
        }
        this.f256855e.mo86714s();
    }

    public final void onPause() {
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Optional optional;
        C50794cr crVar = C50794cr.UNDEFINED;
        if (str.equals("smartspace_calendar_enabled")) {
            crVar = C50794cr.CALENDAR;
        } else if (str.equals("smartspace_commute_enabled")) {
            crVar = C50794cr.COMMUTE_TIME;
        } else if (str.equals("smartspace_flight_enabled")) {
            crVar = C50794cr.FLIGHT;
        } else if (str.equals("smartspace_reminder_enabled")) {
            crVar = C50794cr.REMINDER;
        } else if (str.equals("smartspace_birthday_enabled")) {
            crVar = C50794cr.BIRTHDAY;
        } else if (str.equals("smartspace_alarm_enabled")) {
            crVar = C50794cr.ALARM;
        } else if (str.equals("smartspace_weather_enabled")) {
            crVar = C50794cr.WEATHER;
        } else if (str.equals("smartspace_weather_alert_enabled")) {
            crVar = C50794cr.WEATHER_ALERT;
        } else if (str.equals("smartspace_sports_enabled")) {
            crVar = C50794cr.SPORTS;
        } else if (str.equals("smartspace_stock_price_change_enabled")) {
            crVar = C50794cr.STOCK_PRICE_CHANGE;
        }
        if (!this.f256853c.mo79746e(C89985ax.f246674aA) || crVar != C50794cr.WEATHER) {
            C92122r.m151187e(this.f256852b);
        } else {
            C92122r.m151188f(this.f256852b, Integer.valueOf(crVar.f132222T), this.f256851a.getBoolean(str, false));
        }
        if (crVar == C50794cr.UNDEFINED) {
            if (str.equals("smartspace_work_profile_access_enabled")) {
                optional = Optional.m71637of(C92094j.WORK_PROFILE);
            } else if (str.equals("smartspace_media_suggestions_enabled")) {
                optional = Optional.m71637of(C92094j.HEADPHONES);
            } else {
                optional = Optional.empty();
            }
            if (optional.isPresent()) {
                this.f256855e.mo86707l((C92094j) optional.get(), this.f256851a.getBoolean(str, false));
                return;
            }
            return;
        }
        this.f256855e.mo86708m(crVar, this.f256851a.getBoolean(str, false));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C60870cx cxVar;
        super.onViewCreated(view, bundle);
        if (this.f256853c.mo79746e(C90017bw.f247860B)) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(16908351);
            LayoutInflater.from(getContext()).inflate(R.layout.fab, viewGroup, true);
            FloatingActionButton floatingActionButton = (FloatingActionButton) viewGroup.findViewById(R.id.feedback_fab);
            ap apVar = this.f256856f;
            Context context = getContext();
            if (!apVar.b.mo79746e(C90017bw.f247860B)) {
                cxVar = C60856cj.m92900i(Optional.empty());
            } else if (!apVar.b.mo79746e(C90017bw.f247930as)) {
                cxVar = C60856cj.m92900i(Optional.m71637of(ap.a()));
            } else {
                C60870cx a = apVar.c.a();
                ak akVar = ak.a;
                cxVar = C60922j.m93044g(a, C47810es.m84963c(akVar), apVar.d);
            }
            ao aoVar = new ao(floatingActionButton, context);
            C60856cj.m92911t(cxVar, C47810es.m84974n(aoVar), C60826bg.f164896a);
        }
    }
}
