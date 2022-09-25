package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.ao */
/* compiled from: PG */
public final /* synthetic */ class C125479ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f346025a;

    /* renamed from: b */
    public final /* synthetic */ Locale f346026b;

    public /* synthetic */ C125479ao(String str, Locale locale) {
        this.f346025a = str;
        this.f346026b = locale;
    }

    public final Object apply(Object obj) {
        String str = this.f346025a;
        ((C59052c) ((C59052c) ((C59052c) C125482ar.f346036a.mo56226d()).mo56382g((Exception) obj)).mo56372aa(36599)).mo56354G("Failed loading formatter data [%s] for [%s] [SD]", C126290c.m206496a(str), this.f346026b);
        return Optional.empty();
    }
}
