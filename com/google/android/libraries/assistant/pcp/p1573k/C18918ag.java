package com.google.android.libraries.assistant.pcp.p1573k;

import android.content.ComponentName;
import android.content.Context;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2164c;
import com.google.assistant.p3994s.p3995a.C53306j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.k.ag */
/* compiled from: PG */
public final /* synthetic */ class C18918ag implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18921aj f53208a;

    /* renamed from: b */
    public final /* synthetic */ Context f53209b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f53210c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f53211d;

    public /* synthetic */ C18918ag(C18921aj ajVar, Context context, C2164c cVar, C53306j jVar) {
        this.f53208a = ajVar;
        this.f53209b = context;
        this.f53210c = cVar;
        this.f53211d = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18921aj ajVar = this.f53208a;
        return new MediaBrowserCompat(this.f53209b, (ComponentName) obj, new C18920ai(this.f53210c), ajVar.f53219c.mo24224a(this.f53211d, "com.google.android.apps.youtube.music"));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
