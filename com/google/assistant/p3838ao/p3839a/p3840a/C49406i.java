package com.google.assistant.p3838ao.p3839a.p3840a;

import android.content.pm.ApplicationInfo;
import com.google.assistant.p3838ao.p3839a.p3845e.C49543b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.assistant.ao.a.a.i */
/* compiled from: PG */
final class C49406i {

    /* renamed from: a */
    static final C58495hd f127663a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(-1, C49543b.APP_CATEGORY_UNKNOWN);
        gzVar.mo55429h(1, C49543b.APP_CATEGORY_AUDIO);
        gzVar.mo55429h(0, C49543b.APP_CATEGORY_GAME);
        gzVar.mo55429h(3, C49543b.APP_CATEGORY_IMAGE);
        gzVar.mo55429h(6, C49543b.APP_CATEGORY_MAPS);
        gzVar.mo55429h(5, C49543b.APP_CATEGORY_NEWS);
        gzVar.mo55429h(7, C49543b.APP_CATEGORY_PRODUCTIVITY);
        gzVar.mo55429h(4, C49543b.APP_CATEGORY_SOCIAL);
        gzVar.mo55429h(2, C49543b.APP_CATEGORY_VIDEO);
        f127663a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    static C49543b m85461a(ApplicationInfo applicationInfo) {
        if (applicationInfo == null) {
            return C49543b.APP_CATEGORY_UNKNOWN;
        }
        return (C49543b) f127663a.getOrDefault(Integer.valueOf(applicationInfo.category), C49543b.APP_CATEGORY_UNKNOWN);
    }
}
