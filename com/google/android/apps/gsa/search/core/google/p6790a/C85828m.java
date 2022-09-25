package com.google.android.apps.gsa.search.core.google.p6790a;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6491a.C84376v;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.p6758a.C85580c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90744a;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3917i.p3918a.C51236af;
import com.google.assistant.p3897e.p3917i.p3918a.C51237ag;
import com.google.assistant.p3897e.p3917i.p3918a.C51238ah;
import com.google.assistant.p3897e.p3917i.p3918a.C51239ai;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.m */
/* compiled from: PG */
public final class C85828m {

    /* renamed from: a */
    public static final C59071e f232071a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.a.m");

    /* renamed from: b */
    public final C68214a f232072b;

    /* renamed from: c */
    private final C68214a f232073c;

    /* renamed from: d */
    private final C68214a f232074d;

    /* renamed from: e */
    private final C68214a f232075e;

    /* renamed from: f */
    private final C22871g f232076f;

    public C85828m(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C22871g gVar) {
        this.f232073c = aVar;
        this.f232074d = aVar2;
        this.f232075e = aVar3;
        this.f232072b = aVar4;
        this.f232076f = gVar;
    }

    /* renamed from: a */
    public static C52232kc m137900a(String str, String str2, byte[] bArr, Query query) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return null;
        }
        C51236af afVar = (C51236af) C51239ai.f133399g.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            afVar.copyOnWrite();
            C51239ai aiVar = (C51239ai) afVar.instance;
            str.getClass();
            aiVar.f133401a |= 2;
            aiVar.f133404d = str;
            afVar.copyOnWrite();
            C51239ai aiVar2 = (C51239ai) afVar.instance;
            aiVar2.f133401a |= 4;
            aiVar2.f133405e = 1;
        }
        if (!TextUtils.isEmpty(str2)) {
            C51237ag agVar = (C51237ag) C51238ah.f133395c.createBuilder();
            agVar.copyOnWrite();
            C51238ah ahVar = (C51238ah) agVar.instance;
            str2.getClass();
            ahVar.f133397a = 1;
            ahVar.f133398b = str2;
            afVar.copyOnWrite();
            C51239ai aiVar3 = (C51239ai) afVar.instance;
            C51238ah ahVar2 = (C51238ah) agVar.build();
            ahVar2.getClass();
            C62971cq cqVar = aiVar3.f133406f;
            if (!cqVar.mo58948c()) {
                aiVar3.f133406f = C62942bv.mutableCopy(cqVar);
            }
            aiVar3.f133406f.add(ahVar2);
        }
        if (bArr != null) {
            if (query.mo84324bI()) {
                C63088z A = C63088z.m96139A(bArr);
                afVar.copyOnWrite();
                C51239ai aiVar4 = (C51239ai) afVar.instance;
                aiVar4.f133402b = 22;
                aiVar4.f133403c = A;
            } else {
                C63088z A2 = C63088z.m96139A(bArr);
                afVar.copyOnWrite();
                C51239ai aiVar5 = (C51239ai) afVar.instance;
                aiVar5.f133403c = A2.mo59170I(C62972cr.f170009a);
                aiVar5.f133402b = 1;
            }
        }
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.assistant.sdk.device.params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.AssistantSdkDeviceParams";
        C63088z byteString = ((C51239ai) afVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }

    /* renamed from: b */
    public final C60870cx mo79467b(Query query) {
        String str;
        String bf = query.mo84347bf("android.opa.extra.DEVICE_MODEL_ID");
        byte[] dU = query.mo84440dU("android.opa.extra.DEVICE_ACTIONS_CONTEXT");
        if (C84376v.m134657a(query, this.f232075e) == 6) {
            C60870cx g = C60922j.m93044g(((C85580c) this.f232074d.mo27525b()).mo79084a(), C85825j.f232065a, C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            return C60922j.m93044g(C60846c.m92878g(C90877ak.m148471e(g, ((C86124t) this.f232073c.mo27525b()).mo79743a(C90086ek.f250274Z), TimeUnit.MILLISECONDS, this.f232076f), Throwable.class, C85826k.f232066a, C60826bg.f164896a), new C85827l(this, bf, dU, query), C60826bg.f164896a);
        }
        if (query.mo84411cr()) {
            str = bf;
        } else {
            str = C90744a.m148217a("ro.opa.device_model_id");
        }
        return C60856cj.m92900i(C58833ax.m90833j(m137900a(str, bf, dU, query)));
    }
}
