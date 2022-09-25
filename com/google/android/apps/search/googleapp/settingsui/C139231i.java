package com.google.android.apps.search.googleapp.settingsui;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
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

/* renamed from: com.google.android.apps.search.googleapp.settingsui.i */
/* compiled from: PG */
public final class C139231i implements C139878n {

    /* renamed from: a */
    public final C46792di f378678a = new C46792di() {
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            Boolean bool = (Boolean) obj;
            C139231i iVar = C139231i.this;
            SpinnerSwitchPreference spinnerSwitchPreference = iVar.f378691n;
            spinnerSwitchPreference.getClass();
            if (spinnerSwitchPreference.f378423c || iVar.f378690m) {
                boolean booleanValue = bool.booleanValue();
                spinnerSwitchPreference.f378424d = false;
                spinnerSwitchPreference.mo8391j(booleanValue);
                SpinnerSwitchPreference spinnerSwitchPreference2 = C139231i.this.f378691n;
                spinnerSwitchPreference2.f378423c = false;
                spinnerSwitchPreference2.mo8317e();
            } else {
                spinnerSwitchPreference.mo8391j(bool.booleanValue());
            }
            C139231i.this.f378690m = false;
        }

        /* renamed from: c */
        public final void mo18079c() {
            C139231i iVar = C139231i.this;
            SpinnerSwitchPreference spinnerSwitchPreference = iVar.f378691n;
            spinnerSwitchPreference.getClass();
            C139865b bVar = iVar.f378684g;
            bVar.getClass();
            if (!bVar.mo111461k()) {
                spinnerSwitchPreference.f378423c = true;
                spinnerSwitchPreference.mo8317e();
            }
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            SpinnerSwitchPreference spinnerSwitchPreference = C139231i.this.f378691n;
            spinnerSwitchPreference.getClass();
            spinnerSwitchPreference.mo8339F(true);
            SpinnerSwitchPreference spinnerSwitchPreference2 = C139231i.this.f378691n;
            spinnerSwitchPreference2.f378423c = false;
            spinnerSwitchPreference2.mo8317e();
        }
    };

    /* renamed from: b */
    public final C46792di f378679b = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            SpinnerSwitchPreference spinnerSwitchPreference = C139231i.this.f378691n;
            spinnerSwitchPreference.getClass();
            spinnerSwitchPreference.mo8339F(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: c */
    public final C46792di f378680c = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            SpinnerSwitchPreference spinnerSwitchPreference = C139231i.this.f378691n;
            spinnerSwitchPreference.getClass();
            spinnerSwitchPreference.mo8348O(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: d */
    public final C46792di f378681d = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            SpinnerSwitchPreference spinnerSwitchPreference = C139231i.this.f378691n;
            spinnerSwitchPreference.getClass();
            spinnerSwitchPreference.mo8329n((String) obj);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: e */
    public final C46440f f378682e = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Boolean bool = (Boolean) obj;
            C139231i iVar = C139231i.this;
            SpinnerSwitchPreference spinnerSwitchPreference = iVar.f378691n;
            spinnerSwitchPreference.getClass();
            C139865b bVar = iVar.f378684g;
            bVar.getClass();
            if (!bVar.mo111461k()) {
                spinnerSwitchPreference.f378423c = false;
                spinnerSwitchPreference.mo8317e();
            }
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Void voidR = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: f */
    public final Context f378683f;

    /* renamed from: g */
    public final C139865b f378684g;

    /* renamed from: h */
    public final String f378685h;

    /* renamed from: i */
    public final C46801dp f378686i;

    /* renamed from: j */
    public final C46439e f378687j;

    /* renamed from: k */
    public final C47713d f378688k;

    /* renamed from: l */
    public final C28443m f378689l;

    /* renamed from: m */
    public boolean f378690m = true;

    /* renamed from: n */
    public SpinnerSwitchPreference f378691n;

    /* renamed from: o */
    public C28439i f378692o;

    public C139231i(Context context, Map map, String str, C46439e eVar, C46801dp dpVar, C47713d dVar, C28443m mVar) {
        this.f378683f = context;
        this.f378685h = str;
        this.f378684g = (C139865b) map.get(C139873i.m227462a(str));
        this.f378686i = dpVar;
        this.f378687j = eVar;
        this.f378688k = dVar;
        this.f378689l = mVar;
    }

    /* renamed from: a */
    public final Preference mo112667a() {
        if (this.f378684g != null) {
            SpinnerSwitchPreference spinnerSwitchPreference = this.f378691n;
            spinnerSwitchPreference.getClass();
            return spinnerSwitchPreference;
        }
        throw new IllegalArgumentException("No SettingUiElement provided for key ".concat(String.valueOf(this.f378685h)));
    }

    /* renamed from: b */
    public final void mo112668b(C28439i iVar) {
        this.f378692o = iVar;
    }
}
