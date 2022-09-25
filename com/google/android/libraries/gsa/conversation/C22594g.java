package com.google.android.libraries.gsa.conversation;

import com.google.android.libraries.gsa.conversation.p1838b.C22349c;
import com.google.android.libraries.gsa.conversation.p1838b.C22350d;
import com.google.android.libraries.gsa.conversation.p1839c.C22365l;
import com.google.android.libraries.gsa.conversation.p1851e.C22566e;
import com.google.android.libraries.gsa.conversation.p1851e.C22571j;
import com.google.android.libraries.gsa.conversation.p1852f.C22579f;
import com.google.android.libraries.gsa.conversation.p1852f.C22580g;
import com.google.android.libraries.gsa.conversation.p1853g.C22617ad;
import com.google.android.libraries.gsa.conversation.p1853g.C22624ak;
import com.google.android.libraries.gsa.conversation.p1853g.C22654bn;
import com.google.android.libraries.gsa.conversation.p1855h.C22689ab;
import com.google.android.libraries.gsa.conversation.p1855h.C22699c;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52210jh;
import com.google.assistant.p3897e.p3921j.C52211ji;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58880cq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.gsa.conversation.g */
/* compiled from: PG */
public final class C22594g implements C22699c {

    /* renamed from: a */
    public static final C59071e f62235a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.g");

    /* renamed from: b */
    public final C22308a f62236b;

    /* renamed from: c */
    public final C22617ad f62237c;

    /* renamed from: d */
    public final C22580g f62238d;

    /* renamed from: e */
    public final C22566e f62239e;

    /* renamed from: f */
    public final C22720x f62240f;

    /* renamed from: g */
    private C22573f f62241g;

    public C22594g(C22308a aVar, C22617ad adVar, C22580g gVar, C22566e eVar, C22720x xVar) {
        this.f62236b = aVar;
        this.f62237c = adVar;
        this.f62238d = gVar;
        this.f62239e = eVar;
        this.f62240f = xVar;
    }

    /* renamed from: a */
    public final C60870cx mo27697a(C52078ek ekVar, C58833ax axVar) {
        return this.f62237c.mo27736b(ekVar, axVar, new C22727l(mo27707k(), this, this.f62239e.mo27656b().mo27658a(ekVar)), true);
    }

    /* renamed from: b */
    public final String mo27698b() {
        String str;
        C22350d dVar = new C22350d(1, new ArrayList());
        dVar.mo27580c("ConversationManager");
        this.f62237c.mo27576a(dVar);
        this.f62239e.mo27576a(dVar);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        int i = 0;
        for (C22349c cVar : dVar.f61696b) {
            int i2 = cVar.f61691a;
            if (i2 < 0) {
                str = C22350d.f61695a[0];
            } else {
                String[] strArr = C22350d.f61695a;
                int length = strArr.length;
                if (i2 < 6) {
                    str = strArr[i2];
                } else {
                    str = C58880cq.m90966b("  ", i2);
                }
            }
            String cVar2 = cVar.toString();
            if ((cVar.f61692b & 1) == 0 || cVar.f61691a != i || sb2.length() + cVar2.length() > 97) {
                if (sb2.length() > 0) {
                    if (!z) {
                        sb.append("\n");
                    }
                    sb.append(sb2);
                    sb2 = new StringBuilder();
                    z = false;
                }
                i = cVar.f61691a;
                sb2.append(str);
                sb2.append(cVar2);
                if ((cVar.f61692b & 2) == 0) {
                    if (!z) {
                        sb.append("\n");
                    }
                    sb.append(sb2);
                    sb2 = new StringBuilder();
                    z = false;
                }
            } else {
                if (sb2.length() != 0) {
                    str = " | ";
                }
                sb2.append(str);
                sb2.append(cVar2);
            }
        }
        if (sb2.length() > 0) {
            if (!z) {
                sb.append("\n");
            }
            sb.append(sb2);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo27699c(C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f62240f.mo27816d(axVar);
    }

    /* renamed from: d */
    public final void mo27700d(C22689ab abVar) {
        this.f62240f.mo27818f(abVar);
    }

    /* renamed from: e */
    public final void mo27701e(C22579f fVar) {
        mo27702f(fVar, this.f62239e.mo27656b());
    }

    /* renamed from: f */
    public final void mo27702f(C22579f fVar, C22571j jVar) {
        C22573f fVar2 = new C22573f(this, jVar);
        this.f62241g = fVar2;
        fVar2.mo27662a(fVar);
    }

    /* renamed from: g */
    public final void mo27703g(String str) {
        C22654bn bnVar = this.f62237c.f62313a;
        bnVar.f62405c.execute(C47810es.m84977q(new C22624ak(bnVar, str)));
    }

    /* renamed from: h */
    public final void mo27704h() {
        C52210jh jhVar = (C52210jh) C52211ji.f137015c.createBuilder();
        jhVar.copyOnWrite();
        C52211ji jiVar = (C52211ji) jhVar.instance;
        jiVar.f137018b = 1;
        jiVar.f137017a |= 1;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.MicInputParam";
        C63088z byteString = ((C52211ji) jhVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a = 1 | duVar.f135926a;
        duVar.f135927b = "mic.ACTIVATE";
        dsVar.mo53729a("mic_input_params", (C52230ka) jzVar.build());
        C51805du duVar2 = (C51805du) dsVar.build();
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar2.getClass();
        ekVar.f136675c = duVar2;
        ekVar.f136674b = 5;
        C52078ek ekVar2 = (C52078ek) ejVar.build();
        this.f62237c.mo27736b(ekVar2, C58836b.f156633a, new C22727l(mo27707k(), this, this.f62239e.mo27656b().mo27658a(ekVar2)), false);
    }

    /* renamed from: i */
    public final void mo27705i() {
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "tts.CANCEL";
        C51805du duVar2 = (C51805du) dsVar.build();
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar2.getClass();
        ekVar.f136675c = duVar2;
        ekVar.f136674b = 5;
        C52078ek ekVar2 = (C52078ek) ejVar.build();
        this.f62237c.mo27736b(ekVar2, C58836b.f156633a, new C22727l(mo27707k(), this, this.f62239e.mo27656b().mo27658a(ekVar2)), false);
    }

    /* renamed from: j */
    public final void mo27706j(boolean z) {
        this.f62240f.mo27821j(z);
    }

    /* renamed from: k */
    public final C22365l mo27707k() {
        return this.f62236b.mo27544a(new C22728m(C58836b.f156633a));
    }

    /* renamed from: l */
    public final void mo27708l(int i) {
        C58976aa aaVar = C58975e.f156826a;
        C22573f fVar = this.f62241g;
        if (fVar != null) {
            fVar.f62208b = true;
        }
        this.f62237c.mo27739e(new C22727l(mo27707k(), this, this.f62239e.mo27656b()), i);
    }
}
