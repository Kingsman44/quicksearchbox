package com.google.android.apps.gsa.search.core;

import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.aq */
/* compiled from: PG */
public final /* synthetic */ class C85632aq implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ LocaleChangedReceiver f231453a;

    /* renamed from: b */
    public final /* synthetic */ Context f231454b;

    public /* synthetic */ C85632aq(LocaleChangedReceiver localeChangedReceiver, Context context) {
        this.f231453a = localeChangedReceiver;
        this.f231454b = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.android.apps.gsa.search.core.LocaleChangedReceiver r0 = r11.f231453a
            android.content.Context r1 = r11.f231454b
            com.google.android.apps.gsa.search.core.aj.s r2 = r0.f229545c
            dagger.a r3 = r2.f230130c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r3 = (com.google.android.apps.gsa.assistant.shared.bm) r3
            com.google.android.apps.gsa.shared.m.b.f r4 = r2.f230129b
            java.lang.String r4 = r4.mo83885ae()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.toString()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.toLanguageTag()
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x00e2
            android.content.SharedPreferences r6 = r2.f230128a
            java.lang.String r7 = "voice_language_present"
            r8 = 0
            boolean r6 = r6.getBoolean(r7, r8)
            r7 = 1
            r9 = 0
            if (r6 == 0) goto L_0x0041
            android.content.SharedPreferences r6 = r2.f230128a
            java.lang.String r10 = "interaction_with_search_language_preference"
            boolean r6 = r6.getBoolean(r10, r8)
            if (r6 != 0) goto L_0x0074
        L_0x0041:
            com.google.android.apps.gsa.shared.m.b.f r6 = r2.f230129b
            dagger.a r10 = r2.f230132e
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.speech.n.i r10 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r10
            com.google.al.c.c.b.w r10 = r10.mo87316a()
            com.google.al.c.c.b.ac r5 = com.google.android.apps.gsa.speech.utils.C92654a.m152606c(r10, r5)
            boolean r10 = r6.mo83871aH()
            if (r10 == 0) goto L_0x0074
            if (r5 == 0) goto L_0x0074
            java.lang.String r5 = r5.f29383c
            boolean r10 = r4.equals(r5)
            if (r10 != 0) goto L_0x0074
            java.util.List r10 = r6.mo83890aj()
            r10.add(r4)
            r10.remove(r5)
            com.google.android.apps.gsa.speech.utils.C92654a.m152611h(r10)
            r6.mo83906az(r5, r10, r7)
            goto L_0x0075
        L_0x0074:
            r5 = r9
        L_0x0075:
            if (r3 == 0) goto L_0x007e
            boolean r3 = r3.u()
            if (r3 == 0) goto L_0x007e
            r8 = 1
        L_0x007e:
            if (r8 == 0) goto L_0x0088
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r5 = r3.toLanguageTag()
        L_0x0088:
            if (r8 == 0) goto L_0x0092
            com.google.android.apps.gsa.shared.m.b.f r3 = r2.f230129b
            boolean r3 = r3.mo83848K()
            if (r3 != 0) goto L_0x00a2
        L_0x0092:
            if (r5 == 0) goto L_0x00a2
            java.lang.String r3 = "handleLanguageChange "
            java.lang.String r3 = r3.concat(r5)
            r4 = 3
            com.google.android.apps.gsa.shared.speech.dumper.EventForDump r3 = com.google.android.apps.gsa.shared.speech.dumper.EventForDump.m147676e(r4, r3)
            r2.mo78312c(r5, r3)
        L_0x00a2:
            dagger.a r3 = r2.f230131d
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.configuration.a r3 = (com.google.android.apps.gsa.configuration.C74464a) r3
            r3.mo70780a()
            java.util.Locale r3 = java.util.Locale.getDefault()
            android.content.SharedPreferences r4 = r2.f230128a
            java.lang.String r5 = "search_language_state"
            int r4 = r4.getInt(r5, r7)
            android.content.SharedPreferences r5 = r2.f230128a
            java.lang.String r6 = "hl_parameter"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.getString(r6, r7)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x00cd
            java.lang.String r9 = com.google.android.apps.gsa.search.core.p6513aj.C84559s.m135276b(r5)
        L_0x00cd:
            java.lang.String r6 = r3.getLanguage()
            if (r4 != 0) goto L_0x00df
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x00df
            boolean r4 = r6.equals(r9)
            if (r4 == 0) goto L_0x00e2
        L_0x00df:
            r2.mo78314e(r3)
        L_0x00e2:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f229546d
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247174cF
            boolean r2 = r2.mo79746e(r3)
            if (r2 != 0) goto L_0x00f1
            com.google.android.apps.gsa.assistant.shared.bm r0 = r0.f229544b
            r0.c(r1)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.C85632aq.run():void");
    }
}
