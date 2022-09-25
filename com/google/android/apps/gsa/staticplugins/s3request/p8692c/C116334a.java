package com.google.android.apps.gsa.staticplugins.s3request.p8692c;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.libraries.p11033ap.p11034a.C147814a;
import com.google.audio.p4107b.p4108a.C54582e;
import com.google.audio.p4107b.p4108a.C54584g;
import com.google.audio.p4107b.p4108a.C54594q;
import com.google.audio.p4107b.p4108a.C54595r;
import com.google.p3728as.p3737c.C48038b;
import com.google.speech.p5224k.p5225a.C67247y;
import com.google.speech.p5224k.p5225a.C67248z;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.c.a */
/* compiled from: PG */
public final class C116334a extends C90880an {

    /* renamed from: a */
    private final String f322515a;

    /* renamed from: b */
    private final boolean f322516b;

    /* renamed from: c */
    private final C68214a f322517c;

    /* renamed from: d */
    private final int f322518d;

    /* renamed from: e */
    private final C147814a f322519e;

    /* renamed from: f */
    private final boolean f322520f;

    public C116334a(String str, boolean z, C68214a aVar, int i, C147814a aVar2, boolean z2) {
        super("SoundSearchInfoBuilderTask", 1, 0);
        this.f322515a = str;
        this.f322516b = z;
        this.f322517c = aVar;
        this.f322518d = i;
        this.f322519e = aVar2;
        this.f322520f = z2;
    }

    /* renamed from: b */
    public final C67248z call() {
        C54582e eVar = (C54582e) C54584g.f143307f.createBuilder();
        String a = ((C89045bp) this.f322517c.mo27525b()).mo27402a();
        if (!TextUtils.isEmpty(a)) {
            eVar.copyOnWrite();
            C54584g gVar = (C54584g) eVar.instance;
            a.getClass();
            gVar.f143309a |= 128;
            gVar.f143312d = a;
        } else {
            String country = Locale.getDefault().getCountry();
            if (!TextUtils.isEmpty(country)) {
                eVar.copyOnWrite();
                C54584g gVar2 = (C54584g) eVar.instance;
                country.getClass();
                gVar2.f143309a |= 128;
                gVar2.f143312d = country;
            }
        }
        if (this.f322518d == 0) {
            eVar.mo54135a(1);
        } else {
            eVar.mo54135a(2);
        }
        C48038b a2 = this.f322519e.mo124477a();
        if (this.f322520f) {
            int i = (a2.f124351a & 2) != 0 ? 2 : 6;
            eVar.copyOnWrite();
            C54584g gVar3 = (C54584g) eVar.instance;
            gVar3.f143313e = i - 1;
            gVar3.f143309a |= 256;
        }
        C54594q qVar = (C54594q) C54595r.f143331e.createBuilder();
        qVar.copyOnWrite();
        C54595r rVar = (C54595r) qVar.instance;
        rVar.f143334b = 4;
        rVar.f143333a |= 1;
        qVar.copyOnWrite();
        C54595r rVar2 = (C54595r) qVar.instance;
        rVar2.f143335c = 4;
        rVar2.f143333a |= 2;
        C54595r rVar3 = (C54595r) qVar.build();
        C67247y yVar = (C67247y) C67248z.f182795j.createBuilder();
        yVar.copyOnWrite();
        C67248z zVar = (C67248z) yVar.instance;
        C54584g gVar4 = (C54584g) eVar.build();
        gVar4.getClass();
        zVar.f182799b = gVar4;
        zVar.f182798a |= 1;
        yVar.copyOnWrite();
        C67248z zVar2 = (C67248z) yVar.instance;
        rVar3.getClass();
        zVar2.f182800c = rVar3;
        zVar2.f182798a |= 2;
        yVar.copyOnWrite();
        C67248z zVar3 = (C67248z) yVar.instance;
        zVar3.f182798a |= 128;
        zVar3.f182806i = true;
        boolean z = this.f322516b;
        yVar.copyOnWrite();
        C67248z zVar4 = (C67248z) yVar.instance;
        zVar4.f182798a |= 4;
        zVar4.f182801d = z;
        if ((a2.f124351a & 2) != 0) {
            yVar.copyOnWrite();
            C67248z zVar5 = (C67248z) yVar.instance;
            a2.getClass();
            zVar5.f182805h = a2;
            zVar5.f182798a |= 64;
        }
        String str = this.f322515a;
        if (str != null) {
            yVar.copyOnWrite();
            C67248z zVar6 = (C67248z) yVar.instance;
            zVar6.f182798a |= 8;
            zVar6.f182802e = str;
        }
        yVar.copyOnWrite();
        C67248z zVar7 = (C67248z) yVar.instance;
        zVar7.f182798a |= 16;
        zVar7.f182803f = 0;
        return (C67248z) yVar.build();
    }
}
