package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.e */
/* compiled from: PG */
public final /* synthetic */ class C16421e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48312a;

    /* renamed from: b */
    public final /* synthetic */ C16090ap f48313b;

    /* renamed from: c */
    public final /* synthetic */ String f48314c;

    public /* synthetic */ C16421e(C16416ag agVar, C16090ap apVar, String str) {
        this.f48312a = agVar;
        this.f48313b = apVar;
        this.f48314c = str;
    }

    public final C60870cx apply(Object obj) {
        C16416ag agVar = this.f48312a;
        C16090ap apVar = this.f48313b;
        String str = this.f48314c;
        Void voidR = (Void) obj;
        if (apVar.equals(C16090ap.COOLWALK)) {
            return ((C16002a) agVar.f48287b.mo27525b()).mo22653j(str);
        }
        return ((C16002a) agVar.f48287b.mo27525b()).mo22663t(str);
    }
}
