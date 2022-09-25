package com.google.android.libraries.search.assistant.p2828y.p2853n;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36962j;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.search.assistant.y.n.r */
/* compiled from: PG */
public final class C37021r {

    /* renamed from: f */
    private static final C59071e f96421f = C59071e.m91331h();

    /* renamed from: a */
    public final C69464a f96422a;

    /* renamed from: b */
    public final C46175b f96423b;

    /* renamed from: c */
    public final C71422aw f96424c;

    /* renamed from: d */
    public final C69585o f96425d;

    /* renamed from: e */
    public final C36962j f96426e;

    /* renamed from: g */
    private final PackageManager f96427g;

    public C37021r(C36962j jVar, C69464a aVar, C46175b bVar, PackageManager packageManager, C71422aw awVar, C69585o oVar) {
        this.f96426e = jVar;
        this.f96422a = aVar;
        this.f96423b = bVar;
        this.f96427g = packageManager;
        this.f96424c = awVar;
        this.f96425d = oVar;
    }

    /* renamed from: a */
    public final boolean mo40537a(String str, List list) {
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("android.media.action.MEDIA_PLAY_FROM_SEARCH");
        if (this.f96427g.resolveActivity(intent, 65536) == null) {
            return false;
        }
        if (!list.contains(str)) {
            if (str != null && !C69764m.m101229h(str)) {
                try {
                    ApplicationInfo applicationInfo = this.f96427g.getApplicationInfo(str, 0);
                    C69664n.m101060f(applicationInfo, "packageManager.getApplic…o(providerPackageName, 0)");
                    if (applicationInfo.category == 1) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    C59052c cVar = (C59052c) ((C59052c) f96421f.mo56226d()).mo56382g(e);
                    cVar.mo56379ah(new C59094n(52489));
                    cVar.mo56389s("Failed to retrieve application info for package %s", str);
                }
            }
            return false;
        }
        return true;
    }
}
