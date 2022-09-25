package com.google.android.libraries.gsa.p1859d.p1861b;

import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.libraries.gsa.p1859d.C22785g;
import java.io.PrintWriter;

/* renamed from: com.google.android.libraries.gsa.d.b.r */
/* compiled from: PG */
abstract class C22772r extends C22771q {

    /* renamed from: a */
    protected final int f62689a;

    /* renamed from: b */
    protected final C22774t f62690b;

    /* renamed from: c */
    protected final C22785g f62691c;

    /* renamed from: d */
    protected C22768n f62692d;

    /* renamed from: e */
    final /* synthetic */ C22776v f62693e;

    public C22772r(C22776v vVar, C22774t tVar, int i, String str) {
        this.f62693e = vVar;
        this.f62690b = tVar;
        this.f62689a = i;
        this.f62691c = new C22785g(str, 40);
    }

    /* renamed from: a */
    public void mo28069a(PrintWriter printWriter) {
        C22768n nVar = this.f62692d;
        printWriter.println("     mView: ".concat(String.valueOf(String.valueOf(nVar))));
        if (nVar != null) {
            nVar.mo28034S(printWriter);
        }
        this.f62691c.mo28124d("    ", printWriter);
    }

    /* renamed from: b */
    public abstract C22768n mo28071b(Configuration configuration, Bundle bundle, String str);

