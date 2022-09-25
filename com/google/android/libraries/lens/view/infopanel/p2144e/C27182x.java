package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.x */
/* compiled from: PG */
public final class C27182x {

    /* renamed from: a */
    public static final C58495hd f74302a;

    /* renamed from: b */
    public final Context f74303b;

    /* renamed from: c */
    public final C47449e f74304c;

    /* renamed from: d */
    public final C25225bd f74305d;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("com.whatsapp", "https://www.gstatic.com/lens/share/whatsapp.png");
        gzVar.mo55429h("com.instagram.android", "https://www.gstatic.com/lens/share/instagram.png");
        gzVar.mo55429h("com.twitter.android", "https://www.gstatic.com/lens/share/twitter.png");
        gzVar.mo55429h("com.facebook.katana", "https://www.gstatic.com/lens/share/facebook.png");
        gzVar.mo55429h("com.facebook.orca", "https://www.gstatic.com/lens/share/facebookmessenger.png");
        gzVar.mo55429h("com.tencent.mm", "https://www.gstatic.com/lens/share/wechat.png");
        gzVar.mo55429h("jp.naver.line.android", "https://www.gstatic.com/lens/share/line.png");
        gzVar.mo55429h("com.snapchat.android", "https://www.gstatic.com/lens/share/snapchat.png");
        gzVar.mo55429h("com.pinterest", "https://www.gstatic.com/lens/share/pinterest.png");
        f74302a = gzVar.mo55427f(false);
    }

    public C27182x(Context context, C47449e eVar, C25225bd bdVar) {
        this.f74303b = context;
        this.f74304c = eVar;
        this.f74305d = bdVar;
    }

    /* renamed from: a */
    public final boolean mo32614a(String str) {
        try {
            return this.f74303b.getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32615b(com.google.p4017at.p4056g.p4057a.p4058a.C53992b r5) {
        /*
            r4 = this;
            int r0 = r5.f141655a
            java.lang.String r1 = ""
            r2 = 3
            if (r0 != r2) goto L_0x000c
            java.lang.Object r0 = r5.f141656b
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x0015
            goto L_0x0041
        L_0x0015:
            int r0 = r5.f141655a
            if (r0 != r2) goto L_0x001e
            java.lang.Object r0 = r5.f141656b
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L_0x001e:
            android.content.Intent r0 = com.google.android.libraries.lens.view.utils.C28133v.m52416b(r1)
            android.net.Uri r1 = r0.getData()
            if (r1 == 0) goto L_0x0035
            java.lang.String r2 = "ae-action"
            java.lang.String r1 = r1.getScheme()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0035
            goto L_0x0042
        L_0x0035:
            android.content.Context r1 = r4.f74303b
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r0, r3)
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            return r3
        L_0x0042:
            java.lang.String r0 = r5.f141658d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0053
            java.lang.String r5 = r5.f141658d
            boolean r5 = r4.mo32614a(r5)
            if (r5 != 0) goto L_0x0053
            return r3
        L_0x0053:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.infopanel.p2144e.C27182x.mo32615b(com.google.at.g.a.a.b):boolean");
    }
}
