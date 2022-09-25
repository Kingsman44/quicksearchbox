package com.google.android.apps.search.googleapp.settingsui;

import android.content.Context;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139877m;
import com.google.android.apps.search.googleapp.p10536x.C139878n;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47713d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.u */
/* compiled from: PG */
public final class C139256u implements C139878n {

    /* renamed from: a */
    public static final C59071e f378745a = C59071e.m91332i("com.google.android.apps.search.googleapp.settingsui.u");

    /* renamed from: b */
    public final C46792di f378746b = new C46792di() {
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C139256u.this.f378759o.getClass();
            CharSequence[] charSequenceArr = (CharSequence[]) ((C58485gu) obj).toArray(new CharSequence[0]);
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.f12711g = charSequenceArr;
            multiSelectListPreference.f12712h = charSequenceArr;
        }

        /* renamed from: c */
        public final void mo18079c() {
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8339F(false);
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8339F(false);
            ((C59052c) ((C59052c) ((C59052c) C139256u.f378745a.mo56225c()).mo56382g(th.getCause())).mo56372aa(41354)).mo56386p("Failed to retrieve possible values for the multi-choice setting.");
        }
    };

    /* renamed from: c */
    public final C46792di f378747c = new C46792di() {
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C139256u uVar = C139256u.this;
            MultiSelectListPreference multiSelectListPreference = uVar.f378759o;
            multiSelectListPreference.getClass();
            uVar.f378753i.getClass();
            multiSelectListPreference.mo8332j((Set) obj);
            C139256u.this.f378759o.mo8339F(true);
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8339F(true);
        }

        /* renamed from: c */
        public final void mo18079c() {
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8339F(false);
        }
    };

    /* renamed from: d */
    public final C46792di f378748d = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8339F(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: e */
    public final C46792di f378749e = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8348O(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: f */
    public final C46792di f378750f = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8329n((String) obj);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: g */
    public final C46440f f378751g = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Set set = (Set) obj;
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8339F(true);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj2;
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8332j((Set) obj);
            C139256u.this.f378759o.mo8339F(true);
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Set set = (Set) obj;
            MultiSelectListPreference multiSelectListPreference = C139256u.this.f378759o;
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo8339F(false);
        }
    };

    /* renamed from: h */
    public final Context f378752h;

    /* renamed from: i */
    public final C139877m f378753i;

    /* renamed from: j */
    public final String f378754j;

    /* renamed from: k */
    public final C46801dp f378755k;

    /* renamed from: l */
    public final C46439e f378756l;

    /* renamed from: m */
    public final C47713d f378757m;

    /* renamed from: n */
    public final C28443m f378758n;

    /* renamed from: o */
    public MultiSelectListPreference f378759o;

    /* renamed from: p */
    public C28439i f378760p;

    public C139256u(Context context, Map map, String str, C46439e eVar, C46801dp dpVar, C47713d dVar, C28443m mVar) {
        this.f378752h = context;
        this.f378754j = str;
        this.f378753i = (C139877m) map.get(C139873i.m227462a(str));
        this.f378755k = dpVar;
        this.f378756l = eVar;
        this.f378757m = dVar;
        this.f378758n = mVar;
    }

    /* renamed from: a */
    public final Preference mo112667a() {
        if (this.f378753i != null) {
            MultiSelectListPreference multiSelectListPreference = this.f378759o;
            multiSelectListPreference.getClass();
            return multiSelectListPreference;
        }
        throw new IllegalArgumentException("No SettingUiElement provided for key ".concat(String.valueOf(this.f378754j)));
    }

    /* renamed from: b */
    public final void mo112668b(C28439i iVar) {
        this.f378760p = iVar;
    }
}
