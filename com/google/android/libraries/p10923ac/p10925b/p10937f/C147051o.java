package com.google.android.libraries.p10923ac.p10925b.p10937f;

import android.os.Bundle;
import com.google.android.libraries.p10923ac.p10925b.p10927b.p10928a.C146771a;
import com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a.C147030e;
import com.google.android.libraries.p10923ac.p10925b.p10941h.C147053a;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147160t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ac.b.f.o */
/* compiled from: PG */
public final class C147051o implements C147053a {

    /* renamed from: a */
    public final C68214a f397045a;

    /* renamed from: b */
    public final C68214a f397046b;

    /* renamed from: c */
    public final C146771a f397047c;

    /* renamed from: d */
    public final C147160t f397048d;

    /* renamed from: e */
    public final C147030e f397049e;

    /* renamed from: f */
    public final C147046j f397050f;

    /* renamed from: g */
    private final C147116m f397051g;

    public C147051o(C68214a aVar, C68214a aVar2, C146771a aVar3, C147160t tVar, C147030e eVar, C147116m mVar, C147046j jVar) {
        this.f397045a = aVar;
        this.f397046b = aVar2;
        this.f397047c = aVar3;
        this.f397048d = tVar;
        this.f397049e = eVar;
        this.f397051g = mVar;
        this.f397050f = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo123852a(Bundle bundle) {
        if (bundle == null) {
            return C60856cj.m92899h(new IllegalArgumentException("Notification task extras is null"));
        }
        String string = bundle.getString("notifications");
        if (string == null) {
            return C60856cj.m92899h(new IllegalArgumentException("Notifications payload is missing"));
        }
        C146771a aVar = this.f397047c;
        C147116m mVar = this.f397051g;
        Objects.requireNonNull(mVar);
        return C60922j.m93045h(aVar.mo123625a(new C147049m(mVar)), new C147050n(this, string), this.f397047c);
    }
}
