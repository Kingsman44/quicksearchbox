package com.google.android.libraries.web.contrib.p3390j.p3393c.p3394a;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43664l;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.j.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C43646c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43648e f113894a;

    /* renamed from: b */
    public final /* synthetic */ C43664l f113895b;

    /* renamed from: c */
    public final /* synthetic */ View.OnLongClickListener f113896c;

    /* renamed from: d */
    public final /* synthetic */ FrameLayout f113897d;

    public /* synthetic */ C43646c(C43648e eVar, C43664l lVar, View.OnLongClickListener onLongClickListener, FrameLayout frameLayout) {
        this.f113894a = eVar;
        this.f113895b = lVar;
        this.f113896c = onLongClickListener;
        this.f113897d = frameLayout;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093 A[Catch:{ RemoteException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094 A[Catch:{ RemoteException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.libraries.web.contrib.j.c.a.e r0 = r10.f113894a
            com.google.android.libraries.web.contrib.j.d.l r1 = r10.f113895b
            android.view.View$OnLongClickListener r2 = r10.f113896c
            android.widget.FrameLayout r3 = r10.f113897d
            org.chromium.weblayer.d r11 = (org.chromium.weblayer.C72615d) r11
            org.chromium.weblayer.bo r11 = r11.mo64483b()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "UrlTextSize"
            float r6 = r1.f113939b
            r4.putFloat(r5, r6)
            java.lang.String r5 = "UrlTextColor"
            r6 = 2131104400(0x7f061290, float:1.7821293E38)
            r4.putInt(r5, r6)
            java.lang.String r5 = "UrlIconColor"
            r4.putInt(r5, r6)
            com.google.android.libraries.web.contrib.j.c.a.d r5 = new com.google.android.libraries.web.contrib.j.c.a.d
            r5.<init>(r2, r3)
            r3.setOnLongClickListener(r2)
            com.google.android.libraries.web.contrib.j.d.i r2 = com.google.android.libraries.web.contrib.p3390j.p3396d.C43661i.DEFAULT_CLICK
            int r2 = r1.f113940c
            com.google.android.libraries.web.contrib.j.d.i r2 = com.google.android.libraries.web.contrib.p3390j.p3396d.C43661i.m77039a(r2)
            if (r2 != 0) goto L_0x003b
            com.google.android.libraries.web.contrib.j.d.i r2 = com.google.android.libraries.web.contrib.p3390j.p3396d.C43661i.SHOW_PAGE_INFO
        L_0x003b:
            int r2 = r2.ordinal()
            java.lang.String r6 = "ShowPageInfoWhenUrlTextClicked"
            r7 = 2
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r9) goto L_0x0057
            if (r2 == r7) goto L_0x004b
            goto L_0x005a
        L_0x004b:
            android.view.View$OnClickListener r2 = r0.mo46670a(r3)
            android.view.View$OnClickListener r0 = r0.mo46670a(r3)
            r3.setOnClickListener(r0)
            goto L_0x005b
        L_0x0057:
            r4.putBoolean(r6, r9)
        L_0x005a:
            r2 = r8
        L_0x005b:
            r0 = 0
            boolean r0 = r4.getBoolean(r6, r0)
            if (r2 == 0) goto L_0x006d
            if (r0 != 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            android.util.AndroidRuntimeException r11 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "Text click listener cannot be set when SHOW_PAGE_INFO_WHEN_URL_TEXT_CLICKED is true."
            r11.<init>(r0)
            throw r11
        L_0x006d:
            org.chromium.weblayer.C72604bm.m107399a()
            org.chromium.b.a.az r11 = r11.f193155a     // Catch:{ RemoteException -> 0x00d5 }
            org.chromium.b.a.bj r0 = new org.chromium.b.a.bj     // Catch:{ RemoteException -> 0x00d5 }
            r0.<init>(r2)     // Catch:{ RemoteException -> 0x00d5 }
            org.chromium.b.a.bj r2 = new org.chromium.b.a.bj     // Catch:{ RemoteException -> 0x00d5 }
            r2.<init>(r5)     // Catch:{ RemoteException -> 0x00d5 }
            android.os.Parcel r5 = r11.mo17260gA()     // Catch:{ RemoteException -> 0x00d5 }
            com.google.android.p445a.C8850c.m23497f(r5, r4)     // Catch:{ RemoteException -> 0x00d5 }
            com.google.android.p445a.C8850c.m23499h(r5, r0)     // Catch:{ RemoteException -> 0x00d5 }
            com.google.android.p445a.C8850c.m23499h(r5, r2)     // Catch:{ RemoteException -> 0x00d5 }
            android.os.Parcel r11 = r11.mo17261gT(r7, r5)     // Catch:{ RemoteException -> 0x00d5 }
            android.os.IBinder r0 = r11.readStrongBinder()     // Catch:{ RemoteException -> 0x00d5 }
            if (r0 != 0) goto L_0x0094
            goto L_0x00a7
        L_0x0094:
            java.lang.String r2 = "org.chromium.weblayer_private.interfaces.IObjectWrapper"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x00d5 }
            boolean r4 = r2 instanceof org.chromium.p5643b.p5644a.C72317am     // Catch:{ RemoteException -> 0x00d5 }
            if (r4 == 0) goto L_0x00a2
            r8 = r2
            org.chromium.b.a.am r8 = (org.chromium.p5643b.p5644a.C72317am) r8     // Catch:{ RemoteException -> 0x00d5 }
            goto L_0x00a7
        L_0x00a2:
            org.chromium.b.a.ak r8 = new org.chromium.b.a.ak     // Catch:{ RemoteException -> 0x00d5 }
            r8.<init>(r0)     // Catch:{ RemoteException -> 0x00d5 }
        L_0x00a7:
            r11.recycle()     // Catch:{ RemoteException -> 0x00d5 }
            java.lang.Class<android.view.View> r11 = android.view.View.class
            java.lang.Object r11 = org.chromium.p5643b.p5644a.C72341bj.m106988a(r8, r11)     // Catch:{ RemoteException -> 0x00d5 }
            android.view.View r11 = (android.view.View) r11     // Catch:{ RemoteException -> 0x00d5 }
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r1 = r1.f113942e
            com.google.android.libraries.web.contrib.j.d.g r1 = com.google.android.libraries.web.contrib.p3390j.p3396d.C43659g.m77037a(r1)
            if (r1 != 0) goto L_0x00be
            com.google.android.libraries.web.contrib.j.d.g r1 = com.google.android.libraries.web.contrib.p3390j.p3396d.C43659g.CENTER
        L_0x00be:
            com.google.android.libraries.web.contrib.j.d.g r2 = com.google.android.libraries.web.contrib.p3390j.p3396d.C43659g.START
            boolean r1 = r2.equals(r1)
            if (r9 == r1) goto L_0x00c9
            r1 = 17
            goto L_0x00cc
        L_0x00c9:
            r1 = 8388611(0x800003, float:1.1754948E-38)
        L_0x00cc:
            r2 = -2
            r4 = -1
            r0.<init>(r2, r4, r1)
            r3.addView(r11, r0)
            return
        L_0x00d5:
            r11 = move-exception
            org.chromium.b.a.a r0 = new org.chromium.b.a.a
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.p3390j.p3393c.p3394a.C43646c.accept(java.lang.Object):void");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
