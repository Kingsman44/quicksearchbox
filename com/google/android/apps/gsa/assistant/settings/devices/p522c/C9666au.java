package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.Context;
import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.assistant.platform.p9141h.p9169k.C121181d;
import com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a.C121177c;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.au */
/* compiled from: PG */
public final class C9666au implements C86091a {

    /* renamed from: a */
    private final Context f33431a;

    /* renamed from: b */
    private final SharedPreferences f33432b;

    /* renamed from: c */
    private final C118561t f33433c;

    /* renamed from: d */
    private final C68214a f33434d;

    /* renamed from: e */
    private final C68214a f33435e;

    /* renamed from: f */
    private final C90021c f33436f;

    public C9666au(Context context, SharedPreferences sharedPreferences, C118561t tVar, C68214a aVar, C68214a aVar2, C90021c cVar) {
        this.f33431a = context;
        this.f33432b = sharedPreferences;
        this.f33433c = tVar;
        this.f33434d = aVar;
        this.f33435e = aVar2;
        this.f33436f = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (true != mo17943d()) goto L_0x007d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24386e(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = r11.mo17943d()
            if (r0 != 0) goto L_0x0012
            com.google.android.apps.gsa.shared.m.c r0 = r11.f33436f
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90059dk.f249036Z
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return
        L_0x0012:
            com.google.android.apps.gsa.tasks.t r1 = r11.f33433c
            com.google.android.apps.gsa.staticplugins.settings.a.f r0 = com.google.android.apps.gsa.staticplugins.settings.p8758a.C117302f.f325630f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.staticplugins.settings.a.a r0 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117297a) r0
            com.google.assistant.at.cv r2 = com.google.assistant.p3861at.C49891cv.f129647N
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.at.cn r2 = (com.google.assistant.p3861at.C49883cn) r2
            com.google.assistant.at.dw r3 = com.google.assistant.p3861at.C49919dw.f129746c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.at.dt r3 = (com.google.assistant.p3861at.C49916dt) r3
            java.lang.String r4 = r11.mo17941a()
            android.content.Context r5 = r11.f33431a
            r6 = 2132091588(0x7f1522c4, float:1.9823548E38)
            java.lang.String r5 = r5.getString(r6)
            boolean r5 = r5.equals(r4)
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L_0x0054
            com.google.android.apps.gsa.shared.m.c r4 = r11.f33436f
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90059dk.f249036Z
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x0091
            boolean r4 = r11.mo17943d()
            if (r9 == r4) goto L_0x0091
            goto L_0x007d
        L_0x0054:
            com.google.android.apps.gsa.shared.m.c r5 = r11.f33436f
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90059dk.f249036Z
            boolean r5 = r5.mo79746e(r10)
            if (r5 == 0) goto L_0x006e
            android.content.Context r5 = r11.f33431a
            r10 = 2132091585(0x7f1522c1, float:1.9823542E38)
            java.lang.String r5 = r5.getString(r10)
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x006e
            goto L_0x0091
        L_0x006e:
            android.content.Context r5 = r11.f33431a
            r7 = 2132091589(0x7f1522c5, float:1.982355E38)
            java.lang.String r5 = r5.getString(r7)
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x007f
        L_0x007d:
            r7 = 2
            goto L_0x0091
        L_0x007f:
            android.content.Context r5 = r11.f33431a
            r7 = 2132091586(0x7f1522c2, float:1.9823544E38)
            java.lang.String r5 = r5.getString(r7)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0090
            r7 = 4
            goto L_0x0091
        L_0x0090:
            r7 = 1
        L_0x0091:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.at.dw r4 = (com.google.assistant.p3861at.C49919dw) r4
            int r7 = r7 + -1
            r4.f129749b = r7
            int r5 = r4.f129748a
            r5 = r5 | r9
            r4.f129748a = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.at.cv r4 = (com.google.assistant.p3861at.C49891cv) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.at.dw r3 = (com.google.assistant.p3861at.C49919dw) r3
            r3.getClass()
            r4.f129681t = r3
            int r3 = r4.f129663a
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 | r5
            r4.f129663a = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.staticplugins.settings.a.f r3 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117302f) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.at.cv r2 = (com.google.assistant.p3861at.C49891cv) r2
            r2.getClass()
            r3.f325633b = r2
            int r2 = r3.f325632a
            r2 = r2 | r9
            r3.f325632a = r2
            com.google.android.apps.gsa.staticplugins.settings.a.e r2 = com.google.android.apps.gsa.staticplugins.settings.p8758a.C117301e.f325624e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.staticplugins.settings.a.d r2 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117300d) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.gsa.staticplugins.settings.a.e r3 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117301e) r3
            int r4 = r3.f325626a
            r4 = r4 | r9
            r3.f325626a = r4
            java.lang.String r4 = "ttsMode"
            r3.f325629d = r4
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.gsa.staticplugins.settings.a.e r3 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117301e) r3
            r12.getClass()
            r3.f325627b = r8
            r3.f325628c = r12
            com.google.protobuf.bv r12 = r2.build()
            com.google.android.apps.gsa.staticplugins.settings.a.e r12 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117301e) r12
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.staticplugins.settings.a.f r2 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117302f) r2
            r12.getClass()
            r2.f325634c = r12
            int r12 = r2.f325632a
            r12 = r12 | r8
            r2.f325632a = r12
            android.content.Context r12 = r11.f33431a
            r2 = 2132093394(0x7f1529d2, float:1.9827211E38)
            java.lang.String r12 = r12.getString(r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.staticplugins.settings.a.f r2 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117302f) r2
            r12.getClass()
            int r3 = r2.f325632a
            r3 = r3 | r6
            r2.f325632a = r3
            r2.f325635d = r12
            com.google.android.apps.gsa.staticplugins.settings.a.c r12 = com.google.android.apps.gsa.staticplugins.settings.p8758a.C117299c.f325618e
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.apps.gsa.staticplugins.settings.a.b r12 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117298b) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.android.apps.gsa.staticplugins.settings.a.c r2 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117299c) r2
            int r3 = r2.f325620a
            r3 = r3 | r9
            r2.f325620a = r3
            r3 = 8
            r2.f325621b = r3
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.android.apps.gsa.staticplugins.settings.a.c r2 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117299c) r2
            int r4 = r2.f325620a
            r4 = r4 | r6
            r2.f325620a = r4
            r4 = 15000(0x3a98, double:7.411E-320)
            r2.f325623d = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.staticplugins.settings.a.f r2 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117302f) r2
            com.google.protobuf.bv r12 = r12.build()
            com.google.android.apps.gsa.staticplugins.settings.a.c r12 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117299c) r12
            r12.getClass()
            r2.f325636e = r12
            int r12 = r2.f325632a
            r12 = r12 | r3
            r2.f325632a = r12
            com.google.protobuf.bv r12 = r0.build()
            r2 = r12
            com.google.android.apps.gsa.staticplugins.settings.a.f r2 = (com.google.android.apps.gsa.staticplugins.settings.p8758a.C117302f) r2
            r3 = 5
            j$.time.Duration r12 = p3186j$.time.Duration.ofMinutes(r3)
            long r3 = r12.toMillis()
            r5 = 0
            com.google.android.apps.gsa.assistant.settings.shared.p5799j.C73758e.m108324b(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.devices.p522c.C9666au.m24386e(java.lang.String):void");
    }

    /* renamed from: a */
    public final String mo17941a() {
        return this.f33432b.getString("ttsMode", this.f33431a.getString(R.string.prefDefault_ttsMode));
    }

    /* renamed from: b */
    public final void mo17942b(String str) {
        String string = this.f33432b.getString("ttsMode", BuildConfig.FLAVOR);
        this.f33432b.edit().putString("ttsMode", str).apply();
        C121177c cVar = C121177c.ON;
        if (this.f33431a.getString(R.string.prefValue_ttsMode_verbose).equals(str)) {
            cVar = C121177c.VERBOSE;
        } else if (this.f33431a.getString(R.string.prefValue_ttsMode_handsFreeOnly).equals(str)) {
            cVar = C121177c.HANDS_FREE_ONLY;
        } else if (this.f33436f.mo79746e(C90059dk.f249036Z) && this.f33431a.getString(R.string.prefValue_ttsMode_brief).equals(str)) {
            cVar = C121177c.ON;
        } else if (this.f33436f.mo79746e(C90059dk.f249036Z) && this.f33431a.getString(R.string.prefValue_ttsMode_on).equals(str)) {
            cVar = mo17943d() ? C121177c.ON : C121177c.VERBOSE;
        }
        ((C121181d) this.f33435e.mo27525b()).mo105071b(cVar);
        m24386e(string);
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (z) {
            m24386e(BuildConfig.FLAVOR);
        }
    }

    /* renamed from: d */
    public final boolean mo17943d() {
        return ((Boolean) ((Optional) this.f33434d.mo27525b()).map(C9665at.f33430a).orElse(false)).booleanValue();
    }
}
