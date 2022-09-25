package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a.C146593a;
import com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a.C146594b;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C106622a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106622a f297263a = new C106622a();

    private /* synthetic */ C106622a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f930b;
        C146593a aVar = (C146593a) C146594b.f395943g.createBuilder();
        CharSequence charSequence = mediaDescriptionCompat.f933b;
        if (charSequence != null) {
            String obj2 = charSequence.toString();
            aVar.copyOnWrite();
            C146594b bVar = (C146594b) aVar.instance;
            obj2.getClass();
            bVar.f395945a |= 1;
            bVar.f395946b = obj2;
        }
        CharSequence charSequence2 = mediaDescriptionCompat.f934c;
        if (charSequence2 != null) {
            String obj3 = charSequence2.toString();
            aVar.copyOnWrite();
            C146594b bVar2 = (C146594b) aVar.instance;
            obj3.getClass();
            bVar2.f395945a |= 2;
            bVar2.f395947c = obj3;
        }
        String str = mediaItem.f930b.f932a;
        if (str != null) {
            aVar.copyOnWrite();
            C146594b bVar3 = (C146594b) aVar.instance;
            bVar3.f395945a |= 4;
            bVar3.f395948d = str;
        }
        Uri uri = mediaDescriptionCompat.f937f;
        if (uri != null) {
            String uri2 = uri.toString();
            aVar.copyOnWrite();
            C146594b bVar4 = (C146594b) aVar.instance;
            uri2.getClass();
            bVar4.f395945a |= 8;
            bVar4.f395949e = uri2;
        }
        Bitmap bitmap = mediaDescriptionCompat.f936e;
        if (bitmap != null) {
            C63087y v = C63088z.m96150v();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
            C63088z b = v.mo59165b();
            aVar.copyOnWrite();
            C146594b bVar5 = (C146594b) aVar.instance;
            b.getClass();
            bVar5.f395945a |= 16;
            bVar5.f395950f = b;
        }
        return (C146594b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
