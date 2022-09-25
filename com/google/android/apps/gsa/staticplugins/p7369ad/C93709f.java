package com.google.android.apps.gsa.staticplugins.p7369ad;

import android.content.pm.ShortcutInfo;
import com.google.android.apps.gsa.contacts.C74482ch;
import com.google.android.apps.gsa.contacts.by;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.assistant.p1481f.p1483b.C17949d;
import com.google.android.libraries.assistant.p1481f.p1483b.C17950e;
import com.google.android.libraries.assistant.p1481f.p1483b.C17951f;
import com.google.android.libraries.assistant.p1481f.p1483b.C17954i;
import com.google.android.libraries.assistant.p1481f.p1483b.C17955j;
import com.google.android.libraries.assistant.p1481f.p1483b.C17956k;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.ad.f */
/* compiled from: PG */
public final class C93709f implements C118549h {

    /* renamed from: a */
    private static final C59071e f261520a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ad.f");

    /* renamed from: b */
    private final by f261521b;

    /* renamed from: c */
    private final C74482ch f261522c;

    /* renamed from: d */
    private final C86124t f261523d;

    /* renamed from: e */
    private final C68214a f261524e;

    public C93709f(by byVar, C74482ch chVar, C86124t tVar, C68214a aVar) {
        this.f261521b = byVar;
        this.f261522c = chVar;
        this.f261523d = tVar;
        this.f261524e = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f261521b.g()) {
            Optional b = this.f261521b.b();
            C74482ch chVar = this.f261522c;
            Objects.requireNonNull(chVar);
            b.ifPresent(new C93708e(chVar));
        } else {
            C59104x d = f261520a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CAMPeriodicRefresh");
            ((C59052c) ((C59052c) d).mo56372aa(19033)).mo56386p("Refreshing not complete, unable to upload top contacts.");
        }
        if (this.f261523d.mo79746e(C90025cd.f248145c)) {
            C58485gu<String> c = this.f261523d.mo79745c(C90025cd.f248138B);
            C17956k kVar = (C17956k) this.f261524e.mo27525b();
            ArrayList arrayList = new ArrayList();
            for (String b2 : c) {
                C58485gu<ShortcutInfo> b3 = ((C17949d) kVar.f51420c.mo27525b()).mo23501b(b2);
                ArrayList arrayList2 = new ArrayList();
                for (ShortcutInfo shortcutInfo : b3) {
                    C17950e eVar = (C17950e) C17951f.f51407f.createBuilder();
                    String str = shortcutInfo.getPackage();
                    eVar.copyOnWrite();
                    C17951f fVar = (C17951f) eVar.instance;
                    str.getClass();
                    fVar.f51409a |= 2;
                    fVar.f51411c = str;
                    String c2 = C17949d.m35136c(shortcutInfo);
                    eVar.copyOnWrite();
                    C17951f fVar2 = (C17951f) eVar.instance;
                    c2.getClass();
                    fVar2.f51409a |= 1;
                    fVar2.f51410b = c2;
                    String id = shortcutInfo.getId();
                    eVar.copyOnWrite();
                    C17951f fVar3 = (C17951f) eVar.instance;
                    id.getClass();
                    fVar3.f51409a |= 8;
                    fVar3.f51413e = id;
                    int rank = shortcutInfo.getRank();
                    eVar.copyOnWrite();
                    C17951f fVar4 = (C17951f) eVar.instance;
                    fVar4.f51409a |= 4;
                    fVar4.f51412d = (long) rank;
                    arrayList2.add((C17951f) eVar.build());
                }
                arrayList.addAll(C58485gu.m89842j(arrayList2));
            }
            C60856cj.m92911t(((C42876ab) kVar.f51419b.mo27525b()).mo46039a(new C17954i(arrayList), C60826bg.f164896a), new C17955j(), C60826bg.f164896a);
        }
        return C118826c.f331423b;
    }
}
