package com.google.android.apps.gsa.search.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.core.cq */
/* compiled from: PG */
public final class C85757cq implements C58881cr {

    /* renamed from: a */
    private final Context f231881a;

    /* renamed from: b */
    private final C68214a f231882b;

    /* renamed from: c */
    private final C68214a f231883c;

    /* renamed from: d */
    private final C68214a f231884d;

    /* renamed from: e */
    private final C68214a f231885e;

    /* renamed from: f */
    private final C68214a f231886f;

    /* renamed from: g */
    private String f231887g;

    /* renamed from: h */
    private boolean f231888h;

    public C85757cq(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f231881a = context;
        this.f231882b = aVar;
        this.f231883c = aVar2;
        this.f231884d = aVar3;
        this.f231886f = aVar4;
        this.f231885e = aVar5;
    }

    /* renamed from: d */
    private final String m137799d(String str) {
        String str2;
        String k = ((C84474e) this.f231886f.mo27525b()).mo78122k();
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = str;
        objArr[1] = this.f231883c.mo27525b();
        if (k.isEmpty()) {
            str2 = BuildConfig.FLAVOR;
        } else {
            str2 = " ".concat(String.valueOf(k));
        }
        objArr[2] = str2;
        return String.format(locale, "%s GSA/%s%s", objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo6453a() {
        /*
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = r7.f231881a     // Catch:{ all -> 0x00e1 }
            dagger.a r1 = r7.f231885e     // Catch:{ all -> 0x00e1 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.gsa.shared.m.c r1 = (com.google.android.apps.gsa.shared.p7066m.C90021c) r1     // Catch:{ all -> 0x00e1 }
            boolean r0 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b.m148054b(r0, r1)     // Catch:{ all -> 0x00e1 }
            dagger.a r1 = r7.f231884d     // Catch:{ all -> 0x00e1 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x00e1 }
            com.google.android.apps.gsa.shared.util.v r1 = (com.google.android.apps.gsa.shared.util.C91123v) r1     // Catch:{ all -> 0x00e1 }
            boolean r1 = r1.mo85390b()     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = r7.f231887g     // Catch:{ all -> 0x00e1 }
            if (r2 != 0) goto L_0x00dd
            dagger.a r2 = r7.f231882b     // Catch:{ all -> 0x00e1 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x00e1 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x00e1 }
            java.lang.String r3 = "user_agent"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x00e1 }
            r3 = 1
            if (r2 != 0) goto L_0x00d5
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ all -> 0x00e1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r4.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x00e1 }
            int r6 = r5.length()     // Catch:{ all -> 0x00e1 }
            if (r6 <= 0) goto L_0x005f
            char r6 = r5.charAt(r2)     // Catch:{ all -> 0x00e1 }
            boolean r6 = java.lang.Character.isDigit(r6)     // Catch:{ all -> 0x00e1 }
            if (r6 == 0) goto L_0x0059
            r4.append(r5)     // Catch:{ all -> 0x00e1 }
            goto L_0x0064
        L_0x0059:
            java.lang.String r5 = "8.1.0"
            r4.append(r5)     // Catch:{ all -> 0x00e1 }
            goto L_0x0064
        L_0x005f:
            java.lang.String r5 = "1.0"
            r4.append(r5)     // Catch:{ all -> 0x00e1 }
        L_0x0064:
            java.lang.String r5 = "; "
            r4.append(r5)     // Catch:{ all -> 0x00e1 }
            java.lang.String r5 = r1.getLanguage()     // Catch:{ all -> 0x00e1 }
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = com.google.android.apps.gsa.search.core.google.C85929cw.m138089r(r5)     // Catch:{ all -> 0x00e1 }
            r4.append(r5)     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = r1.getCountry()     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0090
            java.lang.String r5 = "-"
            r4.append(r5)     // Catch:{ all -> 0x00e1 }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = r1.toLowerCase(r5)     // Catch:{ all -> 0x00e1 }
            r4.append(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x0090
        L_0x008b:
            java.lang.String r1 = "en"
            r4.append(r1)     // Catch:{ all -> 0x00e1 }
        L_0x0090:
            java.lang.String r1 = ";"
            r4.append(r1)     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "REL"
            java.lang.String r5 = android.os.Build.VERSION.CODENAME     // Catch:{ all -> 0x00e1 }
            boolean r1 = r1.equals(r5)     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x00af
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x00e1 }
            int r5 = r1.length()     // Catch:{ all -> 0x00e1 }
            if (r5 <= 0) goto L_0x00af
            java.lang.String r5 = " "
            r4.append(r5)     // Catch:{ all -> 0x00e1 }
            r4.append(r1)     // Catch:{ all -> 0x00e1 }
        L_0x00af:
            java.lang.String r1 = android.os.Build.ID     // Catch:{ all -> 0x00e1 }
            int r5 = r1.length()     // Catch:{ all -> 0x00e1 }
            if (r5 <= 0) goto L_0x00bf
            java.lang.String r5 = " Build/"
            r4.append(r5)     // Catch:{ all -> 0x00e1 }
            r4.append(r1)     // Catch:{ all -> 0x00e1 }
        L_0x00bf:
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x00e1 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e1 }
            r5[r2] = r4     // Catch:{ all -> 0x00e1 }
            if (r3 == r0) goto L_0x00cb
            java.lang.String r0 = ""
            goto L_0x00cd
        L_0x00cb:
            java.lang.String r0 = "Mobile "
        L_0x00cd:
            r5[r3] = r0     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 %sSafari/534.30"
            java.lang.String r2 = java.lang.String.format(r1, r0, r5)     // Catch:{ all -> 0x00e1 }
        L_0x00d5:
            r7.f231888h = r3     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r7.m137799d(r2)     // Catch:{ all -> 0x00e1 }
            r7.f231887g = r0     // Catch:{ all -> 0x00e1 }
        L_0x00dd:
            java.lang.String r0 = r7.f231887g     // Catch:{ all -> 0x00e1 }
            monitor-exit(r7)
            return r0
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.C85757cq.mo6453a():java.lang.String");
    }

    /* renamed from: c */
    public final synchronized void mo79412c(WebView webView) {
        if (this.f231887g == null || this.f231888h) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            ((SharedPreferences) this.f231882b.mo27525b()).edit().putString("user_agent", userAgentString).apply();
            String d = m137799d(userAgentString);
            this.f231887g = d;
            this.f231888h = false;
            settings.setUserAgentString(d);
            settings.setAllowFileAccess(false);
        }
    }
}
