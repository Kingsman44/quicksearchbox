package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16867b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import com.google.protobuf.C62995dn;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.c.s */
/* compiled from: PG */
public final /* synthetic */ class C118768s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331287a;

    /* renamed from: b */
    public final /* synthetic */ String f331288b;

    public /* synthetic */ C118768s(C118744ab abVar, String str) {
        this.f331287a = abVar;
        this.f331288b = str;
    }

    public final Object call() {
        C118744ab abVar = this.f331287a;
        String str = this.f331288b;
        C16867b bVar = (C16867b) C16868c.f49349j.createBuilder();
        abVar.mo103949e("primary-language", new C118758i(abVar, str, bVar));
        abVar.mo103949e("assistant-preferred-languages", new C118759j(abVar, bVar, str));
        abVar.mo103949e("user-picked-assistant-locale", new C118760k(abVar, bVar, str));
        abVar.mo103949e("preferred_assistant_voice_id", new C118761l(abVar, bVar, str));
        abVar.mo103949e("has_assistant_voice_preference", new C118762m(abVar, bVar, str));
        boolean z = abVar.f331225g;
        bVar.copyOnWrite();
        C16868c cVar = (C16868c) bVar.instance;
        cVar.f49351a |= 4;
        cVar.f49355e = z;
        Map map = abVar.f331226h;
        bVar.copyOnWrite();
        C16868c cVar2 = (C16868c) bVar.instance;
        C62995dn dnVar = cVar2.f49356f;
        if (!dnVar.f170058b) {
            cVar2.f49356f = dnVar.mo58980a();
        }
        cVar2.f49356f.putAll(map);
        if (abVar.f331224f) {
            bVar.mo23064a(abVar.f331222d);
        } else {
            bVar.mo23064a(abVar.f331223e);
        }
        return (C16868c) bVar.build();
    }
}
