package com.google.android.apps.gsa.shared.p7038f.p7039a;

import com.google.assistant.p3825an.p3830c.p3831a.C49266al;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.f.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C89740aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f242918a;

    public /* synthetic */ C89740aq(Map map) {
        this.f242918a = map;
    }

    public final void accept(Object obj) {
        Map map = this.f242918a;
        Map.Entry entry = (Map.Entry) obj;
        Map.EL.putIfAbsent(map, (String) entry.getKey(), new ArrayList());
        C49266al alVar = (C49266al) C49267am.f127346f.createBuilder();
        String str = (String) entry.getKey();
        alVar.copyOnWrite();
        C49267am amVar = (C49267am) alVar.instance;
        str.getClass();
        amVar.f127348a |= 1;
        amVar.f127349b = str;
        String str2 = (String) entry.getValue();
        alVar.copyOnWrite();
        C49267am amVar2 = (C49267am) alVar.instance;
        str2.getClass();
        amVar2.f127348a |= 2;
        amVar2.f127350c = str2;
        alVar.copyOnWrite();
        C49267am amVar3 = (C49267am) alVar.instance;
        amVar3.f127348a |= 4;
        amVar3.f127351d = 1;
        alVar.copyOnWrite();
        C49267am amVar4 = (C49267am) alVar.instance;
        amVar4.f127348a |= 8;
        amVar4.f127352e = 50;
        ((List) map.get(entry.getKey())).add((C49267am) alVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
