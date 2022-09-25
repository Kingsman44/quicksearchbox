package com.google.apps.tiktok.account.data.p3611a;

import android.text.TextUtils;
import androidx.p060c.C0977g;
import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.apps.tiktok.account.data.C46214i;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.apps.tiktok.account.data.a.k */
/* compiled from: PG */
public final /* synthetic */ class C46133k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f121027a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f121028b;

    /* renamed from: c */
    public final /* synthetic */ Map f121029c;

    /* renamed from: d */
    public final /* synthetic */ C0977g f121030d;

    public /* synthetic */ C46133k(C58485gu guVar, C58495hd hdVar, Map map, C0977g gVar) {
        this.f121027a = guVar;
        this.f121028b = hdVar;
        this.f121029c = map;
        this.f121030d = gVar;
    }

    public final Object call() {
        C58485gu guVar = this.f121027a;
        C58495hd hdVar = this.f121028b;
        Map map = this.f121029c;
        C0977g gVar = this.f121030d;
        HashMap hashMap = new HashMap();
        int size = guVar.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            C30976k kVar = (C30976k) guVar.get(i);
            String g = kVar.mo36657g();
            if (g == null) {
                C60870cx cxVar = (C60870cx) gVar.get(kVar.mo36650a());
                if (cxVar == null) {
                    ((C59052c) ((C59052c) C46144v.f121047a.mo56226d()).mo56372aa(54701)).mo56386p("GoogleOwnersProvider returned account that does not exist on the device.");
                } else {
                    try {
                        g = (String) C60856cj.m92909r(cxVar);
                    } catch (ExecutionException e) {
                        ((C59052c) ((C59052c) ((C59052c) C46144v.f121047a.mo56225c()).mo56382g(e.getCause())).mo56372aa(54700)).mo56386p("Failed to get GaiaId");
                    }
                }
                i++;
                z = false;
            }
            if (hdVar.containsKey(kVar.mo36650a())) {
                C46214i iVar = (C46214i) C46215j.f121154k.createBuilder();
                String a = kVar.mo36650a();
                iVar.copyOnWrite();
                C46215j jVar = (C46215j) iVar.instance;
                a.getClass();
                jVar.f121156a |= 16;
                jVar.f121161f = a;
                iVar.copyOnWrite();
                C46215j jVar2 = (C46215j) iVar.instance;
                jVar2.f121156a |= 64;
                jVar2.f121163h = z;
                iVar.copyOnWrite();
                C46215j jVar3 = (C46215j) iVar.instance;
                g.getClass();
                jVar3.f121156a |= 1;
                jVar3.f121157b = g;
                if (!TextUtils.isEmpty(kVar.mo36653d())) {
                    String d = kVar.mo36653d();
                    iVar.copyOnWrite();
                    C46215j jVar4 = (C46215j) iVar.instance;
                    d.getClass();
                    jVar4.f121156a |= 2;
                    jVar4.f121158c = d;
                }
                if (!TextUtils.isEmpty(kVar.mo36651b())) {
                    String replaceFirst = kVar.mo36651b().replaceFirst("^(https:(//)?){2,}", "https://");
                    iVar.copyOnWrite();
                    C46215j jVar5 = (C46215j) iVar.instance;
                    replaceFirst.getClass();
                    jVar5.f121156a |= 32;
                    jVar5.f121162g = replaceFirst;
                }
                if (!TextUtils.isEmpty(kVar.mo36656f())) {
                    String f = kVar.mo36656f();
                    iVar.copyOnWrite();
                    C46215j jVar6 = (C46215j) iVar.instance;
                    f.getClass();
                    jVar6.f121156a |= 4;
                    jVar6.f121159d = f;
                }
                if (!TextUtils.isEmpty(kVar.mo36654e())) {
                    String e2 = kVar.mo36654e();
                    iVar.copyOnWrite();
                    C46215j jVar7 = (C46215j) iVar.instance;
                    e2.getClass();
                    jVar7.f121156a |= 8;
                    jVar7.f121160e = e2;
                }
                iVar.copyOnWrite();
                C46215j jVar8 = (C46215j) iVar.instance;
                jVar8.f121156a |= 256;
                jVar8.f121165j = "google";
                C62940bt btVar = C46123ad.f121013a;
                C46145w wVar = (C46145w) C46148z.f121055e.createBuilder();
                boolean booleanValue = ((Boolean) hdVar.get(kVar.mo36650a())).booleanValue();
                wVar.copyOnWrite();
                C46148z zVar = (C46148z) wVar.instance;
                zVar.f121057a |= 1;
                zVar.f121058b = booleanValue;
                int l = kVar.mo36663l();
                if (l != 0) {
                    int i2 = l - 1;
                    int i3 = i2 != 0 ? i2 != 1 ? 3 : 2 : 1;
                    wVar.copyOnWrite();
                    C46148z zVar2 = (C46148z) wVar.instance;
                    zVar2.f121060d = i3 - 1;
                    zVar2.f121057a |= 2;
                    iVar.mo58885m(btVar, (C46148z) wVar.build());
                    C46144v.m82371b(g, (C46215j) iVar.build(), hashMap);
                } else {
                    throw null;
                }
            } else {
                continue;
            }
            i++;
            z = false;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            boolean booleanValue2 = ((Boolean) entry.getValue()).booleanValue();
            try {
                String str2 = (String) C60856cj.m92909r((Future) gVar.get(str));
                C46214i iVar2 = (C46214i) C46215j.f121154k.createBuilder();
                iVar2.copyOnWrite();
                C46215j jVar9 = (C46215j) iVar2.instance;
                str.getClass();
                jVar9.f121156a |= 16;
                jVar9.f121161f = str;
                iVar2.copyOnWrite();
                C46215j jVar10 = (C46215j) iVar2.instance;
                str2.getClass();
                jVar10.f121156a |= 1;
                jVar10.f121157b = str2;
                iVar2.copyOnWrite();
                C46215j jVar11 = (C46215j) iVar2.instance;
                str.getClass();
                jVar11.f121156a |= 2;
                jVar11.f121158c = str;
                iVar2.copyOnWrite();
                C46215j jVar12 = (C46215j) iVar2.instance;
                jVar12.f121156a |= 256;
                jVar12.f121165j = "google";
                C62940bt btVar2 = C46123ad.f121013a;
                C46145w wVar2 = (C46145w) C46148z.f121055e.createBuilder();
                wVar2.copyOnWrite();
                C46148z zVar3 = (C46148z) wVar2.instance;
                zVar3.f121057a |= 1;
                zVar3.f121058b = booleanValue2;
                wVar2.copyOnWrite();
                C46148z zVar4 = (C46148z) wVar2.instance;
                zVar4.f121060d = 0;
                zVar4.f121057a |= 2;
                iVar2.mo58885m(btVar2, (C46148z) wVar2.build());
                C46144v.m82371b(str2, (C46215j) iVar2.build(), hashMap);
            } catch (ExecutionException e3) {
                ((C59052c) ((C59052c) ((C59052c) C46144v.f121047a.mo56225c()).mo56382g(e3.getCause())).mo56372aa(54698)).mo56386p("Failed to get GaiaId");
            }
        }
        return hashMap;
    }
}
