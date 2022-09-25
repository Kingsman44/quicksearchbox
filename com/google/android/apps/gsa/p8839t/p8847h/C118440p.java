package com.google.android.apps.gsa.p8839t.p8847h;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.assistant.pcp.p1573k.C18912aa;
import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.t.h.p */
/* compiled from: PG */
public final /* synthetic */ class C118440p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18913ab f328743a;

    /* renamed from: b */
    public final /* synthetic */ C91189au f328744b;

    /* renamed from: c */
    public final /* synthetic */ C22871g f328745c;

    /* renamed from: d */
    public final /* synthetic */ boolean f328746d;

    public /* synthetic */ C118440p(C18913ab abVar, C91189au auVar, C22871g gVar, boolean z) {
        this.f328743a = abVar;
        this.f328744b = auVar;
        this.f328745c = gVar;
        this.f328746d = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C47633f fVar;
        C18913ab abVar = this.f328743a;
        C91189au auVar = this.f328744b;
        C22871g gVar = this.f328745c;
        boolean z = this.f328746d;
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        int i = C118443s.f328767a;
        C52559wf a = C18912aa.m36353a(abVar.mo24143a(), mediaItem, abVar.mo24147e(), abVar.mo24149f());
        MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f930b;
        C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
        if (mediaDescriptionCompat == null) {
            fVar = C47633f.m84733g(C60856cj.m92900i((C51012dc) dbVar.build()));
        } else {
            Uri uri = mediaDescriptionCompat.f937f;
            if (uri != null) {
                String uri2 = uri.toString();
                dbVar.copyOnWrite();
                C51012dc dcVar = (C51012dc) dbVar.instance;
                uri2.getClass();
                dcVar.f132815a |= 2;
                dcVar.f132817c = uri2;
            }
            Bitmap bitmap = mediaDescriptionCompat.f936e;
            if (bitmap != null) {
                C58976aa aaVar = C58975e.f156826a;
                fVar = C47633f.m84733g(gVar.mo28201a("compressImage", new C118436l(bitmap, dbVar)));
            } else if (!z || uri == null) {
                C58976aa aaVar2 = C58975e.f156826a;
                fVar = C47633f.m84733g(C60856cj.m92900i((C51012dc) dbVar.build()));
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                fVar = C47633f.m84733g(gVar.mo28209i(auVar.mo85418e(uri, 7), "loadAndCompressImageUrl", new C118437m(dbVar)));
            }
        }
        return fVar.mo51515h(new C118438n(a), C5622i.f16960b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
