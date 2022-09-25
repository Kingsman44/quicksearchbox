package android.support.p033v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.support.p033v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.p094f.C1897j;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.v */
/* compiled from: PG */
public abstract class C0401v {

    /* renamed from: a */
    static final C0363ax f1355a = new C0363ax(new C0364ay());

    /* renamed from: b */
    public static int f1356b = -100;

    /* renamed from: c */
    public static C1897j f1357c = null;

    /* renamed from: d */
    public static C1897j f1358d = null;

    /* renamed from: e */
    public static boolean f1359e = false;

    /* renamed from: f */
    public static Context f1360f = null;

    /* renamed from: g */
    public static final C0979i f1361g = new C0979i(0);

    /* renamed from: h */
    public static final Object f1362h = new Object();

    /* renamed from: i */
    private static Boolean f1363i = null;

    /* renamed from: j */
    private static Object f1364j = null;

    /* renamed from: k */
    private static final Object f1365k = new Object();

    /* renamed from: C */
    public static void m1321C() {
        if (f1356b != -1) {
            f1356b = -1;
            synchronized (f1362h) {
                C0978h hVar = new C0978h(f1361g);
                while (hVar.hasNext()) {
                    C0401v vVar = (C0401v) ((WeakReference) hVar.next()).get();
                    if (vVar != null) {
                        vVar.mo1195y();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static C0401v m1322b(Activity activity, C0396q qVar) {
        return new C0356aq(activity, (Window) null, qVar, activity);
    }

    /* renamed from: c */
    public static C0401v m1323c(Dialog dialog, C0396q qVar) {
        return new C0356aq(dialog.getContext(), dialog.getWindow(), qVar, dialog);
    }

    /* renamed from: f */
    static Object m1324f() {
        Context a;
        Object obj = f1364j;
        if (obj != null) {
            return obj;
        }
        if (f1360f == null) {
            C0978h hVar = new C0978h(f1361g);
            while (true) {
                if (hVar.hasNext()) {
                    C0401v vVar = (C0401v) ((WeakReference) hVar.next()).get();
                    if (vVar != null && (a = vVar.mo1172a()) != null) {
                        f1360f = a;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Context context = f1360f;
        if (context != null) {
            f1364j = context.getSystemService("locale");
        }
        return f1364j;
    }

    /* renamed from: o */
    public static void m1325o(C0401v vVar) {
        synchronized (f1362h) {
            C0978h hVar = new C0978h(f1361g);
            while (hVar.hasNext()) {
                C0401v vVar2 = (C0401v) ((WeakReference) hVar.next()).get();
                if (vVar2 == vVar || vVar2 == null) {
                    hVar.remove();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:37|(2:43|44)|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        if (r8 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        if (r8 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00cf */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1326v(android.content.Context r8) {
        /*
            java.lang.String r0 = "Storing App Locales : app-locales: "
            java.lang.String r1 = "Storing App Locales : Failed to persist app-locales: "
            boolean r2 = m1327w(r8)
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            boolean r2 = androidx.core.p094f.C1888a.m5150d()
            if (r2 == 0) goto L_0x0020
            boolean r0 = f1359e
            if (r0 != 0) goto L_0x001f
            android.support.v7.app.ax r0 = f1355a
            android.support.v7.app.s r1 = new android.support.v7.app.s
            r1.<init>(r8)
            r0.execute(r1)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r2 = f1365k
            monitor-enter(r2)
            androidx.core.f.j r3 = f1357c     // Catch:{ all -> 0x00e3 }
            if (r3 != 0) goto L_0x0049
            androidx.core.f.j r0 = f1358d     // Catch:{ all -> 0x00e3 }
            if (r0 != 0) goto L_0x0035
            java.lang.String r8 = android.support.p033v7.app.C0365az.m1142a(r8)     // Catch:{ all -> 0x00e3 }
            androidx.core.f.j r8 = androidx.core.p094f.C1897j.m5165b(r8)     // Catch:{ all -> 0x00e3 }
            f1358d = r8     // Catch:{ all -> 0x00e3 }
        L_0x0035:
            androidx.core.f.j r8 = f1358d     // Catch:{ all -> 0x00e3 }
            androidx.core.f.k r8 = r8.f5774b     // Catch:{ all -> 0x00e3 }
            android.os.LocaleList r8 = r8.f5775a     // Catch:{ all -> 0x00e3 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x00e3 }
            if (r8 == 0) goto L_0x0043
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            return
        L_0x0043:
            androidx.core.f.j r8 = f1358d     // Catch:{ all -> 0x00e3 }
            f1357c = r8     // Catch:{ all -> 0x00e3 }
            goto L_0x00e1
        L_0x0049:
            androidx.core.f.j r4 = f1358d     // Catch:{ all -> 0x00e3 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00e3 }
            if (r3 != 0) goto L_0x00e1
            androidx.core.f.j r3 = f1357c     // Catch:{ all -> 0x00e3 }
            f1358d = r3     // Catch:{ all -> 0x00e3 }
            androidx.core.f.k r3 = r3.f5774b     // Catch:{ all -> 0x00e3 }
            android.os.LocaleList r3 = r3.f5775a     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = r3.toLanguageTags()     // Catch:{ all -> 0x00e3 }
            java.lang.String r4 = ""
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00e3 }
            if (r4 == 0) goto L_0x006c
            java.lang.String r0 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r0)     // Catch:{ all -> 0x00e3 }
            goto L_0x00e1
        L_0x006c:
            r4 = 1
            r5 = 0
            java.lang.String r6 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileOutputStream r8 = r8.openFileOutput(r6, r5)     // Catch:{ FileNotFoundException -> 0x00d0 }
            org.xmlpull.v1.XmlSerializer r5 = android.util.Xml.newSerializer()     // Catch:{ all -> 0x00e3 }
            r6 = 0
            r5.setOutput(r8, r6)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x00b5 }
            r5.startDocument(r7, r4)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r4 = "locales"
            r5.startTag(r6, r4)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r4 = "application_locales"
            r5.attribute(r6, r4, r3)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r4 = "locales"
            r5.endTag(r6, r4)     // Catch:{ Exception -> 0x00b5 }
            r5.endDocument()     // Catch:{ Exception -> 0x00b5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b5 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00b5 }
            r4.append(r3)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = " persisted successfully."
            r4.append(r0)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = "AppLocalesStorageHelper"
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00b5 }
            android.util.Log.d(r0, r4)     // Catch:{ Exception -> 0x00b5 }
            if (r8 == 0) goto L_0x00e1
        L_0x00af:
            r8.close()     // Catch:{ IOException -> 0x00e1 }
            goto L_0x00e1
        L_0x00b3:
            r0 = move-exception
            goto L_0x00ca
        L_0x00b5:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r4.<init>(r1)     // Catch:{ all -> 0x00b3 }
            r4.append(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00b3 }
            android.util.Log.w(r1, r3, r0)     // Catch:{ all -> 0x00b3 }
            if (r8 == 0) goto L_0x00e1
            goto L_0x00af
        L_0x00ca:
            if (r8 == 0) goto L_0x00cf
            r8.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00d0:
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            r8[r5] = r0     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "AppLocalesStorageHelper"
            java.lang.String r1 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.String r8 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x00e3 }
            android.util.Log.w(r0, r8)     // Catch:{ all -> 0x00e3 }
        L_0x00e1:
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            return
        L_0x00e3:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            goto L_0x00e7
        L_0x00e6:
            throw r8
        L_0x00e7:
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0401v.m1326v(android.content.Context):void");
    }

    /* renamed from: w */
    static boolean m1327w(Context context) {
        if (f1363i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, C0361av.class), 640);
                if (serviceInfo.metaData != null) {
                    f1363i = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1363i = false;
            }
        }
        return f1363i.booleanValue();
    }

    /* renamed from: z */
    public static C0401v m1328z(Context context, Window window) {
        return new C0356aq(context, window, (C0396q) null, context);
    }

    /* renamed from: A */
    public abstract void mo1149A();

    /* renamed from: B */
    public abstract void mo1150B(int i);

    /* renamed from: a */
    public Context mo1172a() {
        throw null;
    }

    /* renamed from: d */
    public abstract MenuInflater mo1176d();

    /* renamed from: e */
    public abstract View mo1177e(int i);

    /* renamed from: g */
    public abstract void mo1178g(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: h */
    public abstract void mo1179h();

    /* renamed from: i */
    public abstract void mo1180i();

    /* renamed from: j */
    public abstract void mo1181j(Configuration configuration);

    /* renamed from: k */
    public abstract void mo1182k();

    /* renamed from: l */
    public abstract void mo1183l();

    /* renamed from: m */
    public abstract void mo1184m();

    /* renamed from: n */
    public abstract void mo1185n();

    /* renamed from: p */
    public abstract void mo1188p(int i);

    /* renamed from: q */
    public abstract void mo1189q(View view);

    /* renamed from: r */
    public abstract void mo1190r(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: s */
    public abstract void mo1191s(int i);

    /* renamed from: t */
    public abstract void mo1192t(Toolbar toolbar);

    /* renamed from: u */
    public abstract void mo1193u(CharSequence charSequence);

    /* renamed from: x */
    public void mo1194x() {
        throw null;
    }

    /* renamed from: y */
    public abstract void mo1195y();
}
