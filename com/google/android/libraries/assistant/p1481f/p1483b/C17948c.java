package com.google.android.libraries.assistant.p1481f.p1483b;

import android.content.pm.ShortcutInfo;
import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.assistant.f.b.c */
/* compiled from: PG */
public final /* synthetic */ class C17948c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C17949d f51399a;

    /* renamed from: b */
    public final /* synthetic */ String f51400b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f51401c;

    /* renamed from: d */
    public final /* synthetic */ Locale f51402d;

    public /* synthetic */ C17948c(C17949d dVar, String str, C58485gu guVar, Locale locale) {
        this.f51399a = dVar;
        this.f51400b = str;
        this.f51401c = guVar;
        this.f51402d = locale;
    }

    public final Object call() {
        C17949d dVar = this.f51399a;
        String str = this.f51400b;
        C58485gu guVar = this.f51401c;
        Locale locale = this.f51402d;
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            C58485gu b = dVar.mo23501b((String) guVar.get(i));
            int size2 = b.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size2) {
                ShortcutInfo shortcutInfo = (ShortcutInfo) b.get(i2);
                String c = C17949d.m35136c(shortcutInfo);
                String quote = Pattern.quote(C80884a.m128737b(str, locale));
                if (C80884a.m128737b(c, locale).matches(".*\\b" + quote + "\\b.*")) {
                    arrayList.add(shortcutInfo);
                    i3++;
                    if (i3 >= 3) {
                        break;
                    }
                }
                i2++;
            }
            i++;
        }
        return C58485gu.m89842j(arrayList);
    }
}
