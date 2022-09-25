package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21258ba;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62893aa;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.C66237ex;
import com.google.protos.youtube.elements.C66239ez;
import com.google.protos.youtube.elements.C66241fa;
import com.google.protos.youtube.elements.C66242fb;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.youtube.android.libraries.elements.templates.C68105a;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.IOException;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.e.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C20960ax implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C20961ay f58749a;

    /* renamed from: b */
    public final /* synthetic */ C21311r f58750b;

    /* renamed from: c */
    public final /* synthetic */ C66237ex f58751c;

    public /* synthetic */ C20960ax(C20961ay ayVar, C21311r rVar, C66237ex exVar) {
        this.f58749a = ayVar;
        this.f58750b = rVar;
        this.f58751c = exVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        byte[] bArr;
        SenderStateOuterClass$SenderState h;
        C20961ay ayVar = this.f58749a;
        C21311r rVar = this.f58750b;
        C66237ex exVar = this.f58751c;
        byte[] bArr2 = (byte[]) ((C58833ax) obj).mo56109e(C21258ba.f59581a);
        try {
            C66241fa faVar = (C66241fa) C66242fb.f180124e.createBuilder();
            C63088z A = C63088z.m96139A(bArr2);
            faVar.copyOnWrite();
            C66242fb fbVar = (C66242fb) faVar.instance;
            fbVar.f180126a |= 1;
            fbVar.f180127b = A;
            if (!(rVar == null || (h = rVar.mo26739h()) == null)) {
                faVar.copyOnWrite();
                C66242fb fbVar2 = (C66242fb) faVar.instance;
                fbVar2.f180128c = h;
                fbVar2.f180126a |= 2;
            }
            C66239ez ezVar = exVar.f180118b;
            if (ezVar == null) {
                ezVar = C66239ez.f180121a;
            }
            faVar.copyOnWrite();
            C66242fb fbVar3 = (C66242fb) faVar.instance;
            ezVar.getClass();
            fbVar3.f180129d = ezVar;
            fbVar3.f180126a |= 4;
            byte[] byteArray = exVar.toByteArray();
            int i = C62897ae.f169827g;
            C62897ae O = C62897ae.m95112O(byteArray, 0, byteArray.length);
            while (true) {
                if (O.mo58661D()) {
                    bArr = C21258ba.f59581a;
                    break;
                }
                int m = O.mo58678m();
                if ((m >>> 3) == 2) {
                    bArr = ((C62893aa) O).mo58665H(((C62893aa) O).mo58675j());
                    break;
                }
                O.mo58663F(m);
            }
            C68105a a = EkoProcessor.m98450a(bArr, ((C66242fb) faVar.build()).toByteArray(), ayVar.f58753b);
            if (a.f184338a.mo61679g()) {
                C21232ab abVar = ayVar.f58752a;
                String str = exVar.f180117a;
                byte[] bArr3 = a.f184339b;
                bArr3.getClass();
                abVar.mo26140c(str, bArr3);
                C69794a aVar = C69874i.f186267a;
                C69822d dVar = C70101a.f186847o;
                return aVar;
            }
            throw new C21260bc("Eko processor error: " + a.f184338a.getDescription());
        } catch (IOException e) {
            throw new C21260bc("Invalid eko template", e);
        }
    }
}
