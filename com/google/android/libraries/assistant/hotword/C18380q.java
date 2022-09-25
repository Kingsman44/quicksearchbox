package com.google.android.libraries.assistant.hotword;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.micro.GoogleHotwordData;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.assistant.hotword.q */
/* compiled from: PG */
public final class C18380q {

    /* renamed from: a */
    public static final C59071e f52160a = C59071e.m91332i("com.google.android.libraries.assistant.hotword.q");

    /* renamed from: j */
    private static final SimpleDateFormat f52161j = new SimpleDateFormat("_MM-dd_HH-mm-ss");

    /* renamed from: b */
    public boolean f52162b = false;

    /* renamed from: c */
    public final int f52163c;

    /* renamed from: d */
    public InputStream f52164d;

    /* renamed from: e */
    public GoogleHotwordData f52165e;

    /* renamed from: f */
    public final C22871g f52166f;

    /* renamed from: g */
    public Future f52167g;

    /* renamed from: h */
    public C18387x f52168h;

    /* renamed from: i */
    public final Context f52169i;

    /* renamed from: k */
    private String f52170k = BuildConfig.FLAVOR;

    /* renamed from: l */
    private final int f52171l;

    /* renamed from: m */
    private final C18383t f52172m;

    public C18380q(int i, int i2, C18383t tVar, C22871g gVar, Context context) {
        C58976aa aaVar = C58975e.f156826a;
        this.f52163c = i;
        this.f52171l = i2;
        this.f52172m = tVar;
        this.f52166f = gVar;
        this.f52169i = context;
    }

