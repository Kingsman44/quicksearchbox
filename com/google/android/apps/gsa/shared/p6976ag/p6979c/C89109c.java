package com.google.android.apps.gsa.shared.p6976ag.p6979c;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.TelephonyManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.assistant.p3897e.p3921j.C52110fp;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.ag.c.c */
/* compiled from: PG */
public final class C89109c {

    /* renamed from: a */
    public static final C59071e f241552a = C59071e.m91332i("com.google.android.apps.gsa.shared.ag.c.c");

    /* renamed from: g */
    private static final Set f241553g = new HashSet(Arrays.asList(new String[]{"switch_access", "assist_sensitivity", "font_size", "screen_zoom", "enable_wifi_ap", "zen_mode", "toggle_lock_screen_rotation_preference"}));

    /* renamed from: b */
    public final C90021c f241554b;

    /* renamed from: c */
    public final C89113g f241555c;

    /* renamed from: d */
    public final String f241556d;

    /* renamed from: e */
    public final String f241557e;

    /* renamed from: f */
    public boolean f241558f;

    /* renamed from: h */
    private final ContentResolver f241559h;

    /* renamed from: i */
    private final Context f241560i;

    public C89109c(String str, String str2, Context context, C89113g gVar, C90021c cVar) {
        this.f241556d = str;
        this.f241557e = str2;
        this.f241560i = context;
        this.f241559h = context.getContentResolver();
        this.f241555c = gVar;
        this.f241554b = cVar;
    }

    /* renamed from: a */
    public final int mo83080a() {
        Cursor d;
        Uri c = C89111e.m144952c(this.f241556d);
        if (c == null || (d = mo83083d(c)) == null) {
            return -1;
        }
        try {
            d.moveToPosition(0);
            boolean equals = "0".equals(d.getString(1));
            this.f241558f = equals;
            if (!equals) {
                return -1;
            }
            int parseInt = Integer.parseInt(d.getString(0));
            d.close();
            return parseInt;
        } finally {
            d.close();
        }
    }

    /* renamed from: b */
    public final int mo83081b() {
        Cursor d;
        Uri c = C89111e.m144952c(this.f241556d);
        if (c == null || (d = mo83083d(c)) == null) {
            return -1;
        }
        try {
            d.moveToPosition(0);
            boolean equals = "0".equals(d.getString(1));
            this.f241558f = equals;
            if (!equals) {
                return -1;
            }
            int parseInt = Integer.parseInt(d.getString(4));
            d.close();
            return parseInt;
        } finally {
            d.close();
        }
    }

    /* renamed from: c */
    public final int mo83082c() {
        Cursor d;
        Uri c = C89111e.m144952c(this.f241556d);
        if (c == null || (d = mo83083d(c)) == null) {
            return -1;
        }
        try {
            d.moveToPosition(0);
            boolean equals = "0".equals(d.getString(1));
            this.f241558f = equals;
            if (!equals) {
                return -1;
            }
            int parseInt = Integer.parseInt(d.getString(3));
            d.close();
            return parseInt;
        } finally {
            d.close();
        }
    }

