package com.google.android.libraries.search.rendering.xuikit.p3097a.p3114b;

import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.p4283bv.p4380j.p4385b.C57830c;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4397a.p4398a.C57701b;
import com.google.protos.youtube.p5164b.C66011b;
import com.youtube.android.libraries.elements.templates.C68105a;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.IOException;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b.u */
/* compiled from: PG */
public final /* synthetic */ class C40013u implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C40016x f105163a;

    /* renamed from: b */
    public final /* synthetic */ C57701b f105164b;

    public /* synthetic */ C40013u(C40016x xVar, C57701b bVar) {
        this.f105163a = xVar;
        this.f105164b = bVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        C40016x xVar = this.f105163a;
        C57830c cVar = (C57830c) obj;
        C66011b bVar = this.f105164b.f154163c;
        if (bVar == null) {
            bVar = C66011b.f179508a;
        }
        try {
            C68105a a = EkoProcessor.m98450a(bVar.toByteArray(), cVar.toByteArray(), xVar.f105169b);
            if (a.f184338a.mo61679g()) {
                byte[] bArr = a.f184339b;
                bArr.getClass();
                return bArr;
            }
            String description = a.f184338a.getDescription();
            throw new C21260bc("Eko processor error: " + description);
        } catch (IOException e) {
            throw new C21260bc("Invalid eko template", e);
        }
    }
}
