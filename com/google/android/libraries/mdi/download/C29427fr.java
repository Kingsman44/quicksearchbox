package com.google.android.libraries.mdi.download;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.foreground.C29421a;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.android.libraries.mdi.download.p2236d.C29086f;
import com.google.android.libraries.mdi.download.p2236d.C29166h;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29103q;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.mdi.download.fr */
/* compiled from: PG */
public final /* synthetic */ class C29427fr implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79777a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f79778b;

    public /* synthetic */ C29427fr(C29647hr hrVar, C28740br brVar) {
        this.f79777a = hrVar;
        this.f79778b = brVar;
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar;
        C29647hr hrVar = this.f79777a;
        C28740br brVar = this.f79778b;
        C29166h hVar = (C29166h) obj;
        int b = hVar.mo34503b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            String i2 = brVar.mo34350i();
            C29391eo eoVar = (C29391eo) C29392ep.f79679g.createBuilder();
            eoVar.copyOnWrite();
            C29392ep epVar = (C29392ep) eoVar.instance;
            i2.getClass();
            epVar.f79681a = 1 | epVar.f79681a;
            epVar.f79682b = i2;
            String packageName = hrVar.f80295a.getPackageName();
            eoVar.copyOnWrite();
            C29392ep epVar2 = (C29392ep) eoVar.instance;
            packageName.getClass();
            epVar2.f79681a = 2 | epVar2.f79681a;
            epVar2.f79683c = packageName;
            if (brVar.mo34344c().mo56113h()) {
                String b2 = C28694b.m53577b((Account) brVar.mo34344c().mo56107c());
                eoVar.copyOnWrite();
                C29392ep epVar3 = (C29392ep) eoVar.instance;
                epVar3.f79681a |= 4;
                epVar3.f79684d = b2;
            }
            if (brVar.mo34349h().mo56113h()) {
                String str = (String) brVar.mo34349h().mo56107c();
                eoVar.copyOnWrite();
                C29392ep epVar4 = (C29392ep) eoVar.instance;
                str.getClass();
                epVar4.f79681a |= 16;
                epVar4.f79686f = str;
            }
            C29392ep epVar5 = (C29392ep) eoVar.build();
            if (brVar.mo34348g().mo56113h()) {
                if (hrVar.f80302h.mo56113h()) {
                    ((C29441e) hrVar.f80302h.mo56107c()).mo34739i(i2, (C28742bt) brVar.mo34348g().mo56107c());
                } else {
                    C28736bn bnVar = new C28736bn();
                    bnVar.f78062a = C28737bo.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
                    bnVar.f78063b = "downloadFileGroup: DownloadListener is present but Download Monitor is not provided!";
                    return C60856cj.m92899h(bnVar.mo34334a());
                }
            }
            try {
                if (brVar.mo34347f().mo56113h()) {
                    axVar = C58833ax.m90834k(C29103q.m54024a((C28716av) brVar.mo34347f().mo56107c()));
                } else {
                    axVar = C58836b.f156633a;
                }
                C29422b c = C29422b.m54374c(brVar.mo34350i(), brVar.mo34344c(), brVar.mo34349h());
                C60871cy cyVar = new C60871cy((Callable) C29467gu.f79874a);
                C29670b h = C29670b.m54719g(cyVar).mo34822i(new C29468gv(hrVar, epVar5, axVar), hrVar.f80301g).mo34822i(new C29469gw(hrVar, brVar), hrVar.f80301g).mo34821h(C29461go.f79864a, hrVar.f80301g);
                C29670b i3 = C29670b.m54719g(hrVar.f80300f.mo34565b(((C29421a) c).f79765a, h)).mo34822i(new C29470gx(cyVar, h), hrVar.f80301g);
                C29670b i4 = i3.mo34822i(new C29471gy(hrVar, c), hrVar.f80301g).mo34822i(new C29472gz(hrVar, i3, brVar, i2), hrVar.f80301g);
                C60856cj.m92911t(i4, C47810es.m84974n(new C29638hi(hrVar, brVar, i2, c)), hrVar.f80301g);
                return i4;
            } catch (C62974ct e) {
                return C60856cj.m92899h(e);
            }
        } else if (i == 1) {
            return hVar.mo34516c();
        } else {
            if (i == 2) {
                return C60856cj.m92900i(hVar.mo34502a());
            }
            throw new AssertionError(String.format("received unsupported DownloadGroupState kind %s", new Object[]{C29086f.m53976a(hVar.mo34503b())}));
        }
    }
}
