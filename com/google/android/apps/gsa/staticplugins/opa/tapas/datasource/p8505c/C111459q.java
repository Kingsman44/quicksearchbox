package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import android.content.pm.ShortcutInfo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111593r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130328c;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130329d;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130332g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62995dn;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.q */
/* compiled from: PG */
public final /* synthetic */ class C111459q implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C111442as f310080a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310081b;

    /* renamed from: c */
    public final /* synthetic */ String f310082c;

    /* renamed from: d */
    public final /* synthetic */ C130332g f310083d;

    /* renamed from: e */
    public final /* synthetic */ Map f310084e;

    public /* synthetic */ C111459q(C111442as asVar, C113405ep epVar, String str, C130332g gVar, Map map) {
        this.f310080a = asVar;
        this.f310081b = epVar;
        this.f310082c = str;
        this.f310083d = gVar;
        this.f310084e = map;
    }

    public final void accept(Object obj, Object obj2) {
        C111442as asVar = this.f310080a;
        C113405ep epVar = this.f310081b;
        String str = this.f310082c;
        C130332g gVar = this.f310083d;
        Map map = this.f310084e;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        double b = asVar.mo99140b(epVar, epVar.mo100022f().f53683k, str3, str);
        if (b > C59203do.f157270a) {
            C58485gu a = ((C111593r) asVar.f310033b.mo27525b()).mo99176a(str2);
            int size = a.size();
            int i = 0;
            while (i < size) {
                ShortcutInfo shortcutInfo = (ShortcutInfo) a.get(i);
                if (C111442as.m185204p(epVar) && shortcutInfo.isDynamic()) {
                    C130329d dVar = C130329d.f357224d;
                    str2.getClass();
                    C62995dn dnVar = gVar.f357232a;
                    if (dnVar.containsKey(str2)) {
                        dVar = (C130329d) dnVar.get(str2);
                    }
                    int a2 = C130328c.m212774a(dVar.f357228c);
                    if (a2 != 0 && a2 == 3) {
                        i++;
                    }
                }
                C111444b bVar = (C111444b) map.get(shortcutInfo);
                if (bVar == null || bVar.mo99153c().doubleValue() < b) {
                    C111445c cVar = new C111445c();
                    cVar.f310047a = C60856cj.m92900i(Optional.m71637of(str3));
                    cVar.f310048b = Double.valueOf(b);
                    map.put(shortcutInfo, cVar.mo99136a());
                    i++;
                } else {
                    i++;
                }
            }
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
