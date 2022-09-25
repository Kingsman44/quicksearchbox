package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9730c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.g */
/* compiled from: PG */
public final class C9624g extends C9730c {

    /* renamed from: i */
    public static final C59071e f33315i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.bisto.g");

    /* renamed from: j */
    public final C89492cd f33316j;

    /* renamed from: k */
    public final String f33317k;

    /* renamed from: l */
    Map f33318l = new HashMap();

    /* renamed from: m */
    private final C22871g f33319m;

    /* renamed from: n */
    private SeekBarPreference f33320n;

    /* renamed from: o */
    private SeekBarPreference f33321o;

    /* renamed from: p */
    private Preference f33322p;

    public C9624g(C89492cd cdVar, C22871g gVar, String str) {
        this.f33316j = cdVar;
        this.f33319m = gVar;
        this.f33317k = str;
    }

    /* renamed from: G */
    private final void m24335G(SeekBarPreference seekBarPreference, int i, int i2) {
        this.f33319m.mo28212l("setValue", new C9608c(this, seekBarPreference, i, i2));
    }

    /* renamed from: b */
    private final void m24336b(SeekBarPreference seekBarPreference, int i, int i2) {
        seekBarPreference.f12742n = new C9621d(this, i, seekBarPreference, i2);
        seekBarPreference.f12773f = true;
    }

    /* renamed from: a */
    public final synchronized void mo17912a(Map map) {
        int i;
        this.f33318l = new HashMap(map);
        for (Integer intValue : Arrays.asList(new Integer[]{2, 1})) {
            Integer valueOf = Integer.valueOf(intValue.intValue());
            Integer num = (Integer) map.get(valueOf);
            if (num == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            int i2 = i / 50;
            int intValue2 = valueOf.intValue();
            if (intValue2 == 1) {
                SeekBarPreference seekBarPreference = this.f33321o;
                if (seekBarPreference != null) {
                    m24335G(seekBarPreference, i2, R.string.bisto_phone_call_delay_pref_title);
                }
            } else if (intValue2 != 2) {
                C59104x c = f33315i.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoAudioOutputCtrl");
                ((C59052c) ((C59052c) c).mo56372aa(344)).mo56389s("unknown profile=%d", valueOf);
            } else {
                SeekBarPreference seekBarPreference2 = this.f33320n;
                if (seekBarPreference2 != null) {
                    m24335G(seekBarPreference2, i2, R.string.bisto_media_delay_pref_title);
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo17808s() {
        C60856cj.m92911t(this.f33316j.mo83408n(this.f33317k), new C9623f(this), C60826bg.f164896a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17862F(androidx.preference.Preference r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f12748t
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.hashCode()
            r2 = -2063783938(0xffffffff84fd27fe, float:-5.951674E-36)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002f
            r2 = -333862177(0xffffffffec19aadf, float:-7.430903E26)
            if (r1 == r2) goto L_0x0025
            r2 = -203644825(0xfffffffff3dca067, float:-3.4959676E31)
            if (r1 == r2) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r1 = "bistoMediaDelaySlider"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x0025:
            java.lang.String r1 = "bistoPhoneCallDelaySlider"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x002f:
            java.lang.String r1 = "bistoRunAudioTesting"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 2
            goto L_0x003a
        L_0x0039:
            r0 = -1
        L_0x003a:
            if (r0 == 0) goto L_0x0058
            if (r0 == r4) goto L_0x004d
            if (r0 == r3) goto L_0x0041
            goto L_0x004c
        L_0x0041:
            r5.f33322p = r6
            if (r6 == 0) goto L_0x004c
            com.google.android.apps.gsa.assistant.settings.devices.bisto.e r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.e
            r0.<init>(r5)
            r6.f12743o = r0
        L_0x004c:
            return
        L_0x004d:
            androidx.preference.SeekBarPreference r6 = (androidx.preference.SeekBarPreference) r6
            r5.f33321o = r6
            r0 = 2132085418(0x7f150aaa, float:1.9811034E38)
            r5.m24336b(r6, r4, r0)
            return
        L_0x0058:
            androidx.preference.SeekBarPreference r6 = (androidx.preference.SeekBarPreference) r6
            r5.f33320n = r6
            r0 = 2132085405(0x7f150a9d, float:1.9811008E38)
            r5.m24336b(r6, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.devices.bisto.C9624g.mo17862F(androidx.preference.Preference):void");
    }
}
