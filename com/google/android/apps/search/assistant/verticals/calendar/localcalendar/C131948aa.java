package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131946a;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import com.google.common.base.C58890d;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.aa */
/* compiled from: PG */
final class C131948aa {

    /* renamed from: a */
    private static final Pattern f360271a = Pattern.compile("\\.");

    /* renamed from: a */
    public static C131947b m214403a(C131947b bVar, String str) {
        String str2;
        C131946a aVar = (C131946a) bVar.toBuilder();
        if (!bVar.f360264c.isEmpty()) {
            str = bVar.f360264c;
        }
        String b = m214404b(str);
        aVar.copyOnWrite();
        C131947b bVar2 = (C131947b) aVar.instance;
        b.getClass();
        int i = bVar2.f360262a | 2;
        bVar2.f360262a = i;
        bVar2.f360264c = b;
        if ((i & 1) != 0) {
            String lowerCase = bVar2.f360263b.toLowerCase(Locale.getDefault());
            aVar.copyOnWrite();
            C131947b bVar3 = (C131947b) aVar.instance;
            lowerCase.getClass();
            bVar3.f360262a |= 1;
            bVar3.f360263b = lowerCase;
        }
        if (((C131947b) aVar.instance).f360265d.isEmpty()) {
            str2 = "com.google";
        } else {
            str2 = ((C131947b) aVar.instance).f360265d.toLowerCase(Locale.getDefault());
        }
        aVar.copyOnWrite();
        C131947b bVar4 = (C131947b) aVar.instance;
        str2.getClass();
        bVar4.f360262a |= 4;
        bVar4.f360265d = str2;
        boolean z = bVar4.f360266e;
        aVar.copyOnWrite();
        C131947b bVar5 = (C131947b) aVar.instance;
        bVar5.f360262a |= 8;
        bVar5.f360266e = z;
        return (C131947b) aVar.build();
    }

    /* renamed from: b */
    public static String m214404b(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.getDefault());
        String[] split = lowerCase.split("@", 2);
        if (split.length != 2) {
            return lowerCase;
        }
        if (!"gmail.com".equals(split[1]) && !"googlemail.com".equals(split[1])) {
            return lowerCase;
        }
        return String.format("%s@%s", new Object[]{f360271a.matcher(split[0]).replaceAll(BuildConfig.FLAVOR), "gmail.com"});
    }

    /* renamed from: c */
    public static boolean m214405c(C131947b bVar) {
        return "com.google".equals(C58890d.m90988c(bVar.f360265d));
    }
}
