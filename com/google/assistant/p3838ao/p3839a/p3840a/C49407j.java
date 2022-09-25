package com.google.assistant.p3838ao.p3839a.p3840a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49543b;
import com.google.assistant.p3838ao.p3839a.p3845e.C49547bd;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.a.j */
/* compiled from: PG */
final class C49407j implements C49382a {
    /* renamed from: a */
    public final /* synthetic */ boolean mo53258a(C49692r rVar, Object obj) {
        C49547bd bdVar = (C49547bd) obj;
        Optional p = rVar.mo53266p();
        ApplicationInfo applicationInfo = null;
        if (!p.isEmpty()) {
            try {
                applicationInfo = ((C49381a) rVar).f127635a.getPackageManager().getApplicationInfo((String) p.get(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        C49543b a = C49406i.m85461a(applicationInfo);
        C49543b a2 = C49543b.m85578a(bdVar.f127851a);
        if (a2 == null) {
            a2 = C49543b.APP_CATEGORY_UNKNOWN;
        }
        return a.equals(a2);
    }
}
