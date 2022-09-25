package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21258ba;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.common.base.C58833ax;
import com.google.protos.youtube.elements.C66246ff;
import com.youtube.android.libraries.elements.templates.C68105a;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.IOException;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.e.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C20968ba implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C20969bb f58774a;

    /* renamed from: b */
    public final /* synthetic */ C66246ff f58775b;

    public /* synthetic */ C20968ba(C20969bb bbVar, C66246ff ffVar) {
        this.f58774a = bbVar;
        this.f58775b = ffVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        C20969bb bbVar = this.f58774a;
        C66246ff ffVar = this.f58775b;
        try {
            C68105a a = EkoProcessor.m98450a(ffVar.f180138b.mo59174N(), (byte[]) ((C58833ax) obj).mo56109e(C21258ba.f59581a), bbVar.f58777b);
            if (a.f184338a.mo61679g()) {
                C21232ab abVar = bbVar.f58776a;
                String str = ffVar.f180137a;
                byte[] bArr = a.f184339b;
                bArr.getClass();
                abVar.mo26140c(str, bArr);
                C69794a aVar = C69874i.f186267a;
                C69822d dVar = C70101a.f186847o;
                return aVar;
            }
            String description = a.f184338a.getDescription();
            throw new C21260bc("Eko processor error: " + description);
        } catch (IOException e) {
            throw new C21260bc("Invalid eko template", e);
        }
    }
}
