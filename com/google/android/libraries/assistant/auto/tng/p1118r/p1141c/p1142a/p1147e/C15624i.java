package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1147e;

import android.content.res.Configuration;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15678j;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15679k;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.e.i */
/* compiled from: PG */
public final /* synthetic */ class C15624i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f46711a;

    public /* synthetic */ C15624i(String str) {
        this.f46711a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f46711a;
        String languageTag = ((Configuration) obj).getLocales().get(0).toLanguageTag();
        if (C15679k.f46809a.containsKey(languageTag) && ((String) C15679k.f46809a.get(languageTag)).equals(str)) {
            return C15678j.HOME;
        }
        if (!C15679k.f46810b.containsKey(languageTag) || !((String) C15679k.f46810b.get(languageTag)).equals(str)) {
            return C15678j.NONE;
        }
        return C15678j.WORK;
    }
}
