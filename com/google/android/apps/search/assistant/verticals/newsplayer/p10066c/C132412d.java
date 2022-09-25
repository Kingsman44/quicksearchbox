package com.google.android.apps.search.assistant.verticals.newsplayer.p10066c;

import android.content.Context;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132416a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3005i.p3007b.C38424a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52429rk;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p3897e.p3921j.C52432rn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52571wr;
import com.google.assistant.p3897e.p3921j.C52574wu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4838ak.p4839a.p4840a.C63281b;
import com.google.protos.p4838ak.p4839a.p4840a.C63288i;
import com.google.protos.p4838ak.p4839a.p4840a.C63290k;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.c.d */
/* compiled from: PG */
public final class C132412d {

    /* renamed from: a */
    public static final C59071e f361408a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.newsplayer.c.d");

    /* renamed from: b */
    public final Executor f361409b;

    /* renamed from: c */
    public final Context f361410c;

    /* renamed from: d */
    public C132416a f361411d;

    /* renamed from: e */
    public C38469m f361412e = null;

    /* renamed from: f */
    public C38424a f361413f = null;

    /* renamed from: g */
    public AccountId f361414g = null;

    /* renamed from: h */
    public C52174hz f361415h = null;

    /* renamed from: i */
    public PlaybackStateCompat f361416i = null;

    /* renamed from: j */
    public C62910ar f361417j = null;

    /* renamed from: k */
    public C62910ar f361418k = null;

    /* renamed from: l */
    private final C21370a f361419l;

    /* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.c.d$a */
    /* compiled from: PG */
    public interface C132413a {
        /* renamed from: fM */
        C38469m mo110697fM();

        /* renamed from: fP */
        C38424a mo110698fP();
    }

    public C132412d(Executor executor, C21370a aVar, Context context) {
        this.f361409b = executor;
        this.f361419l = aVar;
        this.f361410c = context;
    }

    /* renamed from: a */
    public final void mo110696a(C52174hz hzVar, int i, C62910ar arVar, C62910ar arVar2) {
        C52574wu wuVar;
        C52574wu wuVar2;
        int i2;
        C52574wu wuVar3;
        C52574wu wuVar4;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 18) {
            wuVar = (C52574wu) woVar.f137997d;
        } else {
            wuVar = C52574wu.f138026h;
        }
        if (!wuVar.f138031d) {
            ((C59052c) ((C59052c) f361408a.mo56224b()).mo56372aa(39643)).mo56386p("NewsPlayer playback logging disabled.");
            return;
        }
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        if (woVar2.f137996c == 18) {
            wuVar2 = (C52574wu) woVar2.f137997d;
        } else {
            wuVar2 = C52574wu.f138026h;
        }
        int a = C52571wr.m86651a(wuVar2.f138029b);
        if (a == 0) {
            a = 1;
        }
        int i3 = a - 1;
        if (i3 != 1) {
            i2 = 2;
            if (i3 == 2) {
                i2 = 4;
            }
        } else {
            i2 = 3;
        }
        C63288i iVar = (C63288i) C63290k.f171034p.createBuilder();
        iVar.copyOnWrite();
        C63290k kVar = (C63290k) iVar.instance;
        kVar.f171042g = i - 1;
        kVar.f171036a |= 8;
        iVar.copyOnWrite();
        C63290k kVar2 = (C63290k) iVar.instance;
        kVar2.f171045j = C63281b.m96221a(i2);
        kVar2.f171036a |= 1024;
        long b = this.f361419l.mo26870b();
        iVar.copyOnWrite();
        C63290k kVar3 = (C63290k) iVar.instance;
        kVar3.f171036a |= 4096;
        kVar3.f171047l = b * 1000;
        C52568wo woVar3 = hzVar.f136897d;
        if (woVar3 == null) {
            woVar3 = C52568wo.f137992v;
        }
        if (woVar3.f137996c == 18) {
            wuVar3 = (C52574wu) woVar3.f137997d;
        } else {
            wuVar3 = C52574wu.f138026h;
        }
        String str = wuVar3.f138030c;
        iVar.copyOnWrite();
        C63290k kVar4 = (C63290k) iVar.instance;
        str.getClass();
        kVar4.f171036a |= 1;
        kVar4.f171039d = str;
        String str2 = hzVar.f136895b;
        iVar.copyOnWrite();
        C63290k kVar5 = (C63290k) iVar.instance;
        str2.getClass();
        kVar5.f171036a = 4 | kVar5.f171036a;
        kVar5.f171041f = str2;
        iVar.copyOnWrite();
        C63290k kVar6 = (C63290k) iVar.instance;
        kVar6.f171036a |= 16;
        kVar6.f171043h = 0;
        C52429rk rkVar = (C52429rk) C52432rn.f137634c.createBuilder();
        C52431rm rmVar = C52431rm.OPA_AGSA;
        rkVar.copyOnWrite();
        C52432rn rnVar = (C52432rn) rkVar.instance;
        rnVar.f137637b = rmVar.f137633ah;
        rnVar.f137636a |= 1;
        iVar.copyOnWrite();
        C63290k kVar7 = (C63290k) iVar.instance;
        C52432rn rnVar2 = (C52432rn) rkVar.build();
        rnVar2.getClass();
        kVar7.f171046k = rnVar2;
        kVar7.f171036a |= 2048;
        iVar.copyOnWrite();
        C63290k kVar8 = (C63290k) iVar.instance;
        arVar.getClass();
        kVar8.f171044i = arVar;
        kVar8.f171036a |= 32;
        iVar.copyOnWrite();
        C63290k kVar9 = (C63290k) iVar.instance;
        kVar9.f171050o = 1;
        kVar9.f171036a |= 32768;
        iVar.copyOnWrite();
        C63290k kVar10 = (C63290k) iVar.instance;
        arVar2.getClass();
        kVar10.f171049n = arVar2;
        kVar10.f171036a |= 16384;
        C52568wo woVar4 = hzVar.f136897d;
        if (woVar4 == null) {
            woVar4 = C52568wo.f137992v;
        }
        if (woVar4.f137996c == 18) {
            wuVar4 = (C52574wu) woVar4.f137997d;
        } else {
            wuVar4 = C52574wu.f138026h;
        }
        String str3 = wuVar4.f138032e;
        iVar.copyOnWrite();
        C63290k kVar11 = (C63290k) iVar.instance;
        str3.getClass();
        kVar11.f171036a |= 8192;
        kVar11.f171048m = str3;
        C63290k kVar12 = (C63290k) iVar.build();
        C59071e eVar = f361408a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39641)).mo56386p("Update News Playback Footprints corpus via Geller");
        C38469m mVar = this.f361412e;
        if (mVar == null) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(39642)).mo56386p("gellerAccessor is null");
            return;
        }
        C65753ak akVar = C65753ak.PLAYBACK;
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long b2 = this.f361419l.mo26870b();
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = b2 * 1000;
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        C65139d dVar2 = (C65139d) cVar.build();
        dVar2.getClass();
        azVar.f178796b = dVar2;
        azVar.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/news.audio.proto.PlaybackActivity";
        C63088z byteString = kVar12.toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar2.f178799e = hVar;
        azVar2.f178795a |= 8;
        C60856cj.m92911t(mVar.mo41434e(akVar, (C65768az) ayVar.build()), C47810es.m84974n(new C132409a(this)), this.f361409b);
    }
}
