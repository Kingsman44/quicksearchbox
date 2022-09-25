package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.text.TextUtils;
import androidx.preference.Preference;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9730c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.u */
/* compiled from: PG */
public final class C9638u extends C9730c implements C89495cg {

    /* renamed from: i */
    public static final C59071e f33355i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.bisto.u");

    /* renamed from: j */
    public final String f33356j;

    /* renamed from: k */
    private Preference f33357k;

    /* renamed from: l */
    private Preference f33358l;

    /* renamed from: m */
    private Preference f33359m;

    /* renamed from: n */
    private final C89492cd f33360n;

    public C9638u(C89492cd cdVar, String str) {
        this.f33360n = cdVar;
        this.f33356j = str;
        cdVar.mo83360B(new C58759qy(26), this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
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
            r2 = 13436205(0xcd052d, float:1.8828133E-38)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002f
            r2 = 913329156(0x36704c04, float:3.5807034E-6)
            if (r1 == r2) goto L_0x0025
            r2 = 1882287884(0x70316f0c, float:2.1965238E29)
            if (r1 == r2) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r1 = "bistoHotwordCurrentDspModelId"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0025:
            java.lang.String r1 = "bistoHotwordTargetDspModelId"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x002f:
            java.lang.String r1 = "bistoHotwordSupportedModelIds"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 2
            goto L_0x003a
        L_0x0039:
            r0 = -1
        L_0x003a:
            if (r0 == 0) goto L_0x0047
            if (r0 == r4) goto L_0x0044
            if (r0 == r3) goto L_0x0041
            return
        L_0x0041:
            r5.f33359m = r6
            return
        L_0x0044:
            r5.f33358l = r6
            return
        L_0x0047:
            r5.f33357k = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.devices.bisto.C9638u.mo17862F(androidx.preference.Preference):void");
    }

    /* renamed from: a */
    public final void mo17917a(C124548d dVar) {
        Preference preference = this.f33357k;
        if (preference != null) {
            preference.mo8329n(dVar.mo106482W());
        }
        Preference preference2 = this.f33358l;
        if (preference2 != null) {
            preference2.mo8329n(dVar.mo106471L());
        }
        Preference preference3 = this.f33359m;
        if (preference3 != null) {
            preference3.mo8329n(TextUtils.join(",", dVar.mo106463D()));
        }
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (!str.equals(this.f33356j)) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            mo17917a(dVar);
        }
    }

    /* renamed from: s */
    public final void mo17808s() {
        String str = this.f33356j;
        if (str == null) {
            C59104x c = f33355i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoHWController");
            ((C59052c) ((C59052c) c).mo56372aa(357)).mo56386p("deviceId null");
            return;
        }
        C60856cj.m92911t(this.f33360n.mo83408n(str), new C9637t(this), C60826bg.f164896a);
    }
}
