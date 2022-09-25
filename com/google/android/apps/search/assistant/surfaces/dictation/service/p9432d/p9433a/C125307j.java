package com.google.android.apps.search.assistant.surfaces.dictation.service.p9432d.p9433a;

import android.net.Uri;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.j */
/* compiled from: PG */
public final /* synthetic */ class C125307j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f345669a;

    /* renamed from: b */
    public final /* synthetic */ String f345670b;

    /* renamed from: c */
    public final /* synthetic */ Locale f345671c;

    public /* synthetic */ C125307j(String str, String str2, Locale locale) {
        this.f345669a = str;
        this.f345670b = str2;
        this.f345671c = locale;
    }

    public final Object apply(Object obj) {
        String str = this.f345669a;
        String str2 = this.f345670b;
        Locale locale = this.f345671c;
        C17046am amVar = (C17046am) obj;
        C59071e eVar = C125311n.f345675a;
        C29690f fVar = amVar.f49658b;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        return (Uri) Collection.EL.stream(fVar.f80416g).filter(new C125309l(str)).map(C125310m.f345674a).map(C125299b.f345653a).findFirst().map(new C125300c(str, str2, locale)).orElseThrow(new C125301d(str, str2, locale, amVar));
    }
}
