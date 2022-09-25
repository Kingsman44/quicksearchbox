package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import android.net.Uri;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9452k.C125886a;
import com.google.android.libraries.assistant.p1363c.p1382d.p1383a.C17196a;
import com.google.android.libraries.storage.p3304a.p3312f.C42782f;
import com.google.android.libraries.storage.p3304a.p3312f.C42787k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.nio.MappedByteBuffer;
import java.util.Locale;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.ap */
/* compiled from: PG */
public final /* synthetic */ class C125480ap implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C125482ar f346027a;

    /* renamed from: b */
    public final /* synthetic */ Locale f346028b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f346029c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f346030d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f346031e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f346032f;

    /* renamed from: g */
    public final /* synthetic */ C60870cx f346033g;

    /* renamed from: h */
    public final /* synthetic */ C60870cx f346034h;

    public /* synthetic */ C125480ap(C125482ar arVar, Locale locale, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5, C60870cx cxVar6) {
        this.f346027a = arVar;
        this.f346028b = locale;
        this.f346029c = cxVar;
        this.f346030d = cxVar2;
        this.f346031e = cxVar3;
        this.f346032f = cxVar4;
        this.f346033g = cxVar5;
        this.f346034h = cxVar6;
    }

    public final Object call() {
        C125482ar arVar = this.f346027a;
        Locale locale = this.f346028b;
        C60870cx cxVar = this.f346029c;
        C60870cx cxVar2 = this.f346030d;
        C60870cx cxVar3 = this.f346031e;
        C60870cx cxVar4 = this.f346032f;
        C60870cx cxVar5 = this.f346033g;
        C60870cx cxVar6 = this.f346034h;
        String str = ((C17196a) C125886a.f346957a).f49938a;
        Optional optional = (Optional) C60856cj.m92909r(cxVar2);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar3);
        Optional optional3 = (Optional) C60856cj.m92909r(cxVar4);
        Optional optional4 = (Optional) C60856cj.m92909r(cxVar5);
        Optional optional5 = (Optional) C60856cj.m92909r(cxVar6);
        MappedByteBuffer mappedByteBuffer = (MappedByteBuffer) arVar.f346037b.mo45889c((Uri) C60856cj.m92909r(cxVar), new C42782f());
        MappedByteBuffer mappedByteBuffer2 = optional.isPresent() ? (MappedByteBuffer) arVar.f346037b.mo45889c((Uri) optional.get(), new C42782f()) : null;
        byte[] bArr = optional2.isPresent() ? (byte[]) arVar.f346037b.mo45889c((Uri) optional2.get(), new C42787k()) : null;
        MappedByteBuffer mappedByteBuffer3 = optional3.isPresent() ? (MappedByteBuffer) arVar.f346037b.mo45889c((Uri) optional3.get(), new C42782f()) : null;
        return new NativeFormatterImpl(str, mappedByteBuffer, mappedByteBuffer2, mappedByteBuffer3, NativeFormatterImpl.initJniWithByteBuffer(locale.toLanguageTag(), mappedByteBuffer, mappedByteBuffer2, bArr, mappedByteBuffer3, optional4.isPresent() ? (byte[]) arVar.f346037b.mo45889c((Uri) optional4.get(), new C42787k()) : null, optional5.isPresent() ? (byte[]) arVar.f346037b.mo45889c((Uri) optional5.get(), new C42787k()) : null, arVar.f346041f));
    }
}
