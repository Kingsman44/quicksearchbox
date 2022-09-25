package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.t */
/* compiled from: PG */
public final /* synthetic */ class C16436t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48341a;

    /* renamed from: b */
    public final /* synthetic */ String f48342b;

    public /* synthetic */ C16436t(C16416ag agVar, String str) {
        this.f48341a = agVar;
        this.f48342b = str;
    }

    public final Object apply(Object obj) {
        C16416ag agVar = this.f48341a;
        String str = this.f48342b;
        Void voidR = (Void) obj;
        C58833ax f = agVar.f48288c.mo22631f(str);
        if (f.mo56113h()) {
            agVar.f48288c.mo22639n((C16090ap) f.mo56107c(), false);
        }
        agVar.f48288c.f47361b.remove(str);
        return true;
    }
}
