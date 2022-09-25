package com.google.android.apps.search.soundsearch.p10656e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.audio.p4107b.p4108a.C54586i;
import com.google.audio.p4107b.p4108a.C54597t;
import com.google.audio.p4107b.p4108a.C54599v;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.apps.search.soundsearch.e.a */
/* compiled from: PG */
public final class C141661a {
    /* renamed from: a */
    public static Intent m229884a(C54586i iVar) {
        String d = m229887d(iVar);
        C54599v vVar = iVar.f143319d;
        if (vVar == null) {
            vVar = C54599v.f143344c;
        }
        String str = vVar.f143347b;
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        intent.putExtra("query", d);
        if (!str.isEmpty()) {
            intent.putExtra("search-stick", str);
        }
        return intent;
    }

    /* renamed from: b */
    public static Intent m229885b(C54586i iVar) {
        String d = m229887d(iVar);
        C54599v vVar = iVar.f143319d;
        if (vVar == null) {
            vVar = C54599v.f143344c;
        }
        String str = vVar.f143347b;
        try {
            String concat = "https://www.google.com/search?q=".concat(String.valueOf(URLEncoder.encode(d, "UTF-8")));
            if (!str.isEmpty()) {
                concat = concat + "&stick=" + str;
            }
            return new Intent("android.intent.action.VIEW", Uri.parse(concat));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m229886c(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    /* renamed from: d */
    private static String m229887d(C54586i iVar) {
        C54599v vVar = iVar.f143319d;
        if (vVar == null) {
            vVar = C54599v.f143344c;
        }
        if (!vVar.f143346a.isEmpty()) {
            C54599v vVar2 = iVar.f143319d;
            if (vVar2 == null) {
                vVar2 = C54599v.f143344c;
            }
            return vVar2.f143346a;
        }
        C54597t tVar = iVar.f143318c;
        if (tVar == null) {
            tVar = C54597t.f143337f;
        }
        String str = tVar.f143340b;
        C54597t tVar2 = iVar.f143318c;
        if (tVar2 == null) {
            tVar2 = C54597t.f143337f;
        }
        String str2 = tVar2.f143341c;
        return str + " " + str2;
    }
}