    /* renamed from: d */
    public final Cursor mo83083d(Uri uri) {
        try {
            return this.f241559h.query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        } catch (Exception e) {
            ((C59052c) ((C59052c) f241552a.mo56226d()).mo56372aa(10950)).mo56389s("While getting cursor querying from content resolver: %s", e.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.apps.gsa.shared.p6976ag.p6979c.C89111e.f241564a.mo56226d()).mo56372aa(10979)).mo56389s("While getting drawable from android settings: %s", r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r0 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x001e, B:18:0x0058] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo83084e() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f241556d
            android.net.Uri r0 = com.google.android.apps.gsa.shared.p6976ag.p6979c.C89111e.m144952c(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0017
            com.google.common.f.e r0 = f241552a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Null uri when query setting icon drawable."
            r3 = 10954(0x2aca, float:1.535E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return r1
        L_0x0017:
            android.database.Cursor r0 = r6.mo83083d(r0)     // Catch:{ IllegalArgumentException -> 0x0093 }
            r2 = 0
            if (r0 != 0) goto L_0x0036
            com.google.common.f.e r3 = f241552a     // Catch:{ all -> 0x008c }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x008c }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x008c }
            r4 = 10953(0x2ac9, float:1.5348E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x008c }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x008c }
            java.lang.String r4 = "Null cursor when query setting icon drawable."
            r3.mo56386p(r4)     // Catch:{ all -> 0x008c }
            r6.f241558f = r2     // Catch:{ all -> 0x008c }
            return r1
        L_0x0036:
            r0.moveToPosition(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "0"
            r3 = 1
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x008c }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x008c }
            r6.f241558f = r2     // Catch:{ all -> 0x008c }
            if (r2 != 0) goto L_0x004c
            r0.close()     // Catch:{ IllegalArgumentException -> 0x0093 }
            return r1
        L_0x004c:
            android.content.Context r2 = r6.f241560i     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "icon"
            int r3 = r0.getColumnIndex(r3)     // Catch:{ all -> 0x008c }
            int r3 = r0.getInt(r3)     // Catch:{ all -> 0x008c }
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r5 = "com.android.settings"
            android.content.res.Resources r4 = r4.getResourcesForApplication(r5)     // Catch:{ Exception -> 0x0075 }
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r3)     // Catch:{ Exception -> 0x0075 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x0075 }
            r4 = 2131100435(0x7f060313, float:1.7813251E38)
            int r2 = r2.getColor(r4)     // Catch:{ Exception -> 0x0075 }
            r3.setTint(r2)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0088
        L_0x0075:
            r2 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.shared.p6976ag.p6979c.C89111e.f241564a     // Catch:{ all -> 0x008c }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x008c }
            java.lang.String r4 = "While getting drawable from android settings: %s"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x008c }
            r5 = 10979(0x2ae3, float:1.5385E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56389s(r4, r2)     // Catch:{ all -> 0x008c }
            r3 = r1
        L_0x0088:
            r0.close()     // Catch:{ IllegalArgumentException -> 0x0093 }
            return r3
        L_0x008c:
            r2 = move-exception
            if (r0 == 0) goto L_0x0092
            r0.close()     // Catch:{ IllegalArgumentException -> 0x0093 }
        L_0x0092:
            throw r2     // Catch:{ IllegalArgumentException -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            com.google.common.f.e r2 = f241552a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r0 = r0.getMessage()
            r3 = 10952(0x2ac8, float:1.5347E-41)
            java.lang.String r4 = "While querying setting icon: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r3)).mo56389s(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p6976ag.p6979c.C89109c.mo83084e():android.graphics.drawable.Drawable");
    }

    /* renamed from: f */
    public final String mo83085f(boolean z) {
        Cursor d;
        Uri c = C89111e.m144952c(this.f241556d);
        if (!(c == null || (d = mo83083d(c)) == null)) {
            try {
                d.moveToPosition(0);
                boolean equals = "0".equals(d.getString(1));
                this.f241558f = equals;
                if (z) {
                    return d.getString(d.getColumnIndex("dependent_setting"));
                }
                if (equals) {
                    String string = d.getString(0);
                    d.close();
                    return string;
                }
                d.close();
            } finally {
                d.close();
            }
        }
        this.f241558f = false;
        if (z) {
            return null;
        }
        if (this.f241554b.mo79746e(C90014bt.f247185cQ) && !C58837ba.m90859h(this.f241557e)) {
            Integer a = this.f241555c.mo83091a(4).mo83089a(this.f241557e);
            if (a != null) {
                this.f241558f = true;
                return a.toString();
            }
            Integer a2 = this.f241555c.mo83091a(7).mo83089a(this.f241557e);
            if (a2 != null) {
                this.f241558f = true;
                return a2.toString();
            }
        }
        return Boolean.toString(false);
    }

    /* renamed from: g */
    public final String mo83086g() {
        Cursor d;
        Uri c = C89111e.m144952c(this.f241556d);
        if (c == null) {
            return BuildConfig.FLAVOR;
        }
        try {
            d = mo83083d(c);
            boolean z = false;
            if (d == null) {
                this.f241558f = false;
                return BuildConfig.FLAVOR;
            }
            d.moveToPosition(0);
            if (f241553g.contains(this.f241556d)) {
                this.f241558f = "0".equals(d.getString(1));
            } else {
                this.f241558f = "5".equals(d.getString(1));
            }
            if ("button_roaming_key".equals(this.f241556d)) {
                TelephonyManager telephonyManager = (TelephonyManager) this.f241560i.getSystemService("phone");
                if (this.f241558f && telephonyManager != null && telephonyManager.getSimState() == 5) {
                    z = true;
                }
                this.f241558f = z;
            }
            if (!this.f241558f) {
                d.close();
                return BuildConfig.FLAVOR;
            }
            String string = d.getString(2);
            d.close();
            return string;
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) f241552a.mo56226d()).mo56372aa(10959)).mo56389s("While querying setting intent: %s", e.getMessage());
            return BuildConfig.FLAVOR;
        } catch (Throwable th) {
            if (d != null) {
                d.close();
            }
            throw th;
        }
    }

    /* renamed from: h */
    public final boolean mo83087h(String str) {
        Uri uri;
        Cursor d;
        String str2 = this.f241556d;
        if (C58837ba.m90859h(str2)) {
            uri = null;
        } else {
            uri = new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(str2).appendQueryParameter("new_setting_value", str).build();
        }
        int i = 2;
        if (!(uri == null || (d = mo83083d(uri)) == null)) {
            try {
                d.moveToPosition(0);
                boolean equals = "0".equals(d.getString(2));
                this.f241558f = equals;
                if (equals) {
                    return str.equals(d.getString(0));
                }
                d.close();
            } finally {
                d.close();
            }
        }
        this.f241558f = false;
        if (this.f241554b.mo79746e(C90014bt.f247185cQ) && !C58837ba.m90859h(this.f241557e)) {
            C52110fp fpVar = (C52110fp) C52115fu.f136753n.createBuilder();
            String str3 = this.f241557e;
            fpVar.copyOnWrite();
            C52115fu fuVar = (C52115fu) fpVar.instance;
            str3.getClass();
            fuVar.f136755a |= 16;
            fuVar.f136760f = str3;
            C52115fu fuVar2 = (C52115fu) fpVar.build();
            C89113g gVar = this.f241555c;
            if (true == "0".equals(str)) {
                i = 3;
            }
            this.f241558f = gVar.mo83091a(i).mo83090b(fuVar2);
        }
        return this.f241558f;
    }
}