    /* JADX WARNING: Removed duplicated region for block: B:124:0x03e4 A[SYNTHETIC, Splitter:B:124:0x03e4] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x041d A[Catch:{ Exception -> 0x046c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "configuration"
            java.lang.String r3 = "partner_overlay_icon"
            java.lang.String r4 = "layout_params"
            int r5 = r0.what
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x014b
            if (r5 == r10) goto L_0x0116
            if (r5 == r7) goto L_0x00f1
            r2 = 6
            if (r5 == r2) goto L_0x0070
            r2 = 7
            if (r5 == r2) goto L_0x003f
            r2 = 8
            if (r5 == r2) goto L_0x0022
            return r9
        L_0x0022:
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d
            if (r2 == 0) goto L_0x0037
            com.google.android.libraries.gsa.d.g r2 = r1.f62691c
            java.lang.String r3 = "MSG_START_SEARCH"
            r2.mo28121a(r3)
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d
            java.lang.Object r0 = r0.obj
            com.google.android.libraries.gsa.d.b.l r0 = (com.google.android.libraries.gsa.p1859d.p1861b.C22766l) r0
            r2.mo28022C(r0)
            goto L_0x003e
        L_0x0037:
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c
            java.lang.String r2 = "MSG_START_SEARCH: empty view"
            r0.mo28121a(r2)
        L_0x003e:
            return r10
        L_0x003f:
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d
            if (r2 == 0) goto L_0x0068
            com.google.android.libraries.gsa.d.g r2 = r1.f62691c
            java.lang.Object[] r3 = new java.lang.Object[r10]
            int r4 = r0.arg1
            if (r4 != r10) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r9] = r4
            java.lang.String r4 = "MSG_SET_VOICE_ENABLED: enabled=%b"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.mo28121a(r3)
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d
            int r0 = r0.arg1
            if (r0 != r10) goto L_0x0064
            r9 = 1
        L_0x0064:
            r2.mo28064y(r9)
            goto L_0x006f
        L_0x0068:
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c
            java.lang.String r2 = "MSG_SET_VOICE_ENABLED: empty view"
            r0.mo28121a(r2)
        L_0x006f:
            return r10
        L_0x0070:
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d
            if (r2 == 0) goto L_0x00e9
            java.lang.Object r2 = r0.obj
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = "overlay_animation_duration"
            int r3 = r2.getInt(r3, r9)
            java.lang.String r4 = "overlay_animation_type"
            int r4 = r2.getInt(r4, r9)
            int[] r5 = new int[r6]
            r5 = {1, 2, 4} // fill-array
            r11 = 0
        L_0x008a:
            if (r11 >= r6) goto L_0x00d5
            r12 = r5[r11]
            int r13 = r12 + -1
            if (r12 == 0) goto L_0x00d4
            if (r13 != r4) goto L_0x00d1
            com.google.android.libraries.gsa.d.b.c r4 = new com.google.android.libraries.gsa.d.b.c
            r4.<init>(r12, r3)
            java.lang.String r3 = "is_layer_mode_enabled"
            boolean r2 = r2.getBoolean(r3, r9)
            com.google.android.libraries.gsa.d.g r3 = r1.f62691c
            java.lang.Object[] r5 = new java.lang.Object[r6]
            int r6 = r0.arg1
            if (r6 != r10) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r9] = r6
            r5[r10] = r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r5[r7] = r6
            java.lang.String r6 = "MSG_SET_OPEN: open=%b animationDescriptor=%s, layered=%b"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r3.mo28121a(r5)
            int r0 = r0.arg1
            if (r0 != r10) goto L_0x00cb
            com.google.android.libraries.gsa.d.b.n r0 = r1.f62692d
            r0.mo28039Y(r4, r2)
            goto L_0x00f0
        L_0x00cb:
            com.google.android.libraries.gsa.d.b.n r0 = r1.f62692d
            r0.mo28048e(r4)
            goto L_0x00f0
        L_0x00d1:
            int r11 = r11 + 1
            goto L_0x008a
        L_0x00d4:
            throw r8
        L_0x00d5:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to find an animation type corresponding to value: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x00e9:
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c
            java.lang.String r2 = "MSG_SET_OPEN: empty view"
            r0.mo28121a(r2)
        L_0x00f0:
            return r10
        L_0x00f1:
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d
            if (r2 == 0) goto L_0x010e
            com.google.android.libraries.gsa.d.g r2 = r1.f62691c
            java.lang.String r3 = "MSG_DESTROY"
            r2.mo28121a(r3)
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d
            com.google.android.libraries.ab.f r2 = r2.mo28036V()
            r1.f62692d = r8
            int r0 = r0.arg1
            if (r0 != 0) goto L_0x0115
            com.google.android.libraries.gsa.d.b.t r0 = r1.f62690b
            r0.mo28080b(r2, r9)
            goto L_0x0115
        L_0x010e:
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c
            java.lang.String r2 = "MSG_DESTROY: empty view"
            r0.mo28121a(r2)
        L_0x0115:
            return r10
        L_0x0116:
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d
            if (r2 == 0) goto L_0x0143
            com.google.android.libraries.gsa.d.g r2 = r1.f62691c
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.Object r4 = r0.obj
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r9] = r4
            java.lang.String r4 = "MSG_SET_ACTIVITY_STATE: activityState=%d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.mo28121a(r3)
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d
            java.lang.Object r0 = r0.obj
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.mo28040Z(r0)
            goto L_0x014a
        L_0x0143:
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c
            java.lang.String r2 = "MSG_SET_ACTIVITY_STATE: empty view"
            r0.mo28121a(r2)
        L_0x014a:
            return r10
        L_0x014b:
            int r5 = r0.arg1
            if (r5 != 0) goto L_0x0157
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c
            java.lang.String r2 = "MSG_SET_WINDOW_ATTACHED: skip"
            r0.mo28121a(r2)
            return r10
        L_0x0157:
            java.lang.Object r0 = r0.obj
            android.util.Pair r0 = (android.util.Pair) r0
            com.google.android.libraries.gsa.d.b.v r5 = r1.f62693e
            java.lang.Object r11 = r0.first
            android.os.Bundle r11 = (android.os.Bundle) r11
            r5.mo28102j(r11)
            java.lang.Object r5 = r0.first
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r11 = "internal_request_id"
            java.lang.String r5 = r5.getString(r11)
            java.lang.Object r12 = r0.first     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r12 = (android.os.Bundle) r12     // Catch:{ Exception -> 0x046c }
            android.os.Parcelable r12 = r12.getParcelable(r4)     // Catch:{ Exception -> 0x046c }
            android.view.WindowManager$LayoutParams r12 = (android.view.WindowManager.LayoutParams) r12     // Catch:{ Exception -> 0x046c }
            java.lang.Object r13 = r0.first     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r13 = (android.os.Bundle) r13     // Catch:{ Exception -> 0x046c }
            android.os.Parcelable r13 = r13.getParcelable(r2)     // Catch:{ Exception -> 0x046c }
            android.content.res.Configuration r13 = (android.content.res.Configuration) r13     // Catch:{ Exception -> 0x046c }
            if (r12 != 0) goto L_0x018e
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c     // Catch:{ Exception -> 0x046c }
            java.lang.String r2 = "MSG_SET_WINDOW_ATTACHED: layoutParams is null"
            r0.mo28121a(r2)     // Catch:{ Exception -> 0x046c }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x046c }
            return r10
        L_0x018e:
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x046c }
            android.os.IBinder r14 = r12.token     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r14 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            if (r14 == 0) goto L_0x0269
            boolean r14 = r14.mo28026K()     // Catch:{ Exception -> 0x046c }
            if (r14 == 0) goto L_0x0269
            com.google.android.libraries.gsa.d.b.n r14 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r8 = r14.f62666an     // Catch:{ Exception -> 0x046c }
            if (r8 == 0) goto L_0x0269
            boolean r8 = r14.mo28046af()     // Catch:{ Exception -> 0x046c }
            if (r8 == 0) goto L_0x01ae
            com.google.android.libraries.gsa.d.b.n r8 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            int r8 = r8.f62656aC     // Catch:{ Exception -> 0x046c }
            if (r8 == r10) goto L_0x0269
        L_0x01ae:
            if (r13 == 0) goto L_0x0269
            android.view.WindowManager$LayoutParams r8 = new android.view.WindowManager$LayoutParams     // Catch:{ Exception -> 0x046c }
            r8.<init>()     // Catch:{ Exception -> 0x046c }
            r8.copyFrom(r12)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r14 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r14 = r14.f62666an     // Catch:{ Exception -> 0x046c }
            android.os.Parcelable r14 = r14.getParcelable(r4)     // Catch:{ Exception -> 0x046c }
            android.view.WindowManager$LayoutParams r14 = (android.view.WindowManager.LayoutParams) r14     // Catch:{ Exception -> 0x046c }
            android.os.IBinder r15 = r14.token     // Catch:{ Exception -> 0x046c }
            android.os.IBinder r6 = r8.token     // Catch:{ Exception -> 0x046c }
            int r8 = r8.copyFrom(r14)     // Catch:{ Exception -> 0x046c }
            if (r15 != r6) goto L_0x0269
            if (r8 != 0) goto L_0x0269
            java.lang.Object r6 = r0.first     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r8 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r8 = r8.f62666an     // Catch:{ Exception -> 0x046c }
            android.os.Parcelable r6 = r6.getParcelable(r3)     // Catch:{ Exception -> 0x046c }
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ Exception -> 0x046c }
            android.os.Parcelable r8 = r8.getParcelable(r3)     // Catch:{ Exception -> 0x046c }
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch:{ Exception -> 0x046c }
            if (r6 != 0) goto L_0x01e7
            if (r8 != 0) goto L_0x01e7
            goto L_0x01f2
        L_0x01e7:
            if (r6 == 0) goto L_0x0269
            if (r8 == 0) goto L_0x0269
            boolean r6 = r6.sameAs(r8)     // Catch:{ Exception -> 0x046c }
            if (r6 != 0) goto L_0x01f2
            goto L_0x0269
        L_0x01f2:
            java.lang.Object r6 = r0.first     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r8 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r8 = r8.f62666an     // Catch:{ Exception -> 0x046c }
            r14 = 5
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ Exception -> 0x046c }
            r14[r9] = r4     // Catch:{ Exception -> 0x046c }
            java.lang.String r15 = "background_color_hint"
            r14[r10] = r15     // Catch:{ Exception -> 0x046c }
            java.lang.String r15 = "background_secondary_color_hint"
            r14[r7] = r15     // Catch:{ Exception -> 0x046c }
            r15 = 3
            r14[r15] = r11     // Catch:{ Exception -> 0x046c }
            r11 = 4
            r14[r11] = r3     // Catch:{ Exception -> 0x046c }
            boolean r3 = com.google.android.libraries.gsa.p1859d.p1861b.C22759e.m42470a(r6, r8, r14)     // Catch:{ Exception -> 0x046c }
            if (r3 == 0) goto L_0x0269
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            int r2 = r2.f62656aC     // Catch:{ Exception -> 0x046c }
            if (r2 != r10) goto L_0x022a
            com.google.android.libraries.gsa.d.g r2 = r1.f62691c     // Catch:{ Exception -> 0x046c }
            java.lang.String r3 = "MSG_SET_WINDOW_ATTACHED: update bg color"
            r2.mo28121a(r3)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            java.lang.Object r3 = r0.first     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ Exception -> 0x046c }
            r2.mo28049g(r3)     // Catch:{ Exception -> 0x046c }
            goto L_0x0231
        L_0x022a:
            com.google.android.libraries.gsa.d.g r2 = r1.f62691c     // Catch:{ Exception -> 0x046c }
            java.lang.String r3 = "MSG_SET_WINDOW_ATTACHED: ignore noncritical option change"
            r2.mo28121a(r3)     // Catch:{ Exception -> 0x046c }
        L_0x0231:
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            java.lang.Object r3 = r0.second     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.ab.f r3 = (com.google.android.libraries.p10922ab.C146710f) r3     // Catch:{ Exception -> 0x046c }
            r2.mo28041aa(r3)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.t r2 = r1.f62690b     // Catch:{ Exception -> 0x046c }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.ab.f r0 = (com.google.android.libraries.p10922ab.C146710f) r0     // Catch:{ Exception -> 0x046c }
            int r3 = r1.f62689a     // Catch:{ Exception -> 0x046c }
            r2.mo28080b(r0, r3)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r0 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            r0.mo28038X()     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c     // Catch:{ Exception -> 0x046c }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x046c }
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x046c }
            int r4 = r1.f62689a     // Catch:{ Exception -> 0x046c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x046c }
            r3[r9] = r4     // Catch:{ Exception -> 0x046c }
            java.lang.String r4 = "MSG_SET_WINDOW_ATTACHED: activeStatus=%d, Overlay reused;"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)     // Catch:{ Exception -> 0x046c }
            r0.mo28121a(r2)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.v r0 = r1.f62693e     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.a.a r0 = r0.f62708c     // Catch:{ Exception -> 0x046c }
            r0.mo27925j(r5)     // Catch:{ Exception -> 0x046c }
            return r10
        L_0x0269:
            com.google.android.libraries.gsa.d.b.n r3 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            if (r3 == 0) goto L_0x029e
            com.google.android.libraries.gsa.d.g r3 = r1.f62691c     // Catch:{ Exception -> 0x046c }
            java.lang.String r6 = "MSG_SET_WINDOW_ATTACHED: reconfigure view"
            r3.mo28121a(r6)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.v r3 = r1.f62693e     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.a.a r3 = r3.f62708c     // Catch:{ Exception -> 0x046c }
            r3.mo27940y(r5)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r3 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            boolean r3 = r3.mo28024I()     // Catch:{ Exception -> 0x046c }
            if (r3 == 0) goto L_0x028f
            com.google.android.libraries.gsa.d.b.n r3 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            r3.mo28036V()     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r3 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r3 = r3.mo28035U()     // Catch:{ Exception -> 0x046c }
            goto L_0x029a
        L_0x028f:
            com.google.android.libraries.gsa.d.b.n r3 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r3 = r3.mo28035U()     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r6 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            r6.mo28036V()     // Catch:{ Exception -> 0x046c }
        L_0x029a:
            r6 = 0
            r1.f62692d = r6     // Catch:{ Exception -> 0x046c }
            goto L_0x02a6
        L_0x029e:
            com.google.android.libraries.gsa.d.b.v r3 = r1.f62693e     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.a.a r3 = r3.f62708c     // Catch:{ Exception -> 0x046c }
            r3.mo27936u(r5)     // Catch:{ Exception -> 0x046c }
            r3 = 0
        L_0x02a6:
            com.google.android.libraries.gsa.d.b.v r6 = r1.f62693e     // Catch:{ Exception -> 0x046c }
            java.lang.Object r8 = r0.first     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ Exception -> 0x046c }
            android.content.res.Configuration r6 = r6.mo28095b(r13, r8)     // Catch:{ Exception -> 0x046c }
            java.lang.Object r8 = r0.first     // Catch:{ Exception -> 0x046c }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r6 = r1.mo28071b(r6, r8, r5)     // Catch:{ Exception -> 0x046c }
            r1.f62692d = r6     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.t r8 = r1.f62690b     // Catch:{ BadTokenException -> 0x0451 }
            java.lang.String r11 = r8.f62698d     // Catch:{ BadTokenException -> 0x0451 }
            int r8 = r8.f62696b     // Catch:{ BadTokenException -> 0x0451 }
            java.lang.Object r13 = r0.first     // Catch:{ BadTokenException -> 0x0451 }
            android.os.Bundle r13 = (android.os.Bundle) r13     // Catch:{ BadTokenException -> 0x0451 }
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ BadTokenException -> 0x0451 }
            r14.writeBundle(r13)     // Catch:{ BadTokenException -> 0x0451 }
            r14.setDataPosition(r9)     // Catch:{ BadTokenException -> 0x0451 }
            android.os.Bundle r15 = r14.readBundle()     // Catch:{ BadTokenException -> 0x0451 }
            r6.f62666an = r15     // Catch:{ BadTokenException -> 0x0451 }
            r14.recycle()     // Catch:{ BadTokenException -> 0x0451 }
            android.content.res.Resources r14 = r6.getResources()     // Catch:{ BadTokenException -> 0x0451 }
            boolean r14 = com.google.android.libraries.gsa.p1859d.p1861b.C22754ad.m42437p(r14)     // Catch:{ BadTokenException -> 0x0451 }
            r6.f62661ai = r14     // Catch:{ BadTokenException -> 0x0451 }
            r6.f62662aj = r11     // Catch:{ BadTokenException -> 0x0451 }
            r6.f62663ak = r8     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Window r8 = r6.f62639aa     // Catch:{ BadTokenException -> 0x0451 }
            android.os.IBinder r11 = r12.token     // Catch:{ BadTokenException -> 0x0451 }
            android.content.ComponentName r14 = new android.content.ComponentName     // Catch:{ BadTokenException -> 0x0451 }
            android.content.Context r15 = r6.getBaseContext()     // Catch:{ BadTokenException -> 0x0451 }
            java.lang.Class r15 = r15.getClass()     // Catch:{ BadTokenException -> 0x0451 }
            r14.<init>(r6, r15)     // Catch:{ BadTokenException -> 0x0451 }
            java.lang.String r14 = r14.flattenToShortString()     // Catch:{ BadTokenException -> 0x0451 }
            r15 = 0
            r8.setWindowManager(r15, r11, r14, r10)     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Window r8 = r6.f62639aa     // Catch:{ BadTokenException -> 0x0451 }
            android.view.WindowManager r8 = r8.getWindowManager()     // Catch:{ BadTokenException -> 0x0451 }
            r6.f62641ac = r8     // Catch:{ BadTokenException -> 0x0451 }
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ BadTokenException -> 0x0451 }
            r8.<init>()     // Catch:{ BadTokenException -> 0x0451 }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ BadTokenException -> 0x0451 }
            r14 = 30
            if (r11 < r14) goto L_0x0322
            android.content.Context r11 = r6.getBaseContext()     // Catch:{ BadTokenException -> 0x0451 }
            java.lang.String r14 = "display"
            java.lang.Object r11 = r11.getSystemService(r14)     // Catch:{ BadTokenException -> 0x0451 }
            android.hardware.display.DisplayManager r11 = (android.hardware.display.DisplayManager) r11     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Display r11 = r11.getDisplay(r9)     // Catch:{ BadTokenException -> 0x0451 }
            goto L_0x0328
        L_0x0322:
            android.view.WindowManager r11 = r6.f62641ac     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Display r11 = r11.getDefaultDisplay()     // Catch:{ BadTokenException -> 0x0451 }
        L_0x0328:
            r11.getRealSize(r8)     // Catch:{ BadTokenException -> 0x0451 }
            int r11 = r8.x     // Catch:{ BadTokenException -> 0x0451 }
            int r8 = r8.y     // Catch:{ BadTokenException -> 0x0451 }
            int r8 = java.lang.Math.max(r11, r8)     // Catch:{ BadTokenException -> 0x0451 }
            int r8 = -r8
            r6.f62660ah = r8     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.o r8 = new com.google.android.libraries.gsa.d.b.o     // Catch:{ BadTokenException -> 0x0451 }
            r8.<init>(r6)     // Catch:{ BadTokenException -> 0x0451 }
            r6.f62669aq = r8     // Catch:{ BadTokenException -> 0x0451 }
            android.widget.FrameLayout r8 = new android.widget.FrameLayout     // Catch:{ BadTokenException -> 0x0451 }
            r8.<init>(r6)     // Catch:{ BadTokenException -> 0x0451 }
            r6.f62670ar = r8     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.ad r8 = r6.f62669aq     // Catch:{ BadTokenException -> 0x0451 }
            android.widget.FrameLayout r11 = r6.f62670ar     // Catch:{ BadTokenException -> 0x0451 }
            r8.mo27970l(r11)     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.ad r8 = r6.f62669aq     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.ab r11 = r6.f62658af     // Catch:{ BadTokenException -> 0x0451 }
            r8.mo27969k(r11)     // Catch:{ BadTokenException -> 0x0451 }
            r8 = -1
            r12.width = r8     // Catch:{ BadTokenException -> 0x0451 }
            r12.height = r8     // Catch:{ BadTokenException -> 0x0451 }
            int r8 = r12.flags     // Catch:{ BadTokenException -> 0x0451 }
            r11 = 8650752(0x840000, float:1.2122285E-38)
            r8 = r8 | r11
            r12.flags = r8     // Catch:{ BadTokenException -> 0x0451 }
            r8 = 0
            r12.dimAmount = r8     // Catch:{ BadTokenException -> 0x0451 }
            r8 = 3
            r12.gravity = r8     // Catch:{ BadTokenException -> 0x0451 }
            r8 = 4
            r12.type = r8     // Catch:{ BadTokenException -> 0x0451 }
            r8 = 16
            r12.softInputMode = r8     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Window r8 = r6.f62639aa     // Catch:{ BadTokenException -> 0x0451 }
            r8.setAttributes(r12)     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Window r8 = r6.f62639aa     // Catch:{ BadTokenException -> 0x0451 }
            r11 = 1048576(0x100000, float:1.469368E-39)
            r8.clearFlags(r11)     // Catch:{ BadTokenException -> 0x0451 }
            if (r3 == 0) goto L_0x0392
            java.lang.String r8 = "OPTIONS"
            android.os.Bundle r8 = r3.getBundle(r8)     // Catch:{ BadTokenException -> 0x0451 }
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch:{ BadTokenException -> 0x0451 }
            r11[r9] = r4     // Catch:{ BadTokenException -> 0x0451 }
            r11[r10] = r2     // Catch:{ BadTokenException -> 0x0451 }
            boolean r2 = com.google.android.libraries.gsa.p1859d.p1861b.C22759e.m42470a(r13, r8, r11)     // Catch:{ BadTokenException -> 0x0451 }
            if (r2 == 0) goto L_0x0392
            java.lang.String r2 = "KEY_SAVED_STATE"
            android.os.Bundle r8 = r3.getBundle(r2)     // Catch:{ BadTokenException -> 0x0451 }
            goto L_0x0393
        L_0x0392:
            r8 = r15
        L_0x0393:
            r6.mo28053n(r13, r8)     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Window r2 = r6.f62639aa     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.ad r4 = r6.f62669aq     // Catch:{ BadTokenException -> 0x0451 }
            r2.setContentView(r4)     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Window r2 = r6.f62639aa     // Catch:{ BadTokenException -> 0x0451 }
            android.view.View r2 = r2.getDecorView()     // Catch:{ BadTokenException -> 0x0451 }
            r6.f62640ab = r2     // Catch:{ BadTokenException -> 0x0451 }
            android.view.WindowManager r2 = r6.f62641ac     // Catch:{ BadTokenException -> 0x0451 }
            android.view.View r4 = r6.f62640ab     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Window r8 = r6.f62639aa     // Catch:{ BadTokenException -> 0x0451 }
            android.view.WindowManager$LayoutParams r8 = r8.getAttributes()     // Catch:{ BadTokenException -> 0x0451 }
            r2.addView(r4, r8)     // Catch:{ BadTokenException -> 0x0451 }
            r6.mo28054o()     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.ad r2 = r6.f62669aq     // Catch:{ BadTokenException -> 0x0451 }
            r4 = 1792(0x700, float:2.511E-42)
            r2.setSystemUiVisibility(r4)     // Catch:{ BadTokenException -> 0x0451 }
            r6.mo28042ab(r9)     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.ad r2 = r6.f62669aq     // Catch:{ BadTokenException -> 0x0451 }
            boolean r4 = r6.mo28029N()     // Catch:{ BadTokenException -> 0x0451 }
            boolean r8 = r6.mo28028M()     // Catch:{ BadTokenException -> 0x0451 }
            r2.f62631v = r4     // Catch:{ BadTokenException -> 0x0451 }
            r2.f62632w = r8     // Catch:{ BadTokenException -> 0x0451 }
            android.view.Window r2 = r6.f62639aa     // Catch:{ BadTokenException -> 0x0451 }
            android.view.View r2 = r2.getDecorView()     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.j r4 = new com.google.android.libraries.gsa.d.b.j     // Catch:{ BadTokenException -> 0x0451 }
            r4.<init>(r6)     // Catch:{ BadTokenException -> 0x0451 }
            r2.addOnLayoutChangeListener(r4)     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.v r2 = r1.f62693e     // Catch:{ BadTokenException -> 0x0451 }
            com.google.android.libraries.gsa.d.b.a.a r2 = r2.f62708c     // Catch:{ BadTokenException -> 0x0451 }
            r2.mo27929n(r5)     // Catch:{ BadTokenException -> 0x0451 }
            if (r3 == 0) goto L_0x040c
            com.google.android.libraries.gsa.d.g r2 = r1.f62691c     // Catch:{ Exception -> 0x046c }
            java.lang.String r4 = "MSG_SET_WINDOW_ATTACHED: restore state"
            r2.mo28121a(r4)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            android.view.Window r4 = r2.f62639aa     // Catch:{ Exception -> 0x046c }
            java.lang.String r6 = "android:viewHierarchyState"
            android.os.Bundle r6 = r3.getBundle(r6)     // Catch:{ Exception -> 0x046c }
            r4.restoreHierarchyState(r6)     // Catch:{ Exception -> 0x046c }
            java.lang.String r4 = "open"
            boolean r3 = r3.getBoolean(r4)     // Catch:{ Exception -> 0x046c }
            if (r3 == 0) goto L_0x0405
            com.google.android.libraries.gsa.d.b.ad r2 = r2.f62669aq     // Catch:{ Exception -> 0x046c }
            r2.mo27966h()     // Catch:{ Exception -> 0x046c }
        L_0x0405:
            com.google.android.libraries.gsa.d.b.v r2 = r1.f62693e     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.a.a r2 = r2.f62708c     // Catch:{ Exception -> 0x046c }
            r2.mo27926k(r5)     // Catch:{ Exception -> 0x046c }
        L_0x040c:
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            java.lang.Object r3 = r0.second     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.ab.f r3 = (com.google.android.libraries.p10922ab.C146710f) r3     // Catch:{ Exception -> 0x046c }
            r2.mo28041aa(r3)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.t r2 = r1.f62690b     // Catch:{ Exception -> 0x046c }
            int r2 = r2.f62696b     // Catch:{ Exception -> 0x046c }
            r3 = 10
            if (r2 < r3) goto L_0x0422
            com.google.android.libraries.gsa.d.b.n r2 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            r2.mo28052k()     // Catch:{ Exception -> 0x046c }
        L_0x0422:
            com.google.android.libraries.gsa.d.b.t r2 = r1.f62690b     // Catch:{ Exception -> 0x046c }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.ab.f r0 = (com.google.android.libraries.p10922ab.C146710f) r0     // Catch:{ Exception -> 0x046c }
            int r3 = r1.f62689a     // Catch:{ Exception -> 0x046c }
            r2.mo28080b(r0, r3)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.n r0 = r1.f62692d     // Catch:{ Exception -> 0x046c }
            r0.mo28038X()     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c     // Catch:{ Exception -> 0x046c }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x046c }
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x046c }
            int r4 = r1.f62689a     // Catch:{ Exception -> 0x046c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x046c }
            r3[r9] = r4     // Catch:{ Exception -> 0x046c }
            java.lang.String r4 = "MSG_SET_WINDOW_ATTACHED: activeStatus=%d"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)     // Catch:{ Exception -> 0x046c }
            r0.mo28121a(r2)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.v r0 = r1.f62693e     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.a.a r0 = r0.f62708c     // Catch:{ Exception -> 0x046c }
            r0.mo27922g(r5)     // Catch:{ Exception -> 0x046c }
            return r10
        L_0x0451:
            com.google.android.libraries.gsa.d.g r0 = r1.f62691c     // Catch:{ Exception -> 0x046c }
            java.lang.String r2 = "MSG_SET_WINDOW_ATTACHED: error"
            r0.mo28121a(r2)     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.v r0 = r1.f62693e     // Catch:{ Exception -> 0x046c }
            com.google.android.libraries.gsa.d.b.a.a r0 = r0.f62708c     // Catch:{ Exception -> 0x046c }
            r0.mo27923h(r5)     // Catch:{ Exception -> 0x046c }
            android.os.Message r0 = android.os.Message.obtain()     // Catch:{ Exception -> 0x046c }
            r0.what = r7     // Catch:{ Exception -> 0x046c }
            r1.handleMessage(r0)     // Catch:{ Exception -> 0x046c }
            r0.recycle()     // Catch:{ Exception -> 0x046c }
            return r10
        L_0x046c:
            r0 = move-exception
            com.google.android.libraries.gsa.d.b.v r2 = r1.f62693e
            com.google.android.libraries.gsa.d.b.a.a r2 = r2.f62708c
            r2.mo27924i(r5)
            goto L_0x0476
        L_0x0475:
            throw r0
        L_0x0476:
            goto L_0x0475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1859d.p1861b.C22772r.handleMessage(android.os.Message):boolean");
    }
}
