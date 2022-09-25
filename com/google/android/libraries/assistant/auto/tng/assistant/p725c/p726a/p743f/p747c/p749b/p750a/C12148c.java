package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p747c.p749b.p750a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p747c.p749b.C12145a;
import com.google.android.libraries.assistant.auto.tng.common.p928n.C13294a;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.apps.tiktok.p3674l.p3676b.C47372c;
import com.google.apps.tiktok.p3674l.p3676b.C47378i;
import com.google.apps.tiktok.p3674l.p3676b.C47379j;
import com.google.apps.tiktok.p3674l.p3676b.C47380k;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.c.b.a.c */
/* compiled from: PG */
public final class C12148c implements C47372c {

    /* renamed from: a */
    public final C13294a f38821a;

    /* renamed from: b */
    private final Context f38822b;

    public C12148c(Context context, C13294a aVar) {
        this.f38822b = context;
        this.f38821a = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C47380k mo20458a(Throwable th) {
        Optional optional;
        C12145a aVar = (C12145a) th;
        int i = C37519dz.m66524a(aVar.f40325a).ordinal() != 3 ? R.string.default_microphone_error : R.string.microphone_permission_denied_error;
        C47379j jVar = new C47379j();
        jVar.f123102a.f123107d = i;
        jVar.f123102a.f123104a = this.f38822b.getString(i);
        if (C37519dz.m66524a(aVar.f40325a).ordinal() != 3) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(new C47378i(new C47380k.C47381a(new C12146a(this))));
        }
        Objects.requireNonNull(jVar);
        optional.ifPresent(new C12147b(jVar));
        return jVar.mo51244a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20459b(Throwable th) {
        C12145a aVar = (C12145a) th;
        return true;
    }
}
