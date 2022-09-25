package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.preference.ListPreference;
import android.preference.Preference;
import com.google.android.apps.gsa.search.core.preferences.C86293ai;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60661yd;
import com.google.common.p4552o.C60662ye;
import com.google.p395al.p417d.p418a.C8590q;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.cb */
/* compiled from: PG */
final class C98005cb extends C88994i implements Preference.OnPreferenceChangeListener {

    /* renamed from: b */
    private static final C59071e f273653b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cm.cb");

    /* renamed from: c */
    private static final C8590q f273654c = C8590q.AUTOPLAY_ON_WIFI_ONLY;

    /* renamed from: a */
    public final C68214a f273655a;

    /* renamed from: d */
    private final C58495hd f273656d;

    /* renamed from: e */
    private final C86293ai f273657e;

    /* renamed from: f */
    private final C22871g f273658f;

    /* renamed from: g */
    private ListPreference f273659g;

    public C98005cb(Context context, C86293ai aiVar, C22871g gVar, C68214a aVar) {
        this.f273657e = aiVar;
        this.f273658f = gVar;
        this.f273655a = aVar;
        this.f273656d = C58495hd.m89902p(C8590q.AUTOPLAY_DISABLED.name(), context.getString(R.string.autoplay_video_previews_never), C8590q.AUTOPLAY_ON_WIFI_ONLY.name(), context.getString(R.string.autoplay_video_previews_wifi), C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA.name(), context.getString(R.string.autoplay_video_previews_always));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo90875a(C8590q qVar) {
        C8590q qVar2 = C8590q.AUTOPLAY_UNSPECIFIED;
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            C59104x c = f273653b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VideoAutoplayPrefCtrler");
            ((C59052c) ((C59052c) c).mo56372aa(30407)).mo56386p("AUTOPLAY_UNSPECIFIED has no description");
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return (String) this.f273656d.get(qVar.name());
        }
        throw new AssertionError("Unknown enum for PreviewAutoplay");
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if (!"search_video_preview_autoplay".equals(preference.getKey()) || !(preference instanceof ListPreference)) {
            C59104x c = f273653b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VideoAutoplayPrefCtrler");
            ((C59052c) ((C59052c) c).mo56372aa(30408)).mo56389s("Unable to handle preference %s", preference.getKey());
            return;
        }
        this.f273659g = (ListPreference) preference;
        C8590q a = this.f273657e.mo79997a();
        if (!this.f273656d.containsKey(a.name())) {
            C59104x c2 = f273653b.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "VideoAutoplayPrefCtrler");
            ((C59052c) ((C59052c) c2).mo56372aa(30409)).mo56389s("VideoPreferences#getPreviewAutoplay() should not return %s", a);
            a = f273654c;
        }
        this.f273659g.setEntries((CharSequence[]) this.f273656d.values().toArray(new String[0]));
        this.f273659g.setEntryValues((CharSequence[]) this.f273656d.keySet().toArray(new String[0]));
        this.f273659g.setValue(a.name());
        this.f273659g.setSummary(mo90875a(a));
        this.f273659g.setOnPreferenceChangeListener(this);
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (!"search_video_preview_autoplay".equals(preference.getKey())) {
            C59104x c = f273653b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VideoAutoplayPrefCtrler");
            ((C59052c) ((C59052c) c).mo56372aa(30410)).mo56389s("Unknown preference %s", preference.getKey());
            return true;
        }
        String str = (String) obj;
        C8590q a = C8590q.m23276a(str);
        this.f273659g.setValue(str);
        this.f273659g.setSummary(mo90875a(a));
        C8590q a2 = this.f273657e.mo79997a();
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1289;
        C60661yd ydVar = (C60661yd) C60662ye.f164563d.createBuilder();
        ydVar.copyOnWrite();
        C60662ye yeVar = (C60662ye) ydVar.instance;
        yeVar.f164566b = a2.f29729e;
        yeVar.f164565a |= 1;
        ydVar.copyOnWrite();
        C60662ye yeVar2 = (C60662ye) ydVar.instance;
        yeVar2.f164567c = a.f29729e;
        yeVar2.f164565a |= 2;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60662ye yeVar3 = (C60662ye) ydVar.build();
        yeVar3.getClass();
        ufVar2.f164227ce = yeVar3;
        ufVar2.f164254i |= 16777216;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        this.f273657e.mo79998b(a);
        this.f273658f.mo28212l("forceInvalidate", new C98004ca(this));
        return true;
    }
}
