package com.google.android.apps.gsa.searchbox.p6960ui;

import android.text.Spanned;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.gsa.util.C23341f;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41703c;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.g */
/* compiled from: PG */
public final class C88706g implements C89200e, C41703c, C89204i, C89203h {

    /* renamed from: a */
    public C88703d f239831a;

    /* renamed from: b */
    public C88698g f239832b;

    /* renamed from: c */
    public C41704d f239833c;

    /* renamed from: d */
    public C88702c f239834d;

    /* renamed from: e */
    private C88760ae f239835e;

    /* renamed from: f */
    private C89205j f239836f;

    /* renamed from: g */
    private boolean[] f239837g = new boolean[100];

    /* renamed from: h */
    private String f239838h = BuildConfig.FLAVOR;

    /* renamed from: a */
    public final CharSequence mo82429a() {
        return this.f239833c.mo44287a();
    }

    /* renamed from: c */
    public final void mo82430c(CharSequence charSequence) {
        this.f239832b.mo82402i(5);
        this.f239832b.mo82397A();
        String e = C23341f.m43778e(mo82429a());
        int length = e.length();
        do {
            length--;
            if (length < 0 || e.charAt(length) == ' ') {
                CharSequence concat = TextUtils.concat(new CharSequence[]{e.subSequence(0, length + 1), charSequence});
                int min = Math.min(this.f239838h.length(), 100);
                this.f239838h = concat.toString();
                int min2 = Math.min(concat.length(), 100);
            }
            length--;
            break;
        } while (e.charAt(length) == ' ');
        CharSequence concat2 = TextUtils.concat(new CharSequence[]{e.subSequence(0, length + 1), charSequence});
        int min3 = Math.min(this.f239838h.length(), 100);
        this.f239838h = concat2.toString();
        int min22 = Math.min(concat2.length(), 100);
        if (min22 >= min3) {
            Arrays.fill(this.f239837g, min3, min22, true);
        }
        this.f239834d.mo82425b(concat2.toString());
        this.f239833c.mo44292g(concat2);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88715p pVar = (C88715p) obj;
        this.f239831a = pVar.f239947s;
        this.f239832b = pVar.f239937i;
        this.f239835e = pVar.f239943o;
        this.f239833c = pVar.f239941m;
        this.f239834d = pVar.f239944p;
        this.f239833c.mo44290d(this);
    }

    /* renamed from: e */
    public final void mo78004e() {
        boolean[] zArr;
        if (this.f239836f.mo83177q("QUERY_ARRAY")) {
            C89205j jVar = this.f239836f;
            Object obj = jVar.f241828a;
            if (obj != null) {
                synchronized (obj) {
                    zArr = jVar.mo83163c().getBooleanArray("QUERY_ARRAY");
                }
            } else {
                zArr = jVar.mo83163c().getBooleanArray("QUERY_ARRAY");
            }
            this.f239837g = zArr;
        }
        if (this.f239836f.mo83177q("LAST_DISPLAYED_VALUE")) {
            this.f239838h = this.f239836f.mo83166f("LAST_DISPLAYED_VALUE");
        }
    }

    /* renamed from: f */
    public final void mo44285f() {
        this.f239834d.mo82425b(BuildConfig.FLAVOR);
        int length = this.f239838h.length();
        if (length > 0) {
            Arrays.fill(this.f239837g, 0, Math.min(length, 100), false);
            this.f239838h = BuildConfig.FLAVOR;
        }
        this.f239832b.mo82412s();
    }

