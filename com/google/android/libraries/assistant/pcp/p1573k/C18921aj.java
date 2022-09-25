package com.google.android.libraries.assistant.pcp.p1573k;

import android.content.Context;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.NoSuchElementException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.aj */
/* compiled from: PG */
public final class C18921aj {

    /* renamed from: a */
    public static final C59071e f53217a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.k.aj");

    /* renamed from: b */
    public final C46428ao f53218b;

    /* renamed from: c */
    public final C18922b f53219c;

    /* renamed from: d */
    public Optional f53220d = Optional.empty();

    /* renamed from: e */
    private final C60887da f53221e;

    /* renamed from: f */
    private final C18932l f53222f;

    public C18921aj(C46428ao aoVar, C60887da daVar, C18922b bVar, C18932l lVar) {
        this.f53219c = bVar;
        this.f53222f = lVar;
        this.f53218b = aoVar;
        this.f53221e = daVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo24222a(Context context, C53306j jVar) {
        return C47633f.m84733g(C2169h.m6027a(new C18915ad(this, context, jVar))).mo51515h(new C18916ae(this), this.f53221e).mo51513e(Throwable.class, C18917af.f53207a, this.f53221e);
    }

    /* renamed from: b */
    public final void mo24223b(Context context, C53306j jVar, C2164c cVar) {
        Optional map = this.f53222f.mo24190a("com.google.android.apps.youtube.music").map(new C18918ag(this, context, cVar, jVar));
        this.f53220d = map;
        try {
            ((MediaBrowserCompat) map.get()).mo800d();
            ((C59052c) ((C59052c) f53217a.mo56224b()).mo56372aa(47370)).mo56386p("#connectMediaBrowserCompat() Connecting Youtube Music");
        } catch (IllegalStateException | NoSuchElementException e) {
            ((C59052c) ((C59052c) ((C59052c) f53217a.mo56226d()).mo56382g(e)).mo56372aa(47371)).mo56386p("#connectMediaBrowserCompat() Failed to connect");
            cVar.mo5437b((Object) null);
        }
    }
}
