package com.google.android.apps.search.p10088c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import java.util.List;

/* renamed from: com.google.android.apps.search.c.b */
/* compiled from: PG */
public final class C132670b implements GatewayHandler {

    /* renamed from: a */
    private final Context f362034a;

    /* renamed from: b */
    private final boolean f362035b;

    /* renamed from: c */
    private final boolean f362036c;

    /* renamed from: d */
    private final boolean f362037d;

    /* renamed from: e */
    private final boolean f362038e;

    /* renamed from: f */
    private final String f362039f;

    /* renamed from: g */
    private final String f362040g;

    /* renamed from: h */
    private final int f362041h;

    public C132670b(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, long j) {
        this.f362034a = context;
        this.f362035b = z;
        this.f362036c = z2;
        this.f362037d = z3;
        this.f362038e = z4;
        this.f362039f = str;
        this.f362040g = str2;
        this.f362041h = (int) j;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        String str;
        List<String> pathSegments;
        Uri data = mVar.f123337a.getData();
        if (data != null && "https".equals(data.getScheme())) {
            if (this.f362038e) {
                String str2 = this.f362039f;
                String str3 = this.f362040g;
                if (str2.equals(data.getHost()) && (pathSegments = data.getPathSegments()) != null && !pathSegments.isEmpty() && pathSegments.get(0).equals(str3)) {
                    if (Build.VERSION.SDK_INT < this.f362041h) {
                        Toast.makeText(this.f362034a, R.string.smartsetup_deeplink_version_too_old, 1).show();
                        return null;
                    }
                    str = "com.google.android.gms.smartdevice.quickstart.SOURCE_DEVICE_SETUP";
                    Intent intent = new Intent(str);
                    intent.setPackage("com.google.android.gms");
                    intent.setFlags(268468224);
                    intent.putExtra("deeplink", data);
                    intent.putExtra("android.intent.extra.REFERRER_NAME", "agsa:tng");
                    return new C132669a(intent);
                }
            }
            if (this.f362035b && "pairdevice.gle".equals(data.getHost())) {
                str = "com.google.android.gms.settings.SMART_DEVICE_DISCOVERY";
                Intent intent2 = new Intent(str);
                intent2.setPackage("com.google.android.gms");
                intent2.setFlags(268468224);
                intent2.putExtra("deeplink", data);
                intent2.putExtra("android.intent.extra.REFERRER_NAME", "agsa:tng");
                return new C132669a(intent2);
            } else if ((this.f362036c && "signin.google".equals(data.getHost())) || (this.f362037d && "smartlocktvsignin.google".equals(data.getHost()))) {
                str = "com.google.android.gms.smartdevice.ATV_DEVICE_SETUP";
                Intent intent22 = new Intent(str);
                intent22.setPackage("com.google.android.gms");
                intent22.setFlags(268468224);
                intent22.putExtra("deeplink", data);
                intent22.putExtra("android.intent.extra.REFERRER_NAME", "agsa:tng");
                return new C132669a(intent22);
            }
        }
        return null;
    }
}
