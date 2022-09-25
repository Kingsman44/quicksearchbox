package com.google.android.apps.gsa.search.core.carassistant.p6778b;

import android.content.res.Resources;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16737ay;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16738az;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16740ba;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16742bc;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.b.a */
/* compiled from: PG */
public final class C85685a {

    /* renamed from: a */
    public static final C59071e f231709a = C59071e.m91332i("com.google.android.apps.gsa.search.core.carassistant.b.a");

    /* renamed from: b */
    public static final C58528ij f231710b;

    /* renamed from: c */
    public static final int f231711c;

    /* renamed from: d */
    public static final int f231712d = (C85698m.values().length - 1);

    /* renamed from: e */
    public final C85689d f231713e;

    /* renamed from: f */
    public final C86124t f231714f;

    /* renamed from: g */
    public final Resources f231715g;

    /* renamed from: h */
    private final C68214a f231716h;

    static {
        C58528ij K = C58528ij.m90011K(C85698m.UNKNOWN_QUERY_TYPE, C85698m.MAKE_A_CALL);
        f231710b = K;
        f231711c = C85698m.values().length - K.size();
    }

    public C85685a(C85689d dVar, C68214a aVar, C86124t tVar, Resources resources) {
        this.f231713e = dVar;
        this.f231716h = aVar;
        this.f231714f = tVar;
        this.f231715g = resources;
    }

    /* renamed from: a */
    public final C16737ay mo79312a() {
        C16737ay ayVar = (C16737ay) C16738az.f48952d.createBuilder();
        C16740ba baVar = (C16740ba) C16742bc.f48958d.createBuilder();
        baVar.copyOnWrite();
        C16742bc bcVar = (C16742bc) baVar.instance;
        bcVar.f48961b = 4;
        bcVar.f48960a |= 1;
        String string = this.f231715g.getString(R.string.voiceplate_query_suggestion_play_news);
        baVar.copyOnWrite();
        C16742bc bcVar2 = (C16742bc) baVar.instance;
        string.getClass();
        bcVar2.f48960a |= 2;
        bcVar2.f48962c = string;
        ayVar.mo22997a((C16742bc) baVar.build());
        C16740ba baVar2 = (C16740ba) C16742bc.f48958d.createBuilder();
        baVar2.copyOnWrite();
        C16742bc bcVar3 = (C16742bc) baVar2.instance;
        bcVar3.f48961b = 2;
        bcVar3.f48960a |= 1;
        String string2 = this.f231715g.getString(R.string.voiceplate_query_suggestion_drive_to_gas_station);
        baVar2.copyOnWrite();
        C16742bc bcVar4 = (C16742bc) baVar2.instance;
        string2.getClass();
        bcVar4.f48960a |= 2;
        bcVar4.f48962c = string2;
        ayVar.mo22997a((C16742bc) baVar2.build());
        C16740ba baVar3 = (C16740ba) C16742bc.f48958d.createBuilder();
        baVar3.copyOnWrite();
        C16742bc bcVar5 = (C16742bc) baVar3.instance;
        bcVar5.f48961b = 3;
        bcVar5.f48960a |= 1;
        String string3 = this.f231715g.getString(R.string.voiceplate_query_suggestion_play_music);
        baVar3.copyOnWrite();
        C16742bc bcVar6 = (C16742bc) baVar3.instance;
        string3.getClass();
        bcVar6.f48960a |= 2;
        bcVar6.f48962c = string3;
        ayVar.mo22997a((C16742bc) baVar3.build());
        return ayVar;
    }

    /* renamed from: b */
    public final boolean mo79313b() {
        return ((C89062r) C60856cj.m92910s(((C89037bh) this.f231716h.mo27525b()).mo27378c())).f241370b == 1;
    }
}
