package com.google.android.libraries.gsa.conversation.p1855h;

import com.google.assistant.p3897e.p3917i.p3919b.C51641d;
import com.google.assistant.p3897e.p3917i.p3919b.p3920a.C51638a;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.conversation.h.w */
/* compiled from: PG */
public final class C22719w {

    /* renamed from: a */
    private static final C59071e f62534a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.h.w");

    /* renamed from: b */
    private final Map f62535b = new HashMap();

    /* renamed from: a */
    public final C52091ex mo27874a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f62535b.keySet()) {
            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
            kbVar.copyOnWrite();
            C52232kc kcVar = (C52232kc) kbVar.instance;
            str.getClass();
            kcVar.f137064a |= 1;
            kcVar.f137065b = str;
            C52230ka kaVar = (C52230ka) this.f62535b.get(str);
            kbVar.copyOnWrite();
            C52232kc kcVar2 = (C52232kc) kbVar.instance;
            kaVar.getClass();
            kcVar2.f137066c = kaVar;
            kcVar2.f137064a |= 2;
            arrayList.add((C52232kc) kbVar.build());
        }
        Collections.sort(arrayList, C22718v.f62533a);
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        ewVar.mo53790c(arrayList);
        return (C52091ex) ewVar.build();
    }

    /* renamed from: b */
    public final C58833ax mo27875b(MessageLite messageLite) {
        C52230ka kaVar = (C52230ka) this.f62535b.get(C51638a.m86260a(messageLite).f134569b);
        if (kaVar == null) {
            return C58836b.f156633a;
        }
        try {
            return C58833ax.m90834k((MessageLite) messageLite.getParserForType().mo59008g(kaVar.f137061c));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f62534a.mo56225c()).mo56382g(e)).mo56372aa(48423)).mo56386p("Failed to parse protobuf");
            return C58836b.f156633a;
        }
    }

    /* renamed from: c */
    public final void mo27876c(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            Map map = this.f62535b;
            String str = kcVar.f137065b;
            C52230ka kaVar = kcVar.f137066c;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            map.put(str, kaVar);
        }
    }

    /* renamed from: d */
    public final void mo27877d(MessageLite messageLite) {
        this.f62535b.remove(C51638a.m86260a(messageLite).f134569b);
    }

    /* renamed from: e */
    public final void mo27878e(MessageLite messageLite) {
        C51641d a = C51638a.m86260a(messageLite.getDefaultInstanceForType());
        String str = a.f134569b;
        String str2 = a.f134570c;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        str2.getClass();
        kaVar.f137059a |= 1;
        kaVar.f137060b = str2;
        C63088z byteString = messageLite.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        this.f62535b.put(str, (C52230ka) jzVar.build());
    }
}
