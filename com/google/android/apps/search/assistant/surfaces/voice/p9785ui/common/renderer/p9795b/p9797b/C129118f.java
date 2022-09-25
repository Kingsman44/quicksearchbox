package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b;

import com.google.assistant.p3897e.p3902c.p3907c.C51045ei;
import com.google.assistant.p3897e.p3902c.p3907c.C51046ej;
import com.google.assistant.p3897e.p3902c.p3907c.C51047ek;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.assistant.p3897e.p3921j.afd;
import com.google.assistant.p3897e.p3921j.afh;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.f */
/* compiled from: PG */
public final /* synthetic */ class C129118f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C129123k f354708a;

    /* renamed from: b */
    public final /* synthetic */ afd f354709b;

    public /* synthetic */ C129118f(C129123k kVar, afd afd) {
        this.f354708a = kVar;
        this.f354709b = afd;
    }

    public final Object apply(Object obj) {
        afh afh;
        C129123k kVar = this.f354708a;
        afd afd = this.f354709b;
        List<aco> list = (List) obj;
        if (afd.f134992a == 3) {
            afh = (afh) afd.f134993b;
        } else {
            afh = afh.f134999c;
        }
        int i = afh.f135002b;
        if (i > 0) {
            C58528ij F = C58528ij.m90006F(afd.f134994c);
            for (aco aco : list) {
                if (((C51047ek) kVar.f354718e.instance).f132924b.size() == i) {
                    break;
                } else if (F.isEmpty() || F.contains(aco.f134834l)) {
                    C51046ej ejVar = kVar.f354718e;
                    C51045ei a = C129123k.m210764a(aco);
                    ejVar.copyOnWrite();
                    C51047ek ekVar = (C51047ek) ejVar.instance;
                    a.getClass();
                    ekVar.mo53510a();
                    ekVar.f132924b.add(a);
                }
            }
            C51046ej ejVar2 = kVar.f354718e;
            int a2 = kVar.f354719f.mo108856a();
            ejVar2.copyOnWrite();
            C51047ek ekVar2 = (C51047ek) ejVar2.instance;
            C51047ek ekVar3 = C51047ek.f132921d;
            ekVar2.f132923a |= 1;
            ekVar2.f132925c = a2;
            return null;
        }
        throw new IllegalArgumentException("Failed to initialize carousel, invalid max number of cards: " + i);
    }
}
