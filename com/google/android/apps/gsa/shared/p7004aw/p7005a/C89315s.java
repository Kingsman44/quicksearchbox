package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import org.json.JSONArray;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.s */
/* compiled from: PG */
public final class C89315s {

    /* renamed from: e */
    private static final C59071e f242136e = C59071e.m91332i("com.google.android.apps.gsa.shared.aw.a.s");

    /* renamed from: a */
    public final WebView f242137a;

    /* renamed from: b */
    public final C21370a f242138b;

    /* renamed from: c */
    public C58833ax f242139c;

    /* renamed from: d */
    public C58833ax f242140d;

    /* renamed from: f */
    private final String f242141f;

    /* renamed from: g */
    private boolean f242142g;

    /* renamed from: h */
    private final C89319w f242143h;

    public C89315s(WebView webView, String str, C21370a aVar, C89319w wVar) {
        C58836b bVar = C58836b.f156633a;
        this.f242139c = bVar;
        this.f242140d = bVar;
        this.f242137a = webView;
        this.f242141f = str;
        this.f242138b = aVar;
        this.f242143h = wVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.base.C58833ax m145236a(android.content.Context r6) {
        /*
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ IOException -> 0x003d }
            java.lang.String r0 = "highlighter-min.js"
            java.io.InputStream r6 = r6.open(r0)     // Catch:{ IOException -> 0x003d }
            byte[] r0 = com.google.common.p4541l.C59332o.m92213d(r6)     // Catch:{ all -> 0x001d }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x001d }
            r1.<init>(r0)     // Catch:{ all -> 0x001d }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ all -> 0x001d }
            if (r6 == 0) goto L_0x001c
            r6.close()     // Catch:{ IOException -> 0x003d }
        L_0x001c:
            return r0
        L_0x001d:
            r0 = move-exception
            if (r6 == 0) goto L_0x003c
            r6.close()     // Catch:{ all -> 0x0024 }
            goto L_0x003c
        L_0x0024:
            r6 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x003c }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x003c }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x003c }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003c }
            r1[r4] = r6     // Catch:{ Exception -> 0x003c }
            r2.invoke(r0, r1)     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            throw r0     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r6 = move-exception
            com.google.common.f.e r0 = f242136e
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Failed reading javascript file."
            r2 = 11088(0x2b50, float:1.5538E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r6)).mo56372aa(r2)).mo56386p(r1)
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7004aw.p7005a.C89315s.m145236a(android.content.Context):com.google.common.base.ax");
    }

    /* renamed from: b */
    public final void mo83243b() {
        this.f242137a.evaluateJavascript(String.format("%s.clearHighlights();", new Object[]{"highlighter"}), (ValueCallback) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo83244c(com.google.android.apps.gsa.shared.p7004aw.p7005a.C89321y r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f242142g     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x0014
            com.google.common.f.e r5 = f242136e     // Catch:{ all -> 0x0075 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "Uninitialized."
            r1 = 11090(0x2b52, float:1.554E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            return
        L_0x0014:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0075 }
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "highlighter"
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0075 }
            int r2 = r5.f242162a     // Catch:{ all -> 0x0075 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0075 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x0075 }
            int r5 = r5.f242163b     // Catch:{ all -> 0x0075 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0075 }
            r2 = 2
            r1[r2] = r5     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = "%s.highlightText(%d, %d);"
            java.lang.String r5 = java.lang.String.format(r0, r5, r1)     // Catch:{ all -> 0x0075 }
            android.webkit.WebView r0 = r4.f242137a     // Catch:{ all -> 0x0075 }
            r1 = 0
            r0.evaluateJavascript(r5, r1)     // Catch:{ all -> 0x0075 }
            com.google.android.apps.gsa.shared.aw.a.w r5 = r4.f242143h     // Catch:{ all -> 0x0075 }
            boolean r5 = r5.f242154c     // Catch:{ all -> 0x0075 }
            if (r5 == 0) goto L_0x0043
            goto L_0x0065
        L_0x0043:
            com.google.android.libraries.f.a r5 = r4.f242138b     // Catch:{ all -> 0x0075 }
            long r0 = r5.mo26871c()     // Catch:{ all -> 0x0075 }
            com.google.common.base.ax r5 = r4.f242140d     // Catch:{ all -> 0x0075 }
            boolean r5 = r5.mo56113h()     // Catch:{ all -> 0x0075 }
            if (r5 == 0) goto L_0x0067
            com.google.common.base.ax r5 = r4.f242140d     // Catch:{ all -> 0x0075 }
            java.lang.Object r5 = r5.mo56107c()     // Catch:{ all -> 0x0075 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0075 }
            long r2 = r5.longValue()     // Catch:{ all -> 0x0075 }
            long r0 = r0 - r2
            r2 = 3000(0xbb8, double:1.482E-320)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            monitor-exit(r4)
            return
        L_0x0067:
            android.webkit.WebView r5 = r4.f242137a     // Catch:{ all -> 0x0075 }
            com.google.android.apps.gsa.shared.aw.a.r r0 = new com.google.android.apps.gsa.shared.aw.a.r     // Catch:{ all -> 0x0075 }
            r0.<init>(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "(document.getElementsByTagName('googleHighlightingMark')[0].getBoundingClientRect().top < window.innerHeight / 4) || (document.getElementsByTagName('googleHighlightingMark')[0].getBoundingClientRect().top > window.innerHeight * 0.75)"
            r5.evaluateJavascript(r1, r0)     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            return
        L_0x0075:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7004aw.p7005a.C89315s.mo83244c(com.google.android.apps.gsa.shared.aw.a.y):void");
    }

    /* renamed from: d */
    public final synchronized void mo83245d(C58485gu guVar) {
        if (!this.f242143h.f242154c) {
            this.f242137a.setOnScrollChangeListener(new C89311o(this));
        }
        if (this.f242142g) {
            ((C59052c) ((C59052c) f242136e.mo56226d()).mo56372aa(11093)).mo56386p("Already initialized.");
            return;
        }
        mo83243b();
        ((C59052c) ((C59052c) f242136e.mo56224b()).mo56372aa(11091)).mo56386p("Injecting highlighter definitions.");
        this.f242137a.evaluateJavascript(this.f242141f, C89312p.f242133a);
        Locale locale = Locale.US;
        C89319w wVar = this.f242143h;
        this.f242137a.evaluateJavascript(String.format(locale, "%s = new $googReadAloudHighlighterListenerClass();%s = new $googReadAloudHighlighterClass(%s,{highlightMode:%d,useAutoscroll:%s,autoscrollResumeTimeoutMs:%d,useSnapToParagraph:%s,useSnapToWord:%s,wordHighlightColor:\"%s\",wordHighlightBGColor:\"%s\",elementHighlightColor:null,elementHighlightBGColor:\"%s\",wordHighlightDurationMs:%d,highlightBorderRadiusPx:%d,getLongPressData:%s}, %s);", new Object[]{"highlighterListener", "highlighter", new JSONArray(C58597ky.m90217h(guVar, C89313q.f242134a)).toString(), Integer.valueOf(wVar.f242152a), Boolean.valueOf(wVar.f242154c), 3000L, Boolean.valueOf(wVar.f242153b), Boolean.valueOf(wVar.f242158g), String.format("#%s", new Object[]{wVar.f242157f}), String.format("#%s", new Object[]{this.f242143h.f242155d}), String.format("#%s", new Object[]{this.f242143h.f242156e}), 167, 3, Boolean.valueOf(this.f242143h.f242159h), "highlighterListener"}), (ValueCallback) null);
        this.f242137a.evaluateJavascript(String.format("%s.onSnapToParagraph = (index) => { %s.snapToParagraph(index); };%s.onSnapToWord = (index, offset) => { %s.snapToWord(index, offset); };%s.onGetLongPressData = (word, text) => { %s.wordLongPressed(word, text); };", new Object[]{"highlighterListener", "javaProxy", "highlighterListener", "javaProxy", "highlighterListener", "javaProxy"}), (ValueCallback) null);
        this.f242142g = true;
    }
}
