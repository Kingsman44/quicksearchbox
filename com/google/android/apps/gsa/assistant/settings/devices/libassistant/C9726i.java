package com.google.android.apps.gsa.assistant.settings.devices.libassistant;

import androidx.preference.C4023s;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9730c;
import com.google.android.apps.gsa.assistant.settings.shared.SecondaryWidgetRadioButtonPreference;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.shared.util.p7159c.C90892az;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.libassistant.i */
/* compiled from: PG */
public final class C9726i extends C9730c implements C4023s {

    /* renamed from: i */
    public static final C59071e f33603i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.libassistant.i");

    /* renamed from: j */
    public final o f33604j;

    /* renamed from: k */
    public PreferenceCategory f33605k;

    /* renamed from: l */
    public PreferenceCategory f33606l;

    /* renamed from: m */
    public final String f33607m;

    /* renamed from: n */
    public SecondaryWidgetRadioButtonPreference f33608n;

    /* renamed from: o */
    public SecondaryWidgetRadioButtonPreference f33609o;

    /* renamed from: p */
    private final C90932cb f33610p;

    public C9726i(String str, C90932cb cbVar, o oVar) {
        this.f33607m = str;
        this.f33610p = cbVar;
        this.f33604j = oVar;
    }

    /* renamed from: F */
    public final void mo17862F(Preference preference) {
        String str = preference.f12748t;
        if ("libassistantAudioOutput".equals(str)) {
            PreferenceCategory preferenceCategory = (PreferenceCategory) preference;
            this.f33605k = preferenceCategory;
            preferenceCategory.f12757c = false;
        } else if ("libassistantVideoOutput".equals(str)) {
            PreferenceCategory preferenceCategory2 = (PreferenceCategory) preference;
            this.f33606l = preferenceCategory2;
            preferenceCategory2.f12757c = false;
        }
    }

    /* renamed from: G */
    public final void mo17991G() {
        C58976aa aaVar = C58975e.f156826a;
        PreferenceCategory preferenceCategory = this.f33605k;
        if (preferenceCategory != null) {
            preferenceCategory.mo8376ac();
        }
        PreferenceCategory preferenceCategory2 = this.f33606l;
        if (preferenceCategory2 != null) {
            preferenceCategory2.mo8376ac();
        }
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 512;
        acv.f128954j = true;
        acu.copyOnWrite();
        acv acv2 = (acv) acu.instance;
        acv2.f128946b |= 1048576;
        acv2.f128933L = true;
        mo17813x(acu, new C9724g(this), false);
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        SecondaryWidgetRadioButtonPreference secondaryWidgetRadioButtonPreference = (SecondaryWidgetRadioButtonPreference) preference;
        C58976aa aaVar = C58975e.f156826a;
        if (secondaryWidgetRadioButtonPreference.f12748t.startsWith("audio_cast_device_") || secondaryWidgetRadioButtonPreference.f12748t.startsWith("audio_home_graph_device_")) {
            SecondaryWidgetRadioButtonPreference secondaryWidgetRadioButtonPreference2 = this.f33608n;
            if (secondaryWidgetRadioButtonPreference2 == null || !secondaryWidgetRadioButtonPreference2.equals(secondaryWidgetRadioButtonPreference)) {
                SecondaryWidgetRadioButtonPreference secondaryWidgetRadioButtonPreference3 = this.f33608n;
                if (secondaryWidgetRadioButtonPreference3 != null) {
                    secondaryWidgetRadioButtonPreference3.mo8391j(false);
                }
                this.f33608n = secondaryWidgetRadioButtonPreference;
                secondaryWidgetRadioButtonPreference.mo8391j(true);
            }
            return true;
        }
        SecondaryWidgetRadioButtonPreference secondaryWidgetRadioButtonPreference4 = this.f33609o;
        if (secondaryWidgetRadioButtonPreference4 == null || !secondaryWidgetRadioButtonPreference4.equals(secondaryWidgetRadioButtonPreference)) {
            SecondaryWidgetRadioButtonPreference secondaryWidgetRadioButtonPreference5 = this.f33609o;
            if (secondaryWidgetRadioButtonPreference5 != null) {
                secondaryWidgetRadioButtonPreference5.mo8391j(false);
            }
            this.f33609o = secondaryWidgetRadioButtonPreference;
            secondaryWidgetRadioButtonPreference.mo8391j(true);
        }
        return true;
        this.f33610p.mo85151p(new C90892az(BuildConfig.FLAVOR, new C9723f(this, secondaryWidgetRadioButtonPreference)));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.assistant.settings.shared.SecondaryWidgetRadioButtonPreference mo17992b(com.google.assistant.p3861at.C50292rr r6, boolean r7) {
        /*
            r5 = this;
            com.google.android.apps.gsa.assistant.settings.shared.SecondaryWidgetRadioButtonPreference r0 = new com.google.android.apps.gsa.assistant.settings.shared.SecondaryWidgetRadioButtonPreference
            androidx.preference.PreferenceScreen r1 = r5.mo17792e()
            android.content.Context r1 = r1.f12738j
            r0.<init>(r1)
            java.lang.String r1 = r6.f130880c
            r0.mo8347N(r1)
            if (r7 == 0) goto L_0x0016
            r1 = 2131235155(0x7f081153, float:1.8086496E38)
            goto L_0x0019
        L_0x0016:
            r1 = 2131235210(0x7f08118a, float:1.8086608E38)
        L_0x0019:
            r0.mo8340G(r1)
            com.google.assistant.at.ro r1 = com.google.assistant.p3861at.C50289ro.CAST_DEVICE_ID
            int r1 = r6.f130878a
            com.google.assistant.at.ro r1 = com.google.assistant.p3861at.C50289ro.m85801a(r1)
            int r1 = r1.ordinal()
            r2 = 0
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == 0) goto L_0x0056
            if (r1 == r4) goto L_0x003c
            int r6 = r6.f130878a
            com.google.assistant.at.ro r6 = com.google.assistant.p3861at.C50289ro.m85801a(r6)
            java.lang.String r7 = "Unknown device id type %s"
            com.google.common.base.C58838bb.m90887v(r2, r7, r6)
            goto L_0x006e
        L_0x003c:
            if (r4 == r7) goto L_0x0041
            java.lang.String r7 = "video_home_graph_device_"
            goto L_0x0043
        L_0x0041:
            java.lang.String r7 = "audio_home_graph_device_"
        L_0x0043:
            int r1 = r6.f130878a
            r4 = 2
            if (r1 != r4) goto L_0x004d
            java.lang.Object r6 = r6.f130879b
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3
        L_0x004d:
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r7.concat(r6)
            goto L_0x006e
        L_0x0056:
            if (r4 == r7) goto L_0x005b
            java.lang.String r7 = "video_cast_device_"
            goto L_0x005d
        L_0x005b:
            java.lang.String r7 = "audio_cast_device_"
        L_0x005d:
            int r1 = r6.f130878a
            if (r1 != r4) goto L_0x0066
            java.lang.Object r6 = r6.f130879b
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3
        L_0x0066:
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r7.concat(r6)
        L_0x006e:
            r0.mo8343J(r3)
            r0.f12742n = r5
            r0.f12751w = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.devices.libassistant.C9726i.mo17992b(com.google.assistant.at.rr, boolean):com.google.android.apps.gsa.assistant.settings.shared.SecondaryWidgetRadioButtonPreference");
    }

    /* renamed from: u */
    public final void mo17810u() {
        mo17991G();
    }
}
