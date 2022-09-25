package com.google.android.apps.search.googleapp.settingsui;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139867c;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139878n;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47713d;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.n */
/* compiled from: PG */
public final class C139241n implements C139878n {

    /* renamed from: a */
    public final C46792di f378704a = new C46792di() {
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C139241n nVar = C139241n.this;
            ListPreference listPreference = nVar.f378716m;
            listPreference.getClass();
            nVar.f378710g.getClass();
            listPreference.mo8330o((String) obj);
            if (TextUtils.isEmpty(C139241n.this.f378710g.mo111457g())) {
                C139241n.this.f378716m.mo8329n("%s");
            } else {
                C139241n nVar2 = C139241n.this;
                nVar2.f378716m.mo8329n(nVar2.f378710g.mo111457g());
            }
            C139241n.this.f378716m.mo8339F(true);
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ListPreference listPreference = C139241n.this.f378716m;
            listPreference.getClass();
            listPreference.mo8339F(true);
        }

        /* renamed from: c */
        public final void mo18079c() {
            ListPreference listPreference = C139241n.this.f378716m;
            listPreference.getClass();
            listPreference.mo8339F(false);
        }
    };

    /* renamed from: b */
    public final C46792di f378705b = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            ListPreference listPreference = C139241n.this.f378716m;
            listPreference.getClass();
            listPreference.mo8339F(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: c */
    public final C46792di f378706c = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            ListPreference listPreference = C139241n.this.f378716m;
            listPreference.getClass();
            listPreference.mo8348O(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: d */
    public final C46792di f378707d = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            ListPreference listPreference = C139241n.this.f378716m;
            listPreference.getClass();
            listPreference.mo8329n((String) obj);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: e */
    public final C46440f f378708e = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            String str = (String) obj;
            ListPreference listPreference = C139241n.this.f378716m;
            listPreference.getClass();
            listPreference.mo8339F(true);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            String str = (String) obj;
            Void voidR = (Void) obj2;
            ListPreference listPreference = C139241n.this.f378716m;
            listPreference.getClass();
            listPreference.mo8339F(true);
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            String str = (String) obj;
            ListPreference listPreference = C139241n.this.f378716m;
            listPreference.getClass();
            listPreference.mo8339F(false);
        }
    };

    /* renamed from: f */
    public final Context f378709f;

    /* renamed from: g */
    public final C139867c f378710g;

    /* renamed from: h */
    public final String f378711h;

    /* renamed from: i */
    public final C46801dp f378712i;

    /* renamed from: j */
    public final C46439e f378713j;

    /* renamed from: k */
    public final C47713d f378714k;

    /* renamed from: l */
    public final C28443m f378715l;

    /* renamed from: m */
    public ListPreference f378716m;

    /* renamed from: n */
    public C28439i f378717n;

    public C139241n(Context context, Map map, String str, C46439e eVar, C46801dp dpVar, C47713d dVar, C28443m mVar) {
        this.f378709f = context;
        this.f378711h = str;
        this.f378710g = (C139867c) map.get(C139873i.m227462a(str));
        this.f378712i = dpVar;
        this.f378713j = eVar;
        this.f378714k = dVar;
        this.f378715l = mVar;
    }

    /* renamed from: a */
    public final Preference mo112667a() {
        if (this.f378710g != null) {
            ListPreference listPreference = this.f378716m;
            listPreference.getClass();
            return listPreference;
        }
        throw new IllegalArgumentException("No SettingUiElement provided for key ".concat(String.valueOf(this.f378711h)));
    }

    /* renamed from: b */
    public final void mo112668b(C28439i iVar) {
        this.f378717n = iVar;
    }
}
