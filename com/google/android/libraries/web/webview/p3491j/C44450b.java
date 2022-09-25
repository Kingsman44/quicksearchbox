package com.google.android.libraries.web.webview.p3491j;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.google.android.libraries.web.webview.j.b */
/* compiled from: PG */
final class C44450b extends ContextWrapper {

    /* renamed from: a */
    public Context f115544a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C44450b(android.support.p031v4.app.Fragment r5) {
        /*
            r4 = this;
            java.lang.String r0 = "fragment"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            android.support.v4.app.am r0 = r5.getActivity()
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r5.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "requireContext().applicationContext"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            goto L_0x003e
        L_0x0019:
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ Exception -> 0x0035 }
            android.content.ComponentName r2 = r0.getComponentName()     // Catch:{ Exception -> 0x0035 }
            r3 = 0
            android.content.pm.ActivityInfo r1 = r1.getActivityInfo(r2, r3)     // Catch:{ Exception -> 0x0035 }
            int r1 = r1.getThemeResource()     // Catch:{ Exception -> 0x0035 }
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper     // Catch:{ Exception -> 0x0035 }
            android.content.Context r3 = r0.getApplicationContext()     // Catch:{ Exception -> 0x0035 }
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x0035 }
            r0 = r2
            goto L_0x003e
        L_0x0035:
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "activity.applicationContext"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
        L_0x003e:
            r4.<init>(r0)
            android.content.Context r5 = r5.getContext()
            r4.f115544a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3491j.C44450b.<init>(android.support.v4.app.Fragment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        r0 = r0.getSystemService(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getSystemService(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            java.lang.String r0 = "window"
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r0)
            if (r0 == 0) goto L_0x000e
            goto L_0x001b
        L_0x000e:
            java.lang.String r0 = "layout_inflater"
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r0)
            if (r0 != 0) goto L_0x001b
            java.lang.Object r2 = super.getSystemService(r2)
            goto L_0x0026
        L_0x001b:
            android.content.Context r0 = r1.f115544a
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r0.getSystemService(r2)
            if (r0 == 0) goto L_0x0027
            r2 = r0
        L_0x0026:
            return r2
        L_0x0027:
            java.lang.Object r2 = super.getSystemService(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3491j.C44450b.getSystemService(java.lang.String):java.lang.Object");
    }
}
