package com.google.android.apps.gsa.velvet.p8863ui.settings;

import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118638a;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118639b;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118640c;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118647j;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62971cq;
import java.util.Map;
import p3186j$.util.OptionalInt;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.f */
/* compiled from: PG */
final class C118652f implements C22868d {

    /* renamed from: a */
    final /* synthetic */ SettingsActivity f331008a;

    public C118652f(SettingsActivity settingsActivity) {
        this.f331008a = settingsActivity;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) SettingsActivity.f330929a.mo56226d()).mo56382g(th)).mo56372aa(34075)).mo56386p("Failed to update visibility for dynamic preferences.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            boolean z = !((Boolean) entry.getValue()).booleanValue();
            SettingsActivity settingsActivity = this.f331008a;
            C62971cq cqVar = settingsActivity.f330934c.f331003c;
            OptionalInt findFirst = IntStream.CC.range(0, cqVar.size()).filter(new C118650d(cqVar, (String) entry.getKey())).findFirst();
            if (findFirst.isPresent()) {
                C118639b bVar = (C118639b) ((C118640c) cqVar.get(findFirst.getAsInt())).toBuilder();
                bVar.copyOnWrite();
                C118640c cVar = (C118640c) bVar.instance;
                cVar.f330978a |= 16;
                cVar.f330983f = z;
                C118640c cVar2 = (C118640c) bVar.build();
                C118638a aVar = (C118638a) settingsActivity.f330934c.toBuilder();
                int asInt = findFirst.getAsInt();
                aVar.copyOnWrite();
                C118647j jVar = (C118647j) aVar.instance;
                cVar2.getClass();
                jVar.mo103833a();
                jVar.f331003c.set(asInt, cVar2);
                settingsActivity.f330934c = (C118647j) aVar.build();
            }
        }
    }
}
