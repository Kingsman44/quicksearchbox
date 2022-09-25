package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import android.database.Cursor;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.l */
/* compiled from: PG */
public final /* synthetic */ class C15549l implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ String f46535a;

    /* renamed from: b */
    public final /* synthetic */ Locale f46536b;

    public /* synthetic */ C15549l(String str, Locale locale) {
        this.f46535a = str;
        this.f46536b = locale;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        String str = this.f46535a;
        Locale locale = this.f46536b;
        Cursor cursor = (Cursor) obj;
        C59071e eVar = C15553p.f46541a;
        C58480gp e = C58485gu.m89837e();
        String str2 = ".*\\b" + Pattern.quote(Normalizer.normalize(str, Normalizer.Form.NFKC).toLowerCase(locale)) + "\\b.*";
        while (cursor.moveToNext()) {
            if (DesugarArrays.stream((T[]) C15553p.f46542b).map(new C15544g(cursor)).filter(C15545h.f46527a).anyMatch(new C15546i(locale, str2))) {
                e.mo55395g(Long.toString(cursor.getLong(cursor.getColumnIndex("_id"))));
            }
        }
        return e.mo55394f();
    }
}