    /* renamed from: b */
    private static void m35796b() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }

    /* renamed from: c */
    private final void m35797c() {
        C18383t tVar = this.f52172m;
        if (tVar != null) {
            tVar.f52184a.f52190e.mo103906d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0260, code lost:
        if (r0.isCancelled() == false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0297, code lost:
        if (r0.isCancelled() == false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c7, code lost:
        if (r0.isCancelled() == false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c9, code lost:
        r1.f52167g.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0154, code lost:
        if (r6.mo84680E() != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0156, code lost:
        r7.f52184a.f52190e.mo103905c(r6);
        r7.f52184a.mo23796h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0163, code lost:
        r7.f52184a.f52190e.mo103907e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016c, code lost:
        if (r1.f52162b == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016e, code lost:
        if (r5 == null) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
        r5.mo23883a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0173, code lost:
        r0 = r1.f52168h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0175, code lost:
        if (r0 == null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0177, code lost:
        r0.mo23898c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017a, code lost:
        r0 = r1.f52167g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0182, code lost:
        if (r0.isCancelled() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0184, code lost:
        r1.f52167g.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018f, code lost:
        r0 = r1.f52172m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0191, code lost:
        if (r0 == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0193, code lost:
        r0.mo23892a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0198, code lost:
        if (r1.f52162b == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019a, code lost:
        if (r5 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019c, code lost:
        r5.mo23883a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019f, code lost:
        r0 = r1.f52168h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a1, code lost:
        if (r0 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a3, code lost:
        r0.mo23898c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a6, code lost:
        r0 = r1.f52167g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a8, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ae, code lost:
        if (r0.isCancelled() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e1, code lost:
        if (r5 != null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e3, code lost:
        r5.mo23883a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0209, code lost:
        if (r5 != null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x021b, code lost:
        if (r0.isCancelled() == false) goto L_0x02c9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x029a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x01e7 */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0217  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x0196=Splitter:B:64:0x0196, B:45:0x016a=Splitter:B:45:0x016a} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23884a() {
        /*
            r17 = this;
            r1 = r17
            com.google.common.f.e r0 = f52160a
            com.google.common.f.x r2 = r0.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "HotwordRecognitionRnr"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Starting hotword detection."
            r5 = 47169(0xb841, float:6.6098E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)
            int r3 = r1.f52163c     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            int r5 = r1.f52171l     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            int r3 = r3 + r3
            int r3 = r3 / 1000
            int r3 = r3 * 1000
            int r3 = r3 * r5
            boolean r5 = r1.f52162b     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r14 = 0
            r15 = 0
            if (r5 == 0) goto L_0x00cc
            java.lang.String r5 = r1.f52170k     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            boolean r5 = r5.isEmpty()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            if (r5 == 0) goto L_0x0046
            android.content.Context r5 = r1.f52169i     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.io.File r5 = r5.getExternalFilesDir(r14)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r6 = "/"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r1.f52170k = r5     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
        L_0x0046:
            java.lang.String r5 = r1.f52170k     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            boolean r5 = r5.isEmpty()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            if (r5 == 0) goto L_0x0060
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r0.mo56378ag(r5, r4)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r5 = "No audio file path has been set, so cannot clean up previous audio."
            r6 = 47168(0xb840, float:6.6096E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r5)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            goto L_0x0082
        L_0x0060:
            java.io.File r0 = new java.io.File     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r5 = r1.f52170k     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r0.<init>(r5)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            com.google.android.libraries.assistant.hotword.o r7 = new com.google.android.libraries.assistant.hotword.o     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r7.<init>(r5)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.io.File[] r0 = r0.listFiles(r7)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            if (r0 == 0) goto L_0x0082
            int r5 = r0.length     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r6 = 0
        L_0x0078:
            if (r6 >= r5) goto L_0x0082
            r7 = r0[r6]     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r7.delete()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            int r6 = r6 + 1
            goto L_0x0078
        L_0x0082:
            java.lang.String r0 = r1.f52170k     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.text.SimpleDateFormat r5 = f52161j     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r5 = r5.format(r6)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r6.<init>()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r6.append(r0)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r0 = "hotword_audio"
            r6.append(r0)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r6.append(r5)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r0 = ".wav"
            r6.append(r0)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r0 = r6.toString()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            com.google.common.f.e r5 = f52160a     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r5.mo56378ag(r6, r4)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r6 = 47177(0xb849, float:6.6109E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            java.lang.String r6 = "Hotword Audio File Location : %s"
            r5.mo56389s(r6, r0)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            com.google.android.libraries.assistant.hotword.p r5 = new com.google.android.libraries.assistant.hotword.p     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            r5.<init>(r0)     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            goto L_0x00cd
        L_0x00cc:
            r5 = r14
        L_0x00cd:
            m35796b()     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            com.google.speech.micro.GoogleHotwordData r0 = r1.f52165e     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r0 = r0.idealBufferBytes()     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r6 = r0 * 1000
            int r6 = r6 / r3
            int r6 = r6 + 2000
            int r7 = r1.f52163c     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r6 = r6 * r7
            int r6 = r6 + r6
            int r7 = r1.f52171l     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r6 = r6 * r7
            int r6 = r6 / 1000
            com.google.android.libraries.assistant.hotword.s r13 = new com.google.android.libraries.assistant.hotword.s     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r8 = r7 + r7
            r13.<init>(r0, r6, r8, r7)     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
        L_0x00ed:
            boolean r6 = r1.f52162b     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            if (r6 == 0) goto L_0x00f7
            if (r5 == 0) goto L_0x00f7
            int r6 = r13.f52176b     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            r5.f52156b = r6     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
        L_0x00f7:
            java.io.InputStream r6 = r1.f52164d     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            com.google.android.libraries.assistant.hotword.r r12 = r13.mo23887a(r6)     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            m35796b()     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            com.google.android.libraries.assistant.hotword.x r6 = r1.f52168h     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            if (r6 != 0) goto L_0x0108
            r2 = r13
            r6 = r14
            r14 = r12
            goto L_0x011d
        L_0x0108:
            java.io.InputStream r7 = r1.f52164d     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r9 = r12.f52173a     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r10 = r12.f52174b     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r11 = r1.f52171l     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            r8 = r13
            r16 = r11
            r11 = r0
            r14 = r12
            r12 = r3
            r2 = r13
            r13 = r16
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r6 = r6.mo23896a(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
        L_0x011d:
            boolean r7 = r1.f52162b     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            if (r7 == 0) goto L_0x014a
            if (r5 == 0) goto L_0x014a
            int r7 = r2.f52176b     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            r5.f52157c = r7     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            byte[] r8 = r2.mo23890d()     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r9 = r5.f52156b     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            if (r7 >= r9) goto L_0x0130
            goto L_0x014a
        L_0x0130:
            int r7 = r7 - r9
            int r10 = r8.length     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r11 = r9 + r7
            byte[] r12 = new byte[r7]     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            if (r10 < r11) goto L_0x013c
            java.lang.System.arraycopy(r8, r9, r12, r15, r7)     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            goto L_0x0145
        L_0x013c:
            int r10 = r10 - r9
            java.lang.System.arraycopy(r8, r9, r12, r15, r10)     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            int r9 = r7 - r10
            java.lang.System.arraycopy(r8, r15, r12, r10, r9)     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
        L_0x0145:
            java.io.ByteArrayOutputStream r8 = r5.f52155a     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            r8.write(r12, r15, r7)     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
        L_0x014a:
            if (r6 == 0) goto L_0x018b
            com.google.android.libraries.assistant.hotword.t r7 = r1.f52172m     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            if (r7 == 0) goto L_0x018b
            boolean r0 = r6.mo84680E()     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            if (r0 != 0) goto L_0x0163
            com.google.android.libraries.assistant.hotword.u r0 = r7.f52184a     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            com.google.android.apps.gsa.voiceinteraction.hotword.c r0 = r0.f52190e     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            r0.mo103905c(r6)     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            com.google.android.libraries.assistant.hotword.u r0 = r7.f52184a     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            r0.mo23796h()     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            goto L_0x016a
        L_0x0163:
            com.google.android.libraries.assistant.hotword.u r0 = r7.f52184a     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            com.google.android.apps.gsa.voiceinteraction.hotword.c r0 = r0.f52190e     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            r0.mo103907e(r6)     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
        L_0x016a:
            boolean r0 = r1.f52162b     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            if (r0 == 0) goto L_0x0173
            if (r5 == 0) goto L_0x0173
            r5.mo23883a()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
        L_0x0173:
            com.google.android.libraries.assistant.hotword.x r0 = r1.f52168h
            if (r0 == 0) goto L_0x017a
            r0.mo23898c()
        L_0x017a:
            java.util.concurrent.Future r0 = r1.f52167g
            if (r0 == 0) goto L_0x018a
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x018a
        L_0x0184:
            java.util.concurrent.Future r0 = r1.f52167g
            r2 = 1
            r0.cancel(r2)
        L_0x018a:
            return
        L_0x018b:
            int r6 = r14.f52174b     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            if (r6 >= r0) goto L_0x01b2
            com.google.android.libraries.assistant.hotword.t r0 = r1.f52172m     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
            if (r0 == 0) goto L_0x0196
            r0.mo23892a()     // Catch:{ IOException -> 0x01e7, UnsupportedOperationException -> 0x01b8 }
        L_0x0196:
            boolean r0 = r1.f52162b     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            if (r0 == 0) goto L_0x019f
            if (r5 == 0) goto L_0x019f
            r5.mo23883a()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
        L_0x019f:
            com.google.android.libraries.assistant.hotword.x r0 = r1.f52168h
            if (r0 == 0) goto L_0x01a6
            r0.mo23898c()
        L_0x01a6:
            java.util.concurrent.Future r0 = r1.f52167g
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x01b1
            goto L_0x0184
        L_0x01b1:
            return
        L_0x01b2:
            r13 = r2
            r14 = 0
            goto L_0x00ed
        L_0x01b6:
            r0 = move-exception
            goto L_0x021f
        L_0x01b8:
            r0 = move-exception
            r17.m35797c()     // Catch:{ all -> 0x01b6 }
            com.google.common.f.e r2 = f52160a     // Catch:{ all -> 0x01b6 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x01b6 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01b6 }
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x01b6 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x01b6 }
            com.google.common.f.x r0 = r2.mo56382g(r0)     // Catch:{ all -> 0x01b6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01b6 }
            r2 = 47175(0xb847, float:6.6106E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x01b6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = "UnsupportedOperationException"
            r0.mo56386p(r2)     // Catch:{ all -> 0x01b6 }
            boolean r0 = r1.f52162b     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            if (r0 == 0) goto L_0x020c
            if (r5 == 0) goto L_0x020c
        L_0x01e3:
            r5.mo23883a()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            goto L_0x020c
        L_0x01e7:
            r17.m35797c()     // Catch:{ all -> 0x01b6 }
            com.google.common.f.e r0 = f52160a     // Catch:{ all -> 0x01b6 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x01b6 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01b6 }
            r0.mo56378ag(r2, r4)     // Catch:{ all -> 0x01b6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01b6 }
            r2 = 47174(0xb846, float:6.6105E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x01b6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = "IOException during hotword detection; expected during hotword detection closing"
            r0.mo56386p(r2)     // Catch:{ all -> 0x01b6 }
            boolean r0 = r1.f52162b     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            if (r0 == 0) goto L_0x020c
            if (r5 == 0) goto L_0x020c
            goto L_0x01e3
        L_0x020c:
            com.google.android.libraries.assistant.hotword.x r0 = r1.f52168h
            if (r0 == 0) goto L_0x0213
            r0.mo23898c()
        L_0x0213:
            java.util.concurrent.Future r0 = r1.f52167g
            if (r0 == 0) goto L_0x02cf
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x02cf
            goto L_0x02c9
        L_0x021f:
            boolean r2 = r1.f52162b     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
            if (r2 == 0) goto L_0x0228
            if (r5 == 0) goto L_0x0228
            r5.mo23883a()     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
        L_0x0228:
            throw r0     // Catch:{ InterruptedException -> 0x029a, IllegalArgumentException -> 0x0263, IllegalStateException -> 0x022c }
        L_0x0229:
            r0 = move-exception
            goto L_0x02d7
        L_0x022c:
            r0 = move-exception
            r17.m35797c()     // Catch:{ all -> 0x0229 }
            com.google.common.f.e r2 = f52160a     // Catch:{ all -> 0x0229 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0229 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0229 }
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0229 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0229 }
            com.google.common.f.x r0 = r2.mo56382g(r0)     // Catch:{ all -> 0x0229 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0229 }
            r2 = 47173(0xb845, float:6.6103E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0229 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0229 }
            java.lang.String r2 = "Error using GoogleHotwordRecognizer"
            r0.mo56386p(r2)     // Catch:{ all -> 0x0229 }
            com.google.android.libraries.assistant.hotword.x r0 = r1.f52168h
            if (r0 == 0) goto L_0x0258
            r0.mo23898c()
        L_0x0258:
            java.util.concurrent.Future r0 = r1.f52167g
            if (r0 == 0) goto L_0x02cf
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x02cf
            goto L_0x02c9
        L_0x0263:
            r0 = move-exception
            r17.m35797c()     // Catch:{ all -> 0x0229 }
            com.google.common.f.e r2 = f52160a     // Catch:{ all -> 0x0229 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0229 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0229 }
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0229 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0229 }
            com.google.common.f.x r0 = r2.mo56382g(r0)     // Catch:{ all -> 0x0229 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0229 }
            r2 = 47172(0xb844, float:6.6102E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0229 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0229 }
            java.lang.String r2 = "Error creating or using GoogleHotwordRecognizer"
            r0.mo56386p(r2)     // Catch:{ all -> 0x0229 }
            com.google.android.libraries.assistant.hotword.x r0 = r1.f52168h
            if (r0 == 0) goto L_0x028f
            r0.mo23898c()
        L_0x028f:
            java.util.concurrent.Future r0 = r1.f52167g
            if (r0 == 0) goto L_0x02cf
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x02cf
            goto L_0x02c9
        L_0x029a:
            r17.m35797c()     // Catch:{ all -> 0x0229 }
            com.google.common.f.e r0 = f52160a     // Catch:{ all -> 0x0229 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0229 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0229 }
            r0.mo56378ag(r2, r4)     // Catch:{ all -> 0x0229 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0229 }
            r2 = 47171(0xb843, float:6.61E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0229 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0229 }
            java.lang.String r2 = "Catched InterruptedException"
            r0.mo56386p(r2)     // Catch:{ all -> 0x0229 }
            com.google.android.libraries.assistant.hotword.x r0 = r1.f52168h
            if (r0 == 0) goto L_0x02bf
            r0.mo23898c()
        L_0x02bf:
            java.util.concurrent.Future r0 = r1.f52167g
            if (r0 == 0) goto L_0x02cf
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x02cf
        L_0x02c9:
            java.util.concurrent.Future r0 = r1.f52167g
            r2 = 1
            r0.cancel(r2)
        L_0x02cf:
            com.google.android.libraries.assistant.hotword.t r0 = r1.f52172m
            if (r0 == 0) goto L_0x02d6
            r0.mo23892a()
        L_0x02d6:
            return
        L_0x02d7:
            com.google.android.libraries.assistant.hotword.x r2 = r1.f52168h
            if (r2 == 0) goto L_0x02de
            r2.mo23898c()
        L_0x02de:
            java.util.concurrent.Future r2 = r1.f52167g
            if (r2 == 0) goto L_0x02ee
            boolean r2 = r2.isCancelled()
            if (r2 != 0) goto L_0x02ee
            java.util.concurrent.Future r2 = r1.f52167g
            r3 = 1
            r2.cancel(r3)
        L_0x02ee:
            goto L_0x02f0
        L_0x02ef:
            throw r0
        L_0x02f0:
            goto L_0x02ef
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18380q.mo23884a():void");
    }
}
