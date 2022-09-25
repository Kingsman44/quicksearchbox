package com.google.android.libraries.search.p3005i;

import android.content.Context;
import com.google.android.libraries.assistant.p1363c.p1382d.C17198b;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p4985f.p5030q.p5032b.C65021af;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.i.ab */
/* compiled from: PG */
public class C38411ab {

    /* renamed from: a */
    public final C46423aj f101669a;

    /* renamed from: b */
    public final Context f101670b;

    /* renamed from: c */
    public final C60887da f101671c;

    /* renamed from: d */
    public final C60887da f101672d;

    /* renamed from: e */
    public final C17198b f101673e;

    /* renamed from: f */
    public final boolean f101674f;

    /* renamed from: g */
    public final GellerLoggingCallback f101675g;

    /* renamed from: h */
    public final C46175b f101676h;

    /* renamed from: i */
    public final C46723bg f101677i;

    /* renamed from: j */
    public final C60887da f101678j;

    /* renamed from: k */
    public final C46128f f101679k;

    /* renamed from: l */
    public final Set f101680l;

    /* renamed from: m */
    public final C65021af f101681m;

    /* renamed from: com.google.android.libraries.search.i.ab$a */
    /* compiled from: PG */
    public interface C38412a {
        /* renamed from: iT */
        Map mo41414iT();

        /* renamed from: jp */
        Map mo41415jp();
    }

    public C38411ab(Context context, C60887da daVar, C60887da daVar2, C17198b bVar, GellerLoggingCallback gellerLoggingCallback, C46175b bVar2, C46723bg bgVar, C60887da daVar3, C46128f fVar, Set set, C65021af afVar, boolean z) {
        this.f101670b = context;
        this.f101671c = daVar;
        this.f101672d = daVar2;
        this.f101673e = bVar;
        this.f101675g = gellerLoggingCallback;
        this.f101674f = z;
        this.f101669a = new C46423aj(new C38473q(this), daVar);
        this.f101676h = bVar2;
        this.f101677i = bgVar;
        this.f101678j = daVar3;
        this.f101680l = set;
        this.f101679k = fVar;
        this.f101681m = afVar;
    }
}
