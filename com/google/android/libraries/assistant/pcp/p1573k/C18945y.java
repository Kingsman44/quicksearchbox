package com.google.android.libraries.assistant.pcp.p1573k;

import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.k.y */
/* compiled from: PG */
public final /* synthetic */ class C18945y implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18912aa f53249a;

    /* renamed from: b */
    public final /* synthetic */ C18913ab f53250b;

    public /* synthetic */ C18945y(C18912aa aaVar, C18913ab abVar) {
        this.f53249a = aaVar;
        this.f53250b = abVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C18912aa aaVar = this.f53249a;
        C18913ab abVar = this.f53250b;
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        ComponentName a = abVar.mo24143a();
        C52559wf a2 = C18912aa.m36353a(a, mediaItem, abVar.mo24147e(), abVar.mo24149f());
        MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f930b;
        if (mediaDescriptionCompat == null) {
            return C60856cj.m92900i((C52560wg) a2.build());
        }
        C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
        String flattenToString = a.flattenToString();
        dbVar.copyOnWrite();
        C51012dc dcVar = (C51012dc) dbVar.instance;
        flattenToString.getClass();
        dcVar.f132815a |= 32;
        dcVar.f132821g = flattenToString;
        Uri uri = mediaDescriptionCompat.f937f;
        if (uri != null) {
            String uri2 = uri.toString();
            dbVar.copyOnWrite();
            C51012dc dcVar2 = (C51012dc) dbVar.instance;
            uri2.getClass();
            dcVar2.f132815a |= 2;
            dcVar2.f132817c = uri2;
        }
        Bitmap bitmap = mediaDescriptionCompat.f936e;
        if (bitmap == null) {
            cxVar = C60856cj.m92900i((C51012dc) dbVar.build());
        } else {
            cxVar = C60856cj.m92904m(C47810es.m84978r(new C18942v(bitmap, dbVar)), aaVar.f53201b);
        }
        return C60922j.m93044g(cxVar, C47810es.m84963c(new C18943w(a2)), aaVar.f53202c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