    /* renamed from: g */
    public final void mo82431g(Spanned spanned) {
        this.f239833c.mo44291f(spanned);
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [boolean[]] */
    /* JADX WARNING: type inference failed for: r8v6, types: [boolean] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r8v6, types: [boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[LOOP:2: B:27:0x007f->B:28:0x0081, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44286h(int r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.searchbox.ui.a.g r0 = r10.f239832b
            r1 = 1
            r0.mo82402i(r1)
            com.google.android.apps.gsa.searchbox.ui.a.g r0 = r10.f239832b
            r0.mo82419z()
            java.lang.CharSequence r0 = r10.mo82429a()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r10.f239838h
            int r2 = r2.length()
            int r3 = r0.length()
            int r4 = r2 - r3
            r5 = 100
            if (r2 > r5) goto L_0x0092
            if (r3 <= r5) goto L_0x0027
            goto L_0x0092
        L_0x0027:
            r5 = 0
            if (r4 >= 0) goto L_0x0046
            if (r2 == 0) goto L_0x0046
            int r3 = -r4
        L_0x002d:
            int r2 = r2 + -1
            int r4 = r11 - r3
            if (r2 < r4) goto L_0x003e
            if (r2 < 0) goto L_0x003e
            boolean[] r4 = r10.f239837g
            int r6 = r2 + r3
            boolean r7 = r4[r2]
            r4[r6] = r7
            goto L_0x002d
        L_0x003e:
            if (r11 < r3) goto L_0x0099
            boolean[] r2 = r10.f239837g
            java.util.Arrays.fill(r2, r4, r11, r5)
            goto L_0x0099
        L_0x0046:
            if (r4 < 0) goto L_0x0099
            com.google.android.apps.gsa.searchbox.ui.a.g r6 = r10.f239832b
            r6.mo82403j(r4)
            if (r11 <= 0) goto L_0x0069
            int r6 = r11 + -1
            java.lang.String r7 = r10.f239838h
            char r7 = r7.charAt(r6)
            char r8 = r0.charAt(r6)
            if (r7 == r8) goto L_0x0069
            com.google.android.apps.gsa.searchbox.ui.a.g r7 = r10.f239832b
            r7.mo82403j(r1)
            boolean[] r7 = r10.f239837g
            boolean r8 = r7[r6]
            r7[r6] = r5
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            r6 = 0
        L_0x006b:
            if (r6 >= r4) goto L_0x007a
            boolean[] r7 = r10.f239837g
            int r9 = r11 + r6
            boolean r7 = r7[r9]
            if (r7 == 0) goto L_0x0077
            int r8 = r8 + 1
        L_0x0077:
            int r6 = r6 + 1
            goto L_0x006b
        L_0x007a:
            com.google.android.apps.gsa.searchbox.ui.a.g r6 = r10.f239832b
            r6.mo82404k(r8)
        L_0x007f:
            if (r11 >= r3) goto L_0x008c
            boolean[] r6 = r10.f239837g
            int r7 = r11 + r4
            boolean r7 = r6[r7]
            r6[r11] = r7
            int r11 = r11 + 1
            goto L_0x007f
        L_0x008c:
            boolean[] r11 = r10.f239837g
            java.util.Arrays.fill(r11, r3, r2, r5)
            goto L_0x0099
        L_0x0092:
            if (r4 <= 0) goto L_0x0099
            com.google.android.apps.gsa.searchbox.ui.a.g r11 = r10.f239832b
            r11.mo82403j(r4)
        L_0x0099:
            java.lang.String r11 = r0.toString()
            r10.f239838h = r11
            com.google.android.apps.gsa.searchbox.ui.suggestions.ae r11 = r10.f239835e
            r11.mo82490l()
            long r2 = r11.f240143w
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bb
            com.google.android.libraries.gsa.k.g r0 = r11.f240145y
            com.google.android.apps.gsa.searchbox.ui.suggestions.z r4 = new com.google.android.apps.gsa.searchbox.ui.suggestions.z
            r4.<init>(r11)
            java.lang.String r5 = "clearSuggestionsTask"
            com.google.common.util.concurrent.cx r0 = r0.mo28208h(r5, r2, r4)
            r11.f240142v = r0
        L_0x00bb:
            com.google.android.apps.gsa.searchbox.ui.c r11 = r10.f239834d
            java.lang.CharSequence r0 = r10.mo82429a()
            java.lang.String r0 = r0.toString()
            r11.mo82425b(r0)
            com.google.android.apps.gsa.searchbox.ui.d r11 = r10.f239831a
            if (r11 == 0) goto L_0x00d8
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.b.b r11 = (com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.p6955b.C88653b) r11
            r11.mo82323j()
            int r0 = r11.f239698e
            if (r0 <= 0) goto L_0x00d8
            r11.mo82325l(r1)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.C88706g.mo44286h(int):void");
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239836f = jVar;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        this.f239834d.mo82425b(mo82429a().toString());
        boolean[] zArr = new boolean[100];
        this.f239837g = zArr;
        this.f239838h = BuildConfig.FLAVOR;
        C89205j jVar = this.f239836f;
        Object obj = jVar.f241828a;
        if (obj != null) {
            synchronized (obj) {
                jVar.mo83163c().putBooleanArray("QUERY_ARRAY", zArr);
            }
        } else {
            jVar.mo83163c().putBooleanArray("QUERY_ARRAY", zArr);
        }
        this.f239836f.mo83176p("LAST_DISPLAYED_VALUE", this.f239838h);
    }
}
