package com.google.android.apps.gsa.searchbox.p6960ui;

import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.h */
/* compiled from: PG */
public final class C88707h implements C89200e {

    /* renamed from: a */
    public boolean f239839a;

    /* renamed from: b */
    private C88706g f239840b;

    /* renamed from: c */
    private C88698g f239841c;

    /* renamed from: d */
    private List f239842d;

    /* renamed from: e */
    private C88760ae f239843e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r3.f108863c.getBoolean("gsa:ap") != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r2.f108863c.getBoolean("gsa:ap") != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r1.isEmpty() == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if ("web".equals(r7.f108865e) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (r1.length() < r2.length()) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3.f108863c.getBoolean("gsa:ap") != false) goto L_0x004b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82432a(com.google.android.libraries.searchbox.shared.response.Response r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.searchbox.ui.g r0 = r6.f239840b
            java.lang.CharSequence r0 = r0.mo82429a()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.google.android.libraries.gsa.util.C23341f.m43778e(r0)
            java.lang.String r1 = r7.f108861a
            boolean r2 = r6.f239839a
            if (r2 != 0) goto L_0x005b
            com.google.android.apps.gsa.searchbox.ui.suggestions.ae r2 = r6.f239843e
            com.google.android.libraries.searchbox.shared.response.Response r3 = r2.mo82489k()
            com.google.android.apps.gsa.searchbox.ui.suggestions.ac r4 = r2.f240140t
            com.google.android.libraries.searchbox.shared.response.Response r4 = r4.f240107a
            java.lang.String r5 = "gsa:ap"
            if (r4 != 0) goto L_0x0031
            com.google.android.libraries.searchbox.shared.response.Response r4 = r2.f240139s
            if (r4 != 0) goto L_0x0031
            if (r3 == 0) goto L_0x0031
            android.os.Bundle r3 = r3.f108863c
            boolean r3 = r3.getBoolean(r5)
            if (r3 == 0) goto L_0x0031
            goto L_0x004b
        L_0x0031:
            com.google.android.apps.gsa.searchbox.ui.suggestions.ac r3 = r2.f240140t
            com.google.android.libraries.searchbox.shared.response.Response r3 = r3.f240107a
            if (r3 == 0) goto L_0x003f
            android.os.Bundle r3 = r3.f108863c
            boolean r3 = r3.getBoolean(r5)
            if (r3 != 0) goto L_0x004b
        L_0x003f:
            com.google.android.libraries.searchbox.shared.response.Response r2 = r2.f240139s
            if (r2 == 0) goto L_0x005b
            android.os.Bundle r2 = r2.f108863c
            boolean r2 = r2.getBoolean(r5)
            if (r2 == 0) goto L_0x005b
        L_0x004b:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x005b
            java.lang.String r2 = "web"
            java.lang.String r3 = r7.f108865e
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0097
        L_0x005b:
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L_0x009d
            com.google.android.apps.gsa.searchbox.ui.g r2 = r6.f239840b
            com.google.android.libraries.searchbox.ui.a.d r2 = r2.f239833c
            boolean r2 = r2.mo44294i()
            if (r2 == 0) goto L_0x006c
            goto L_0x009d
        L_0x006c:
            com.google.common.b.gu r2 = r7.f108862b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0097
            boolean r2 = r0.startsWith(r1)
            if (r2 == 0) goto L_0x0097
            com.google.android.apps.gsa.searchbox.ui.suggestions.ae r2 = r6.f239843e
            com.google.android.libraries.searchbox.shared.response.Response r2 = r2.mo82489k()
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = ""
            goto L_0x0087
        L_0x0085:
            java.lang.String r2 = r2.f108861a
        L_0x0087:
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x009d
            int r0 = r1.length()
            int r1 = r2.length()
            if (r0 >= r1) goto L_0x009d
        L_0x0097:
            com.google.android.apps.gsa.searchbox.ui.a.g r7 = r6.f239841c
            r7.mo82405l()
            return
        L_0x009d:
            java.util.List r0 = r6.f239842d
            java.util.Iterator r0 = r0.iterator()
        L_0x00a3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r0.next()
            com.google.android.libraries.searchbox.ui.a.e r1 = (com.google.android.libraries.searchbox.p3203ui.p3204a.C41705e) r1
            r1.mo44296hM(r7)
            goto L_0x00a3
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.C88707h.mo82432a(com.google.android.libraries.searchbox.shared.response.Response):void");
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88715p pVar = (C88715p) obj;
        this.f239840b = pVar.f239940l;
        this.f239841c = pVar.f239937i;
        this.f239842d = pVar.f239930b;
        this.f239843e = pVar.f239943o;
    }
}
